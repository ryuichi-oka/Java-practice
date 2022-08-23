import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JdbcSelectSample {
	private static final String DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String URL = "jdbc:mysql://localhost:3306/database01?user=user01&password=password01&allowPublicKeyRetrieval=true&useSSL=false";
	
	public static void main(String[] args) throws ClassNotFoundException {
		
		try {
			Class.forName(DRIVER);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			throw e;
		}
		
		Connection con = null;
		try {
			con = DriverManager.getConnection(URL);
			con.setAutoCommit(false);
			
			try (PreparedStatement statement = con.prepareStatement("UPDATE user SET money = money - 1000 WHERE id = 2")) {
				statement.execute();
			}
			
			try (PreparedStatement statement = con.prepareStatement("UPDATE user SET money = money + 1000 WHERE id = 3")) {
				statement.execute();
			}
			
			con.commit();
		} catch (SQLException e1) {
			try {
				con.rollback();
				e1.printStackTrace();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		
		
		try (Connection connection = DriverManager.getConnection(URL);
				PreparedStatement statement = connection.prepareStatement("select * from user")) {
            try (ResultSet resultSet = statement.executeQuery()) {

                while (resultSet.next()) {
                    System.out.println("----------------------");
                    System.out.println(resultSet.getLong("id"));
                    System.out.println(resultSet.getString("email"));
                    System.out.println(resultSet.getString("name"));
                    System.out.println(resultSet.getInt("money"));
                    System.out.println(resultSet.getDate("created_at"));
                }
            }
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
