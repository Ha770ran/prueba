package Conexion;

import Conexion.ConexionBD;
import java.sql.Connection;
import java.sql.SQLException;

public class EjemploConsulta {
    public static void main(String[] args) {
        try {
            Connection connection = ConexionBD.getConnection();
            if (connection != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                connection.close();
            } else {
                System.out.println("No se pudo establecer la conexión a la base de datos.");
            }
        } catch (SQLException e) {
            System.out.println("Error al conectar a la base de datos:");
            e.printStackTrace();
        }
    }
}

