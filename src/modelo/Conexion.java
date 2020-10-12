
package modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author BRIAN
 */
public class Conexion {
    
    
    private final String base ="bodegakatherine";// nombre de la base da datos
    private final String user = "root";// usuario de la base de datos
    private final String password = "mysql_p_papu";// contraseña de tu base de datos
    private final String url="jdbc:mysql://localhost:3306/"+base+"?serverTimezone=UTC";
    private Connection con=null;// esta variable obtiene la conexion y la guarda
    
    
    public Connection getConexion(){
    
        try{
           
            Class.forName("com.mysql.cj.jdbc.Driver");// controlador para realizar la conexion
            con = (Connection)DriverManager.getConnection(this.url, this.user,this.password);
            
        }catch(SQLException e){
            System.err.println(e);
        } catch (ClassNotFoundException ex) {// esta excepcion nose porque se agrega
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return con;
    }
    
}
