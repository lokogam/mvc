/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.SQLException;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ConexionBD {
    public static coneection conexion;
    
    private ConexionBD() throws ClassNotFoundException {
        String driverBD = "com.mysql.jdbc.Driver";
        String urlBD = "jdbc:mysql://localhost/SistemaEjemplo";
        String usuario = "root";
        String caveBD = "";
        Class.forName(driverBD );
    } catch (ClassNotFoundEceception ex) {
    System.err.prntln("No encuentro el driver:"+ex. getMessage());
} catch (SQLException ex ) {
    System.err.println("Error al conectarme :"+ex .getMessage());
}
    
    public static ConexionBD getInstance() {
        return ConexionBDHolder.INSTANCE;
    }
    
    private static class ConexionBDHolder {

        private static final ConexionBD INSTANCE = new ConexionBD();

        private ConexionBDHolder() {
        }
    }

    private static class coneection {

        public coneection() {
        }
    }

    private static class classNotFoundException {

        public classNotFoundException() {
        }
    }

    private static class ClassNotFoundEceception {

        public ClassNotFoundEceception() {
        }

        private String getMessage() {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
    }
}
