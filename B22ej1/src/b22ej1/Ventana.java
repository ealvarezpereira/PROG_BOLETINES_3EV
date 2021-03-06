/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b22ej1;

/**
 *
 * @author quique
 */
public class Ventana extends javax.swing.JFrame {

    /**
     * Creates new form Ventana
     */
    public Ventana() {
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

        lnuevousuario = new javax.swing.JLabel();
        lusername = new javax.swing.JLabel();
        lfullname = new javax.swing.JLabel();
        luserid = new javax.swing.JLabel();
        lgroup = new javax.swing.JLabel();
        lhomedir = new javax.swing.JLabel();
        llogins = new javax.swing.JLabel();
        lpsswd = new javax.swing.JLabel();
        lconfirm = new javax.swing.JLabel();
        bcancel = new javax.swing.JButton();
        bok = new javax.swing.JButton();
        jusername = new javax.swing.JTextField();
        jname = new javax.swing.JTextField();
        jid = new javax.swing.JTextField();
        jcombostaff = new javax.swing.JComboBox<>();
        jhomedir = new javax.swing.JTextField();
        jcombologin = new javax.swing.JComboBox<>();
        jpsswd = new javax.swing.JPasswordField();
        jpsswdconfirm = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("New User...");

        lnuevousuario.setText("Create a new user");

        lusername.setText("User Name:");

        lfullname.setText("Full Name:");

        luserid.setText("User ID:");

        lgroup.setText("Group:");

        lhomedir.setText("Home Directory:");

        llogins.setText("Login Shell:");

        lpsswd.setText("Password:");

        lconfirm.setText("Confirm:");

        bcancel.setText("Cancel");

        bok.setText("OK");

        jid.setEditable(false);
        jid.setBackground(new java.awt.Color(255, 255, 255));
        jid.setForeground(new java.awt.Color(204, 204, 204));
        jid.setText("(automatic)");

        jcombostaff.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Staff", "User", "Moderator", "Organizator" }));

        jhomedir.setEditable(false);
        jhomedir.setBackground(new java.awt.Color(255, 255, 255));
        jhomedir.setForeground(new java.awt.Color(204, 204, 204));
        jhomedir.setText("(automatic)");

        jcombologin.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "/bin/ksh", "/usr/ubuntu", "/src/com", "/etc/bin" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bcancel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bok))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lusername)
                            .addComponent(lnuevousuario)
                            .addComponent(lfullname)
                            .addComponent(luserid)
                            .addComponent(lgroup)
                            .addComponent(lhomedir)
                            .addComponent(llogins)
                            .addComponent(lpsswd)
                            .addComponent(lconfirm))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jusername)
                            .addComponent(jname)
                            .addComponent(jid)
                            .addComponent(jhomedir)
                            .addComponent(jpsswd)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcombologin, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jcombostaff, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 133, Short.MAX_VALUE))
                            .addComponent(jpsswdconfirm))))
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lnuevousuario)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lusername)
                    .addComponent(jusername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lfullname)
                    .addComponent(jname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(luserid)
                    .addComponent(jid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lgroup)
                    .addComponent(jcombostaff, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lhomedir)
                    .addComponent(jhomedir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(llogins)
                    .addComponent(jcombologin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lpsswd)
                    .addComponent(jpsswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lconfirm)
                    .addComponent(jpsswdconfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bcancel)
                    .addComponent(bok))
                .addContainerGap())
        );

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
    private javax.swing.JButton bcancel;
    private javax.swing.JButton bok;
    private javax.swing.JComboBox<String> jcombologin;
    private javax.swing.JComboBox<String> jcombostaff;
    private javax.swing.JTextField jhomedir;
    private javax.swing.JTextField jid;
    private javax.swing.JTextField jname;
    private javax.swing.JPasswordField jpsswd;
    private javax.swing.JPasswordField jpsswdconfirm;
    private javax.swing.JTextField jusername;
    private javax.swing.JLabel lconfirm;
    private javax.swing.JLabel lfullname;
    private javax.swing.JLabel lgroup;
    private javax.swing.JLabel lhomedir;
    private javax.swing.JLabel llogins;
    private javax.swing.JLabel lnuevousuario;
    private javax.swing.JLabel lpsswd;
    private javax.swing.JLabel luserid;
    private javax.swing.JLabel lusername;
    // End of variables declaration//GEN-END:variables
}
