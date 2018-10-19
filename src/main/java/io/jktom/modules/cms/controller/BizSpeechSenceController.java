package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Date;
import java.util.Map;

import io.jktom.common.validator.ValidatorUtils;
import io.jktom.modules.cms.form.SpeechTechniqueForm;
import io.jktom.modules.cms.service.BizSpeechSenceService;
import io.jktom.modules.sys.controller.AbstractController;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
@RequestMapping("speech")
public class BizSpeechSenceController extends AbstractController {
    @Autowired
    private BizSpeechSenceService bizSpeechSenceService;

    /**
     * 列表
     */
    @PostMapping("/list")
    public R list(@RequestBody Map<String, Object> params){

        PageUtils page = bizSpeechSenceService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{senceId}")
    public R info(@PathVariable("senceId") Long senceId){

        BizSpeechSenceEntity bizSpeechSence = bizSpeechSenceService.selectById(senceId);

        return R.ok().put("bizSpeechSence", bizSpeechSence);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody SpeechTechniqueForm speechTechniqueForm){

        ValidatorUtils.validateEntity(speechTechniqueForm);

        bizSpeechSenceService.insertSpeech(speechTechniqueForm,getUser());

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody SpeechTechniqueForm form){

        ValidatorUtils.validateEntity(form);

        BizSpeechSenceEntity speechSenceEntity = new BizSpeechSenceEntity();

        speechSenceEntity.setSpeechId(form.getSpeechId());
        speechSenceEntity.setSpeechName(form.getSpeechName());
        speechSenceEntity.setMark(form.getSpeechMark());
        speechSenceEntity.setModifyId(getUserId());
        speechSenceEntity.setCreateTime(new Date());
        bizSpeechSenceService.updateById(speechSenceEntity);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] senceIds){

        bizSpeechSenceService.deleteBatchIds(Arrays.asList(senceIds));

        return R.ok();
    }

}
