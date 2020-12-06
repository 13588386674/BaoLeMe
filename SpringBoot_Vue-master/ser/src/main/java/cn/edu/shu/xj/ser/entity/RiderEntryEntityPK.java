package cn.edu.shu.xj.ser.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class RiderEntryEntityPK implements Serializable {
    private int riderId;
    private int addId;

    @Column(name = "rider_id")
    @Id
    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    @Column(name = "add_id")
    @Id
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RiderEntryEntityPK that = (RiderEntryEntityPK) o;
        return riderId == that.riderId &&
                addId == that.addId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(riderId, addId);
    }
}
