package cn.edu.shu.xj.ser.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "middle", schema = "school", catalog = "")
public class MiddleEntity {
    private String middleName;
    private String middleAddress;

    @Basic
    @Column(name = "middle_name")
    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    @Basic
    @Column(name = "middle_address")
    public String getMiddleAddress() {
        return middleAddress;
    }

    public void setMiddleAddress(String middleAddress) {
        this.middleAddress = middleAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MiddleEntity that = (MiddleEntity) o;
        return Objects.equals(middleName, that.middleName) &&
                Objects.equals(middleAddress, that.middleAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(middleName, middleAddress);
    }
}
