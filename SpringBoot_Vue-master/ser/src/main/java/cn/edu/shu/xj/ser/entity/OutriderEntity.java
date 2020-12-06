package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "outrider", schema = "school", catalog = "")
public class OutriderEntity {
    private int outRiderId;
    private String outRiderName;
    private String outRiderStatus;
    private Timestamp outRiderTime;
    private String outRiderPhone;
    private String outRiderPwd;

    @Id
    @Column(name = "out_rider_id")
    public int getOutRiderId() {
        return outRiderId;
    }

    public void setOutRiderId(int outRiderId) {
        this.outRiderId = outRiderId;
    }

    @Basic
    @Column(name = "out_rider_name")
    public String getOutRiderName() {
        return outRiderName;
    }

    public void setOutRiderName(String outRiderName) {
        this.outRiderName = outRiderName;
    }

    @Basic
    @Column(name = "out_rider_status")
    public String getOutRiderStatus() {
        return outRiderStatus;
    }

    public void setOutRiderStatus(String outRiderStatus) {
        this.outRiderStatus = outRiderStatus;
    }

    @Basic
    @Column(name = "out_rider_time")
    public Timestamp getOutRiderTime() {
        return outRiderTime;
    }

    public void setOutRiderTime(Timestamp outRiderTime) {
        this.outRiderTime = outRiderTime;
    }

    @Basic
    @Column(name = "out_rider_phone")
    public String getOutRiderPhone() {
        return outRiderPhone;
    }

    public void setOutRiderPhone(String outRiderPhone) {
        this.outRiderPhone = outRiderPhone;
    }

    @Basic
    @Column(name = "out_rider_pwd")
    public String getOutRiderPwd() {
        return outRiderPwd;
    }

    public void setOutRiderPwd(String outRiderPwd) {
        this.outRiderPwd = outRiderPwd;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutriderEntity that = (OutriderEntity) o;
        return outRiderId == that.outRiderId &&
                Objects.equals(outRiderName, that.outRiderName) &&
                Objects.equals(outRiderStatus, that.outRiderStatus) &&
                Objects.equals(outRiderTime, that.outRiderTime) &&
                Objects.equals(outRiderPhone, that.outRiderPhone) &&
                Objects.equals(outRiderPwd, that.outRiderPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(outRiderId, outRiderName, outRiderStatus, outRiderTime, outRiderPhone, outRiderPwd);
    }
}
