package com.example.Farmer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;


@Document(collection = "Farmer_Details")
public class FarmerDetais {
    @Id
    private String _id;
    private String f_id;

    private String f_name;
    private String f_location;
    private String f_contact;
    private int f_age;

    public FarmerDetais() {
    }

    public FarmerDetais(String _id, String f_id, String f_name, String f_location, String f_contact, int f_age) {
        this._id = _id;
        this.f_id = f_id;
        this.f_name = f_name;
        this.f_location = f_location;
        this.f_contact = f_contact;
        this.f_age = f_age;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getF_id() {
        return f_id;
    }

    public void setF_id(String f_id) {
        this.f_id = f_id;
    }

    public String getF_name() {
        return f_name;
    }

    public void setF_name(String f_name) {
        this.f_name = f_name;
    }

    public String getF_location() {
        return f_location;
    }

    public void setF_location(String f_location) {
        this.f_location = f_location;
    }

    public String getF_contact() {
        return f_contact;
    }

    public void setF_contact(String f_contact) {
        this.f_contact = f_contact;
    }

    public int getF_age() {
        return f_age;
    }

    public void setF_age(int f_age) {
        this.f_age = f_age;
    }

    @Override
    public String toString() {
        return "FarmerDetais{" +
                "_id='" + _id + '\'' +
                ", f_id='" + f_id + '\'' +
                ", f_name='" + f_name + '\'' +
                ", f_location='" + f_location + '\'' +
                ", f_contact='" + f_contact + '\'' +
                ", f_age=" + f_age +
                '}';
    }
}
