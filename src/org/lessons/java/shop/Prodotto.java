package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    public int code;
    public String name;
    public String description;
    public double price;
    public int iva;

    public Prodotto(String name,String description, double price,int iva) {
        Random random = new Random();
        this.code=random.nextInt(100);
        this.description=description;
        this.name=name;
        this.price=price;
        this.iva=iva;

    }
    public double basePrice() {
        return this.price;
    }

    public double totalPrice() {
        return this.price + (this.price*this.iva)/100;
    }
public String fullName() {
    return this.code+"-"+this.name;
}

    



}
