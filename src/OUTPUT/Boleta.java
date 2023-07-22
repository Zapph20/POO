package OUTPUT;

import java.awt.Image;
import java.awt.Toolkit;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

/**@author Axel Yamir CT */

public class Boleta extends javax.swing.JFrame implements Runnable{
    String hora,minutos,segundos;
    Thread hilo;
    
    public static DefaultTableModel modelo2;
    
    public Boleta() {
        initComponents();
        this.setLocationRelativeTo(this);
        lblFecha.setText(fecha());
        hilo=new Thread(this);
        hilo.start();
        setVisible(true);
        Image icono= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/coctel.png"));
        this.setIconImage(icono);
        Image factura= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/Factura.png"));
        lblFactura.setIcon(new ImageIcon(factura.getScaledInstance(lblFactura.getWidth(), lblFactura.getHeight() , Image.SCALE_SMOOTH ) ));
        Image marron1= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/marron2.jpeg"));
        lblmarron1.setIcon(new ImageIcon(marron1.getScaledInstance(lblmarron1.getWidth(), lblmarron1.getHeight() , Image.SCALE_SMOOTH ) ));
        Image marron2= Toolkit.getDefaultToolkit().getImage(getClass().getResource("/img/marron2.jpeg"));
        lblmarron2.setIcon(new ImageIcon(marron2.getScaledInstance(lblmarron2.getWidth(), lblmarron2.getHeight() , Image.SCALE_SMOOTH ) ));
        
        modelo2=new DefaultTableModel();
        modelo2.addColumn("Descripción");
        modelo2.addColumn("Cantidad");
        modelo2.addColumn("Precio U.");
        modelo2.addColumn("Importe");
        tblDetalles2.setModel(modelo2);   
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDetalles2 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        lblmarron = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel27 = new javax.swing.JLabel();
        lblFacDni = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        lblRecibeSubtotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblRecibeIva = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        lblRecibeTotal = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        lblFacNom = new javax.swing.JLabel();
        lblFacApe = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblFactura = new javax.swing.JLabel();
        lblmarron1 = new javax.swing.JLabel();
        lblmarron2 = new javax.swing.JLabel();
        lblHora = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblFecha = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDetalles2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblDetalles2);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 370, 160));

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));
        jPanel2.setForeground(new java.awt.Color(138, 101, 67));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 21)); // NOI18N
        jLabel20.setText("BOLETA DE VENTA");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 200, 30));

        lblmarron.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jPanel3.add(lblmarron, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, -50, 270, 150));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 250, 50));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 250, 50));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("20601540437");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 140, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("000001");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 90, 20));

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("RUC: ");
        jPanel2.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 50, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Nro de Venta:");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 20));

        jLabel3.setBackground(new java.awt.Color(153, 153, 153));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 3));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 150));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 40, 270, 150));

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("¡Gracias!");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 520, 220, 50));

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel23.setText("Av. Pardo y Aliaga 662, Lima");
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 270, 20));

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel24.setText("952 480 810");
        getContentPane().add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 140, 20));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 420, 260, 10));

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel27.setText("Dirección:");
        getContentPane().add(jLabel27, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 140, 20));

        lblFacDni.setBackground(new java.awt.Color(255, 255, 255));
        lblFacDni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblFacDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, 140, 20));

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel30.setText("DNI:");
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 60, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel18.setText("SUBTOTAL:");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        lblRecibeSubtotal.setBackground(new java.awt.Color(255, 255, 255));
        lblRecibeSubtotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRecibeSubtotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecibeSubtotal.setText("S/. 0.00 PEN");
        getContentPane().add(lblRecibeSubtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 330, 160, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("IVA:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 380, -1, -1));

        lblRecibeIva.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRecibeIva.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecibeIva.setText("S/. 0.00 PEN");
        getContentPane().add(lblRecibeIva, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 160, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel17.setText("TOTAL:");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 440, -1, -1));

        lblRecibeTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblRecibeTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblRecibeTotal.setText("S/. 0.00 PEN");
        getContentPane().add(lblRecibeTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 440, 180, -1));

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel31.setText("Telefono:");
        getContentPane().add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 100, 20));

        lblFacNom.setBackground(new java.awt.Color(255, 255, 255));
        lblFacNom.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblFacNom, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 220, 20));

        lblFacApe.setBackground(new java.awt.Color(255, 255, 255));
        lblFacApe.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        getContentPane().add(lblFacApe, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 170, 20));

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel33.setText("Hora:");
        getContentPane().add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 230, 70, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 700, 10));

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel34.setText("Fecha:");
        getContentPane().add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 70, 20));

        jLabel1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, 300, 160));

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 1, 51)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("CARNAVAL");
        getContentPane().add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, 290, 60));

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel26.setText("Contactanos:");
        getContentPane().add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 20));
        getContentPane().add(lblFactura, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 80, 60));
        getContentPane().add(lblmarron1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 740, 90));
        getContentPane().add(lblmarron2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 100));

        lblHora.setBackground(new java.awt.Color(255, 255, 255));
        lblHora.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblHora.setText("00:00");
        getContentPane().add(lblHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 230, 90, 20));

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel32.setText("Cliente: ");
        getContentPane().add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 80, 20));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        lblFecha.setBackground(new java.awt.Color(255, 255, 255));
        lblFecha.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblFecha.setText("DD/MM/YYYY");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(182, 182, 182))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(170, 170, 170)
                .addComponent(lblFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(220, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 740, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public static String fecha(){
        Date fecha=new Date();
        SimpleDateFormat formatofecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatofecha.format(fecha);
    }   
    public void hora(){
        Calendar calendario=new GregorianCalendar();
        Date horaactual=new Date();
        calendario.setTime(horaactual);
        hora=calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        //segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND); 
    } 
    public void run(){
        Thread current=Thread.currentThread();  
        while(current==hilo){
            hora();
            lblHora.setText(hora+":"+minutos);
        }  
    }
    
//lblHora.setText(hora+":"+minutos+":"+segundos);

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    public static javax.swing.JLabel lblFacApe;
    public static javax.swing.JLabel lblFacDni;
    public static javax.swing.JLabel lblFacNom;
    private javax.swing.JLabel lblFactura;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHora;
    public static javax.swing.JLabel lblRecibeIva;
    public static javax.swing.JLabel lblRecibeSubtotal;
    public static javax.swing.JLabel lblRecibeTotal;
    private javax.swing.JLabel lblmarron;
    private javax.swing.JLabel lblmarron1;
    private javax.swing.JLabel lblmarron2;
    public static javax.swing.JTable tblDetalles2;
    // End of variables declaration//GEN-END:variables
}
