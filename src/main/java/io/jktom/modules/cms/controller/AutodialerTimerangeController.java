package io.jktom.modules.cms.controller;

import java.util.Arrays;
import java.util.Map;

import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.modules.cms.entity.AutodialerTimerangeEntity;
import io.jktom.modules.cms.service.AutodialerTimerangeService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




/**
 * 
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-08 10:03:15
 */
@RestController
@RequestMapping("generator/autodialertimerange")
public class AutodialerTimerangeController {
    @Autowired
    private AutodialerTimerangeService autodialerTimerangeService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = autodialerTimerangeService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{uuid}")
    public R info(@PathVariable("uuid") String uuid){
			AutodialerTimerangeEntity autodialerTimerange = autodialerTimerangeService.selectById(uuid);

        return R.ok().put("autodialerTimerange", autodialerTimerange);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody AutodialerTimerangeEntity autodialerTimerange){
			autodialerTimerangeService.insert(autodialerTimerange);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody AutodialerTimerangeEntity autodialerTimerange){
			autodialerTimerangeService.updateById(autodialerTimerange);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody String[] uuids){
			autodialerTimerangeService.deleteBatchIds(Arrays.asList(uuids));

        return R.ok();
    }

}
