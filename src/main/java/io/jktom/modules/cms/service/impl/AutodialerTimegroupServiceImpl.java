package io.jktom.modules.cms.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;
import io.jktom.modules.cms.dao.AutodialerTimegroupDao;
import io.jktom.modules.cms.entity.AutodialerTimegroupEntity;
import io.jktom.modules.cms.service.AutodialerTimegroupService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("autodialerTimegroupService")
public class AutodialerTimegroupServiceImpl extends ServiceImpl<AutodialerTimegroupDao, AutodialerTimegroupEntity> implements AutodialerTimegroupService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AutodialerTimegroupEntity> page = this.selectPage(
                new Query<AutodialerTimegroupEntity>(params).getPage(),
                new EntityWrapper<AutodialerTimegroupEntity>()
        );

        return new PageUtils(page);
    }

}
