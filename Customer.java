package PetShopManagementSystem.model;
import java.sql.*;
import java.util.Scanner;
import static PetShopManagementSystem.model.DbConnect.*;
public class Customer {
    private String Name;
    private String phNo;
    private int id;
    private String email;
    private String password;
    private String address;
    private int custId;
    private int petId;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }
    public Customer(){

    }
    public Customer(int id, String Name, String email, String password, String phNo, String address){
            this.id=id;
            this.Name=Name;
            this.email=email;
            this.password=password;
            this.phNo=phNo;
            this.address=address;
    }
    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
    public String getPhNo() {
        return phNo;
    }
    public void setPhNo(String phNo) {
        this.phNo = phNo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
}
