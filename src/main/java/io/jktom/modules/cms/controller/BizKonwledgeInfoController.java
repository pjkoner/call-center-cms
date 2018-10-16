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

import io.jktom.modules.cms.entity.BizKonwledgeInfoEntity;
import io.jktom.modules.cms.service.BizKonwledgeInfoService;
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
@RequestMapping("cms/bizkonwledgeinfo")
public class BizKonwledgeInfoController {
    @Autowired
    private BizKonwledgeInfoService bizKonwledgeInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bizKonwledgeInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{knowledgeId}")
    public R info(@PathVariable("knowledgeId") Integer knowledgeId){
			BizKonwledgeInfoEntity bizKonwledgeInfo = bizKonwledgeInfoService.selectById(knowledgeId);

        return R.ok().put("bizKonwledgeInfo", bizKonwledgeInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BizKonwledgeInfoEntity bizKonwledgeInfo){
			bizKonwledgeInfoService.insert(bizKonwledgeInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BizKonwledgeInfoEntity bizKonwledgeInfo){
			bizKonwledgeInfoService.updateById(bizKonwledgeInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] knowledgeIds){
			bizKonwledgeInfoService.deleteBatchIds(Arrays.asList(knowledgeIds));

        return R.ok();
    }

}
