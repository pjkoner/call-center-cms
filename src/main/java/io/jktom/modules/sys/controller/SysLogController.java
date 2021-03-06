/**
 * Copyright 2018 人人开源 http://www.renren.io
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * <p>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */

package io.jktom.modules.sys.controller;

import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.common.utils.PageUtils;
import io.jktom.common.utils.R;
import io.jktom.modules.sys.service.SysLogService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;


/**
 * 系统日志
 * 
 * @author pjk
 * @email pjk2018@gmail.com
 * @date 2018-10-04 10:40:56
 */
@Controller
@RequestMapping("/sys/log")
public class SysLogController {
	@Autowired
	private SysLogService sysLogService;
	
	/**
	 * 列表
	 */
	@ResponseBody
	@PostMapping("/list")
	public R list(@RequestBody Map<String, Object> params){

		PageUtils page = sysLogService.queryPage(params);

		return R.ok().put("page", page);
	}
	
}
