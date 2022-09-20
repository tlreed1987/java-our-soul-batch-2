import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Main {
	
	public static void main(String[] args) {
		String jdbcURL="jdbc:mysql://localhost:3306/javaoursoul2";
		//Class.forName("com.mysql.cj.jdbc.Driver");
		List<Employee> empList=new ArrayList<>();
		
		try {
			Connection con=DriverManager.getConnection(jdbcURL,"root","admin#123");
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			while(rs.next()) {
				int id=rs.getInt("EMP_ID"); //int id=rs.getInt(1); //
				String name=rs.getString("name");
				double salary=rs.getDouble("salary");
				int did=rs.getInt("DEPT_ID");
				empList.add(new Employee(id,name,salary,did));
			}
			
		} catch (SQLException e) {
			System.out.println(e.toString());
			//e.printStackTrace();
		}
		
		empList.forEach(e->System.out.println(e));
	}

}
