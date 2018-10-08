package io.jktom.modules.cms.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;
import io.jktom.modules.cms.dao.AutodialerTimerangeDao;
import io.jktom.modules.cms.entity.AutodialerTimerangeEntity;
import io.jktom.modules.cms.service.AutodialerTimerangeService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("autodialerTimerangeService")
public class AutodialerTimerangeServiceImpl extends ServiceImpl<AutodialerTimerangeDao, AutodialerTimerangeEntity> implements AutodialerTimerangeService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AutodialerTimerangeEntity> page = this.selectPage(
                new Query<AutodialerTimerangeEntity>(params).getPage(),
                new EntityWrapper<AutodialerTimerangeEntity>()
        );

        return new PageUtils(page);
    }

}
