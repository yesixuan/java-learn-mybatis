package cn.vic.init.bean;

public class IdCard {

    private Long id;
    private String cardNo;
    private String address;

    public IdCard() {
    }

    public IdCard(String cardNo, String address) {
        this.cardNo = cardNo;
        this.address = address;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "id=" + id +
                ", cardNo='" + cardNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
