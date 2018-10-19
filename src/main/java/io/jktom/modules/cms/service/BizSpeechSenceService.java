package io.jktom.modules.cms.service;

import com.baomidou.mybatisplus.service.IService;
import io.jktom.common.utils.PageUtils;
import io.jktom.modules.cms.entity.BizSpeechSenceEntity;
import io.jktom.modules.cms.form.SpeechTechniqueForm;
import io.jktom.modules.sys.entity.SysUserEntity;

import java.util.Map;

/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-18 11:08:29
 */
public interface BizSpeechSenceService extends IService<BizSpeechSenceEntity> {

    PageUtils queryPage(Map<String, Object> params);

    void insertSpeech(SpeechTechniqueForm speechTechniqueForm,SysUserEntity user);
}

