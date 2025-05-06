package db;

import modelo.Celular;
import java.sql.*;

public class DBCelular {

    Conexion BLcon = new Conexion();

    // Método para insertar celular
    public int Insertar(Celular objcelular) throws ClassNotFoundException, SQLException {
        String sentenciaSQL = "INSERT INTO celulares (numero, estado) VALUES (?, ?)";

        try (Connection conn = BLcon.getConnection(); PreparedStatement ps = conn.prepareStatement(sentenciaSQL)) {

            // Validación básica
            if (objcelular.numero == null || objcelular.numero.trim().isEmpty()) {
                throw new SQLException("Número de celular inválido");
            }

            // Seteamos parámetros usando campos públicos
            ps.setString(1, objcelular.numero);
            ps.setInt(2, objcelular.estado);

            return ps.executeUpdate();
        }
    }

    // Método para obtener celular por número
    public Celular obtenerPorNumero(String numero) throws SQLException, ClassNotFoundException {
        String sql = "SELECT * FROM Celular WHERE numero = ?";

        try (Connection conn = BLcon.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, numero);

            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    Celular c = new Celular();

                    c.idCel = rs.getInt("idCel");
                    c.numero = rs.getString("numero");
                    c.estado = rs.getInt("estado");
                    c.saldo = rs.getInt("saldo");
                    c.megas = rs.getInt("megas");
                    return c;
                }
            }
        }
        return null;
    }

    // Método para actualizar saldo y megas
    public void actualizarSaldoYmegas(int idCel, int nuevoSaldo, int nuevasMegas)
            throws SQLException, ClassNotFoundException {

        String sql = "UPDATE Celular SET saldo = ?, megas = ? WHERE idCel = ?";

        try (Connection conn = BLcon.getConnection(); // Usamos tu conexión
                 PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, nuevoSaldo);
            ps.setInt(2, nuevasMegas);
            ps.setInt(3, idCel);

            ps.executeUpdate();
        }
    }
}
