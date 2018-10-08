package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.modules.cms.entity.AutodialerTaskEntity;
import io.jktom.modules.cms.service.AutodialerTaskService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;





/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-08 10:03:15
 */
@RestController
@RequestMapping("generator/autodialertask")
public class AutodialerTaskController {
    @Autowired
    private AutodialerTaskService autodialerTaskService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:autodialertask:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = autodialerTaskService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    @RequiresPermissions("generator:autodialertask:info")
    public R info(@PathVariable("uuid") String uuid){
			AutodialerTaskEntity autodialerTask = autodialerTaskService.selectById(uuid);

        return R.ok().put("autodialerTask", autodialerTask);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:autodialertask:save")
    public R save(@RequestBody AutodialerTaskEntity autodialerTask){
			autodialerTaskService.insert(autodialerTask);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:autodialertask:update")
    public R update(@RequestBody AutodialerTaskEntity autodialerTask){
			autodialerTaskService.updateById(autodialerTask);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:autodialertask:delete")
    public R delete(@RequestBody String[] uuids){
			autodialerTaskService.deleteBatchIds(Arrays.asList(uuids));

        return R.ok();
    }

}
