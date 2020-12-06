package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "sort", schema = "school", catalog = "")
public class SortEntity {
    private int sortId;
    private String sortName;

    @Id
    @Column(name = "sort_id")
    public int getSortId() {
        return sortId;
    }

    public void setSortId(int sortId) {
        this.sortId = sortId;
    }

    @Basic
    @Column(name = "sort_name")
    public String getSortName() {
        return sortName;
    }

    public void setSortName(String sortName) {
        this.sortName = sortName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SortEntity that = (SortEntity) o;
        return sortId == that.sortId &&
                Objects.equals(sortName, that.sortName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sortId, sortName);
    }
}
