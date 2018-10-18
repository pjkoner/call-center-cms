package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import io.jktom.modules.cms.service.BizSpeechSenceService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jktom.modules.cms.entity.BizSpeechSenceEntity;
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
@RequestMapping("cms/bizspeechsence")
public class BizSpeechSenceController {
    @Autowired
    private BizSpeechSenceService bizSpeechSenceService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    @RequiresPermissions("cms:bizspeechsence:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bizSpeechSenceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{senceId}")
    @RequiresPermissions("cms:bizspeechsence:info")
    public R info(@PathVariable("senceId") Long senceId){
			BizSpeechSenceEntity bizSpeechSence = bizSpeechSenceService.selectById(senceId);

        return R.ok().put("bizSpeechSence", bizSpeechSence);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    @RequiresPermissions("cms:bizspeechsence:save")
    public R save(@RequestBody BizSpeechSenceEntity bizSpeechSence){
			bizSpeechSenceService.insert(bizSpeechSence);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    @RequiresPermissions("cms:bizspeechsence:update")
    public R update(@RequestBody BizSpeechSenceEntity bizSpeechSence){
			bizSpeechSenceService.updateById(bizSpeechSence);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    @RequiresPermissions("cms:bizspeechsence:delete")
    public R delete(@RequestBody Long[] senceIds){
			bizSpeechSenceService.deleteBatchIds(Arrays.asList(senceIds));

        return R.ok();
    }

}
