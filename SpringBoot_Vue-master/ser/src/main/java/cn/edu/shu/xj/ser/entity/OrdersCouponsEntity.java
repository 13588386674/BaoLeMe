package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders_coupons", schema = "school", catalog = "")
@IdClass(OrdersCouponsEntityPK.class)
public class OrdersCouponsEntity {
    private int couponId;
    private int userId;
    private int shopId;
    private int ordersCouponsNeed;
    private int ordersCouponsAlready;

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
    @Column(name = "orders_coupons_need")
    public int getOrdersCouponsNeed() {
        return ordersCouponsNeed;
    }

    public void setOrdersCouponsNeed(int ordersCouponsNeed) {
        this.ordersCouponsNeed = ordersCouponsNeed;
    }

    @Basic
    @Column(name = "orders_coupons_already")
    public int getOrdersCouponsAlready() {
        return ordersCouponsAlready;
    }

    public void setOrdersCouponsAlready(int ordersCouponsAlready) {
        this.ordersCouponsAlready = ordersCouponsAlready;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersCouponsEntity that = (OrdersCouponsEntity) o;
        return couponId == that.couponId &&
                userId == that.userId &&
                shopId == that.shopId &&
                ordersCouponsNeed == that.ordersCouponsNeed &&
                ordersCouponsAlready == that.ordersCouponsAlready;
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, userId, shopId, ordersCouponsNeed, ordersCouponsAlready);
    }
}
