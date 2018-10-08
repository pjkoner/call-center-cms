package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.modules.cms.entity.AutodialerNumber1Entity;
import io.jktom.modules.cms.service.AutodialerNumber1Service;
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
@RequestMapping("generator/autodialernumber1")
public class AutodialerNumber1Controller {
    @Autowired
    private AutodialerNumber1Service autodialerNumber1Service;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("generator:autodialernumber1:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = autodialerNumber1Service.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    @RequiresPermissions("generator:autodialernumber1:info")
    public R info(@PathVariable("id") Integer id){
			AutodialerNumber1Entity autodialerNumber1 = autodialerNumber1Service.selectById(id);

        return R.ok().put("autodialerNumber1", autodialerNumber1);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("generator:autodialernumber1:save")
    public R save(@RequestBody AutodialerNumber1Entity autodialerNumber1){
			autodialerNumber1Service.insert(autodialerNumber1);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("generator:autodialernumber1:update")
    public R update(@RequestBody AutodialerNumber1Entity autodialerNumber1){
			autodialerNumber1Service.updateById(autodialerNumber1);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("generator:autodialernumber1:delete")
    public R delete(@RequestBody Integer[] ids){
			autodialerNumber1Service.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
