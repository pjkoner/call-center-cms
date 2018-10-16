package io.jktom.modules.cms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;

import io.jktom.modules.cms.dao.BizSpeechTechniqueDao;
import io.jktom.modules.cms.entity.BizSpeechTechniqueEntity;
import io.jktom.modules.cms.service.BizSpeechTechniqueService;


@Service("bizSpeechTechniqueService")
public class BizSpeechTechniqueServiceImpl extends ServiceImpl<BizSpeechTechniqueDao, BizSpeechTechniqueEntity> implements BizSpeechTechniqueService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BizSpeechTechniqueEntity> page = this.selectPage(
                new Query<BizSpeechTechniqueEntity>(params).getPage(),
                new EntityWrapper<BizSpeechTechniqueEntity>()
        );

        return new PageUtils(page);
    }

}
