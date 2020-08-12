package com.example.droolshelloworlddemo.model;

/**
 * @Author: zhangQi
 * @Date: 2020-08-12 12:45
 */
public class Car {
    private int id;
    private Person person;
    private long price;
    private long carNumber;
    private String carName;
    private int discount;//zhejiulv second hand car

    public Car(){

    }

    public Car(String carName){
        this.carName=carName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }

    public long getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(long carNumber) {
        this.carNumber = carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
