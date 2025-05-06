package Logica;

import BD.BDPropietario;
import BD.BDVehiculo;
import Clases.Propietario;
import Clases.Vehiculo;
import java.sql.SQLException;

public class LogicaPropietario {
    
    private final BDPropietario objBDPropietario;
    private final BDVehiculo objBDVehiculo;

    public LogicaPropietario() {
        this.objBDPropietario = new BDPropietario();
        this.objBDVehiculo = new BDVehiculo();
    }

    public void registrarPropietario(Propietario objPropietario) 
            throws ClassNotFoundException, SQLException {
        validarPropietario(objPropietario);
        objBDPropietario.InsertarP(objPropietario);
    } 
    
    public void registrarVehiculo(Vehiculo objVehiculo)
            throws ClassNotFoundException, SQLException {
        validarVehiculo(objVehiculo);
        objBDVehiculo.InsertarV(objVehiculo);
    }
    
    private void validarPropietario(Propietario propietario) {
        if (propietario == null) {
            throw new IllegalArgumentException("El propietario no puede ser nulo");
        }
        if (propietario.getCedula() == null || propietario.getCedula().trim().isEmpty()) {
            throw new IllegalArgumentException("La cédula es obligatoria");
        }
    }
    

    private void validarVehiculo(Vehiculo vehiculo) {
        if (vehiculo == null) {
            throw new IllegalArgumentException("El vehículo no puede ser nulo");
        }
        if (vehiculo.getPlaca() == null || vehiculo.getPlaca().trim().isEmpty()) {
            throw new IllegalArgumentException("La placa es obligatoria");
        }
    }
}