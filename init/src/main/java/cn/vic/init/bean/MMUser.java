package cn.vic.init.bean;

import java.util.List;

public class MMUser {

    private Long id;
    private String username;
    private int age;
    // 数据表中本来还有时间字段，但是实体类没有必要与表中字段一一对应，所以可以略去不写
    private List<Order> orderList;

    public MMUser() {
    }

    public MMUser(String username, int age, List<Order> orderList) {
        this.username = username;
        this.age = age;
        this.orderList = orderList;
    }

    @Override
    public String toString() {
        return "MUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", orderList=" + orderList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
