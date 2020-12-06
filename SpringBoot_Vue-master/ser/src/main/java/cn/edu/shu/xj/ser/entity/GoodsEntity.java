package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "goods", schema = "school", catalog = "")
public class GoodsEntity {
    private int goodsId;
    private String goodsName;
    private int goodsPrice;
    private int goodsYouhui;
    private int goodsSum;

    @Id
    @Column(name = "goods_id")
    public int getGoodsId() {
        return goodsId;
    }

    public void setGoodsId(int goodsId) {
        this.goodsId = goodsId;
    }

    @Basic
    @Column(name = "goods_name")
    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    @Basic
    @Column(name = "goods_price")
    public int getGoodsPrice() {
        return goodsPrice;
    }

    public void setGoodsPrice(int goodsPrice) {
        this.goodsPrice = goodsPrice;
    }

    @Basic
    @Column(name = "goods_youhui")
    public int getGoodsYouhui() {
        return goodsYouhui;
    }

    public void setGoodsYouhui(int goodsYouhui) {
        this.goodsYouhui = goodsYouhui;
    }

    @Basic
    @Column(name = "goods_sum")
    public int getGoodsSum() {
        return goodsSum;
    }

    public void setGoodsSum(int goodsSum) {
        this.goodsSum = goodsSum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GoodsEntity that = (GoodsEntity) o;
        return goodsId == that.goodsId &&
                goodsPrice == that.goodsPrice &&
                goodsYouhui == that.goodsYouhui &&
                goodsSum == that.goodsSum &&
                Objects.equals(goodsName, that.goodsName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(goodsId, goodsName, goodsPrice, goodsYouhui, goodsSum);
    }
}
