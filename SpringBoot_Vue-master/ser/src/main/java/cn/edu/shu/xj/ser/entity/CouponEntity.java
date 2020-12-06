package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "coupon", schema = "school", catalog = "")
public class CouponEntity {
    private int couponId;
    private int couponYouhui;
    private int couponListNum;
    private Timestamp couponTimeStart;
    private Timestamp couponTimeFinish;

    @Id
    @Column(name = "coupon_id")
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Basic
    @Column(name = "coupon_youhui")
    public int getCouponYouhui() {
        return couponYouhui;
    }

    public void setCouponYouhui(int couponYouhui) {
        this.couponYouhui = couponYouhui;
    }

    @Basic
    @Column(name = "coupon_list_num")
    public int getCouponListNum() {
        return couponListNum;
    }

    public void setCouponListNum(int couponListNum) {
        this.couponListNum = couponListNum;
    }

    @Basic
    @Column(name = "coupon_time_start")
    public Timestamp getCouponTimeStart() {
        return couponTimeStart;
    }

    public void setCouponTimeStart(Timestamp couponTimeStart) {
        this.couponTimeStart = couponTimeStart;
    }

    @Basic
    @Column(name = "coupon_time_finish")
    public Timestamp getCouponTimeFinish() {
        return couponTimeFinish;
    }

    public void setCouponTimeFinish(Timestamp couponTimeFinish) {
        this.couponTimeFinish = couponTimeFinish;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponEntity that = (CouponEntity) o;
        return couponId == that.couponId &&
                couponYouhui == that.couponYouhui &&
                couponListNum == that.couponListNum &&
                Objects.equals(couponTimeStart, that.couponTimeStart) &&
                Objects.equals(couponTimeFinish, that.couponTimeFinish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, couponYouhui, couponListNum, couponTimeStart, couponTimeFinish);
    }
}
