package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "rider", schema = "school", catalog = "")
public class RiderEntity {
    private int riderId;
    private String riderName;
    private String riderPhone;
    private String riderPwd;
    private String riderAddress;

    @Id
    @Column(name = "rider_id")
    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    @Basic
    @Column(name = "rider_name")
    public String getRiderName() {
        return riderName;
    }

    public void setRiderName(String riderName) {
        this.riderName = riderName;
    }

    @Basic
    @Column(name = "rider_phone")
    public String getRiderPhone() {
        return riderPhone;
    }

    public void setRiderPhone(String riderPhone) {
        this.riderPhone = riderPhone;
    }

    @Basic
    @Column(name = "rider_pwd")
    public String getRiderPwd() {
        return riderPwd;
    }

    public void setRiderPwd(String riderPwd) {
        this.riderPwd = riderPwd;
    }

    @Basic
    @Column(name = "rider_address")
    public String getRiderAddress() {
        return riderAddress;
    }

    public void setRiderAddress(String riderAddress) {
        this.riderAddress = riderAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiderEntity that = (RiderEntity) o;
        return riderId == that.riderId &&
                Objects.equals(riderName, that.riderName) &&
                Objects.equals(riderPhone, that.riderPhone) &&
                Objects.equals(riderPwd, that.riderPwd) &&
                Objects.equals(riderAddress, that.riderAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riderId, riderName, riderPhone, riderPwd, riderAddress);
    }
}
