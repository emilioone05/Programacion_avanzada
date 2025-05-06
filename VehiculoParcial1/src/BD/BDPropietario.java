
package BD;

import Clases.Propietario;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BDPropietario {
    
    Conexion BLcon = new Conexion();
    public int InsertarP(Propietario objPropietario) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Propietario (Cedula, Apellido, Nombre)"
                + " VALUES (?,?,?)";
        PreparedStatement ps= BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objPropietario.getCedula());
        ps.setString(2, objPropietario.getApellido());
        ps.setString(3, objPropietario.getNombre());
        return ps.executeUpdate();
    }

    
    public ResultSet BuscarPropietarioCedula(Propietario objPropietario) throws ClassNotFoundException, SQLException {
        String Sentencia = "Select * from Propietario where Cedula = ?";
        PreparedStatement ps= BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objPropietario.getCedula());
        return ps.executeQuery();
    }
}
