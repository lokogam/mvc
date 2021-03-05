/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class controlarAccion {
    public void controlarAccion(ActionEvent evento, Cliente unCliente) {
        String accion=evento.getActionCommand();
        switch (accion) {
            case "Insertar":
                inCinte.insertar();
                break;
            case "Modificar":
                unCliente.modificar();
                break;
            case "Eliminar":
                unCliente.eliminar();
                break;
        }
    }

}
