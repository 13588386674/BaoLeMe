package cn.edu.shu.xj.ser.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class ShopOrderEntityPK implements Serializable {
    private int shopId;
    private int mjId;
    private int couponId;
    private int riderId;
    private int userId;
    private int addId;
    private int orderId;
    private int outRiderId;

    @Column(name = "shop_id")
    @Id
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Column(name = "mj_id")
    @Id
    public int getMjId() {
        return mjId;
    }

    public void setMjId(int mjId) {
        this.mjId = mjId;
    }

    @Column(name = "coupon_id")
    @Id
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Column(name = "rider_id")
    @Id
    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
    }

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "add_id")
    @Id
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Column(name = "order_id")
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
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
        ShopOrderEntityPK that = (ShopOrderEntityPK) o;
        return shopId == that.shopId &&
                mjId == that.mjId &&
                couponId == that.couponId &&
                riderId == that.riderId &&
                userId == that.userId &&
                addId == that.addId &&
                orderId == that.orderId &&
                outRiderId == that.outRiderId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, mjId, couponId, riderId, userId, addId, orderId, outRiderId);
    }
}
