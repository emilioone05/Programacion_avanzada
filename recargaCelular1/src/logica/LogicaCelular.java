package logica;

import modelo.Celular;
import db.DBCelular;
import db.DBRecargas;

import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.Recargas;

public class LogicaCelular {

    DBCelular objDBcelular = new DBCelular();
    DBRecargas objDBRecargas = new DBRecargas();

    public void Insertar(Celular celular)
            throws ClassNotFoundException, SQLException {
        objDBcelular.Insertar(celular);
    }

}
