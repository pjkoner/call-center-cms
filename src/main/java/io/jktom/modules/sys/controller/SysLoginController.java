package io.jktom.modules.sys.controller;

import io.jktom.common.utils.R;
import io.jktom.common.validator.ValidatorUtils;
import io.jktom.modules.sys.entity.SysUserEntity;
import io.jktom.modules.sys.form.LoginForm;
import io.jktom.modules.sys.service.SysCaptchaService;
import io.jktom.modules.sys.service.SysUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.io.IOUtils;
import org.apache.shiro.crypto.hash.Sha256Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Map;

/**
 * 登录相关
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018年10月4日 下午1:15:31
 */
@RestController
@Api("登陆注册")
public class SysLoginController extends AbstractController {
	@Autowired
	private SysUserService sysUserService;

	@Autowired
	private SysCaptchaService sysCaptchaService;

	/**
	 * 验证码
	 */
	@ApiOperation("获取验证码图片")
	@GetMapping("captcha.jpg")
	public void captcha(HttpServletResponse response,@RequestParam("uuid") String uuid)throws ServletException, IOException {
		response.setHeader("Cache-Control", "no-store, no-cache");
		response.setContentType("image/jpeg");

		//获取图片验证码
		BufferedImage image = sysCaptchaService.getCaptcha(uuid);

		ServletOutputStream out = response.getOutputStream();
		ImageIO.write(image, "jpg", out);
		IOUtils.closeQuietly(out);
	}

	/**
	 * 登录
	 */
	@ApiOperation("登陆入口")
	@PostMapping("/sys/login")
	public Map<String, Object> login(@RequestBody LoginForm form)throws IOException {
		//验证码
//		boolean captcha = sysCaptchaService.validate(form.getUuid(), form.getCaptcha());
//		if(!captcha){
//			return R.error("验证码不正确");
//		}

		//表单校验
		ValidatorUtils.validateEntity(form);
		//用户信息
		SysUserEntity user = sysUserService.queryByUserMobile(form.getM());

		//账号不存在、密码错误
		if(user == null || !user.getPassword().equals(new Sha256Hash(form.getP(), user.getSalt()).toHex())) {
			return R.error("账号或密码不正确");
		}

		//账号锁定
		if(user.getStatus() == 0){
			return R.error("账号已被锁定,请联系管理员");
		}

		//生成token 返回前端
		R r = sysUserService.createToken(user.getUserId());
		return r;
	}


	/**
	 * 退出
	 */
	@ApiOperation("退出入口")
	@PostMapping("/sys/logout")
	public R logout() {



		return R.ok();
	}


	/**
	 * 注册
	 */
	@ApiOperation("注册入口")
	@PostMapping("/sys/register")
	public Map<String, Object> register(@RequestBody LoginForm form) throws IOException{

		//验证码
//		boolean captcha = sysCaptchaService.validate(form.getUuid(), form.getCaptcha());
//		if(!captcha){
//			return R.error("验证码不正确");
//		}

		SysUserEntity user = new SysUserEntity();

		user.setPassword(form.getP());
		user.setUsername(form.getM());
		user.setMobile(form.getM());
		//注册
		user.setCreateUserId(0L);
		user.setStatus(1);
		sysUserService.save(user);
		return R.ok();
	}

	
}
