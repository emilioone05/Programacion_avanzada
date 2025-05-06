package logica;

import db.DBCelular;
import db.DBRecargas;
import modelo.Celular;
import modelo.Recargas;
import java.sql.SQLException;

public class LogicaRecargas {
    private final DBCelular dbCelular = new DBCelular();
    private final DBRecargas dbRecargas = new DBRecargas();
    
    public String realizarRecarga(String numeroCelular, int valor) throws Exception {
        // 1. Buscar celular
        Celular celular = dbCelular.obtenerPorNumero(numeroCelular);
        
        if (celular == null) {
            throw new Exception("Celular no registrado");
        }
        
        // 2. Verificar estado
        if (celular.estado == 0) {
            throw new Exception("El celular está inhabilitado");
        }
        
        // 3. Calcular megas (1$ = 5000 MB)
        int megasRecarga = valor * 5000;
        
        // 4. Actualizar valores
        int nuevoSaldo = celular.saldo + valor;
        int nuevasMegas = celular.megas + megasRecarga;
        
        // 5. Actualizar en BD
        dbCelular.actualizarSaldoYmegas(celular.idCel, nuevoSaldo, nuevasMegas);
        
        // 6. Registrar recarga
        Recargas recarga = new Recargas();
        recarga.valor = valor;
        recarga.saldo = nuevoSaldo;
        recarga.megas = megasRecarga;
        recarga.id_cel = celular.idCel;
        
        dbRecargas.Recargar(recarga);
        
        return "Recarga exitosa!\n"
             + "Nuevo saldo: $" + nuevoSaldo + "\n"
             + "Megas disponibles: " + nuevasMegas + " MB";
    }
}