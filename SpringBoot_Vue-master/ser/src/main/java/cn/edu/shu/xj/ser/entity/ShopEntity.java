package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "shop", schema = "school", catalog = "")
public class ShopEntity {
    private int shopId;
    private String shopName;
    private Integer shopStar;
    private Integer shopPerConsume;
    private Integer shopTotal;
    private Integer shopCount;
    private String shopPhone;
    private String shopPwd;
    private String shopAddress;

    @Id
    @Column(name = "shop_id")
    public int getShopId() {
        return shopId;
    }

    public void setShopId(int shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "shop_name")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "shop_star")
    public Integer getShopStar() {
        return shopStar;
    }

    public void setShopStar(Integer shopStar) {
        this.shopStar = shopStar;
    }

    @Basic
    @Column(name = "shop_perConsume")
    public Integer getShopPerConsume() {
        return shopPerConsume;
    }

    public void setShopPerConsume(Integer shopPerConsume) {
        this.shopPerConsume = shopPerConsume;
    }

    @Basic
    @Column(name = "shop_total")
    public Integer getShopTotal() {
        return shopTotal;
    }

    public void setShopTotal(Integer shopTotal) {
        this.shopTotal = shopTotal;
    }

    @Basic
    @Column(name = "shop_count")
    public Integer getShopCount() {
        return shopCount;
    }

    public void setShopCount(Integer shopCount) {
        this.shopCount = shopCount;
    }

    @Basic
    @Column(name = "shop_phone")
    public String getShopPhone() {
        return shopPhone;
    }

    public void setShopPhone(String shopPhone) {
        this.shopPhone = shopPhone;
    }

    @Basic
    @Column(name = "shop_pwd")
    public String getShopPwd() {
        return shopPwd;
    }

    public void setShopPwd(String shopPwd) {
        this.shopPwd = shopPwd;
    }

    @Basic
    @Column(name = "shop_address")
    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShopEntity that = (ShopEntity) o;
        return shopId == that.shopId &&
                Objects.equals(shopName, that.shopName) &&
                Objects.equals(shopStar, that.shopStar) &&
                Objects.equals(shopPerConsume, that.shopPerConsume) &&
                Objects.equals(shopTotal, that.shopTotal) &&
                Objects.equals(shopCount, that.shopCount) &&
                Objects.equals(shopPhone, that.shopPhone) &&
                Objects.equals(shopPwd, that.shopPwd) &&
                Objects.equals(shopAddress, that.shopAddress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(shopId, shopName, shopStar, shopPerConsume, shopTotal, shopCount, shopPhone, shopPwd, shopAddress);
    }
}
