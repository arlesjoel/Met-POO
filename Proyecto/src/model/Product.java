/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Dell
 */
public class Product {
    private int id;
    private String name;
    private String descripcion;
    private double price;
    private int stock;

    public Product() {
    }

    public Product(int id, String name, String descripcion, double price, int stock) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.price = price;
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Product{id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", descripcion=").append(descripcion);
        sb.append(", price=").append(price);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }
    
}
