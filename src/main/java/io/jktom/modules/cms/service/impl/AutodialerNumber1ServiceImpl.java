package io.jktom.modules.cms.service.impl;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;
import io.jktom.modules.cms.dao.AutodialerNumber1Dao;
import io.jktom.modules.cms.entity.AutodialerNumber1Entity;
import io.jktom.modules.cms.service.AutodialerNumber1Service;
import org.springframework.stereotype.Service;
import java.util.Map;



@Service("autodialerNumber1Service")
public class AutodialerNumber1ServiceImpl extends ServiceImpl<AutodialerNumber1Dao, AutodialerNumber1Entity> implements AutodialerNumber1Service {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AutodialerNumber1Entity> page = this.selectPage(
                new Query<AutodialerNumber1Entity>(params).getPage(),
                new EntityWrapper<AutodialerNumber1Entity>()
        );

        return new PageUtils(page);
    }

}
