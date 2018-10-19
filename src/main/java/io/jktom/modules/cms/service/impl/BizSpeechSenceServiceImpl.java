package io.jktom.modules.cms.service.impl;

import io.jktom.modules.cms.form.SpeechTechniqueForm;
import io.jktom.modules.sys.entity.SysUserEntity;
import org.springframework.stereotype.Service;
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
                        .like("speechName",speechName)
                        .eq(speechType != 0 ,"status",speechType)

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
        speechSence.setStatus(1);
        speechSence.setCreateId(user.getUserId());

        this.insert(speechSence);
    }
}
