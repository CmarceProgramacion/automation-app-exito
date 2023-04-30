package com.exito.models;

import java.util.List;

public class ProductModel {

    private String productCategory;
    private String productName;
    private String country;
    private String store;

    public ProductModel(List<String> logData) {
        this.productCategory = logData.get(0);
        this.productName = logData.get(1);
        this.country = logData.get(2);
        this.store = logData.get(3);
    }

    public String getProductCategory() {
        return productCategory;
    }

    public void setProductCategory(String productCategory) {
        this.productCategory = productCategory;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStore() {
        return store;
    }

    public void setStore(String store) {
        this.store = store;
    }
}