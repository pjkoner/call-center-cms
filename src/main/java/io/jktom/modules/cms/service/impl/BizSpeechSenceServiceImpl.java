package io.jktom.modules.cms.service.impl;

import io.jktom.modules.cms.constant.CmsCommomConstant;
import io.jktom.modules.cms.form.SpeechTechniqueForm;
import io.jktom.modules.sys.entity.SysUserEntity;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;

import io.jktom.modules.cms.dao.BizSpeechSenceDao;
import io.jktom.modules.cms.entity.BizSpeechSenceEntity;
import io.jktom.modules.cms.service.BizSpeechSenceService;


@Service("bizSpeechSenceService")
public class BizSpeechSenceServiceImpl extends ServiceImpl<BizSpeechSenceDao, BizSpeechSenceEntity> implements BizSpeechSenceService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {

        String speechName = (String)params.get("speechName");

        Integer speechType = (Integer)params.get("speechType");

        Page<BizSpeechSenceEntity> page = this.selectPage(
                new Query<BizSpeechSenceEntity>(params).getPage(),
                new EntityWrapper<BizSpeechSenceEntity>()
                        .like("speech_name",speechName)
                        .eq(speechType != 0 ,"status",speechType)
                        .eq("is_delete",0)


        );

        return new PageUtils(page);
    }


    @Override
    public void insertSpeech(SpeechTechniqueForm form, SysUserEntity user) {

        BizSpeechSenceEntity speechSence = new BizSpeechSenceEntity();
        speechSence.setSpeechName(form.getSpeechName());
        if(null != form.getSpeechMark()){
            speechSence.setMark(form.getSpeechMark());
        }
        //默认未发布
        speechSence.setStatus(CmsCommomConstant.SPEECH_STATUS.NOT_ISSUE);
        speechSence.setCreateId(user.getUserId());
        speechSence.setCreateTime(new Date());
        speechSence.setIsDelete(CmsCommomConstant.IS_DELETE.NOT_DELETE);

        this.insert(speechSence);
    }
}
