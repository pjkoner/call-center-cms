package io.jktom.modules.cms.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;
import io.jktom.modules.cms.dao.AutodialerLogDao;
import io.jktom.modules.cms.entity.AutodialerLogEntity;
import io.jktom.modules.cms.service.AutodialerLogService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("autodialerLogService")
public class AutodialerLogServiceImpl extends ServiceImpl<AutodialerLogDao, AutodialerLogEntity> implements AutodialerLogService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AutodialerLogEntity> page = this.selectPage(
                new Query<AutodialerLogEntity>(params).getPage(),
                new EntityWrapper<AutodialerLogEntity>()
        );

        return new PageUtils(page);
    }

}
