package io.jktom.modules.cms.controller;

import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.common.utils.ShiroUtils;
import io.jktom.common.validator.ValidatorUtils;
import io.jktom.modules.cms.constant.CmsCommomConstant;
import io.jktom.modules.cms.entity.BizSpeechInfoEntity;
import io.jktom.modules.cms.form.SpeechNodeInfoForm;
import io.jktom.modules.cms.form.SpeechSortIndexForm;
import io.jktom.modules.cms.service.BizSpeechInfoService;
import io.jktom.modules.cms.vo.SpeechInfoVO;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.Map;


/**
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-22 09:31:38
 */
@RestController
@RequestMapping("speechNode")
public class BizSpeechInfoController {
    @Autowired
    private BizSpeechInfoService bizSpeechInfoService;


    /**
     * 信息
     */
    @RequestMapping("/getSpeechNode")
    public R info(@RequestParam("speechNodeId") Long speechNodeId) {

        if (speechNodeId == null || speechNodeId < 0L) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "传入参数错误");
        }

        BizSpeechInfoEntity bizSpeechInfo = bizSpeechInfoService.selectById(speechNodeId);

        SpeechInfoVO speechInfoVO = new SpeechInfoVO();
        speechInfoVO.setSpeechNodeId(bizSpeechInfo.getSpeechNodeId());
        speechInfoVO.setSpeechId(bizSpeechInfo.getSpeechId());
        speechInfoVO.setSortIndex(bizSpeechInfo.getSortIndex());
        speechInfoVO.setSpeechName(bizSpeechInfo.getNodeName());

        return R.ok().put("data", speechInfoVO);
    }

    /**
     * 信息
     */
    @RequestMapping("/getSpeechList")
    public R getSpeechinfo(@RequestParam("speechId") Long speechId) {

        if (speechId == null || speechId < 0L) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "传入参数错误");
        }

        return bizSpeechInfoService.selectSpeechInfolist(speechId);
    }

    /**
     * 保存
     */
    @RequestMapping("/saveSpeechNode")
    public R save(@RequestBody SpeechNodeInfoForm form) {

        ValidatorUtils.validateEntity(form);

        if (form.getSpeechNodeName().length() > 20) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "传入参数过长");
        }

        if (form.getSpeechId() < 0L || form.getSpeechId() == null) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "传入参数错误");
        }


        BizSpeechInfoEntity bizSpeechInfo = new BizSpeechInfoEntity();
        bizSpeechInfo.setSpeechId(form.getSpeechId());
        bizSpeechInfo.setNodeName(form.getSpeechNodeName());
        bizSpeechInfo.setCreateId(ShiroUtils.getUserId());
        bizSpeechInfo.setCreateTime(new Date());
        bizSpeechInfo.setIsDelete(CmsCommomConstant.IS_DELETE.NOT_DELETE);
        bizSpeechInfoService.insert(bizSpeechInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/updateSpeechNode")
    public R update(@RequestBody SpeechNodeInfoForm form) {

        ValidatorUtils.validateEntity(form);

        if (form.getSpeechNodeName().length() > 20) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "传入参数过长");
        }


        if (form.getSpeechNodeId() == null || form.getSpeechNodeId() < 0L) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "传入参数错误");
        }

        BizSpeechInfoEntity bizSpeechInfo = new BizSpeechInfoEntity();
        bizSpeechInfo.setNodeName(form.getSpeechNodeName());
        bizSpeechInfo.setSpeechNodeId(form.getSpeechNodeId());
        bizSpeechInfo.setModifyTime(new Date());
        bizSpeechInfo.setModifyId(ShiroUtils.getUserId());

        bizSpeechInfoService.updateById(bizSpeechInfo);

        return R.ok();
    }


    /**
     * 保存顺序
     */
    @RequestMapping("/saveSortIndex")
    public R saveSortIndex(@RequestBody ArrayList<SpeechSortIndexForm> params) {

        if (null == params) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "请求参数不能为空");
        }

        for (SpeechSortIndexForm form : params) {

            if (form.getSortIndex() == null || form.getSortIndex() < 0
                    || form.getSpeechNodeId() == null || form.getSpeechNodeId() < 0) {
                return R.error(HttpStatus.SC_BAD_REQUEST, "请求参数错误");
            }

        }

        for (SpeechSortIndexForm form : params) {

            BizSpeechInfoEntity bizSpeechInfo = new BizSpeechInfoEntity();
            bizSpeechInfo.setSpeechNodeId(form.getSpeechNodeId());
            bizSpeechInfo.setSortIndex(form.getSortIndex());
            bizSpeechInfo.setModifyId(ShiroUtils.getUserId());
            bizSpeechInfo.setModifyTime(new Date());
            bizSpeechInfoService.updateById(bizSpeechInfo);

        }

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/deleteSpeechNode")
    public R delete(@RequestParam Long speechNodeId) {

        if (speechNodeId == null || speechNodeId < 0L) {

            return R.error(HttpStatus.SC_BAD_REQUEST, "请求参数错误");
        }

        BizSpeechInfoEntity bizSpeechInfo = new BizSpeechInfoEntity();
        bizSpeechInfo.setModifyId(ShiroUtils.getUserId());
        bizSpeechInfo.setModifyTime(new Date());
        bizSpeechInfo.setIsDelete(CmsCommomConstant.IS_DELETE.DELETE);
        bizSpeechInfo.setSpeechNodeId(speechNodeId);

        bizSpeechInfoService.updateById(bizSpeechInfo);
        return R.ok();
    }

}
