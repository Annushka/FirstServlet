import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Properties;


public class TestDB {
private int id;
private String value;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getValue() {
	return value;
}
public void setValue(String value) {
	this.value = value;
}

public void insert(){
	try{
		Connection con;
        String driver = "com.mysql.jdbc.Driver";
        Class.forName(driver);

        Properties properties = new Properties();
        properties.setProperty("user", "root");
        properties.setProperty("password", "123");
        properties.setProperty("useUnicode", "true");

        String url = "jdbc:mysql://localhost:3306/first";
        con = DriverManager.getConnection(url, properties);
        String query = "INSERT INTO TEST(VALUE) VALUES( ? )";
        
        PreparedStatement preparedStatement = con.prepareStatement(query);
        preparedStatement.setObject(1, this.value);

        preparedStatement.executeUpdate();
        
        con.close();
	}
	catch(Exception exception){
		exception.printStackTrace();
	}
}
	
}
