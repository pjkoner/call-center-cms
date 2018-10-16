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

import io.jktom.modules.cms.entity.BizCompanyInfoEntity;
import io.jktom.modules.cms.service.BizCompanyInfoService;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;



/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-16 17:30:19
 */
@RestController
@RequestMapping("cms/bizcompanyinfo")
public class BizCompanyInfoController {
    @Autowired
    private BizCompanyInfoService bizCompanyInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")

    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bizCompanyInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{companyId}")

    public R info(@PathVariable("companyId") Integer companyId){
			BizCompanyInfoEntity bizCompanyInfo = bizCompanyInfoService.selectById(companyId);

        return R.ok().put("bizCompanyInfo", bizCompanyInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BizCompanyInfoEntity bizCompanyInfo){
			bizCompanyInfoService.insert(bizCompanyInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BizCompanyInfoEntity bizCompanyInfo){
			bizCompanyInfoService.updateById(bizCompanyInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] companyIds){
			bizCompanyInfoService.deleteBatchIds(Arrays.asList(companyIds));

        return R.ok();
    }

}
