package cn.edu.shu.xj.ser.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OutRiderEntryEntityPK implements Serializable {
    private int addId;
    private int outRiderId;

    @Column(name = "add_id")
    @Id
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Column(name = "out_rider_id")
    @Id
    public int getOutRiderId() {
        return outRiderId;
    }

    public void setOutRiderId(int outRiderId) {
        this.outRiderId = outRiderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OutRiderEntryEntityPK that = (OutRiderEntryEntityPK) o;
        return addId == that.addId &&
                outRiderId == that.outRiderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(addId, outRiderId);
    }
}
