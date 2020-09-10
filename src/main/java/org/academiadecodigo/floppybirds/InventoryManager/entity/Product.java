package org.academiadecodigo.floppybirds.InventoryManager.entity;

import javax.persistence.*;

@Entity
public class Product {

    @Id
    @GeneratedValue (strategy = GenerationType.TABLE)
    private int id;
    private String name;
    private int quantity;


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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
