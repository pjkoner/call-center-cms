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

package io.jktom.modules.sys.form;


import javax.validation.constraints.NotBlank;

/**
 * 登录表单
 *
 * @author Mark pjk2018@gmail.com
 * @since 3.1.0 2018-01-25
 */

public class LoginForm {

    @NotBlank(message="手机号不能为空")
    private String m;


    @NotBlank(message="密码不能为空")
    private String p;

    public String getM() {
        return m;
    }

    public void setM(String m) {
        this.m = m;
    }

    public String getP() {
        return p;
    }

    public void setP(String p) {
        this.p = p;
    }
}
