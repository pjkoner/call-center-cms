package io.jktom.modules.cms.service;


import com.baomidou.mybatisplus.service.IService;
import io.jktom.common.utils.PageUtils;
import io.jktom.modules.cms.entity.AutodialerTimegroupEntity;

import java.util.Map;

/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-08 10:03:15
 */
public interface AutodialerTimegroupService extends IService<AutodialerTimegroupEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

