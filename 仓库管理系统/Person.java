package 仓库管理系统;

import java.io.Serializable;

public class Person implements Serializable {//使用Serializable类，可以使对象被序列化，用于持久化（保存）对象。
    private String goodsID;
    private String goodsName;
    private int inven;
    private String price;
    private String ware;
    private String num;
    private String time;
    private String phone;
    //public Person(){}

    public String getGoodsID() {
        return goodsID;
    }

    public Person(String goodsID, String goodsName, int inven, String price,
                  String ware, String num, String time, String phone) {
        super();
        this.goodsID = goodsID;
        this.goodsName = goodsName;
        this.inven = inven;
        this.price = price;
        this.ware = ware;
        this.num = num;
        this.time = time;
        this.phone = phone;
    }

    public void setGoodsID(String goodsID) {
        this.goodsID = goodsID;
    }

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public int getInven() {
        return inven;
    }

    public void setInven(int inven) {
        this.inven = inven;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getWare() {
        return ware;
    }

    public void setWare(String ware) {
        this.ware = ware;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}