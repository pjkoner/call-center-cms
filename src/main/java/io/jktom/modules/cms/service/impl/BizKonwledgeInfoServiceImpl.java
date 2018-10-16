package io.jktom.modules.cms.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;

import io.jktom.modules.cms.dao.BizKonwledgeInfoDao;
import io.jktom.modules.cms.entity.BizKonwledgeInfoEntity;
import io.jktom.modules.cms.service.BizKonwledgeInfoService;


@Service("bizKonwledgeInfoService")
public class BizKonwledgeInfoServiceImpl extends ServiceImpl<BizKonwledgeInfoDao, BizKonwledgeInfoEntity> implements BizKonwledgeInfoService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BizKonwledgeInfoEntity> page = this.selectPage(
                new Query<BizKonwledgeInfoEntity>(params).getPage(),
                new EntityWrapper<BizKonwledgeInfoEntity>()
        );

        return new PageUtils(page);
    }

}
