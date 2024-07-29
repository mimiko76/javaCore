package Lection_4.HW4;

import lombok.Data;

@Data
public class Product {
    private String nameProduct;
    int price;
    public Product(String nameProduct, int price){
        this.nameProduct = nameProduct;
        this.price = price;
    }
    public Product(){

    }
}
