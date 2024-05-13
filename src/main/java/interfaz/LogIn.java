/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import main.BaseDatos;
import main.Main;

/**
 *
 * @author Miguel
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarImagenes();
    }
    
    public void cargarImagenes(){
        
        ImageIcon imgThisImg = new ImageIcon("C:\\Users\\Miguel\\Documents\\NetBeansProjects\\hipoteka\\src\\main\\java\\imagenes\\Picsart_24-02-28_19-12-02-305.jpg");
        imagenFondo.setIcon(imgThisImg);
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        navbarTxt = new javax.swing.JLabel();
        exitB = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jMail = new javax.swing.JTextField();
        jPass = new javax.swing.JTextField();
        LogInB = new javax.swing.JPanel();
        LogInBTxt = new javax.swing.JLabel();
        SignB = new javax.swing.JPanel();
        SignBTxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1130, 628));
        setMinimumSize(new java.awt.Dimension(1130, 628));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1130, 628));
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setBackground(new java.awt.Color(0, 255, 153));
        navbar.setMaximumSize(new java.awt.Dimension(1130, 570));

        navbarTxt.setFont(new java.awt.Font("Tw Cen MT", 0, 48)); // NOI18N
        navbarTxt.setForeground(new java.awt.Color(255, 255, 255));
        navbarTxt.setText("hipoteka");
        navbarTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        navbarTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                navbarTxtMouseClicked(evt);
            }
        });

        exitB.setBackground(new java.awt.Color(0, 255, 153));

        exitTxt.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBLayout = new javax.swing.GroupLayout(exitB);
        exitB.setLayout(exitBLayout);
        exitBLayout.setHorizontalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );
        exitBLayout.setVerticalGroup(
            exitBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(navbarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 791, Short.MAX_VALUE)
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(navbarTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondo.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jMail.setForeground(new java.awt.Color(102, 102, 102));
        jMail.setText("Correo electrónico");
        jMail.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jMail.setOpaque(true);
        jMail.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMailMousePressed(evt);
            }
        });
        jMail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMailActionPerformed(evt);
            }
        });

        jPass.setForeground(new java.awt.Color(102, 102, 102));
        jPass.setText("Contraseña");
        jPass.setToolTipText("");
        jPass.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPass.setOpaque(true);
        jPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPassMousePressed(evt);
            }
        });
        jPass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPassActionPerformed(evt);
            }
        });

        LogInB.setBackground(new java.awt.Color(0, 0, 51));
        LogInB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LogInB.setPreferredSize(new java.awt.Dimension(55, 47));
        LogInB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInBMouseClicked(evt);
            }
        });

        LogInBTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        LogInBTxt.setForeground(new java.awt.Color(0, 255, 153));
        LogInBTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LogInBTxt.setText("Iniciar sesión");
        LogInBTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        LogInBTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogInBTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                LogInBTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                LogInBTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout LogInBLayout = new javax.swing.GroupLayout(LogInB);
        LogInB.setLayout(LogInBLayout);
        LogInBLayout.setHorizontalGroup(
            LogInBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInBTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        LogInBLayout.setVerticalGroup(
            LogInBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LogInBTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        SignB.setBackground(new java.awt.Color(0, 0, 51));
        SignB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SignB.setPreferredSize(new java.awt.Dimension(55, 47));
        SignB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignBMouseClicked(evt);
            }
        });

        SignBTxt.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        SignBTxt.setForeground(new java.awt.Color(0, 255, 153));
        SignBTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SignBTxt.setText("Registrarse");
        SignBTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        SignBTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignBTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                SignBTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                SignBTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout SignBLayout = new javax.swing.GroupLayout(SignB);
        SignB.setLayout(SignBLayout);
        SignBLayout.setHorizontalGroup(
            SignBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignBTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
        );
        SignBLayout.setVerticalGroup(
            SignBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(SignBTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("Entrar como invitado");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(LogInB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(SignB, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jMail, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jMail, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jPass, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LogInB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SignB, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 180, 420, 310));
        fondo.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1130, 560));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void navbarTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_navbarTxtMouseClicked
        Home home = new Home();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_navbarTxtMouseClicked

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitB.setBackground(Color.RED);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitB.setBackground(new Color(0, 255, 153));
    }//GEN-LAST:event_exitTxtMouseExited

    private void jMailMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMailMousePressed
        if(jMail.getText().equals("Correo electrónico")){
            jMail.setText("");
            jMail.setForeground(Color.black);
        }
        if(jPass.getText().isEmpty()){
            jPass.setText("Contraseña");
            jPass.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jMailMousePressed

    private void jMailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMailActionPerformed

    private void jPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPassMousePressed
        if(jPass.getText().equals("Contraseña")){
            jPass.setText("");
            jPass.setForeground(Color.black);
        }
        if(jMail.getText().isEmpty()){
            jMail.setText("Correo electrónico");
            jMail.setForeground(Color.gray);
        }
    }//GEN-LAST:event_jPassMousePressed

    private void jPassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jPassActionPerformed

    private void LogInBTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInBTxtMouseClicked
        String correo = jMail.getText();
        String pass = jPass.getText();
        
        if (BaseDatos.getInstance().verificarCredenciales(correo, pass)) { 
            
            if(Main.getIntance().getUsuarioActivo()!=null){
                
                JOptionPane.showMessageDialog(this, "Bienvenido " + Main.getIntance().getUsuarioActivo().getNombre() + "!", "Has iniciado sesion.", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                
                Main.getIntance().setInvitado(false);
                
                if(Main.getIntance().getUsuarioActivo().getAporteMaximo().isEmpty()){
                    form1 vF1 = new form1();
                    vF1.setVisible(true);
                }
                else{
                    vPCliente vPC = new vPCliente();
                    vPC.setVisible(true);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Bienvenido " + Main.getIntance().getBanco().getNombre() + "!", "Has iniciado sesion.", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                vPBanco vPB = new vPBanco();
                vPB.setVisible(true);
                Main.getIntance().setInvitado(false);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Credenciales incorrectas", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_LogInBTxtMouseClicked

    private void LogInBTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInBTxtMouseEntered
        LogInB.setBackground(new Color(0,255,153));
        LogInBTxt.setForeground(new Color(0,0,51));
    }//GEN-LAST:event_LogInBTxtMouseEntered

    private void LogInBTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInBTxtMouseExited
        LogInB.setBackground(new Color(0,0,51));
        LogInBTxt.setForeground(new Color(0,255,153));
    }//GEN-LAST:event_LogInBTxtMouseExited

    private void LogInBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogInBMouseClicked

    }//GEN-LAST:event_LogInBMouseClicked

    private void SignBTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBTxtMouseClicked
        this.dispose();
        SignIn signin = new SignIn();
        signin.setVisible(true);
    }//GEN-LAST:event_SignBTxtMouseClicked

    private void SignBTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBTxtMouseEntered
        SignB.setBackground(new Color(0,255,153));
        SignBTxt.setForeground(new Color(0,0,51));
    }//GEN-LAST:event_SignBTxtMouseEntered

    private void SignBTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBTxtMouseExited
        SignB.setBackground(new Color(0,0,51));
        SignBTxt.setForeground(new Color(0,255,153));
    }//GEN-LAST:event_SignBTxtMouseExited

    private void SignBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignBMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_SignBMouseClicked

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        this.dispose();
        Main.getIntance().setInvitado(true);
        vPCliente vPC = new vPCliente();
        vPC.setVisible(true);
    }//GEN-LAST:event_jLabel1MouseClicked

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel LogInB;
    private javax.swing.JLabel LogInBTxt;
    private javax.swing.JPanel SignB;
    private javax.swing.JLabel SignBTxt;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jMail;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jPass;
    private javax.swing.JPanel navbar;
    private javax.swing.JLabel navbarTxt;
    // End of variables declaration//GEN-END:variables
}
