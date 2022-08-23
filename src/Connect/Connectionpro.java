/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Connect;
import java.sql.*;
/**
 *
 * @author HP
 */
public class Connectionpro {
    public static Connection getCon(){
     Connection con=null;
       
//        String host ="ec2-34-255-134-200.eu-west-1.compute.amazonaws.com";
//        String port ="5432";
//        String database="defdlgjsp3c87h"; 
//        String url= "jdbc:postgresql://"+host+":"+port+"/"+database;
//        String user ="dyofpamychniwh";
//        String password ="322b1393532e0efa55f9009ff4c17e91d1f6931c12395f3bba56c0d26bf4d737";

            String host ="localhost";
            String port ="5432";
            String database="CMS"; 
            String url= "jdbc:postgresql://"+host+":"+port+"/"+database;
            String user ="postgres";
            String password ="password";  
        
        try
        {
            Class.forName("org.postgresql.Driver");
            con=DriverManager.getConnection(url,user,password);
            if(con!=null){
                System.out.println("Connection OK");
            }
            else{
                System.out.println("Connection failed");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
}
}
