package database;

import java.io.File;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

public class Empleados {

    public static void getTotalTrabajador(JTable table) {
        Conexion conecion = new Conexion();
        ((DefaultTableModel) table.getModel()).setRowCount(0);
        try {
            Statement st = conecion.connection().createStatement();
            String sql = "SELECT * FROM empleado";
            ResultSet rs = st.executeQuery(sql);
            while ((rs != null) && (rs.next())) {
                String id = rs.getString(1);
                String nombre = rs.getString(2);
                int sueldo = rs.getInt(3);
                int dias = rs.getInt(4);
                int total = rs.getInt(5);
                Object[] row1 = {id, nombre, sueldo, dias, total};
                DefaultTableModel model = (DefaultTableModel) table.getModel();
                model.addRow(row1);
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static int insertTrabajador(String clave, String nombre, int sueldo, int dias, int sueldo_total) {
        Conexion conecion = new Conexion();
        int resultado = 0;
        try {
            String str_query = "INSERT INTO empleado VALUES (?,?,?,?,?)";
            PreparedStatement query = conecion.connection().prepareStatement(str_query);
            query.setString(1, clave);
            query.setString(2, nombre);
            query.setInt(3, sueldo);
            query.setInt(4, dias);
            query.setInt(5, sueldo_total);
            resultado = query.executeUpdate();
            conecion.connection().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public static int updateTrabajador(String clave, String nombre, int sueldo, int dias, int sueldo_total) {
        Conexion conecion = new Conexion();
        int resultado = 0;
        try {
            String str_query = "UPDATE empleado SET nombre = ?, sueldo = ? , dias = ?, sueldo_total = ? WHERE clave = " + clave;
            PreparedStatement query = conecion.connection().prepareStatement(str_query);
            query.setString(1, nombre);
            query.setInt(2, sueldo);
            query.setInt(3, dias);
            query.setInt(4, sueldo_total);
            resultado = query.executeUpdate();
            conecion.connection().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public static int deleteTrabajador(String clave) {
        Conexion conecion = new Conexion();
        int resultado = 0;
        try {
            String str_query = "DELETE FROM empleado WHERE clave = " + clave;
            PreparedStatement query = conecion.connection().prepareStatement(str_query);
            resultado = query.executeUpdate();
            conecion.connection().close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(new JFrame(), ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
        return resultado;
    }

    public void imprimirReporte() {
        Conexion conecion = new Conexion();
        try {
            File file = new File("src/database/Empleados.jrxml");
            String absolutePath = file.getAbsolutePath();
            JasperDesign jd;
            jd = JRXmlLoader.load(absolutePath);
            String sql = "SELECT\n"
              + "     empleado.`clave` AS Clave,\n"
              + "     empleado.`nombre` AS Nombre,\n"
              + "     empleado.`sueldo` AS Sueldo,\n"
              + "     empleado.`dias` AS Dias,\n"
              + "     empleado.`sueldo_total` AS Total\n"
              + "FROM\n"
              + "     `empleado` empleado";
            JRDesignQuery newQuery = new JRDesignQuery();
            newQuery.setText(sql);
            jd.setQuery(newQuery);
            JasperReport jasperreport = JasperCompileManager.compileReport(jd);
            JasperPrint jasperprint = JasperFillManager.fillReport(jasperreport, null, conecion.connection());
            JasperViewer viewer = new JasperViewer(jasperprint, false);
            viewer.setVisible(true);
//            JasperPrintManager.printReport(jasperprint,false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
