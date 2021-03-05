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
public class Cliente {

    private int idCliente;
    private String nombreCliente;
    private String documentoCliente;
    private String celularCliente;

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getDocumentoCliente() {
        return documentoCliente;
    }

    public void setDocumentoCliente(String documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public String getCelularCliente() {
        return celularCliente;
    }

    public void setCelularCliente(String celularCliente) {
        this.celularCliente = celularCliente;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombreCliente=" + nombreCliente + '}';
    }

    public Iterator<Cliente> listar() {
        ArrayList<Cliente> los Clientes = new ArrayList<>();
        try {
            preparedStatement sql = ConexionBD.conexion.prepareStatement("SELECT* FROM" + this.getSimpleName());
            ResultSet rs = sql.executeQuery();
            Cliente unCliente;
            while (rs.net()) {
                unCliente = new Cliente();
                unCliente.setIdCliente(rs.getInt("idCliente"));
                unCliente.setNombreCliente(rs.getString("nombreCliente"));
                unCliente.setDocumentoCliente(rs.getString("documentoCliente"));
                unCliente.setDireccionCliente(rs.getString("direccionCliente"));
                unCliente.setCelularCliente(rs.getString(celularCliente));
                losClientes.add(unCliente);
            }

        } catch (SQLException ex) {
            System.err.prinntln("Error al listar estudiante:" + ex.getMessage());

        }
        if (losClientes.isEmpty()) {
            Cliente miCliente = new Cliente();
            miCliente.setNombreCliente("No hay clientes");
            losClientes.add(miCliente);

        }
        return losClientes.interator();

    }

    public void insertar() {
        try {
            PreparedStatement sql = conexionBD.conexion.PREPAREstatement("INSER INTO" + this.getSimpleName() + "VALUES(NULL,?,?,?,?)");
            sql.setString(1, this.getNombreCliente());
            sql.setString(2, this.getDocumentoCliente());
            sql.setString(3, this.getDireccionCliente());
            sql.setString(4, this.getCelularCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + "insertado corectamente");
        }
    }

    public void modificar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("UPDATE" + this.getClass().getSimpleName() + "SET nombreCliente= ?, documentoCliente = ?, direccionCliente = ?, celularCliente = ? WERE idCliente = ?)");
            sql.setString(1, this.getDocumentoCliente());
            sql.setString(2, this.getNombreCliente());
            sql.setString(3, this.getDireccionCliente());
            sql.setString(4, this.getCelularCliente());
            sql.setInt(5, this.getIdCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().get.SimpleName() + "modificado correctamente");
        } catch (SQLException ex) {
            System.err.println("Error al modificar " + this.getClass().getSimpleName() + ": " + ex.getMessage());
        }
    }

    public viod eliminar() {
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStatement("DELETE FROM"
                    + this.getClass().getSimpleName() + "were idCliente = ?)");
            sql.setInt(1, this.getIdCliente());
            sql.executeUpdate();
            System.out.println(this.getClass().getSimpleName() + "eliminado correctamente");
        } catch (SQLException ex) {
            System.err.println("error al eliminar " + this.getClass().getSimpleName() + ": " + ex.getMessage());
        }
    }

    public Iterator<Cliente> buscar(String busqueda) {
        ArrayList<Cliente> losClientes = new ArrayList<>();
        try {
            PreparedStatement sql = conexionBD.conexion.prepareStatement("SELECT +FROM " + this.getClass().getSimpleName()
                    + "WERE nombreCliente LIKE ? OR documentoCliente LIKE ? OR direccionCliente LIKE ? OR  celularCliente LIKE ?");
            sql.setString(1, "%" + busqueda + "%");
            sql.setString(2, "%" + busqueda + "%");
            sql.setString(3, "%" + busqueda + "%");
            sql.setString(4, "%" + busqueda + "%");
            ResultSet rs = sql.executeQuery();
            Cliente unClienta;
            while (rs.next()) {
                unCliente = new Cliente();
                unCliente.setIdCliente(rs.getInt("idCliente"));
                unCliente.setNombreCliente(rs.getString("nombreCliente"));
                unCliente.setDocumentoCliente(rs.getString("documentoCliente"));
                unClienta.setDireccionCliente(rs.getString("direccionCliente"));
                unCliente.setCelularCliente(rs.getString("celularCliente"));
                losClientes.add(unCliente);

            }
        } catch (SQLExeption ex) {
            System.err.println("Error al busacar " + this.getClass().getSimpleName() + ": " + ex.getMessage());
        }
        return losClientes.interator();
    }

    public Cliente buscarPorId(int elId) {
        Cliente unCliente = new Cliente();
        unCliente.setNombreCliente("Cliente no existe");
        try {
            PreparedStatement sql = ConexionBD.conexion.prepareStantement("SELECT * FROM"
                    + this.getClass().getSimpleName() + "WERE idCliente = ?");
            sql.setInt(1, elId);
            ResultSet rs = sql.executeQuery();
            while (rs.next()) {
                unCliente.setIdCliente(rs.getInt("idCliente"));
                unCliente.setNombreCliente(rs.getString("nombreCliente"));
                unCliente.setDocumetoCliente(rs.getString("documentoCliente"));
                unCliente.setDireccionCliente(rs.getString("direccionCliente"));
                unCliente.setCelularCliente(rs.getString("celularCliente"));
            }
        } catch (SQLExecption ex) {
            System.out.println("Error al buscar por id " + ex.getMessage());
        }
        return unCliente;
    }

}
