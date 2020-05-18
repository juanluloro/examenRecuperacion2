import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DBConn {
    private Connection dbConn;

    public DBConn(String host, String puerto, String nombreDB, String usuario, String passsword) throws SQLException {
        StringBuilder url = new StringBuilder();
        url.append("jdbc:mysql://")
                .append(host)
                .append(":")
                .append(puerto)
                .append("/")
                .append(nombreDB)
                .append("?serverTimezone=UTC");

        dbConn = DriverManager.getConnection(url.toString(), usuario, passsword);
    }

    public ResultSet query(String sql) throws SQLException {
        return dbConn.prepareStatement(sql).executeQuery();
    }

    public int queryUpdate(String sql) throws SQLException {
        return dbConn.prepareStatement(sql).executeUpdate();
    }

}
