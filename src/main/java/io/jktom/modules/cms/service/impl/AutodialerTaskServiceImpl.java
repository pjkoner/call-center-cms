package io.jktom.modules.cms.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;
import io.jktom.modules.cms.dao.AutodialerTaskDao;
import io.jktom.modules.cms.entity.AutodialerTaskEntity;
import io.jktom.modules.cms.service.AutodialerTaskService;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("autodialerTaskService")
public class AutodialerTaskServiceImpl extends ServiceImpl<AutodialerTaskDao, AutodialerTaskEntity> implements AutodialerTaskService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AutodialerTaskEntity> page = this.selectPage(
                new Query<AutodialerTaskEntity>(params).getPage(),
                new EntityWrapper<AutodialerTaskEntity>()
        );

        return new PageUtils(page);
    }

}
