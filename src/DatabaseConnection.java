import java.sql.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Administrator
 */
public class DatabaseConnection {
    Connection con;
    Statement st;
    ResultSet rs;
    
    public DatabaseConnection(){
        connect();
    }
    public void connect(){
        try{
            String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
            Class.forName(driver);
            
            String db = "jdbc:odbc:db1";
            con = DriverManager.getConnection(db);
            st = con.createStatement();
            
            String sql = "select * from Table1";
            rs = st.executeQuery(sql);
                                            
        }catch(Exception ex){
        }
    
    }
    
    
}


