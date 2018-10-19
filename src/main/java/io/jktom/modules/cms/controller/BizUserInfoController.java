package io.jktom.modules.cms.controller;


import io.jktom.common.utils.R;
import io.jktom.common.utils.ShiroUtils;
import io.jktom.modules.cms.annotation.Login;
import io.jktom.modules.cms.vo.UserInfoVO;
import io.jktom.modules.sys.controller.AbstractController;
import io.jktom.modules.sys.entity.SysUserEntity;
import io.jktom.modules.sys.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * APP测试接口
 *
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-04 15:47
 */
@RestController
@RequestMapping("/accountInfo")
@Api("APP测试接口")
public class BizUserInfoController {

    @Autowired
    private SysUserService userService;

    @Login
    @GetMapping("getUserInfo")
    @ApiOperation("获取用户信息")
    public R userInfo(){


        UserInfoVO userInfoVO = userService.getUserInfo(ShiroUtils.getUserEntity());

        return R.ok().put("data", userInfoVO);
    }

}
