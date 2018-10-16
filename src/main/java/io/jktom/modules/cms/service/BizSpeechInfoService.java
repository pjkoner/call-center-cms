package io.jktom.modules.cms.service;

import com.baomidou.mybatisplus.service.IService;
import io.jktom.common.utils.PageUtils;
import io.jktom.modules.cms.entity.BizSpeechInfoEntity;

import java.util.Map;

/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-16 17:30:19
 */
public interface BizSpeechInfoService extends IService<BizSpeechInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

