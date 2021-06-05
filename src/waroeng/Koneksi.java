package waroeng;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection koneksimysql;
    public static Connection koneksiDB() {
        if (koneksimysql==null){
            try {
                String DB="jdbc:mysql://localhost:3306/waroeng";
                String user="root";
                String pass="ArlanBB270899";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksimysql = (Connection)DriverManager.getConnection(DB,user,pass);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Koneksi Gagal");
            }
        }
        return koneksimysql;
    }

    static Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    static Statement createstatement() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}