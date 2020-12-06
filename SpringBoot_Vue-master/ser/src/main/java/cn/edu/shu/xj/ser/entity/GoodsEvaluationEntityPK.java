package cn.edu.shu.xj.ser.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

public class GoodsEvaluationEntityPK implements Serializable {
    private int userId;
    private int shopId;
    private int goodsId;

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

    @Column(name = "goods_id")
    @Id
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsEvaluationEntityPK that = (GoodsEvaluationEntityPK) o;
        return userId == that.userId &&
                shopId == that.shopId &&
                goodsId == that.goodsId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, shopId, goodsId);
    }
}
