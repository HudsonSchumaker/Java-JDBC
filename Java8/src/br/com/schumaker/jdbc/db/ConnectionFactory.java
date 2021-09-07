package br.com.schumaker.jdbc.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection getConnectionMySQL() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/contas", "root", "");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e); 
        }
    }

    public Connection getConnectionHSQLDB() {
        try {
            Class.forName("org.hsqldb.jdbcDriver");
            return DriverManager.getConnection("jdbc:hsqldb:contas", "sa", "");
        } catch (SQLException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
