package cn.edu.shu.xj.ser.mapper;

import cn.edu.shu.xj.ser.entity.MyuserEntity;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {

    /**
     * @param userphone
     * @return
     */
    @Select("select user_pwd from myuser where user_phone =#{userphone}")
    String findUserPwd(@Param("userphone") String userphone);

    /**
     * @param userName, userSex, pwd, phoneNum, userEmail
     * @return
     */

    @Select("insert into myuser(user_name, user_sex, user_pwd, user_phone, user_email) " +
            "values(#{userName},#{userSex},#{userSex},#{phoneNum},#{userEmail})")
    void registerUser(@Param("userName, userSex, userSex, phoneNum, userEmail") String userName, String userSex, String pwd, String phoneNum, String userEmail);
}
