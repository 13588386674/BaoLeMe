package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "mj", schema = "school", catalog = "")
public class MjEntity {
    private int mjId;
    private int mjMoney;
    private int mjYouhui;
    private byte mjFlagCoupon;

    @Id
    @Column(name = "mj_id")
    public int getMjId() {
        return mjId;
    }

    public void setMjId(int mjId) {
        this.mjId = mjId;
    }

    @Basic
    @Column(name = "mj_money")
    public int getMjMoney() {
        return mjMoney;
    }

    public void setMjMoney(int mjMoney) {
        this.mjMoney = mjMoney;
    }

    @Basic
    @Column(name = "mj_youhui")
    public int getMjYouhui() {
        return mjYouhui;
    }

    public void setMjYouhui(int mjYouhui) {
        this.mjYouhui = mjYouhui;
    }

    @Basic
    @Column(name = "mj_FlagCoupon")
    public byte getMjFlagCoupon() {
        return mjFlagCoupon;
    }

    public void setMjFlagCoupon(byte mjFlagCoupon) {
        this.mjFlagCoupon = mjFlagCoupon;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MjEntity mjEntity = (MjEntity) o;
        return mjId == mjEntity.mjId &&
                mjMoney == mjEntity.mjMoney &&
                mjYouhui == mjEntity.mjYouhui &&
                mjFlagCoupon == mjEntity.mjFlagCoupon;
    }

    @Override
    public int hashCode() {
        return Objects.hash(mjId, mjMoney, mjYouhui, mjFlagCoupon);
    }
}
