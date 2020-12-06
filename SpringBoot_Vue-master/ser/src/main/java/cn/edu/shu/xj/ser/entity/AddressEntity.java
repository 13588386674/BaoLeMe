package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "address", schema = "school", catalog = "")
public class AddressEntity {
    private int addId;
    private String addDetail;
    private String addName;
    private String addPhone;

    @Id
    @Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Basic
    @Column(name = "add_detail")
    public String getAddDetail() {
        return addDetail;
    }

    public void setAddDetail(String addDetail) {
        this.addDetail = addDetail;
    }

    @Basic
    @Column(name = "add_name")
    public String getAddName() {
        return addName;
    }

    public void setAddName(String addName) {
        this.addName = addName;
    }

    @Basic
    @Column(name = "add_phone")
    public String getAddPhone() {
        return addPhone;
    }

    public void setAddPhone(String addPhone) {
        this.addPhone = addPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressEntity that = (AddressEntity) o;
        return addId == that.addId &&
                Objects.equals(addDetail, that.addDetail) &&
                Objects.equals(addName, that.addName) &&
                Objects.equals(addPhone, that.addPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(addId, addDetail, addName, addPhone);
    }
}
