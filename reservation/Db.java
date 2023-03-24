package reservation;
import java.sql.Connection;
import java.sql.DriverManager;

public class Db {

	public static void main(String[] args) {

		  {
		    try {
		      String url = "jdbc:mysql://localhost:3306/railway";
		      String uname = "root";
		      String pass = "connecthp";
		      Class.forName("com.mysql.cj.jdbc.Driver");
		      Connection con ;
		      con=DriverManager.getConnection(url,uname,pass);
		      if(con!=null)
		      {
		        System.out.println("connected");
		      }
		      else {
		        System.out.println("not connected");
		      }
		    } catch (Exception e) {
		      System.out.println(e);
		    }
		    
		  }

		}

	}
