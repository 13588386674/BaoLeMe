package cn.edu.shu.xj.ser.controller;

import cn.edu.shu.xj.ser.service.IUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.EmptyStackException;

@Api(tags = "用户接口")
@RestController
public class UserController {

    @Autowired
    IUserService userService;

    @ApiOperation(value = "查询用户密码")
    @GetMapping("/query")
    public String queryUserpwd(String phoneNum){
        String userpwd = userService.findUserPwd(phoneNum);
        return userpwd;
    }

    @ApiOperation(value = "用户注册")
    @GetMapping("/query")
    public void queryRegisteruser(String userName, String userSex, String pwd, String phoneNum, String userEmail){
        userService.registerUser(userName, userSex, pwd, phoneNum, userEmail);
    }
}
