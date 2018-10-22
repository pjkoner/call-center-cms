package io.jktom.modules.cms.service.impl;

import io.jktom.common.utils.R;
import io.jktom.modules.cms.bo.QueryBizSpeechInfoBO;
import io.jktom.modules.cms.constant.CmsCommomConstant;
import io.jktom.modules.cms.entity.BizSpeechInfoEntity;
import io.jktom.modules.cms.vo.SpeechInfoVO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.Query;

import io.jktom.modules.cms.dao.BizSpeechInfoDao;
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

    @Override
    public R selectSpeechInfolist(Long speechId) {

        QueryBizSpeechInfoBO BO = new QueryBizSpeechInfoBO();
        BO.setSpeechId(speechId);
        BO.setIsDelete(CmsCommomConstant.IS_DELETE.NOT_DELETE);
        List<BizSpeechInfoEntity> bizSpeechInfoEntities = baseMapper.selectBizSpeechInfoList(BO);

        List<SpeechInfoVO> speechInfoVOS = new ArrayList<SpeechInfoVO>();
        for(BizSpeechInfoEntity bizSpeechInfo : bizSpeechInfoEntities){

            SpeechInfoVO speechInfoVO = new SpeechInfoVO();
            speechInfoVO.setSpeechNodeId(bizSpeechInfo.getSpeechNodeId());
            speechInfoVO.setSpeechId(bizSpeechInfo.getSpeechId());
            speechInfoVO.setSortIndex(bizSpeechInfo.getSortIndex());
            speechInfoVO.setSpeechName(bizSpeechInfo.getNodeName());
            speechInfoVOS.add(speechInfoVO);
        }

        return R.ok("成功请求").put("data",speechInfoVOS);
    }


}
