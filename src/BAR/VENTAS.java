
package BAR;

import BaseDatos.Cliente;
import BaseDatos.ClienteDAO;
import OUTPUT.Boleta;
import java.awt.Image;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Date;
import java.text.SimpleDateFormat;


/**
 * @author Axel Yamir CT
 */
public class VENTAS extends javax.swing.JFrame {
    
    ClienteDAO cdao=new ClienteDAO();

    String Productos[]={"ROB BOY","NEGRONI","CARNAVAL TONIC","ALMA","MOJITO","PIÑA COLADA","MARGARITA","SCREWDRIVER"};
    double precios[]={48,38,42,42,40,48,48,46};
    double precio=0;
    int cantidad=0;
    String imgs[]={"ROB_BOY.jpg","NEGRONI.jpg","CARNAVAL.jpeg","ALMA.jpeg","MOJITO.jpeg","PIÑA_COLADA.jpg","MARGARITA.jpeg","SCREW.jpeg"};
    int index =0;
    DefaultTableModel model;
    DefaultTableModel modelo=new DefaultTableModel();
             
    ArrayList<Venta> ListaVentas=new ArrayList<Venta>();
    
    public VENTAS() {
        initComponents();
        this.setLocationRelativeTo(this);
        this.setTitle("PROCESO DE VENTAS");
        jtxtFecha.setText(fecha());
        Image icono= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/coctel.png"));
        this.setIconImage(icono);
        
        Image fondoVentas= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/fondoventas.jpg"));
        lblFondoVentas.setIcon(new ImageIcon(fondoVentas.getScaledInstance(lblFondoVentas.getWidth(), lblFondoVentas.getHeight() , Image.SCALE_SMOOTH ) ));
        
        Image logo= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/carnaval.png"));
        jblLogo.setIcon(new ImageIcon(logo.getScaledInstance(jblLogo.getWidth(), jblLogo.getHeight() , Image.SCALE_SMOOTH ) ));
        
        Image titulo= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/titulo.png"));
        lbltitulo.setIcon(new ImageIcon(titulo.getScaledInstance(lbltitulo.getWidth(), lbltitulo.getHeight() , Image.SCALE_SMOOTH ) ));
        
        Image marronfactura= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/marron2.jpeg"));
        lblmarron.setIcon(new ImageIcon(marronfactura.getScaledInstance(lblmarron.getWidth(), lblmarron.getHeight() , Image.SCALE_SMOOTH ) ));
        
        Image marron1= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/marron2.jpeg"));
        lblmarron1.setIcon(new ImageIcon(marron1.getScaledInstance(lblmarron1.getWidth(), lblmarron1.getHeight() , Image.SCALE_SMOOTH ) ));
       
        Image iconoAgregar= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/agregar.png"));
        btnAgregar.setIcon(new ImageIcon(iconoAgregar.getScaledInstance(70,70, Image.SCALE_SMOOTH ) ));
        
        DefaultComboBoxModel comboModel=new DefaultComboBoxModel(Productos);
        cboProducto.setModel(comboModel);  
        
        modelo=new DefaultTableModel();
        modelo.addColumn("Descripción");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Precio U.");
        modelo.addColumn("Importe");
        tblDetalles.setModel(modelo);
        
        ImagenIndex();
        ActualizarTabla();
        CalcularPrecio();
    }   
     
    public void CalcularPrecio(){
        precio = precios[cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText(aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
    }    
    
    public String aMoneda (double precio) {
        return "S/. "+Math.round(precio*100.0)/100.0+" PEN";
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jtlblDniC = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jtxtFecha = new javax.swing.JTextField();
        txtlBoleta = new javax.swing.JTextField();
        txtSoles = new javax.swing.JTextField();
        jlblNombreATienda = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblNetoPagar = new javax.swing.JLabel();
        lblIvaa = new javax.swing.JLabel();
        lblTotall = new javax.swing.JLabel();
        btnQuitar = new javax.swing.JButton();
        btnLimpiarTabla = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        cboProducto = new javax.swing.JComboBox<>();
        lblImagen = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalles = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jblLogo = new javax.swing.JLabel();
        jlblImprimir = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblInicio1 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        lblmarron = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jblIconito1 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jtlblNombreC = new javax.swing.JLabel();
        jtlblApellidoC = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbltitulo = new javax.swing.JLabel();
        lblmarron1 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        lblmarronCliente = new javax.swing.JLabel();
        lblmarronProducto = new javax.swing.JLabel();
        lblFondoVentas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Moneda:");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 420, 90, 20));

        jtlblDniC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtlblDniC.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtlblDniC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 420, 130, 20));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Fecha de emisión:");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 130, 180, 20));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Bebida:");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 100, 20));

        jtxtFecha.setEditable(false);
        jtxtFecha.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jtxtFecha.setText("DD/MM/YYYY");
        jtxtFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtFechaActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, 110, 30));

        txtlBoleta.setEditable(false);
        txtlBoleta.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtlBoleta.setText("BOLETA");
        getContentPane().add(txtlBoleta, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 180, -1));

        txtSoles.setEditable(false);
        txtSoles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtSoles.setText("SOLES");
        getContentPane().add(txtSoles, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 420, 60, -1));

        jlblNombreATienda.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jlblNombreATienda.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jlblNombreATienda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 130, 40));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("IVA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("TOTAL:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, -1, -1));

        lblNetoPagar.setBackground(new java.awt.Color(255, 255, 255));
        lblNetoPagar.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblNetoPagar.setForeground(new java.awt.Color(255, 255, 255));
        lblNetoPagar.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNetoPagar.setText("S/. 0.00 PEN");
        getContentPane().add(lblNetoPagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 680, 160, -1));

        lblIvaa.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblIvaa.setForeground(new java.awt.Color(255, 255, 255));
        lblIvaa.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblIvaa.setText("S/. 0.00 PEN");
        getContentPane().add(lblIvaa, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 680, 160, -1));

        lblTotall.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        lblTotall.setForeground(new java.awt.Color(255, 255, 255));
        lblTotall.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblTotall.setText("S/. 0.00 PEN");
        getContentPane().add(lblTotall, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 680, 180, -1));

        btnQuitar.setBackground(new java.awt.Color(138, 101, 82));
        btnQuitar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnQuitar.setText("QUITAR COMPRA");
        btnQuitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnQuitarActionPerformed(evt);
            }
        });
        getContentPane().add(btnQuitar, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 530, 170, 40));

        btnLimpiarTabla.setBackground(new java.awt.Color(138, 101, 82));
        btnLimpiarTabla.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnLimpiarTabla.setText(" LIMPIAR TABLA");
        btnLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarTablaActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiarTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 480, 170, 40));

        btnAgregar.setBackground(new java.awt.Color(102, 255, 102));
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 340, 110, 90));

        cboProducto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });
        getContentPane().add(cboProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 380, 200, 30));

        lblImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(lblImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 480, 250, 220));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cantidad:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, -1, -1));

        spnCantidad.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });
        getContentPane().add(spnCantidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 380, 60, 30));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Precio:");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 420, 70, 20));

        lblPrecio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(lblPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 420, 120, 20));

        tblDetalles.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        tblDetalles.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDetalles);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 620, 170));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("SUBTOTAL:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 680, -1, -1));
        getContentPane().add(jblLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 180, 210));

        jlblImprimir.setBackground(new java.awt.Color(204, 255, 153));
        jlblImprimir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlblImprimir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/check.png"))); // NOI18N
        jlblImprimir.setText("IMPRIMIR");
        jlblImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblImprimirActionPerformed(evt);
            }
        });
        getContentPane().add(jlblImprimir, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 580, 170, 70));

        jPanel2.setBackground(new java.awt.Color(79, 55, 34));
        jPanel2.setForeground(new java.awt.Color(138, 101, 67));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(85, 62, 41));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblInicio1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblInicio1.setForeground(new java.awt.Color(255, 255, 255));
        lblInicio1.setText("Nueva venta");
        jPanel3.add(lblInicio1, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 11, -1, 68));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("BOLETA DE VENTA");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 170, 30));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 320, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("20601540437");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 30, 150, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("000001");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 90, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("RUC: ");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 60, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nro de Venta:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 140, 20));

        lblmarron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel2.add(lblmarron, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 190));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 90, 340, 190));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Tipo:");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 230, 190, 20));
        getContentPane().add(jblIconito1, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 300, 40, 30));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Axel Yamir Castañeda Terrones");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 340, 290, 20));

        jtlblNombreC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtlblNombreC.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtlblNombreC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 270, 20));

        jtlblApellidoC.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtlblApellidoC.setForeground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jtlblApellidoC, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 380, 130, 20));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Tipo de Documento", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, 380, 90));

        jLabel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Fecha de compra", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 90, 380, 90));
        getContentPane().add(lbltitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 10, 350, 50));
        getContentPane().add(lblmarron1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1140, 70));

        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Cajero:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 340, 80, 20));

        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Nombre:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 80, 20));

        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Telefono:");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 90, 20));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("DNI:");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 420, 60, 20));

        lblImporte.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        getContentPane().add(lblImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 310, 120, 20));

        btnBuscar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/buscar.png"))); // NOI18N
        btnBuscar.setText("CAMBIAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, 130, 60));

        lblmarronCliente.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblmarronCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 410, 160));

        lblmarronProducto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Producto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N
        getContentPane().add(lblmarronProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 300, 660, 160));
        getContentPane().add(lblFondoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1140, 660));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnQuitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnQuitarActionPerformed
        if(tblDetalles.getSelectedRow()==-1)
            return;
        modelo.removeRow(tblDetalles.getSelectedRow());
        
    }//GEN-LAST:event_btnQuitarActionPerformed

    private void btnLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarTablaActionPerformed
        modelo.getDataVector().removeAllElements();
        tblDetalles.updateUI();
        this.lblIvaa.setText("");
        this.lblNetoPagar.setText("");
        this.lblTotall.setText("");
    }//GEN-LAST:event_btnLimpiarTablaActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        Venta venta= new Venta();
        venta.setId(cboProducto.getSelectedIndex());
        venta.setDescripción(cboProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setImporte(precio*cantidad);
        if(!BuscarVenta(venta)){
            ListaVentas.add(venta);
        }
        ActualizarTabla();
        BorrarVenta();   
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        index=cboProducto.getSelectedIndex();
        ImagenIndex();
        CalcularPrecio();
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
        CalcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void jtxtFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtFechaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtFechaActionPerformed

    private void jlblImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblImprimirActionPerformed
        Boleta a=new Boleta();
            a.setVisible(true);
            
        for (int i = 0; i < tblDetalles.getRowCount(); i++) {
            String Datos[]=new String[4];
            Datos[0]=tblDetalles.getValueAt(i, 0).toString();
            Datos[1]=tblDetalles.getValueAt(i, 1).toString();
            Datos[2]=tblDetalles.getValueAt(i, 2).toString();
            Datos[3]=tblDetalles.getValueAt(i, 3).toString();
            
            Boleta.modelo2.addRow(Datos); 
        }
        
        nuevatabla();
                
            String info=jtlblNombreC.getText();
        Boleta.lblFacNom.setText(info);
        // ------DATOS CLIENTE------------
            String info2=jtlblApellidoC.getText();
        Boleta.lblFacApe.setText(info2);
        
            String info3=jtlblDniC.getText();
        Boleta.lblFacDni.setText(info3);
            this.dispose();
        // -------TOTALES A PAGAR----------------
            String info4=lblNetoPagar.getText();
        Boleta.lblRecibeSubtotal.setText(info4);
        
            String info5=lblIvaa.getText();
        Boleta.lblRecibeIva.setText(info5);
        
            String info6=lblTotall.getText();
        Boleta.lblRecibeTotal.setText(info6);
            this.dispose();
    }//GEN-LAST:event_jlblImprimirActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
                 AñadirCliente AC=new AñadirCliente();
                 AC.setVisible(true);
                 this.dispose();
    }//GEN-LAST:event_btnBuscarActionPerformed
    
    
    public void ImagenIndex() {
        Image img= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/"+imgs[index]));
        lblImagen.setIcon(new ImageIcon(img.getScaledInstance(lblImagen.getWidth(), lblImagen.getHeight(), Image.SCALE_SMOOTH)));
    }
    public boolean BuscarVenta(Venta nueva){
        for(Venta v : ListaVentas){
            if(v.getId()==nueva.getId()){
                int nuevaCantidad=v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setImporte(v.getPrecio()*nuevaCantidad);
                return true;
            }
        }
        return false;
    }
    
    public void BorrarVenta(){
        precio=0;
        cantidad=1;
        cboProducto.setSelectedIndex(0);
        spnCantidad.setValue(1);
        CalcularPrecio();
    }
    public void ActualizarTabla(){
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
        }
        double subtotal=0;
        for (Venta v : ListaVentas){
            Object x[]=new Object[4];
            x[0]=v.getDescripción();
            x[1]=v.getCantidad();
            x[2]=v.getPrecio();
            x[3]=v.getImporte();
            subtotal+=v.getImporte();
            modelo.addRow(x);  
        }
        double ivaa =subtotal*0.18;
        double totall=subtotal+ivaa;
        lblNetoPagar.setText(aMoneda(subtotal));
        lblIvaa.setText(aMoneda(ivaa));
        lblTotall.setText(aMoneda(totall));
        tblDetalles.setModel(modelo);
    }
    public static String fecha(){
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }
    
    public void nuevatabla(){
        modelo=new DefaultTableModel();
        tblDetalles.setModel(modelo);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnLimpiarTabla;
    private javax.swing.JButton btnQuitar;
    public static javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jblIconito1;
    private javax.swing.JLabel jblLogo;
    private javax.swing.JButton jlblImprimir;
    public static javax.swing.JLabel jlblNombreATienda;
    public static javax.swing.JLabel jtlblApellidoC;
    public static javax.swing.JLabel jtlblDniC;
    public static javax.swing.JLabel jtlblNombreC;
    private javax.swing.JTextField jtxtFecha;
    private javax.swing.JLabel lblFondoVentas;
    private javax.swing.JLabel lblImagen;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblInicio1;
    private javax.swing.JLabel lblIvaa;
    private javax.swing.JLabel lblNetoPagar;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblTotall;
    private javax.swing.JLabel lblmarron;
    private javax.swing.JLabel lblmarron1;
    private javax.swing.JLabel lblmarronCliente;
    private javax.swing.JLabel lblmarronProducto;
    private javax.swing.JLabel lbltitulo;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblDetalles;
    private javax.swing.JTextField txtSoles;
    private javax.swing.JTextField txtlBoleta;
    // End of variables declaration//GEN-END:variables
}
