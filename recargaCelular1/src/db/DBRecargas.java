package db;

import modelo.Recargas;
import java.sql.*;

public class DBRecargas {
    // Usamos tu conexión original
    Conexion BLcon = new Conexion();
    
    // Método para insertar recargas (corregido)
    public int Recargar(Recargas objRecargas) throws ClassNotFoundException, SQLException {
        // Sentencia SQL válida
        String sentenciaSQL = "INSERT INTO recargas (valor, saldo, megas, id_cel) VALUES (?, ?, ?, ?)";
        
        try (Connection conn = BLcon.getConnection();
             PreparedStatement ps = conn.prepareStatement(sentenciaSQL)) {
            
            // Asignar valores usando campos públicos
            ps.setInt(1, objRecargas.valor);
            ps.setInt(2, objRecargas.saldo);
            ps.setInt(3, objRecargas.megas);
            ps.setInt(4, objRecargas.id_cel);
            
            return ps.executeUpdate();
        }
    }
}