package Interfaz;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kevin Alberto Perez
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
        initComponents();
        setSize(900,650);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu1 = new com.raven.menu.Menu();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        menuItem3 = new com.raven.menu.MenuItem();
        menuItem4 = new com.raven.menu.MenuItem();
        menuItem5 = new com.raven.menu.MenuItem();
        menu3 = new com.raven.menu.Menu();
        jLabel1 = new javax.swing.JLabel();
        menuItem6 = new com.raven.menu.MenuItem();
        menuItem7 = new com.raven.menu.MenuItem();
        menuItem8 = new com.raven.menu.MenuItem();
        menuItem9 = new com.raven.menu.MenuItem();
        menuItem10 = new com.raven.menu.MenuItem();
        menuItem11 = new com.raven.menu.MenuItem();
        menuItem12 = new com.raven.menu.MenuItem();
        subMenuPanel1 = new com.raven.menu.SubMenuPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        menuItem3.setText("menuItem3");

        menuItem4.setText("menuItem4");

        menuItem5.setText("menuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(500, 25));
        setSize(new java.awt.Dimension(900, 800));
        getContentPane().setLayout(null);

        menu3.setSubMenuPanel(subMenuPanel1);

        jLabel1.setText("jLabel1");
        menu3.add(jLabel1);

        menuItem6.setText("menuItem6");
        menuItem6.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "Codigo Fuente", "Diseño", " " };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu3.add(menuItem6);

        menuItem7.setText("menuItem7");
        menu3.add(menuItem7);

        menuItem8.setText("menuItem8");
        menu3.add(menuItem8);

        menuItem9.setText("menuItem9");
        menu3.add(menuItem9);

        menuItem10.setText("menuItem10");
        menu3.add(menuItem10);

        menuItem11.setText("menuItem11");
        menu3.add(menuItem11);

        menuItem12.setText("menuItem12");
        menuItem12.setMenuModel(new javax.swing.AbstractListModel() {
            String[] strings = { "TDT", "TDS" };
            public int getSize() { return strings.length; }
            public Object getElementAt(int i) { return strings[i]; }
        });
        menu3.add(menuItem12);

        getContentPane().add(menu3);
        menu3.setBounds(0, 0, 110, 670);
        getContentPane().add(subMenuPanel1);
        subMenuPanel1.setBounds(110, 0, 150, 670);

        jTextPane1.setFocusable(false);
        jTextPane1.setOpaque(false);
        jScrollPane1.setViewportView(jTextPane1);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(0, 670, 1280, 140);

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Opciones");
        jMenuBar2.add(jMenu5);

        setJMenuBar(jMenuBar2);

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
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private com.raven.menu.Menu menu1;
    private com.raven.menu.Menu menu3;
    private com.raven.menu.MenuItem menuItem10;
    private com.raven.menu.MenuItem menuItem11;
    private com.raven.menu.MenuItem menuItem12;
    private com.raven.menu.MenuItem menuItem3;
    private com.raven.menu.MenuItem menuItem4;
    private com.raven.menu.MenuItem menuItem5;
    private com.raven.menu.MenuItem menuItem6;
    private com.raven.menu.MenuItem menuItem7;
    private com.raven.menu.MenuItem menuItem8;
    private com.raven.menu.MenuItem menuItem9;
    private com.raven.menu.SubMenuPanel subMenuPanel1;
    // End of variables declaration//GEN-END:variables
}
