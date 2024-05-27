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
public class perfilUsuario extends javax.swing.JFrame {

    /**
     * Creates new form perfilUsuario
     */
    public perfilUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        cargarInformacion();
        cargarImagenes();
        
    }
    
    public void cargarImagenes(){
        
        ImageIcon imgThisImg = new ImageIcon(getClass().getResource("/imgs/Picsart_24-02-28_19-12-02-305.jpg"));
        imagenFondo.setIcon(imgThisImg);
    }
    
    public void cargarInformacion(){
        
        textoBienv.setText("Hola, " + Main.getIntance().getUsuarioActivo().getNombre());
        correo.setText(Main.getIntance().getUsuarioActivo().getMail());
        edadTxt.setText(Main.getIntance().getUsuarioActivo().getEdad());
        ubiTxt.setText(Main.getIntance().getUsuarioActivo().getProvincia());
        
        
        for(int i=0; i<valorViviendaFiltro.getItemCount(); i++){    
            if(valorViviendaFiltro.getItemAt(i).equals(Main.getIntance().getUsuarioActivo().getValorVivienda())){
                valorViviendaFiltro.setSelectedIndex(i);
                break;
            }
        }
        
        for(int i=0; i<tipoContratoFiltro.getItemCount(); i++){    
            if(tipoContratoFiltro.getItemAt(i).equals(Main.getIntance().getUsuarioActivo().getContrato())){
                tipoContratoFiltro.setSelectedIndex(i);
                break;
            }
        }
        
        for(int i=0; i<ingresosTotalesFiltro.getItemCount(); i++){    
            if(ingresosTotalesFiltro.getItemAt(i).equals(Main.getIntance().getUsuarioActivo().getSalario())){
                ingresosTotalesFiltro.setSelectedIndex(i);
                break;
            }
        }
        
        for(int i=0; i<aporteMaximoFiltro.getItemCount(); i++){    
            if(aporteMaximoFiltro.getItemAt(i).equals(Main.getIntance().getUsuarioActivo().getAporteMaximo())){
                aporteMaximoFiltro.setSelectedIndex(i);
                break;
            }
        }
        
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
        bloqueInfo = new javax.swing.JPanel();
        textoBienv = new javax.swing.JLabel();
        correoLabel = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        valorVL = new javax.swing.JLabel();
        ubiTxt = new javax.swing.JLabel();
        contratoL = new javax.swing.JLabel();
        salarioL = new javax.swing.JLabel();
        aMinL = new javax.swing.JLabel();
        edadL = new javax.swing.JLabel();
        edadTxt = new javax.swing.JLabel();
        ubiL = new javax.swing.JLabel();
        cerrarSesion = new javax.swing.JPanel();
        cerrarSesionL = new javax.swing.JLabel();
        guardar = new javax.swing.JPanel();
        guardarL = new javax.swing.JLabel();
        valorViviendaFiltro = new javax.swing.JComboBox<>();
        tipoContratoFiltro = new javax.swing.JComboBox<>();
        ingresosTotalesFiltro = new javax.swing.JComboBox<>();
        aporteMaximoFiltro = new javax.swing.JComboBox<>();
        imagenFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1130, 628));
        setResizable(false);

        fondo.setBackground(new java.awt.Color(255, 255, 255));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        navbar.setBackground(new java.awt.Color(0, 255, 153));
        navbar.setMaximumSize(new java.awt.Dimension(1130, 570));
        navbar.setPreferredSize(new java.awt.Dimension(1130, 72));

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

        bloqueInfo.setBackground(new java.awt.Color(255, 255, 255));
        bloqueInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoBienv.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        bloqueInfo.add(textoBienv, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 450, 70));

        correoLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        correoLabel.setText("Correo electrónico:");
        bloqueInfo.add(correoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        correo.setMaximumSize(new java.awt.Dimension(300, 33));
        bloqueInfo.add(correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 114, 170, 30));

        valorVL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        valorVL.setText("Valor de la vivienda:");
        bloqueInfo.add(valorVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, 120, -1));
        bloqueInfo.add(ubiTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 110, 20));

        contratoL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        contratoL.setText("Contrato:");
        bloqueInfo.add(contratoL, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        salarioL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        salarioL.setText("Ingresos totales:");
        bloqueInfo.add(salarioL, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 100, -1));

        aMinL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        aMinL.setText("Aporte mínimo:");
        bloqueInfo.add(aMinL, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 360, 90, -1));

        edadL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        edadL.setText("Edad:");
        bloqueInfo.add(edadL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 30, 20));
        bloqueInfo.add(edadTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 160, 150, 20));

        ubiL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        ubiL.setText("Ubicación de la vivienda:");
        bloqueInfo.add(ubiL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        cerrarSesion.setBackground(new java.awt.Color(255, 255, 255));

        cerrarSesionL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        cerrarSesionL.setForeground(new java.awt.Color(255, 0, 0));
        cerrarSesionL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cerrarSesionL.setText("Cerrar sesión");
        cerrarSesionL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 0, 0)));
        cerrarSesionL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cerrarSesionLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cerrarSesionLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cerrarSesionLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout cerrarSesionLayout = new javax.swing.GroupLayout(cerrarSesion);
        cerrarSesion.setLayout(cerrarSesionLayout);
        cerrarSesionLayout.setHorizontalGroup(
            cerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarSesionL, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        cerrarSesionLayout.setVerticalGroup(
            cerrarSesionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(cerrarSesionL, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bloqueInfo.add(cerrarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 430, -1, -1));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setMinimumSize(new java.awt.Dimension(0, 0));
        guardar.setPreferredSize(new java.awt.Dimension(90, 40));

        guardarL.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        guardarL.setForeground(new java.awt.Color(0, 255, 153));
        guardarL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guardarL.setText("Guardar");
        guardarL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        guardarL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                guardarLMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                guardarLMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                guardarLMouseExited(evt);
            }
        });

        javax.swing.GroupLayout guardarLayout = new javax.swing.GroupLayout(guardar);
        guardar.setLayout(guardarLayout);
        guardarLayout.setHorizontalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarL, javax.swing.GroupLayout.DEFAULT_SIZE, 90, Short.MAX_VALUE)
        );
        guardarLayout.setVerticalGroup(
            guardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(guardarL, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bloqueInfo.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        valorViviendaFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<100.000 €", "<200.000 €", "<300.000 €", ">300.000 €" }));
        valorViviendaFiltro.setToolTipText("");
        valorViviendaFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorViviendaFiltroActionPerformed(evt);
            }
        });
        bloqueInfo.add(valorViviendaFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 110, 40));

        tipoContratoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Indefinido", "Temporal", "Autónomo", "Otros" }));
        tipoContratoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoContratoFiltroActionPerformed(evt);
            }
        });
        bloqueInfo.add(tipoContratoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 280, 110, 40));

        ingresosTotalesFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<1.000 €", "<3.000 €", ">3.000 €" }));
        ingresosTotalesFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosTotalesFiltroActionPerformed(evt);
            }
        });
        bloqueInfo.add(ingresosTotalesFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 110, 40));

        aporteMaximoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<50.000 €", "<100.000 €", ">100.000 €" }));
        aporteMaximoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aporteMaximoFiltroActionPerformed(evt);
            }
        });
        bloqueInfo.add(aporteMaximoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 350, 110, 40));

        fondo.add(bloqueInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 740, 500));
        fondo.add(imagenFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1130, 561));

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
        vPCliente vPC = new vPCliente();
        vPC.setVisible(true);
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

    private void cerrarSesionLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionLMouseClicked
        Main.getIntance().setUsuarioActivo(null);
        this.dispose();

        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_cerrarSesionLMouseClicked

    private void cerrarSesionLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionLMouseEntered
        cerrarSesion.setBackground(new Color(255, 0, 0));
        cerrarSesionL.setForeground(Color.WHITE);
    }//GEN-LAST:event_cerrarSesionLMouseEntered

    private void cerrarSesionLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cerrarSesionLMouseExited
        cerrarSesion.setBackground(Color.WHITE);
        cerrarSesionL.setForeground(new Color(255, 0, 0));
    }//GEN-LAST:event_cerrarSesionLMouseExited

    private void valorViviendaFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorViviendaFiltroActionPerformed
        
    }//GEN-LAST:event_valorViviendaFiltroActionPerformed

    private void tipoContratoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoContratoFiltroActionPerformed
        
    }//GEN-LAST:event_tipoContratoFiltroActionPerformed

    private void ingresosTotalesFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresosTotalesFiltroActionPerformed
        
    }//GEN-LAST:event_ingresosTotalesFiltroActionPerformed

    private void aporteMaximoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aporteMaximoFiltroActionPerformed
        
    }//GEN-LAST:event_aporteMaximoFiltroActionPerformed

    private void guardarLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLMouseClicked
        
        Boolean cambio = false;
           
        if(!valorViviendaFiltro.getSelectedItem().toString().equals(Main.getIntance().getUsuarioActivo().getValorVivienda())){
            cambio = true;
        }
        
        if(!tipoContratoFiltro.getSelectedItem().toString().equals(Main.getIntance().getUsuarioActivo().getContrato())){
            cambio = true;
        }
        
        if(!ingresosTotalesFiltro.getSelectedItem().toString().equals(Main.getIntance().getUsuarioActivo().getSalario())){
            cambio = true;
        }
        
        if(!aporteMaximoFiltro.getSelectedItem().toString().equals(Main.getIntance().getUsuarioActivo().getAporteMaximo())){
            cambio = true;
        }
        
        if(cambio==true){
            
            int opcion = JOptionPane.showConfirmDialog(null, "¿Desea realizar los cambios?", "Confirmar cambios", JOptionPane.OK_CANCEL_OPTION);
            if (opcion == JOptionPane.OK_OPTION) {
                BaseDatos.getInstance().cambiarDatos(valorViviendaFiltro.getSelectedItem().toString(), 
                    tipoContratoFiltro.getSelectedItem().toString(), ingresosTotalesFiltro.getSelectedItem().toString(),
                    aporteMaximoFiltro.getSelectedItem().toString());

                Main.getIntance().getUsuarioActivo().setValorVivienda(valorViviendaFiltro.getSelectedItem().toString());
                Main.getIntance().getUsuarioActivo().setContrato(tipoContratoFiltro.getSelectedItem().toString());
                Main.getIntance().getUsuarioActivo().setSalario(ingresosTotalesFiltro.getSelectedItem().toString());
                Main.getIntance().getUsuarioActivo().setAporteMaximo(aporteMaximoFiltro.getSelectedItem().toString());
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "No existen cambios en el perfil", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_guardarLMouseClicked

    private void guardarLMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLMouseEntered
        guardarL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        guardar.setBackground(new java.awt.Color(0, 255, 153));
        guardarL.setForeground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_guardarLMouseEntered

    private void guardarLMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_guardarLMouseExited
        guardarL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardarL.setForeground(new java.awt.Color(0, 255, 153));
    }//GEN-LAST:event_guardarLMouseExited

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
            java.util.logging.Logger.getLogger(perfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(perfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(perfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(perfilUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new perfilUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel aMinL;
    private javax.swing.JComboBox<String> aporteMaximoFiltro;
    private javax.swing.JPanel bloqueInfo;
    private javax.swing.JPanel cerrarSesion;
    private javax.swing.JLabel cerrarSesionL;
    private javax.swing.JLabel contratoL;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel correoLabel;
    private javax.swing.JLabel edadL;
    private javax.swing.JLabel edadTxt;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel fondo;
    private javax.swing.JPanel guardar;
    private javax.swing.JLabel guardarL;
    private javax.swing.JLabel imagenFondo;
    private javax.swing.JComboBox<String> ingresosTotalesFiltro;
    private javax.swing.JPanel navbar;
    private javax.swing.JLabel navbarTxt;
    private javax.swing.JLabel salarioL;
    private javax.swing.JLabel textoBienv;
    private javax.swing.JComboBox<String> tipoContratoFiltro;
    private javax.swing.JLabel ubiL;
    private javax.swing.JLabel ubiTxt;
    private javax.swing.JLabel valorVL;
    private javax.swing.JComboBox<String> valorViviendaFiltro;
    // End of variables declaration//GEN-END:variables
}
