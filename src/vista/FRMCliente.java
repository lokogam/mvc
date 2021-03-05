/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class FRMCliente extends javax.swing.JInternalFrame {

    ControladorCliente clienteController = new ControladorCliente();

    /**
     * Creates new form FRMCliente
     */
    public FRMCliente() {
        initComponents();
        initComponents();
        TXTIdCliente.setValue(0);
        TXTIdCliente.setVisible(false);
        limpiarFormulario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        LBLNombre = new javax.swing.JLabel();
        LBLDocumento = new javax.swing.JLabel();
        LBLDireccion = new javax.swing.JLabel();
        LBLCelular = new javax.swing.JLabel();
        LBLBuscar = new javax.swing.JLabel();
        TXTNombreCliente = new javax.swing.JTextField();
        TXTDocumentoCliente = new javax.swing.JTextField();
        TXTDireccionCliente = new javax.swing.JTextField();
        TXTCelularCliente = new javax.swing.JTextField();
        TXTBuscarCliente = new javax.swing.JTextField();
        BTNInsertar = new javax.swing.JButton();
        BTNModificar = new javax.swing.JButton();
        BTNEliminar = new javax.swing.JButton();
        BTNCerrar = new javax.swing.JButton();
        BTNBuscar = new javax.swing.JButton();
        TXTIdCliente = new javax.swing.JFormattedTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        TBLCliente = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setTitle("Formulario Cliente");

        LBLNombre.setText("Nombre");

        LBLDocumento.setText("Documento");

        LBLDireccion.setText("Direccion");

        LBLCelular.setText("Celular");

        LBLBuscar.setText("Buscar");

        TXTNombreCliente.setText("Escriba Nombres");

        TXTDocumentoCliente.setText("Escriba Documento");

        TXTDireccionCliente.setText("Escriba Direccion");

        TXTCelularCliente.setText("Escriba Celular");

        TXTBuscarCliente.setText("Escriba texto a buscar");

        BTNInsertar.setText("Insertar");
        BTNInsertar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNInsertarActionPerformed(evt);
            }
        });

        BTNModificar.setText("Modificar");
        BTNModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNModificarActionPerformed(evt);
            }
        });

        BTNEliminar.setText("Eliminar");
        BTNEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNEliminarActionPerformed(evt);
            }
        });

        BTNCerrar.setText("Cerrar");
        BTNCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNCerrarActionPerformed(evt);
            }
        });

        BTNBuscar.setText("Buscar");
        BTNBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                BTNBuscarFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                BTNBuscarFocusLost(evt);
            }
        });
        BTNBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTNBuscarActionPerformed(evt);
            }
        });

        TXTIdCliente.setText("0");
        TXTIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TXTIdClienteActionPerformed(evt);
            }
        });

        TBLCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id", "Nombre", "Documento", "Direccion", "Celular"
            }
        ));
        TBLCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBLClienteMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(TBLCliente);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LBLNombre)
                    .addComponent(LBLDocumento)
                    .addComponent(LBLDireccion)
                    .addComponent(LBLCelular)
                    .addComponent(LBLBuscar))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TXTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BTNInsertar)
                    .addComponent(BTNModificar)
                    .addComponent(BTNEliminar)
                    .addComponent(BTNCerrar)
                    .addComponent(BTNBuscar))
                .addGap(34, 34, 34))
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLNombre)
                    .addComponent(TXTNombreCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNInsertar)
                    .addComponent(TXTIdCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDocumento)
                    .addComponent(TXTDocumentoCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNModificar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLDireccion)
                    .addComponent(TXTDireccionCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNEliminar))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLCelular)
                    .addComponent(TXTCelularCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNCerrar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LBLBuscar)
                    .addComponent(TXTBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BTNBuscar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TXTIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TXTIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TXTIdClienteActionPerformed

    private void BTNCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNCerrarActionPerformed
        doDefaultCloseAction();
// TODO add your handling code here:
    }//GEN-LAST:event_BTNCerrarActionPerformed

    private void BTNInsertarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNInsertarActionPerformed
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();
        // TODO add your handling code here:
    }//GEN-LAST:event_BTNInsertarActionPerformed

    private void BTNModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNModificarActionPerformed
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();        // TODO add your handling code here:
    }//GEN-LAST:event_BTNModificarActionPerformed

    private void BTNEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNEliminarActionPerformed
        clienteController.controlarAccion(evt, obtenerCliente());
        limpiarFormulario();        // TODO add your handling code here:
    }//GEN-LAST:event_BTNEliminarActionPerformed

    private void TBLClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBLClienteMouseClicked
          

    

    

    

    

    

    private void TBLClienteMouseClicked(java.awt.event.MouseEvent evt) {
        if (evt.getClickCount() == 2) {
            int fita = TBLCliente.rowAtPoint(eve.getPoint());
            if (fila > -1) {
                TXTId.setValue((Integer) TBLCliiente.getValueAt(fila, 0));
                TXTNombre.setText((string) TBLCliente.getValueAt(fila, 1));
                TXTDireccion.setText((string) TBLCliente.getValueAt(fila, 2));
                TXTCorreo.seText((string) TBLCliente.getValueAt(fila, 3));
                TXTCedula.setText((string) TBLCliente.getValueAt(fila, 4));
                BTNModificar.setEnabled(true);
                BTNEliminar.setEnable(true);
            }
        }
    }
    // TODO add your handling code here:
    }//GEN-LAST:event_TBLClienteMouseClicked

    private void BTNBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTNBuscarActionPerformed
       llenarTablaConBusqueda(TXTBusqueda.getText());

// TODO add your handling code here:
    }//GEN-LAST:event_BTNBuscarActionPerformed

    private void BTNBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTNBuscarFocusGained

         if (TXTBusqueda.getText().equals("Escriba texto al buscar")){
TXTBusqueda.getText();
}
// TODO add your handling code here:
    }//GEN-LAST:event_BTNBuscarFocusGained

    private void BTNBuscarFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_BTNBuscarFocusLost
if (TXTBusqueda.getText(). isEmpty()){
TXTBusqueda.setText("Escriba  texto a buscar")  // TODO add your handling code here:
    }//GEN-LAST:event_BTNBuscarFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTNBuscar;
    private javax.swing.JButton BTNCerrar;
    private javax.swing.JButton BTNEliminar;
    private javax.swing.JButton BTNInsertar;
    private javax.swing.JButton BTNModificar;
    private javax.swing.JLabel LBLBuscar;
    private javax.swing.JLabel LBLCelular;
    private javax.swing.JLabel LBLDireccion;
    private javax.swing.JLabel LBLDocumento;
    private javax.swing.JLabel LBLNombre;
    private javax.swing.JTable TBLCliente;
    private javax.swing.JTextField TXTBuscarCliente;
    private javax.swing.JTextField TXTCelularCliente;
    private javax.swing.JTextField TXTDireccionCliente;
    private javax.swing.JTextField TXTDocumentoCliente;
    private javax.swing.JFormattedTextField TXTIdCliente;
    private javax.swing.JTextField TXTNombreCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void limpiarFormulario() {
        TXTIdCliente.setValue(0);
        TXTNombreCliente.setText("Escriba Nombre");
        TXTDocumentoCliente.setText("Escriba Documento");
        TXTDireccionCliente.setText("Escriba Direccion");
        TXTCelularCliente.setText("Escriva Celular");
        TXTBuscarCliente.setText("Escriba texto a buscar");
        BTNModificar.setEnabled(false);
        BTNEliminar.setEnabled(false);
        llenarTabla();

    }

    public void llenarTabla() {
        Cliente unCliente = new Cliente();
        DefaultTableModel table = (DefaultTableModel) TBLCliente.getMode();
        iterator<Cliente> itCliente
        .listar();
        object[] filaCliente = newOblect[TBLCliente.getClumnCount()];
        tabla.setRowCoun(0);
        while (itCliente.hasNext()) {
            unCliente = itCliente.hasNext();
            filaCliente[0] = unCliente.getIdCliente();
            filaCliente[1] = unCliente.getCedulaCliente();
            filaCliente[2] = unCliente.getNombreClinte();
            filaCliente[3] = unCliente.getDireccionCliente();
            filaCliente[4] = unClinte.getCorre0Cliente();
            tabla.addRow(filaCliente);
            
        }
    }
    
    
    private Cliente OobtenerCliente(){
        Cliente elCliente() = new Cliente();
        elCliente.setIdCliente((integer) TXTIdCliente.getValue());
        elCliente.setNombreCliente(TXTNombreCliente.getText());
        elCliente.setDocumentoCliente(TXTDocumentoCliente.getText());
        elCliente.setDireccionCliente(TXTDireccionCliente.getText());
        elCliente.ssetCelularCliente(TXTCelularCliente.getText());
        return elCliente;
    }


private void llenarTablaConBusqueda(String busqueda){
           Cliente unCliente = new Cliente ();
             DefaultTablel tabla = (defaultTableModel)TBLCliente.getModel();
            Iterator<cliente> itCliente = unCliente.buscar(busqueda);
            object[] filaCliente = new Object[TBLCliente.getColumnCount()];
           tabla.setRowCount(0);
           while (itCliente.hasNext() ){
                  unCliente = itCliente.net();
                   filaCliente[0] =  unCliente.getId ();
                   filaCliente[1 = unCliente.getNombre():
                   filaCliente[2] = unClienteDireccion();
                  filaCliente[3 = ] unClienteCorreo();
                 filaCliente[4] = un ClienteCedula();
                 ((DefaultTableModel)TBLCliente.getModel()) .addRow(filaCliente);
          
}
}
