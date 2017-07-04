package demo;

import com.mysql.jdbc.Driver;

import java.sql.*;

/**
 * Created by zhenya.1291813139.com
 * on 2017/7/4.
 * JavaEE_Framework_1702A.
 */
public class JdbcTest {
    public static void main(String[] args) throws SQLException {
        new Driver();
        Connection connection = DriverManager.getConnection("jdbc:mysql:///?user=root&password=system");
        String username = "tom";
        String password = "123";

        String sql = "INSERT INTO db_test.user VALUE(null,?,?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        preparedStatement.setString(1,username);
        preparedStatement.setString(2,password);
        ResultSet resultSet = preparedStatement.executeQuery();

        resultSet.next();
        System.out.println(resultSet);

    }
}
