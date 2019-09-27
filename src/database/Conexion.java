package database;

import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Conexion {

    public Connection connection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost/msc", "root", "");
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }
}
