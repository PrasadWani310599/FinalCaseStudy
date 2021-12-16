package Model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection ="Dealer_Details_Final")
public class DealerDetails {
    @Id

    private String _id;
    private String username;
    private String password;
    private String dealer_id;
    private String dealer_name;
    private String dealer_location;
    private int dealer_age;
    private String dealer_phoneNumber;

    public DealerDetails() {
    }

    public DealerDetails(String _id, String username, String password, String dealer_id, String dealer_name, String dealer_location, int dealer_age, String dealer_phoneNumber) {
        this._id = _id;
        this.username = username;
        this.password = password;
        this.dealer_id = dealer_id;
        this.dealer_name = dealer_name;
        this.dealer_location = dealer_location;
        this.dealer_age = dealer_age;
        this.dealer_phoneNumber = dealer_phoneNumber;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDealer_id() {
        return dealer_id;
    }

    public void setDealer_id(String dealer_id) {
        this.dealer_id = dealer_id;
    }

    public String getDealer_name() {
        return dealer_name;
    }

    public void setDealer_name(String dealer_name) {
        this.dealer_name = dealer_name;
    }

    public String getDealer_location() {
        return dealer_location;
    }

    public void setDealer_location(String dealer_location) {
        this.dealer_location = dealer_location;
    }

    public int getDealer_age() {
        return dealer_age;
    }

    public void setDealer_age(int dealer_age) {
        this.dealer_age = dealer_age;
    }

    public String getDealer_phoneNumber() {
        return dealer_phoneNumber;
    }

    public void setDealer_phoneNumber(String dealer_phoneNumber) {
        this.dealer_phoneNumber = dealer_phoneNumber;
    }

    @Override
    public String toString() {
        return "DealerDetails{" +
                "_id='" + _id + '\'' +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dealer_id='" + dealer_id + '\'' +
                ", dealer_name='" + dealer_name + '\'' +
                ", dealer_location='" + dealer_location + '\'' +
                ", dealer_age=" + dealer_age +
                ", dealer_phoneNumber='" + dealer_phoneNumber + '\'' +
                '}';
    }
}
