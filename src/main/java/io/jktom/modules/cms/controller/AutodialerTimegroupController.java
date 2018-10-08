package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.modules.cms.entity.AutodialerTimegroupEntity;
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
@RequestMapping("generator/autodialertimegroup")
public class AutodialerTimegroupController {
    @Autowired
    private AutodialerTimegroupService autodialerTimegroupService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:autodialertimegroup:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = autodialerTimegroupService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    @RequiresPermissions("generator:autodialertimegroup:info")
    public R info(@PathVariable("uuid") String uuid){
			AutodialerTimegroupEntity autodialerTimegroup = autodialerTimegroupService.selectById(uuid);

        return R.ok().put("autodialerTimegroup", autodialerTimegroup);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:autodialertimegroup:save")
    public R save(@RequestBody AutodialerTimegroupEntity autodialerTimegroup){
			autodialerTimegroupService.insert(autodialerTimegroup);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:autodialertimegroup:update")
    public R update(@RequestBody AutodialerTimegroupEntity autodialerTimegroup){
			autodialerTimegroupService.updateById(autodialerTimegroup);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:autodialertimegroup:delete")
    public R delete(@RequestBody String[] uuids){
			autodialerTimegroupService.deleteBatchIds(Arrays.asList(uuids));

        return R.ok();
    }

}
