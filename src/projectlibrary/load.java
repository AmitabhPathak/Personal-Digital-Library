/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectlibrary;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author wowya
 */
public class load {
   public ResultSet loader(String name,String column,String term)
   {
       try{  
                                        Class.forName("oracle.jdbc.driver.OracleDriver");  
                                        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","library","amit");   
                                        Statement stmt=con.createStatement(); 
                                        
                                        
                                        ResultSet rs= stmt.executeQuery("select bookname from "+name+" where "+column+" like '%"+term+"%'");
                                        return rs;
                                        
                                        }catch(Exception e){ System.out.println(e);}
       
       return null;
   }
    
}
