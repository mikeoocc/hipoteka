/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import main.Main;

/**
 *
 * @author Miguel
 */
public class form2 extends javax.swing.JFrame {

    /**
     * Creates new form form
     */
    public form2() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarImagenes();
    }
    
    public void cargarImagenes(){

        ImageIcon imgThisImg = new ImageIcon(getClass().getResource("/imgs/Picsart_24-02-28_19-12-02-305.jpg"));
        imgFondo.setIcon(imgThisImg);
        
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
        panelQ = new javax.swing.JPanel();
        sigB = new javax.swing.JPanel();
        sigTxt = new javax.swing.JLabel();
        preguntaTxt = new javax.swing.JLabel();
        provinciaTxt = new javax.swing.JTextField();
        preguntaTxt1 = new javax.swing.JLabel();
        sigB3 = new javax.swing.JPanel();
        sigTxt3 = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1130, 628));
        setUndecorated(true);
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setMaximumSize(new java.awt.Dimension(1130, 628));
        fondo.setMinimumSize(new java.awt.Dimension(1130, 628));
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(navbarLayout.createSequentialGroup()
                .addComponent(exitB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        fondo.add(navbar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 72));

        panelQ.setBackground(new java.awt.Color(255, 255, 255));
        panelQ.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));

        sigB.setBackground(new java.awt.Color(255, 255, 255));
        sigB.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        sigB.setForeground(new java.awt.Color(0, 255, 153));

        sigTxt.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sigTxt.setForeground(new java.awt.Color(0, 0, 51));
        sigTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sigTxt.setText(">");
        sigTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sigTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sigTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout sigBLayout = new javax.swing.GroupLayout(sigB);
        sigB.setLayout(sigBLayout);
        sigBLayout.setHorizontalGroup(
            sigBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sigTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );
        sigBLayout.setVerticalGroup(
            sigBLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sigTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        preguntaTxt.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        preguntaTxt.setForeground(new java.awt.Color(0, 0, 51));
        preguntaTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntaTxt.setText("¿En que provincia se encuentra");

        provinciaTxt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        provinciaTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provinciaTxtActionPerformed(evt);
            }
        });

        preguntaTxt1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        preguntaTxt1.setForeground(new java.awt.Color(0, 0, 51));
        preguntaTxt1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        preguntaTxt1.setText("la vivienda?");

        sigB3.setBackground(new java.awt.Color(255, 255, 255));
        sigB3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 51), 1, true));
        sigB3.setForeground(new java.awt.Color(0, 255, 153));

        sigTxt3.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        sigTxt3.setForeground(new java.awt.Color(0, 0, 51));
        sigTxt3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sigTxt3.setText("<");
        sigTxt3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                sigTxt3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sigTxt3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sigTxt3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout sigB3Layout = new javax.swing.GroupLayout(sigB3);
        sigB3.setLayout(sigB3Layout);
        sigB3Layout.setHorizontalGroup(
            sigB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sigTxt3, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
        );
        sigB3Layout.setVerticalGroup(
            sigB3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sigTxt3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout panelQLayout = new javax.swing.GroupLayout(panelQ);
        panelQ.setLayout(panelQLayout);
        panelQLayout.setHorizontalGroup(
            panelQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQLayout.createSequentialGroup()
                .addContainerGap(99, Short.MAX_VALUE)
                .addGroup(panelQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(panelQLayout.createSequentialGroup()
                            .addComponent(sigB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(220, 220, 220)
                            .addComponent(sigB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(provinciaTxt))
                    .addComponent(preguntaTxt1)
                    .addComponent(preguntaTxt))
                .addGap(85, 85, 85))
        );
        panelQLayout.setVerticalGroup(
            panelQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(preguntaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(preguntaTxt1)
                .addGap(16, 16, 16)
                .addComponent(provinciaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(116, 116, 116)
                .addGroup(panelQLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(sigB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sigB3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        fondo.add(panelQ, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, 400));
        fondo.add(imgFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1130, 556));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void provinciaTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provinciaTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_provinciaTxtActionPerformed

    private void sigTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigTxtMouseClicked
        
        ArrayList<String> provincias = new ArrayList<>();
        Boolean coincide = false;
        
        provincias.add("Álava");
        provincias.add("Albacete");
        provincias.add("Alicante");
        provincias.add("Almería");
        provincias.add("Asturias");
        provincias.add("Ávila");
        provincias.add("Badajoz");
        provincias.add("Barcelona");
        provincias.add("Burgos");
        provincias.add("Cáceres");
        provincias.add("Cádiz");
        provincias.add("Cantabria");
        provincias.add("Castellón");
        provincias.add("Ciudad Real");
        provincias.add("Córdoba");
        provincias.add("Cuenca");
        provincias.add("Gerona");
        provincias.add("Granada");
        provincias.add("Guadalajara");
        provincias.add("Guipúzcoa");
        provincias.add("Huelva");
        provincias.add("Huesca");
        provincias.add("Islas Baleares");
        provincias.add("Jaén");
        provincias.add("La Coruña");
        provincias.add("La Rioja");
        provincias.add("Las Palmas");
        provincias.add("León");
        provincias.add("Lérida");
        provincias.add("Lugo");
        provincias.add("Madrid");
        provincias.add("Málaga");
        provincias.add("Murcia");
        provincias.add("Navarra");
        provincias.add("Orense");
        provincias.add("Palencia");
        provincias.add("Pontevedra");
        provincias.add("Salamanca");
        provincias.add("Santa Cruz de Tenerife");
        provincias.add("Segovia");
        provincias.add("Sevilla");
        provincias.add("Soria");
        provincias.add("Tarragona");
        provincias.add("Teruel");
        provincias.add("Toledo");
        provincias.add("Valencia");
        provincias.add("Valladolid");
        provincias.add("Vizcaya");
        provincias.add("Zamora");
        provincias.add("Zaragoza");
        
        
        for(String provincia : provincias){
            if(provinciaTxt.getText().trim().toLowerCase().equals(provincia.trim().toLowerCase())){
                coincide = true;
                break;
            }
        }
        
        if(coincide == true){
            Main.getIntance().getUsuarioActivo().setProvincia(provinciaTxt.getText());
            this.dispose();
            form3 q3 = new form3();
            q3.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(this, "No se encuentra esa provincia", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_sigTxtMouseClicked

    private void sigTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigTxtMouseEntered
        sigTxt.setForeground(Color.WHITE);
        sigB.setBackground(new Color(0, 0, 51));
    }//GEN-LAST:event_sigTxtMouseEntered

    private void sigTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigTxtMouseExited
        sigTxt.setForeground(new Color(0, 0, 51));
        sigB.setBackground(Color.WHITE);
    }//GEN-LAST:event_sigTxtMouseExited

    private void sigTxt3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigTxt3MouseEntered
        sigTxt3.setForeground(Color.WHITE);
        sigB3.setBackground(new Color(0, 0, 51));
    }//GEN-LAST:event_sigTxt3MouseEntered

    private void sigTxt3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigTxt3MouseExited
        sigTxt3.setForeground(new Color(0, 0, 51));
        sigB3.setBackground(Color.WHITE);
    }//GEN-LAST:event_sigTxt3MouseExited

    private void sigTxt3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sigTxt3MouseClicked
        this.dispose();
        form1 q1 = new form1();
        q1.setVisible(true);
    }//GEN-LAST:event_sigTxt3MouseClicked

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
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(form2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new form2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JPanel navbar;
    private javax.swing.JLabel navbarTxt;
    private javax.swing.JPanel panelQ;
    private javax.swing.JLabel preguntaTxt;
    private javax.swing.JLabel preguntaTxt1;
    private javax.swing.JTextField provinciaTxt;
    private javax.swing.JPanel sigB;
    private javax.swing.JPanel sigB3;
    private javax.swing.JLabel sigTxt;
    private javax.swing.JLabel sigTxt3;
    // End of variables declaration//GEN-END:variables
}
