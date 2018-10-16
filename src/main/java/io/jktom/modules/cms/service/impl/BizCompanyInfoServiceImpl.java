package io.jktom.modules.cms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;

import io.jktom.modules.cms.dao.BizCompanyInfoDao;
import io.jktom.modules.cms.entity.BizCompanyInfoEntity;
import io.jktom.modules.cms.service.BizCompanyInfoService;


@Service("bizCompanyInfoService")
public class BizCompanyInfoServiceImpl extends ServiceImpl<BizCompanyInfoDao, BizCompanyInfoEntity> implements BizCompanyInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BizCompanyInfoEntity> page = this.selectPage(
                new Query<BizCompanyInfoEntity>(params).getPage(),
                new EntityWrapper<BizCompanyInfoEntity>()
        );

        return new PageUtils(page);
    }

}
