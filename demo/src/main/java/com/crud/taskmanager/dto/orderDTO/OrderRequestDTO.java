package com.crud.taskmanager.dto.orderDTO;

public class OrderRequestDTO {

    private String product;
    private double price;
    private Long userId;


    public String getProduct() {
        return product;
    }

    public void setProduct(String product)
    {
        this.product=product;
    }

    public double getPrice(){
        return price;
    }
    public void setPrice(double price) {
        this.price=price;
    }

    public Long getUserId() {
        return userId;
    }
    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
