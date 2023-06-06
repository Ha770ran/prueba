/*
 * 
 */
package ejecucionctoblabv1;

/**
 *
 * @author Halloran
 */
import contratolaboralv1.ContratoLaboralv1;
import java.io.IOException;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import plantillareclamardocumentos.Plantilla;

public class EjecucionCtObLabv1 {

    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);
        String fecha = JOptionPane.showInputDialog("Ingresa la Fecha: ");
        String numeroContrato = JOptionPane.showInputDialog("Ingresa Numero de Contrato: ");
        String nombreEmpleador = JOptionPane.showInputDialog("Ingresa Nombre del Empleador: ");
        String nitEmpleador = JOptionPane.showInputDialog("Ingresa Nit Empleador: ");
        String nombreRl = JOptionPane.showInputDialog("Ingresa Nombre Representante Legal: ");
        String direccionEmpleador = JOptionPane.showInputDialog("Ingresa Dirección de la Empresa: ");
        String nombreTrabajador = JOptionPane.showInputDialog("Ingresa Nombre del Trabajador: ");
        String cedulaTrabajador = JOptionPane.showInputDialog("Ingresa numero identificación del Trabajador: ");
        String ciudadTrabajador = JOptionPane.showInputDialog("Ingrese la ciudad donde reside el Trabajador: ");
        String direccionTrabajador = JOptionPane.showInputDialog("Ingrese la dirección del Trabajador: ");
        String telefonoTrabajador = JOptionPane.showInputDialog("Ingrese el numero telefonico del Trabajador: ");
        String lugarNacimiento = JOptionPane.showInputDialog("Ingrese la ciudad de nacimiento del Trabajador: ");
        String fechaNacimiento = JOptionPane.showInputDialog("Ingrese la fecha de nacimiento del Trabajador: ");
        String cargo = JOptionPane.showInputDialog("Ingrese el Cargo a desempeñar el Trabajador: ");
        String obra = JOptionPane.showInputDialog("Ingrese la Obra o Areá donde desempeñará la labor el Trabajador: ");
        String salario = JOptionPane.showInputDialog("Ingrese el salario a devengar por el Trabajador: ");
        String periodoPago = JOptionPane.showInputDialog("Ingrese el periodo de pago del Trabajador: ");
        String inicioLabores = JOptionPane.showInputDialog("Ingrese la fecha inicio de labores del Trabajador: ");
        String finalizacionLabores = JOptionPane.showInputDialog("Ingrese la fecha de finalización de labores del Trabajador: ");
        String emergencia = JOptionPane.showInputDialog("Ingrese el nombre y celular del contacto de emergencia del Trabajador: ");

        ContratoLaboralv1 miContratoLaboralv1 = new ContratoLaboralv1(fecha, numeroContrato, nombreEmpleador, nitEmpleador, nombreRl, direccionEmpleador, nombreTrabajador, cedulaTrabajador, ciudadTrabajador, direccionTrabajador, telefonoTrabajador, lugarNacimiento, fechaNacimiento, cargo, obra, salario, periodoPago, inicioLabores, finalizacionLabores, emergencia);
        miContratoLaboralv1.crearContratoLaboralv1();
        JOptionPane.showInputDialog("El Contrato se creo correctamente");
        
        TrabajadorDAO trabajadorDAO = new TrabajadorDAO();
        try {
            trabajadorDAO.insertarTrabajador(miContratoLaboralv1);
            JOptionPane.showMessageDialog(null, "El Contrato se guardó correctamente en la base de datos.");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al guardar el contrato en la base de datos.");
            e.printStackTrace();
        }

    }

}
