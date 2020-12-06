package cn.edu.shu.xj.ser.service;


public interface IUserService {
    /*通过用户手机号找到该用户的密码*/
    String findUserPwd(String userphone);
    /*注册用户*/
    void registerUser(String userName, String userSex, String pwd, String phoneNum, String userEmail);
}
