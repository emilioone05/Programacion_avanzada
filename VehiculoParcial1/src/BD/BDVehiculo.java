
package BD;

import Clases.Vehiculo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Clases.Propietario;

public class BDVehiculo {
    
    Conexion BLcon = new Conexion();

    
    public int InsertarV(Vehiculo objVehiculo) throws ClassNotFoundException, SQLException {
        String Sentencia = "INSERT INTO Vehiculo (Placa, Marca, Estado, Ced)"
                + " VALUES (?,?,?,?)";
        PreparedStatement ps= BLcon.getConnection().prepareStatement(Sentencia);
        ps.setString(1, objVehiculo.getPlaca());
        ps.setString(2, objVehiculo.getMarca());
        ps.setString(3, objVehiculo.getEstado());
        ps.setInt(4, objVehiculo.getCed());
        return ps.executeUpdate();
    }
}
