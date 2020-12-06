package cn.edu.shu.xj.ser.service.impl;

import cn.edu.shu.xj.ser.mapper.UserMapper;
import cn.edu.shu.xj.ser.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService {

    @Autowired
    UserMapper userMapper;

    public String findUserPwd(String userphone){ return userMapper.findUserPwd(userphone); }

    @Override
    public void registerUser(String userName, String userSex, String pwd, String phoneNum, String userEmail) {
        userMapper.registerUser(userName, userSex, pwd, phoneNum, userEmail);
    }
}
