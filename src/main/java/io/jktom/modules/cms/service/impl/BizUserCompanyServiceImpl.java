package io.jktom.modules.cms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;

import io.jktom.modules.cms.dao.BizUserCompanyDao;
import io.jktom.modules.cms.entity.BizUserCompanyEntity;
import io.jktom.modules.cms.service.BizUserCompanyService;


@Service("bizUserCompanyService")
public class BizUserCompanyServiceImpl extends ServiceImpl<BizUserCompanyDao, BizUserCompanyEntity> implements BizUserCompanyService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BizUserCompanyEntity> page = this.selectPage(
                new Query<BizUserCompanyEntity>(params).getPage(),
                new EntityWrapper<BizUserCompanyEntity>()
        );

        return new PageUtils(page);
    }

}
