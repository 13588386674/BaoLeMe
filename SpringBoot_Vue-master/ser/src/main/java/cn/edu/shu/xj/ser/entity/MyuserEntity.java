package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "myuser", schema = "school", catalog = "")
public class MyuserEntity {
    private int userId;
    private String userName;
    private String userSex;
    private String userPwd;
    private String userPhone;
    private String userEmail;
    private Timestamp userRigisterTime;
    private Byte userVip;
    private Timestamp userVipTime;
    private Integer userMoney;

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_sex")
    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) {
        this.userSex = userSex;
    }

    @Basic
    @Column(name = "user_pwd")
    public String getUserPwd() {
        return userPwd;
    }

    public void setUserPwd(String userPwd) {
        this.userPwd = userPwd;
    }

    @Basic
    @Column(name = "user_phone")
    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Basic
    @Column(name = "user_rigister_time")
    public Timestamp getUserRigisterTime() {
        return userRigisterTime;
    }

    public void setUserRigisterTime(Timestamp userRigisterTime) {
        this.userRigisterTime = userRigisterTime;
    }

    @Basic
    @Column(name = "user_VIP")
    public Byte getUserVip() {
        return userVip;
    }

    public void setUserVip(Byte userVip) {
        this.userVip = userVip;
    }

    @Basic
    @Column(name = "user_VIP_time")
    public Timestamp getUserVipTime() {
        return userVipTime;
    }

    public void setUserVipTime(Timestamp userVipTime) {
        this.userVipTime = userVipTime;
    }

    @Basic
    @Column(name = "user_money")
    public Integer getUserMoney() {
        return userMoney;
    }

    public void setUserMoney(Integer userMoney) {
        this.userMoney = userMoney;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyuserEntity that = (MyuserEntity) o;
        return userId == that.userId &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userSex, that.userSex) &&
                Objects.equals(userPwd, that.userPwd) &&
                Objects.equals(userPhone, that.userPhone) &&
                Objects.equals(userEmail, that.userEmail) &&
                Objects.equals(userRigisterTime, that.userRigisterTime) &&
                Objects.equals(userVip, that.userVip) &&
                Objects.equals(userVipTime, that.userVipTime) &&
                Objects.equals(userMoney, that.userMoney);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, userName, userSex, userPwd, userPhone, userEmail, userRigisterTime, userVip, userVipTime, userMoney);
    }
}
