package cn.edu.shu.xj.ser.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class OrdersCouponsEntityPK implements Serializable {
    private int couponId;
    private int userId;
    private int shopId;

    @Column(name = "coupon_id")
    @Id
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Column(name = "user_id")
    @Id
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Column(name = "shop_id")
    @Id
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersCouponsEntityPK that = (OrdersCouponsEntityPK) o;
        return couponId == that.couponId &&
                userId == that.userId &&
                shopId == that.shopId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(couponId, userId, shopId);
    }
}
