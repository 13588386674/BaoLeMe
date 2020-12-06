package cn.edu.shu.xj.ser.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "orders", schema = "school", catalog = "")
public class OrdersEntity {
    private int orderId;
    private int orderSum;
    private int orderPrice;
    private Integer orderDisconut;

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "order_sum")
    public int getOrderSum() {
        return orderSum;
    }

    public void setOrderSum(int orderSum) {
        this.orderSum = orderSum;
    }

    @Basic
    @Column(name = "order_price")
    public int getOrderPrice() {
        return orderPrice;
    }

    public void setOrderPrice(int orderPrice) {
        this.orderPrice = orderPrice;
    }

    @Basic
    @Column(name = "order_disconut")
    public Integer getOrderDisconut() {
        return orderDisconut;
    }

    public void setOrderDisconut(Integer orderDisconut) {
        this.orderDisconut = orderDisconut;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrdersEntity that = (OrdersEntity) o;
        return orderId == that.orderId &&
                orderSum == that.orderSum &&
                orderPrice == that.orderPrice &&
                Objects.equals(orderDisconut, that.orderDisconut);
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, orderSum, orderPrice, orderDisconut);
    }
}
