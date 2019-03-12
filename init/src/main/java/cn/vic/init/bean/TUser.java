package cn.vic.init.bean;

public class TUser {

    private Long id;
    private String username;
    private Integer age;
    private IdCard idCard;

    public TUser() {
    }

    public TUser(String username, Integer age, IdCard idCard) {
        this.username = username;
        this.age = age;
        this.idCard = idCard;
    }

    @Override
    public String toString() {
        return "TUser{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", age=" + age +
                ", idCard=" + idCard +
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }
}
