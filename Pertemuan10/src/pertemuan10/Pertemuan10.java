
package pertemuan10;

import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
/**
 *
 * @author Thesa Dahat
 * TGL : 20 Mei 2025
 */
public class Pertemuan10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        DBKONEKSI cnn = new DBKONEKSI();
         Statement st = cnn.koneksi().createStatement();
         
         String sql = "SELECT * FROM mhs";
         ResultSet res = st.executeQuery(sql);
         
         
         while (res.next()){
             
             System.out.println("Nama: "+res.getString("NAMA"));
         }
    }
    
}
