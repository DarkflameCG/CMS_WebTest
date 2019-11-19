package com.briup.apps.cms.web.controller;

import com.briup.apps.cms.util.Message;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author GX Cui
 * @ClassName: UserController
 * @Description: TODO
 * @date 2019/11/18 15:28
 */
@Api("用户操作接口")
@RestController
@RequestMapping("/user")
public class UserController {

    /*@ApiOperation(value = "用户登录",httpMethod = "POST")
    @PostMapping("/login")
    public Message userLogin(){

    }
    @ApiOperation(value = "用户注销",httpMethod = "POST")
    @PostMapping("/logout")
    public Message userLogout(){

    }
    @ApiOperation(value = "获取用户信息",httpMethod = "GET")
    @GetMapping("/info")
    public Message userInfo(){

    }*/


}
