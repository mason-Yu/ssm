package base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestConnection {
	 public static Connection conn = null;
	 public static  String url = "jdbc:oracle:thin:@localhost:1521:ORCL";
	 public static  String UserName = "scott";// 数据库用户登陆名 ( 也有说是 schema 名字的 )
	 public static  String Password = "admin";// 密码
      
      private static final TestConnection  tc= new TestConnection();
      
      private  TestConnection(){ }
     
      public   Connection getConnection(){
    	  
    	  try {
			Class.forName("oracle.jdbc.driver.OracleDriver");

			  conn = DriverManager.getConnection(url, UserName, Password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	  return conn;
      }
		
		

	
	
public static void main(String[] args) {
	System.out.println(new TestConnection().getConnection()); 
}
}
