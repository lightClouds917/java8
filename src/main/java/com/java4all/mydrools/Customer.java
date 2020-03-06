package com.java4all.mydrools;

/**
 * @author wangzhongxiang
 * @date 2020年03月06日 14:34:25
 */
public class Customer {

    private Integer age;

    private Integer height;

    private Integer money;

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Customer(Integer age, Integer height, Integer money) {
        this.age = age;
        this.height = height;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "age=" + age +
                ", height=" + height +
                ", money=" + money +
                '}';
    }
}
