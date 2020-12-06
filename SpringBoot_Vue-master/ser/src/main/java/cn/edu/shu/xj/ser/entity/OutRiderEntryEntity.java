package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "out_rider_entry", schema = "school", catalog = "")
@IdClass(OutRiderEntryEntityPK.class)
public class OutRiderEntryEntity {
    private int addId;
    private int outRiderId;
    private Timestamp outRiderEntryTime;
    private String outRiderEntryEvaluation;
    private Integer outRiderEntryIncome;

    @Id
    @Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Id
    @Column(name = "out_rider_id")
    public int getOutRiderId() {
        return outRiderId;
    }

    public void setOutRiderId(int outRiderId) {
        this.outRiderId = outRiderId;
    }

    @Basic
    @Column(name = "out_rider_entry_time")
    public Timestamp getOutRiderEntryTime() {
        return outRiderEntryTime;
    }

    public void setOutRiderEntryTime(Timestamp outRiderEntryTime) {
        this.outRiderEntryTime = outRiderEntryTime;
    }

    @Basic
    @Column(name = "out_rider_entry_evaluation")
    public String getOutRiderEntryEvaluation() {
        return outRiderEntryEvaluation;
    }

    public void setOutRiderEntryEvaluation(String outRiderEntryEvaluation) {
        this.outRiderEntryEvaluation = outRiderEntryEvaluation;
    }

    @Basic
    @Column(name = "out_rider_entry_income")
    public Integer getOutRiderEntryIncome() {
        return outRiderEntryIncome;
    }

    public void setOutRiderEntryIncome(Integer outRiderEntryIncome) {
        this.outRiderEntryIncome = outRiderEntryIncome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutRiderEntryEntity that = (OutRiderEntryEntity) o;
        return addId == that.addId &&
                outRiderId == that.outRiderId &&
                Objects.equals(outRiderEntryTime, that.outRiderEntryTime) &&
                Objects.equals(outRiderEntryEvaluation, that.outRiderEntryEvaluation) &&
                Objects.equals(outRiderEntryIncome, that.outRiderEntryIncome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addId, outRiderId, outRiderEntryTime, outRiderEntryEvaluation, outRiderEntryIncome);
    }
}
