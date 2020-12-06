package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "rider_entry", schema = "school", catalog = "")
@IdClass(RiderEntryEntityPK.class)
public class RiderEntryEntity {
    private int riderId;
    private int addId;
    private Timestamp riderEntryTime;
    private String riderEntryEvaluation;
    private Integer riderEntryIncome;

    @Id
    @Column(name = "rider_id")
    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    @Id
    @Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Basic
    @Column(name = "rider_entry_time")
    public Timestamp getRiderEntryTime() {
        return riderEntryTime;
    }

    public void setRiderEntryTime(Timestamp riderEntryTime) {
        this.riderEntryTime = riderEntryTime;
    }

    @Basic
    @Column(name = "rider_entry_evaluation")
    public String getRiderEntryEvaluation() {
        return riderEntryEvaluation;
    }

    public void setRiderEntryEvaluation(String riderEntryEvaluation) {
        this.riderEntryEvaluation = riderEntryEvaluation;
    }

    @Basic
    @Column(name = "rider_entry_income")
    public Integer getRiderEntryIncome() {
        return riderEntryIncome;
    }

    public void setRiderEntryIncome(Integer riderEntryIncome) {
        this.riderEntryIncome = riderEntryIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiderEntryEntity that = (RiderEntryEntity) o;
        return riderId == that.riderId &&
                addId == that.addId &&
                Objects.equals(riderEntryTime, that.riderEntryTime) &&
                Objects.equals(riderEntryEvaluation, that.riderEntryEvaluation) &&
                Objects.equals(riderEntryIncome, that.riderEntryIncome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(riderId, addId, riderEntryTime, riderEntryEvaluation, riderEntryIncome);
    }
}
