package cn.vic.init.bean;

import java.math.BigDecimal;

/**
 * 与 MUser 配合演示一对多的场景
 */
public class Order {
    private Long id;
    private String orderNo;
    private BigDecimal price;

    public Order() {
    }

    public Order(String orderNo, BigDecimal price) {
        this.orderNo = orderNo;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", orderNo='" + orderNo + '\'' +
                ", price=" + price +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
