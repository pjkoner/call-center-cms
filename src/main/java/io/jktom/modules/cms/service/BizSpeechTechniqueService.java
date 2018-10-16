package io.jktom.modules.cms.service;

import com.baomidou.mybatisplus.service.IService;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.modules.cms.entity.BizSpeechTechniqueEntity;
import io.jktom.modules.cms.form.SpeechTechniqueForm;
import io.jktom.modules.sys.entity.SysUserEntity;

import java.util.Map;

/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-16 17:30:19
 */
public interface BizSpeechTechniqueService extends IService<BizSpeechTechniqueEntity> {

    PageUtils queryPage(Map<String, Object> params);

    R saveSpeechTechnique(SysUserEntity user, SpeechTechniqueForm speechTechniqueForm);
}

