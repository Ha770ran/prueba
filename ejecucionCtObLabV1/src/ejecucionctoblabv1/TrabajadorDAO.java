package ejecucionctoblabv1;

import Conexion.ConexionBD;
import contratolaboralv1.ContratoLaboralv1;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TrabajadorDAO {

    public void insertarTrabajador(ContratoLaboralv1 contrato) throws SQLException {
        String sql = "INSERT INTO trabajador (Fecha,NContrato,NombreEmpleador,NitEmpleador,NombreR,DireccionEmplea,NombreTraba,CedulaTraba,CiudadTraba,DireccionTraba,TelefonoTraba,LugarNacimi,FechaNacimie,Cargo,Obra,Salario,PeriodoPago,InicioLabores,FinalizacionLabores,NumEmergencia) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection connection = ConexionBD.getConnection(); PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, contrato.getFecha());
            statement.setInt(2, Integer.parseInt(contrato.getNumeroContrato()));
            statement.setString(3, contrato.getNombreEmpleador());
            statement.setInt(4, Integer.parseInt(contrato.getNitEmpleador()));
            statement.setString(5, contrato.getNombreRl());
            statement.setString(6, contrato.getDireccionEmpleador());
            statement.setString(7, contrato.getNombreTrabajador());
            statement.setInt(8, Integer.parseInt(contrato.getCedulaTrabajador()));
            statement.setString(9, contrato.getCiudadTrabajador());
            statement.setString(10, contrato.getDireccionTrabajador());
            statement.setString(11, contrato.getTelefonoTrabajador());
            statement.setString(12, contrato.getLugarNacimiento());
            statement.setString(13, contrato.getFechaNacimiento());
            statement.setString(14, contrato.getCargo());
            statement.setString(15, contrato.getObra());
            statement.setString(16, contrato.getSalario());
            statement.setString(17, contrato.getPeriodoPago());
            statement.setString(18, contrato.getInicioLabores());
            statement.setString(19, contrato.getFinalizacionLabores());
            statement.setString(20, contrato.getEmergencia());
            // Continúa asignando los valores para todos los campos
            // ...
            statement.executeUpdate();
        }
    }

}
