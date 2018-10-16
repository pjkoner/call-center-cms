package io.jktom.modules.cms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;

import io.jktom.modules.cms.dao.BizSpeechInfoDao;
import io.jktom.modules.cms.entity.BizSpeechInfoEntity;
import io.jktom.modules.cms.service.BizSpeechInfoService;


@Service("bizSpeechInfoService")
public class BizSpeechInfoServiceImpl extends ServiceImpl<BizSpeechInfoDao, BizSpeechInfoEntity> implements BizSpeechInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BizSpeechInfoEntity> page = this.selectPage(
                new Query<BizSpeechInfoEntity>(params).getPage(),
                new EntityWrapper<BizSpeechInfoEntity>()
        );

        return new PageUtils(page);
    }

}
