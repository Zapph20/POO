
package BAR;

import BaseDatos.Cliente;
import BaseDatos.ClienteDAO;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Axel Yamir CT
 */
public class AñadirCliente extends javax.swing.JFrame {
    ClienteDAO dao=new ClienteDAO();
    Cliente cl=new Cliente();
    
    DefaultTableModel modelo=new DefaultTableModel();
    int id;
 
    public AñadirCliente() {
        initComponents();
        listar();
        this.setLocationRelativeTo(this);
        this.setTitle("INGRESO DE DATOS DEL CLIENTE");
        Image icono= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/coctel.png"));
        this.setIconImage(icono);
        
        Image fondo= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/fondobar2.jpg"));
        jblFondo.setIcon(new ImageIcon(fondo.getScaledInstance(jblFondo.getWidth(), jblFondo.getHeight() , Image.SCALE_SMOOTH ) ));
        Image logo= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/carnaval.png"));
        jblLogo.setIcon(new ImageIcon(logo.getScaledInstance(jblLogo.getWidth(), jblLogo.getHeight() , Image.SCALE_SMOOTH ) ));
        Image iconito= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/usuario.png"));
        jblIconitoU.setIcon(new ImageIcon(iconito.getScaledInstance(jblIconitoU.getWidth(), jblIconitoU.getHeight() , Image.SCALE_SMOOTH ) ));
    }

    void listar(){
        List<Cliente> lista=dao.listar();
        modelo=(DefaultTableModel)tabla.getModel();
        Object[]ob=new Object[5];
        for (int i = 0; i < lista.size(); i++) {
            ob[0]=lista.get(i).getId();
            ob[1]=lista.get(i).getDni();
            ob[2]=lista.get(i).getNom();
            ob[3]=lista.get(i).getTelefono();
            ob[4]=lista.get(i).getEstado();
            modelo.addRow(ob);   
        }
        tabla.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblUsuario = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator1 = new javax.swing.JSeparator();
        guardar = new javax.swing.JButton();
        lblUsuario3 = new javax.swing.JLabel();
        jblLogo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        lblInicio = new javax.swing.JLabel();
        jblIconitoU = new javax.swing.JLabel();
        lblUsuario4 = new javax.swing.JLabel();
        cboEstado = new javax.swing.JComboBox<>();
        btnNuevo = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        lblUsuario5 = new javax.swing.JLabel();
        txtDni1 = new javax.swing.JTextField();
        txtNom1 = new javax.swing.JTextField();
        txtTel1 = new javax.swing.JTextField();
        btnCambiar = new javax.swing.JButton();
        jblFondo = new javax.swing.JLabel();
        fondo = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblUsuario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario.setText("NOMBRE");
        getContentPane().add(lblUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 190, -1, -1));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 250, 300, 20));

        jSeparator3.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 300, 20));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 330, 300, 20));

        guardar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guarda1.png"))); // NOI18N
        guardar.setText("  GUARDAR");
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        getContentPane().add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, 180, 50));

        lblUsuario3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario3.setText("ESTADO");
        getContentPane().add(lblUsuario3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, -1, -1));
        getContentPane().add(jblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 200, 240));

        tabla.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRES", "DNI", "TELEFONO", "ESTADO"
            }
        ));
        tabla.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 410, 510, 180));

        jPanel1.setBackground(new java.awt.Color(151, 120, 93));

        lblInicio.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblInicio.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio.setText("DATOS DEL CLIENTE");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jblIconitoU, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInicio)
                .addGap(155, 155, 155))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(lblInicio))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jblIconitoU, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 580, 90));

        lblUsuario4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario4.setText("DNI");
        getContentPane().add(lblUsuario4, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        cboEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cboEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "0" }));
        getContentPane().add(cboEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 200, 40));

        btnNuevo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/nuevo.png"))); // NOI18N
        btnNuevo.setText("NUEVO");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btnNuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 320, 180, 60));

        btnAgregar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/agre.png"))); // NOI18N
        btnAgregar.setText("AGREGAR");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 110, 180, 50));

        btnActualizar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/actu.png"))); // NOI18N
        btnActualizar.setText("ACTUALIZAR");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 180, 180, 50));

        btnEliminar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/eliminar.png"))); // NOI18N
        btnEliminar.setText("ELIMINAR");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 250, 180, 50));

        lblUsuario5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblUsuario5.setText("TELEFONO");
        getContentPane().add(lblUsuario5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, -1, -1));

        txtDni1.setForeground(new java.awt.Color(204, 204, 204));
        txtDni1.setText("Ingrese el DNI del Cliente");
        txtDni1.setBorder(null);
        txtDni1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtDni1MousePressed(evt);
            }
        });
        txtDni1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDni1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtDni1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 300, 40));

        txtNom1.setForeground(new java.awt.Color(204, 204, 204));
        txtNom1.setText("Ingrese el nombre del Cliente");
        txtNom1.setBorder(null);
        txtNom1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNom1MousePressed(evt);
            }
        });
        txtNom1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNom1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNom1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 300, 40));

        txtTel1.setForeground(new java.awt.Color(204, 204, 204));
        txtTel1.setText("Ingrese el número de telefono del Cliente");
        txtTel1.setBorder(null);
        txtTel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtTel1MousePressed(evt);
            }
        });
        txtTel1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTel1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtTel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 300, 40));

        btnCambiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnCambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cambiar.png"))); // NOI18N
        btnCambiar.setText("  CAMBIAR");
        btnCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCambiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, 180, 50));
        getContentPane().add(jblFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 610));

        fondo.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 610, Short.MAX_VALUE)
        );

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 580, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        TIENDA_BAR t=new TIENDA_BAR();
        t.setVisible(true);
        
        String info=txtNom1.getText();
        TIENDA_BAR.lblRecibeNombre.setText(info);
        
        String info2=txtTel1.getText();
        TIENDA_BAR.lblRecibeApellido.setText(info2);
        
        String info3=txtDni1.getText();
        TIENDA_BAR.lblRecibeDni.setText(info3);
            
        this.dispose();
    }//GEN-LAST:event_guardarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        agregar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        actualizar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        eliminar();
        limpiarTabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void tablaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaMouseClicked
        int fila=tabla.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");     
        }else{
            id = Integer.parseInt(tabla.getValueAt(fila, 0).toString());
            String dni=tabla.getValueAt(fila, 1).toString();
            String nom=tabla.getValueAt(fila, 2).toString();
            String telefono=tabla.getValueAt(fila, 3).toString();
            String estado=tabla.getValueAt(fila, 4).toString();
            txtDni1.setText(dni);
            txtNom1.setText(nom);
            txtTel1.setText(telefono);
            cboEstado.setSelectedItem(estado);
        }
                
    }//GEN-LAST:event_tablaMouseClicked

    private void txtDni1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtDni1MousePressed
        if (txtDni1.getText().equals("Ingrese el DNI del Cliente")) {
            txtDni1.setText("");
            txtDni1.setForeground(Color.BLACK);
        }
        
        if (txtNom1.getText().isEmpty()){
            txtNom1.setText("Ingrese el nombre del Cliente");
            txtNom1.setForeground(Color.LIGHT_GRAY);
        }
        if (txtTel1.getText().isEmpty()){
            txtTel1.setText("Ingrese el número de telefono del Cliente");
            txtTel1.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtDni1MousePressed

    private void txtDni1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDni1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDni1ActionPerformed

    private void txtNom1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNom1MousePressed
        if (txtNom1.getText().equals("Ingrese el nombre del Cliente")) {
            txtNom1.setText("");
            txtNom1.setForeground(Color.BLACK);
        }
        
        if (txtTel1.getText().isEmpty()){
            txtTel1.setText("Ingrese el número de telefono del Cliente");
            txtTel1.setForeground(Color.LIGHT_GRAY);
        }
        
        if (txtDni1.getText().isEmpty()){
            txtDni1.setText("Ingrese el DNI del Cliente");
            txtDni1.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtNom1MousePressed

    private void txtNom1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNom1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNom1ActionPerformed

    private void txtTel1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTel1MousePressed
        if (txtTel1.getText().equals("Ingrese el número de telefono del Cliente")) {
            txtTel1.setText("");
            txtTel1.setForeground(Color.BLACK);
        }
        
        if (txtNom1.getText().isEmpty()){
            txtNom1.setText("Ingrese el nombre del Cliente");
            txtNom1.setForeground(Color.LIGHT_GRAY);
        }
        
        if (txtDni1.getText().isEmpty()){
            txtDni1.setText("Ingrese el DNI del Cliente");
            txtDni1.setForeground(Color.LIGHT_GRAY);
        }
    }//GEN-LAST:event_txtTel1MousePressed

    private void txtTel1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTel1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTel1ActionPerformed

    private void btnCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarActionPerformed
        VENTAS t=new VENTAS();
        t.setVisible(true);
        
        String info=txtNom1.getText();
        VENTAS.jtlblNombreC.setText(info);
        
        String info2=txtTel1.getText();
        VENTAS.jtlblApellidoC.setText(info2);
        
        String info3=txtDni1.getText();
        VENTAS.jtlblDniC.setText(info3);
        this.dispose();
       
    }//GEN-LAST:event_btnCambiarActionPerformed

    void agregar(){
        String dni=txtDni1.getText();
        String nom=txtNom1.getText();
        String telefono=txtTel1.getText();
        String estado=cboEstado.getSelectedItem().toString();
        Object[] ob=new Object[4];
        ob[0]=dni;
        ob[1]=nom;
        ob[2]=telefono;
        ob[3]=estado;
        dao.add(ob);
    }
    void actualizar(){
        int fila=tabla.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");     
        }else{
        String dni=txtDni1.getText();
        String nom=txtNom1.getText();
        String telefono=txtTel1.getText();
        String estado=cboEstado.getSelectedItem().toString();
        Object[] obj=new Object[5];
        obj[0]=dni;
        obj[1]=nom;
        obj[2]=telefono;
        obj[3]=estado;
        obj[4]=id;
        dao.actualizar(obj);
        }
    }
    void eliminar(){
        int fila=tabla.getSelectedRow();
        if (fila==-1) {
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");     
        }else{
            dao.eliminar(id);            
        }
    }
    void nuevo(){
        txtDni1.setText("");
        txtNom1.setText("");
        txtTel1.setText("");
        cboEstado.setSelectedItem(0);
        txtDni1.requestFocus();
    }
    void limpiarTabla(){
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i=i-1;
        }
    }
            


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnCambiar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JComboBox<String> cboEstado;
    private javax.swing.JPanel fondo;
    private javax.swing.JButton guardar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel jblFondo;
    private javax.swing.JLabel jblIconitoU;
    private javax.swing.JLabel jblLogo;
    private javax.swing.JLabel lblInicio;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JLabel lblUsuario3;
    private javax.swing.JLabel lblUsuario4;
    private javax.swing.JLabel lblUsuario5;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField txtDni1;
    private javax.swing.JTextField txtNom1;
    private javax.swing.JTextField txtTel1;
    // End of variables declaration//GEN-END:variables
}
