package io.jktom.modules.cms.service.impl;

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
        Page<BizSpeechSenceEntity> page = this.selectPage(
                new Query<BizSpeechSenceEntity>(params).getPage(),
                new EntityWrapper<BizSpeechSenceEntity>()
        );

        return new PageUtils(page);
    }

}
