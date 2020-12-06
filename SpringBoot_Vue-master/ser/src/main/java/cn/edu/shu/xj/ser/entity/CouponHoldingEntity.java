package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "coupon_holding", schema = "school", catalog = "")
@IdClass(CouponHoldingEntityPK.class)
public class CouponHoldingEntity {
    private int couponId;
    private int userId;
    private int shopId;
    private Integer quantity;
    private Timestamp closingDate;
    private Integer youhui;

    @Id
    @Column(name = "coupon_id")
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Id
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Id
    @Column(name = "shop_id")
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "closingDate")
    public Timestamp getClosingDate() {
        return closingDate;
    }

    public void setClosingDate(Timestamp closingDate) {
        this.closingDate = closingDate;
    }

    @Basic
    @Column(name = "youhui")
    public Integer getYouhui() {
        return youhui;
    }

    public void setYouhui(Integer youhui) {
        this.youhui = youhui;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CouponHoldingEntity that = (CouponHoldingEntity) o;
        return couponId == that.couponId &&
                userId == that.userId &&
                shopId == that.shopId &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(closingDate, that.closingDate) &&
                Objects.equals(youhui, that.youhui);
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, userId, shopId, quantity, closingDate, youhui);
    }
}
