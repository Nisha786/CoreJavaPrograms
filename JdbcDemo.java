import java.sql.*;
public class JdbcDemo
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/JdbcDemo","root","root");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from employee");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+"..."+rs.getString(2));
		}
		con.close();
	}
}