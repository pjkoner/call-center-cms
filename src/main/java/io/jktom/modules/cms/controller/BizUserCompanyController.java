package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jktom.modules.cms.entity.BizUserCompanyEntity;
import io.jktom.modules.cms.service.BizUserCompanyService;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;



/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-18 11:08:29
 */
@RestController
@RequestMapping("cms/bizusercompany")
public class BizUserCompanyController {
    @Autowired
    private BizUserCompanyService bizUserCompanyService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bizUserCompanyService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
			BizUserCompanyEntity bizUserCompany = bizUserCompanyService.selectById(id);

        return R.ok().put("bizUserCompany", bizUserCompany);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BizUserCompanyEntity bizUserCompany){
			bizUserCompanyService.insert(bizUserCompany);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BizUserCompanyEntity bizUserCompany){
			bizUserCompanyService.updateById(bizUserCompany);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
			bizUserCompanyService.deleteBatchIds(Arrays.asList(ids));

        return R.ok();
    }

}
