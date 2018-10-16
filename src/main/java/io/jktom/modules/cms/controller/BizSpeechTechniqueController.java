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

import io.jktom.modules.cms.entity.BizSpeechTechniqueEntity;
import io.jktom.modules.cms.service.BizSpeechTechniqueService;
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
public class BizSpeechTechniqueController {
    @Autowired
    private BizSpeechTechniqueService bizSpeechTechniqueService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = bizSpeechTechniqueService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{speechId}")
    public R info(@PathVariable("speechId") Integer speechId){
			BizSpeechTechniqueEntity bizSpeechTechnique = bizSpeechTechniqueService.selectById(speechId);

        return R.ok().put("bizSpeechTechnique", bizSpeechTechnique);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody BizSpeechTechniqueEntity bizSpeechTechnique){
			bizSpeechTechniqueService.insert(bizSpeechTechnique);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody BizSpeechTechniqueEntity bizSpeechTechnique){
			bizSpeechTechniqueService.updateById(bizSpeechTechnique);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] speechIds){
			bizSpeechTechniqueService.deleteBatchIds(Arrays.asList(speechIds));

        return R.ok();
    }

}
