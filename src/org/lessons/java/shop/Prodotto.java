package org.lessons.java.shop;

import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String description;
    private double price;
    private int iva;

    public Prodotto(String name,String description, double price,int iva) {
        Random random = new Random();
        this.code=random.nextInt(100);
        this.description=description;
        this.name=name;
        this.price=price;
        this.iva=iva;

    }
    public Prodotto(String name,double price) {
        Random random = new Random();
        this.code=random.nextInt(100);
        this.name=name;
        this.price=price;
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

public int getCode() {
    return code;
}


public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public String getDescription() {
    return description;
}

public void setDescription(String description) {
    this.description = description;
}

public double getPrice() {
    return price;
}

public void setPrice(double price) {
    this.price = price;
}

public int getIva() {
    return iva;
}

public void setIva(int iva) {
    this.iva = iva;
}

    



}
