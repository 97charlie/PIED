/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Insercion;

/**
 *
 * @author MS
 */
public class vistaReservacion extends javax.swing.JFrame {

    /**
     * Creates new form vistaReservacion
     */
    public vistaReservacion() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField19 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jTextField20 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(0, 0, 0, 0));
        setMaximumSize(new java.awt.Dimension(480, 600));
        setMinimumSize(new java.awt.Dimension(480, 600));
        setPreferredSize(new java.awt.Dimension(480, 600));
        setSize(new java.awt.Dimension(480, 600));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Viajes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 250, 80, 30);

        jButton2.setText("Agregar");
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 210, 79, 25);

        jButton1.setText("Eliminar");
        getContentPane().add(jButton1);
        jButton1.setBounds(110, 210, 79, 25);

        jButton3.setText("Limpiar");
        getContentPane().add(jButton3);
        jButton3.setBounds(200, 210, 75, 25);

        jTextField19.setToolTipText("");
        getContentPane().add(jTextField19);
        jTextField19.setBounds(20, 80, 90, 22);

        jLabel20.setText("Origen");
        getContentPane().add(jLabel20);
        jLabel20.setBounds(50, 60, 40, 16);

        jTextField20.setToolTipText("");
        getContentPane().add(jTextField20);
        jTextField20.setBounds(130, 80, 90, 22);

        jLabel21.setText("Destino");
        getContentPane().add(jLabel21);
        jLabel21.setBounds(150, 60, 50, 16);

        jTextField8.setToolTipText("");
        getContentPane().add(jTextField8);
        jTextField8.setBounds(20, 160, 40, 22);

        jTextField9.setToolTipText("");
        getContentPane().add(jTextField9);
        jTextField9.setBounds(60, 160, 40, 22);

        jTextField7.setToolTipText("");
        getContentPane().add(jTextField7);
        jTextField7.setBounds(100, 160, 60, 22);

        jLabel9.setText("Fecha salida");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(30, 140, 80, 16);

        jTextField10.setToolTipText("");
        getContentPane().add(jTextField10);
        jTextField10.setBounds(260, 160, 60, 22);

        jTextField11.setToolTipText("");
        getContentPane().add(jTextField11);
        jTextField11.setBounds(220, 160, 40, 22);

        jTextField12.setToolTipText("");
        getContentPane().add(jTextField12);
        jTextField12.setBounds(180, 160, 40, 22);

        jLabel10.setText("Fecha regreso");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(190, 140, 90, 16);

        jTextField16.setToolTipText("");
        getContentPane().add(jTextField16);
        jTextField16.setBounds(390, 160, 40, 22);

        jTextField17.setToolTipText("");
        getContentPane().add(jTextField17);
        jTextField17.setBounds(350, 160, 40, 22);

        jLabel17.setText("Hora Llegada");
        getContentPane().add(jLabel17);
        jLabel17.setBounds(350, 140, 80, 20);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Origen", "Destino", "Salida", "Llegada", "Precio", "Marca"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(20, 290, 430, 240);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Reservacion");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 150, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaReservacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaReservacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField19;
    private javax.swing.JTextField jTextField20;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
