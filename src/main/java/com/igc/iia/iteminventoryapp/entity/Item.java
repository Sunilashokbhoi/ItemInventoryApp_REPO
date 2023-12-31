package com.igc.iia.iteminventoryapp.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;

@Entity
public class Item {
    @Id
    private int id;
    @NotBlank(message = "Please Enter Item Name")
    private String name;
    @NotBlank(message = "Please Enter Item description ")
    private String description;
    private int price;
    private int quantity;
    private String status;

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id =id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public int getPrice(){
        return price;
    }
    public void setPrice(int price){
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(int quantity){
        this.quantity=quantity;
    }
    public String getStatus(){
        return status;
    }
    public void setStatus(String status){
        this.status=status;
    }
}
