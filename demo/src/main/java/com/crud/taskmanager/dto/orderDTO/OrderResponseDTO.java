package com.crud.taskmanager.dto.orderDTO;


public class OrderResponseDTO {

    private Long id;
    private String product;
    private double price;
    private Long userId;

    public Long getId(){return id;}
    public void setId(Long id){this.id=id;}
    public String getProduct(){return product;}
    public void setProduct(String product){this.product=product;}
    public double getPrice(){return price;}
    public void setPrice(double price){this.price=price;}
    public Long getUserId(){return userId;}
    public void setUserId(Long userId){this.userId=userId;}
    }
