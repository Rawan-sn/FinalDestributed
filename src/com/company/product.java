package com.company;

public class product {
    private String name;
    private String status;
    private int price;

    public product(String name, String status, int price) {
        this.name = name;
        this.status = status;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
