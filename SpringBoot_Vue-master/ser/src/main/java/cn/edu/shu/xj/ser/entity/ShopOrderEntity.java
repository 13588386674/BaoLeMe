package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "shop_order", schema = "school", catalog = "")
@IdClass(ShopOrderEntityPK.class)
public class ShopOrderEntity {
    private int shopId;
    private int mjId;
    private int couponId;
    private int riderId;
    private int userId;
    private int addId;
    private int orderId;
    private int outRiderId;
    private int soOldMoney;
    private Integer soNewMoney;
    private Timestamp soOrderTime;
    private Timestamp soIntime;
    private String soState;

    @Id
    @Column(name = "shop_id")
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Id
    @Column(name = "mj_id")
    public int getMjId() {
        return mjId;
    }

    public void setMjId(int mjId) {
        this.mjId = mjId;
    }

    @Id
    @Column(name = "coupon_id")
    public int getCouponId() {
        return couponId;
    }

    public void setCouponId(int couponId) {
        this.couponId = couponId;
    }

    @Id
    @Column(name = "rider_id")
    public int getRiderId() {
        return riderId;
    }

    public void setRiderId(int riderId) {
        this.riderId = riderId;
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
    @Column(name = "add_id")
    public int getAddId() {
        return addId;
    }

    public void setAddId(int addId) {
        this.addId = addId;
    }

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Id
    @Column(name = "out_rider_id")
    public int getOutRiderId() {
        return outRiderId;
    }

    public void setOutRiderId(int outRiderId) {
        this.outRiderId = outRiderId;
    }

    @Basic
    @Column(name = "so_old_money")
    public int getSoOldMoney() {
        return soOldMoney;
    }

    public void setSoOldMoney(int soOldMoney) {
        this.soOldMoney = soOldMoney;
    }

    @Basic
    @Column(name = "so_new_money")
    public Integer getSoNewMoney() {
        return soNewMoney;
    }

    public void setSoNewMoney(Integer soNewMoney) {
        this.soNewMoney = soNewMoney;
    }

    @Basic
    @Column(name = "so_order_time")
    public Timestamp getSoOrderTime() {
        return soOrderTime;
    }

    public void setSoOrderTime(Timestamp soOrderTime) {
        this.soOrderTime = soOrderTime;
    }

    @Basic
    @Column(name = "so_intime")
    public Timestamp getSoIntime() {
        return soIntime;
    }

    public void setSoIntime(Timestamp soIntime) {
        this.soIntime = soIntime;
    }

    @Basic
    @Column(name = "so_state")
    public String getSoState() {
        return soState;
    }

    public void setSoState(String soState) {
        this.soState = soState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopOrderEntity that = (ShopOrderEntity) o;
        return shopId == that.shopId &&
                mjId == that.mjId &&
                couponId == that.couponId &&
                riderId == that.riderId &&
                userId == that.userId &&
                addId == that.addId &&
                orderId == that.orderId &&
                outRiderId == that.outRiderId &&
                soOldMoney == that.soOldMoney &&
                Objects.equals(soNewMoney, that.soNewMoney) &&
                Objects.equals(soOrderTime, that.soOrderTime) &&
                Objects.equals(soIntime, that.soIntime) &&
                Objects.equals(soState, that.soState);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, mjId, couponId, riderId, userId, addId, orderId, outRiderId, soOldMoney, soNewMoney, soOrderTime, soIntime, soState);
    }
}
