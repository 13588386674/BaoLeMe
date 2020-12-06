package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name = "goods_evaluation", schema = "school", catalog = "")
@IdClass(GoodsEvaluationEntityPK.class)
public class GoodsEvaluationEntity {
    private int userId;
    private int shopId;
    private int goodsId;
    private String goodsEvaluationTo;
    private Timestamp goodsEvaluationTime;
    private String goodsEvaluationPhoto;
    private Integer goodsEvaluationStar;

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

    @Id
    @Column(name = "goods_id")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_evaluation_to")
    public String getGoodsEvaluationTo() {
        return goodsEvaluationTo;
    }

    public void setGoodsEvaluationTo(String goodsEvaluationTo) {
        this.goodsEvaluationTo = goodsEvaluationTo;
    }

    @Basic
    @Column(name = "goods_evaluation_time")
    public Timestamp getGoodsEvaluationTime() {
        return goodsEvaluationTime;
    }

    public void setGoodsEvaluationTime(Timestamp goodsEvaluationTime) {
        this.goodsEvaluationTime = goodsEvaluationTime;
    }

    @Basic
    @Column(name = "goods_evaluation_photo")
    public String getGoodsEvaluationPhoto() {
        return goodsEvaluationPhoto;
    }

    public void setGoodsEvaluationPhoto(String goodsEvaluationPhoto) {
        this.goodsEvaluationPhoto = goodsEvaluationPhoto;
    }

    @Basic
    @Column(name = "goods_evaluation_star")
    public Integer getGoodsEvaluationStar() {
        return goodsEvaluationStar;
    }

    public void setGoodsEvaluationStar(Integer goodsEvaluationStar) {
        this.goodsEvaluationStar = goodsEvaluationStar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsEvaluationEntity that = (GoodsEvaluationEntity) o;
        return userId == that.userId &&
                shopId == that.shopId &&
                goodsId == that.goodsId &&
                Objects.equals(goodsEvaluationTo, that.goodsEvaluationTo) &&
                Objects.equals(goodsEvaluationTime, that.goodsEvaluationTime) &&
                Objects.equals(goodsEvaluationPhoto, that.goodsEvaluationPhoto) &&
                Objects.equals(goodsEvaluationStar, that.goodsEvaluationStar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, shopId, goodsId, goodsEvaluationTo, goodsEvaluationTime, goodsEvaluationPhoto, goodsEvaluationStar);
    }
}
