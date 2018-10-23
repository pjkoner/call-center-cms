package io.jktom.modules.cms.controller;

import com.alibaba.fastjson.JSONObject;
import io.jktom.common.utils.R;
import io.jktom.modules.cms.service.BizSpeechInfoService;
import org.apache.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-22 09:31:38
 */
@RestController
@RequestMapping("speechTree")
public class BizSpeechTreeController {
    @Autowired
    private BizSpeechInfoService bizSpeechInfoService;

    /**
     * 保存话术树结构信息
     */
    @RequestMapping("/saveSpeechTree")
    public R saveSortIndex(@RequestBody JSONObject params) {

        if (null == params) {
            return R.error(HttpStatus.SC_BAD_REQUEST, "请求参数不能为空");
        }





        return R.ok();
    }


}
