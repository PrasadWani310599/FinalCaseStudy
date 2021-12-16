package com.example.OrderDetails;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "OrderDetails")
public class OrderDetails {

    @Id
    public String order_id;
    public String dealer_id;
    public String crop_name;
    public int quantity;
    public String crop_type;
    public String amount;

    public OrderDetails() {
        super();
    }

    public OrderDetails(String order_id, String dealer_id, String crop_name, int quantity, String crop_type, String amount) {
        this.order_id = order_id;
        this.dealer_id = dealer_id;
        this.crop_name = crop_name;
        this.quantity = quantity;
        this.crop_type = crop_type;
        this.amount = amount;
    }

    public String getOrder_id() {
        return order_id;
    }

    public void setOrder_id(String order_id) {
        this.order_id = order_id;
    }

    public String getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(String dealer_id) {
        this.dealer_id = dealer_id;
    }

    public String getCrop_name() {
        return crop_name;
    }

    public void setCrop_name(String crop_name) {
        this.crop_name = crop_name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCrop_type() {
        return crop_type;
    }

    public void setCrop_type(String crop_type) {
        this.crop_type = crop_type;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "OrderDetails{" +
                "order_id='" + order_id + '\'' +
                ", dealer_id='" + dealer_id + '\'' +
                ", crop_name='" + crop_name + '\'' +
                ", quantity=" + quantity +
                ", crop_type='" + crop_type + '\'' +
                ", amount='" + amount + '\'' +
                '}';
    }
}
