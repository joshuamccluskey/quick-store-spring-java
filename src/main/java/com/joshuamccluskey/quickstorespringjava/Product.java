package com.joshuamccluskey.quickstorespringjava;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Product {
    @Id
    private String id;
    private String name;
    private String brand;
    private Integer price;
    private String origin;
    private Integer qty;
    private String imageURL;

    public Product(String name, String brand, Integer price, String origin, Integer qty, String imageURL) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.origin = origin;
        this.qty = qty;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public String getImageURL() {
        return imageURL;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }






}
