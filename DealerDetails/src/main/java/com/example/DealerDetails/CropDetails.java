package com.example.DealerDetails;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Crop_Details")
public class CropDetails {
     @Id
    private String id;
    private String name;
    private int quantity;
    private double price;
    private String location;
    private String crop_type;
    private String farmer_name;

    public CropDetails() {
        super();
    }

    public CropDetails(String id, String name, int quantity, double price, String location, String crop_type, String farmer_name) {
        this.id = id;
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.location = location;
        this.crop_type = crop_type;
        this.farmer_name = farmer_name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCrop_type() {
        return crop_type;
    }

    public void setCrop_type(String crop_type) {
        this.crop_type = crop_type;
    }

    public String getFarmer_name() {
        return farmer_name;
    }

    public void setFarmer_name(String farmer_name) {
        this.farmer_name = farmer_name;
    }

    @Override
    public String toString() {
        return "CropDetails{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", location='" + location + '\'' +
                ", crop_type='" + crop_type + '\'' +
                ", farmer_name='" + farmer_name + '\'' +
                '}';
    }
}
