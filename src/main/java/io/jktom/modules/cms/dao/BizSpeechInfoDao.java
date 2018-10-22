package io.jktom.modules.cms.dao;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import io.jktom.modules.cms.bo.QueryBizSpeechInfoBO;
import io.jktom.modules.cms.entity.BizSpeechInfoEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-18 11:08:29
 */
@Mapper
public interface BizSpeechInfoDao extends BaseMapper<BizSpeechInfoEntity> {

    /** 添加 */
    public int insertBizSpeechInfo(BizSpeechInfoEntity bizSpeechInfo);

    /** 根据主键查询 */
    public BizSpeechInfoEntity selectBizSpeechInfoById(Long speechNodeId);

    /** 查询1条 */
    public BizSpeechInfoEntity selectOneBizSpeechInfo(QueryBizSpeechInfoBO query);

    /** 查询列表 */
    public List<BizSpeechInfoEntity> selectBizSpeechInfoList(QueryBizSpeechInfoBO query);

    /** 分页计数 */
    public int selectBizSpeechInfoCount(QueryBizSpeechInfoBO query);

    /** 分页查找 */
    public List<BizSpeechInfoEntity> selectBizSpeechInfoPage(QueryBizSpeechInfoBO query);

    /** 完全修改 */
    public int updateBizSpeechInfo(BizSpeechInfoEntity bizSpeechInfo);

    /** 选择性修改 */
    public int updateBizSpeechInfoSelective(BizSpeechInfoEntity bizSpeechInfo);

    /** 删除 */
    public int deleteBizSpeechInfo(Long speechNodeId);
	
}
