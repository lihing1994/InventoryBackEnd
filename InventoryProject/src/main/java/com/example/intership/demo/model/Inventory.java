package com.example.intership.demo.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="inventory")
public class Inventory {
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name",columnDefinition = "varchar(128)")
    private String name;
    @Column(name="unitPrice",columnDefinition = "double")
    private Double unitPrice;
    @Column(name="quantity",columnDefinition = "integer")
    private int quantity;
    @Column(name="location",columnDefinition = "varchar(128)")
    private String location;
    @Column(name="status",columnDefinition = "varchar(128)")
    private String status;

    public Inventory() {
        this.id = -1;
        this.name = "unset";
        this.quantity = -1;
        this.location = "unset";
        this.status = "unset";
    }

    public Inventory(int id, String name, int quantity, String location, String status) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.location = location;
        this.status = status;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "{" +
            " id='" + getId() + "'" +
            ", name='" + getName() + "'" +
            ", quantity='" + getQuantity() + "'" +
            ", location='" + getLocation() + "'" +
            ", status='" + getStatus() + "'" +
            "}";
    }

    
}
