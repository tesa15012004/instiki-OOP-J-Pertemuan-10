package pertemuan10;


import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

/**
 *
 * @author ALFANI THESA
 * TGL : 20 MEI 2025
 */
public class DBKONEKSI {
    static String JDBC_DRIVER="com.mysql.cj.jdbc.Driver";
    static String DB_USER="root";
    static String DB_PASSWORD="";
    static String DB_URL="jdbc:mysql://localhost:3306/mahasiswa";
    
    public Connection koneksi () throws SQLException, ClassNotFoundException{
       try{
           Class.forName(JDBC_DRIVER);
           return DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
           
       }catch(ClassNotFoundException | SQLException err){
             System .out.println("Gagal koneksi ke Database");
        return null;
        
       }
    }
    
}
