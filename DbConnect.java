package PetShopManagementSystem.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;

public class DbConnect {
    private static Connection connection;
    private DbConnect(){
        String url="jdbc:mysql://localhost:3306/PetShop";
        String name="root";
        String password="kalai1234";
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection=DriverManager.getConnection(url,name,password);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

   public static Connection createCon(){
        if(connection==null)
        {
            new DbConnect();
            return connection;
        }
        return connection;
    }
    public static PreparedStatement getPST(String ppt)throws Exception{
        return connection.prepareStatement(ppt);
    }
    public static void closeCon(){
        try{
            connection.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
