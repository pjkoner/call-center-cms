package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.jktom.modules.cms.entity.BizSpeechInfoEntity;
import io.jktom.modules.cms.service.BizSpeechInfoService;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;



/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-16 17:30:19
 */
@RestController
public class BizSpeechInfoController {
    @Autowired
    private BizSpeechInfoService bizSpeechInfoService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bizSpeechInfoService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{speechInfoId}")
    public R info(@PathVariable("speechInfoId") Integer speechInfoId){
			BizSpeechInfoEntity bizSpeechInfo = bizSpeechInfoService.selectById(speechInfoId);

        return R.ok().put("bizSpeechInfo", bizSpeechInfo);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BizSpeechInfoEntity bizSpeechInfo){
			bizSpeechInfoService.insert(bizSpeechInfo);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BizSpeechInfoEntity bizSpeechInfo){
			bizSpeechInfoService.updateById(bizSpeechInfo);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] speechInfoIds){
			bizSpeechInfoService.deleteBatchIds(Arrays.asList(speechInfoIds));

        return R.ok();
    }

}
