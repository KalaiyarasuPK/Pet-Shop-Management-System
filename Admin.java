package PetShopManagementSystem.model;
import java.sql.*;
import java.util.Scanner;
import static PetShopManagementSystem.model.DbConnect.*;
public class Admin {
    private int id;
    private String email,password,name;
    private int phNo;
    private int tnId;


    private int custId;
    private int petId;
    private String dateTime;

    public String getDateTime() {
        return dateTime;
    }

    public int getTnId() {
        return tnId;
    }

    public void setTnId(int tnId) {
        this.tnId = tnId;
    }
    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
    }

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

    public int getPhNo() {
        return phNo;
    }

    public void setPhNo(int phNo) {
        this.phNo = phNo;
    }
    public Admin(String name, String email, String password){
        this.name=name;
        this.email=email;
        this.password=password;
    }

    public Admin(){

    }
    public Admin(int tnId,int custId,int petId,String dateTime){
        this.tnId=tnId;
        this.custId=custId;
        this.petId=petId;
        this.dateTime=dateTime;
    }
    public Admin(int id,String name, String email, String password){
        this.id=id;
        this.name=name;
        this.email=email;
        this.password=password;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
