package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.modules.cms.entity.AutodialerLogEntity;
import io.jktom.modules.cms.service.AutodialerLogService;
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
@RequestMapping("generator/autodialerlog")
public class AutodialerLogController {
    @Autowired
    private AutodialerLogService autodialerLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:autodialerlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = autodialerLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    @RequiresPermissions("generator:autodialerlog:info")
    public R info(@PathVariable("uuid") String uuid){
			AutodialerLogEntity autodialerLog = autodialerLogService.selectById(uuid);

        return R.ok().put("autodialerLog", autodialerLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:autodialerlog:save")
    public R save(@RequestBody AutodialerLogEntity autodialerLog){
			autodialerLogService.insert(autodialerLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:autodialerlog:update")
    public R update(@RequestBody AutodialerLogEntity autodialerLog){
			autodialerLogService.updateById(autodialerLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:autodialerlog:delete")
    public R delete(@RequestBody String[] uuids){
			autodialerLogService.deleteBatchIds(Arrays.asList(uuids));

        return R.ok();
    }

}
