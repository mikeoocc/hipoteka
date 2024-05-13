/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfaz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import main.BaseDatos;
import main.Main;
import ofertas.Oferta;
import org.netbeans.lib.awtextra.AbsoluteConstraints;
import org.netbeans.lib.awtextra.AbsoluteLayout;
import usuario.Banco;

/**
 *
 * @author Miguel
 */
public class vPCliente extends javax.swing.JFrame {

    private ArrayList<Oferta> ofertasBanco;
    public Boolean invitado;
    public Boolean yaClickeado0 = false;
    
    /**
     * Creates new form vPCliente
     */
    public vPCliente() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        
        String rutaAbsoluta3 = "src\\main\\java\\imagenes\\usuario.pg.png";
        ImageIcon usuarioIcon = new ImageIcon(rutaAbsoluta3);
        Image image = usuarioIcon.getImage();
        Image newimg = image.getScaledInstance(30, 30,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        usuarioIcon = new ImageIcon(newimg);
        usuarioB.setIcon(usuarioIcon);
        
        String rutaAbsoluta4 = "src\\main\\java\\imagenes\\pHistory.png";
        ImageIcon favoritosIcon = new ImageIcon(rutaAbsoluta4);
        Image image4 = favoritosIcon.getImage();
        Image newimg4 = image4.getScaledInstance(35, 35,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        favoritosIcon = new ImageIcon(newimg4);
        favoritos.setIcon(favoritosIcon);
        
        String rutaAbsoluta5 = "src\\main\\java\\imagenes\\filtroOfe.png";
        ImageIcon filtroOfer = new ImageIcon(rutaAbsoluta5);
        Image image5 = filtroOfer.getImage();
        Image newimg5 = image5.getScaledInstance(35, 35,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way  
        filtroOfer = new ImageIcon(newimg5);
        filtroOferL.setIcon(filtroOfer);
        
        ArrayList<Oferta> ofertas = new ArrayList<>();
        BaseDatos.getInstance().cargarOfertas(ofertas);
        
        Collections.reverse(ofertas);
        
        cargarOfertas(ofertas);
        this.setOfertasBanco(ofertas);
        
        
    }
    
    public void cargarOfertas(ArrayList<Oferta> ofertas){
       
        expositor.removeAll();
        JPanel panelOfertas = new JPanel(new GridLayout(0, 1, 0, 5));
        panelOfertas.setBackground(Color.WHITE);
        
        for(Oferta oferta : ofertas){
            JPanel panelOferta = cargarPaneles(oferta);
            panelOfertas.add(panelOferta);
        }
        
        JScrollPane scrollPane = new JScrollPane(panelOfertas);
        scrollPane.getVerticalScrollBar().setUnitIncrement(16);
        
        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        
        expositor.setLayout(new BorderLayout());
        expositor.add(scrollPane, BorderLayout.CENTER);
        expositor.revalidate();
        expositor.repaint();
        
    }
    
    
    public JPanel cargarPaneles(Oferta oferta){
        
        JPanel panel = new JPanel();
        
        panel.setBackground(new Color(242,242,242));
        panel.setMaximumSize(new Dimension(873, 275));
        panel.setPreferredSize(new Dimension(873, 275));
        panel.setLayout(new AbsoluteLayout());
        
        JLabel nombreLabel = new JLabel(oferta.getNombreBanco());
        nombreLabel.setFont(new java.awt.Font("Segoe UI", 1, 14));
        
        JLabel nombreOferta = new JLabel(oferta.getNombre());
        nombreOferta.setFont(new java.awt.Font("Segoe UI", 1, 18));
        
        JLabel valorVivienda1 = new JLabel("Valor de la vivienda:");
        JLabel valorVivienda2 = new JLabel(oferta.getValorVivienda());
        
        JLabel tipoContrato1 = new JLabel("Tipo de contrato:");
        JLabel tipoContrato2 = new JLabel(oferta.getContrato());
        
        JLabel salario1 = new JLabel("Salario:");
        JLabel salario2 = new JLabel(oferta.getSalario());
        
        JLabel aporteMaximo1 = new JLabel("Aporte máximo:");
        JLabel aporteMaximo2 = new JLabel(oferta.getAporteMaximo());
        
        JPanel favorito = new JPanel();
        JLabel favoritoL = new JLabel("Fav");
        
        favorito.setBackground(new java.awt.Color(255, 255, 255));
        favoritoL.setFont(new java.awt.Font("Segoe UI", 1, 14));
        favoritoL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        favoritoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
        favoritoL.setForeground(new java.awt.Color(0, 255, 153));
        
        javax.swing.GroupLayout verMasLayout = new javax.swing.GroupLayout(favorito);
        favorito.setLayout(verMasLayout);
        verMasLayout.setHorizontalGroup(
            verMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(favoritoL, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        verMasLayout.setVerticalGroup(
            verMasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(favoritoL, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
        );
        
        favorito.add(favoritoL);
        
        //Boolean yaClickeado0;
        
        if(Main.getIntance().getInvitado()==false){
            System.out.println("Soy false!");
        }
        
        if(Main.getIntance().getInvitado()==false){
            if(BaseDatos.getInstance().verificarFavorito(oferta.getId(), Main.getIntance().getUsuarioActivo().getId()) == true){
                yaClickeado0 = true;
                favoritoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                favorito.setBackground(new java.awt.Color(0, 255, 153));
                favoritoL.setForeground(new java.awt.Color(255, 255, 255));
            }
            else{
                yaClickeado0 = false;
            }
        }
        
        
        favoritoL.addMouseListener(new java.awt.event.MouseAdapter() {
            
            Boolean yaClickeado = yaClickeado0;
          
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                if(Main.getIntance().getInvitado()==true){
                    JOptionPane.showMessageDialog(null, "Debe de iniciar sesión.", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
                else{
                    if(yaClickeado == false){
                        BaseDatos.getInstance().anadirFavoritos(oferta.getId(), Main.getIntance().getUsuarioActivo().getId());

                        Banco b = new Banco();
                        b = BaseDatos.getInstance().obtenerDatosBanco(oferta.getIdBanco());

                        String mensaje = "Información del banco:\n\n" +
                             "Banco: " + b.getNombre() + "\n" +
                             "Correo: " + b.getMail() + "\n" +
                             "Teléfono: " + b.getTelef() + "\n" +
                             "Horario: " + b.getHorario() + "\n" +
                             "Dirección: " + b.getDireccion();


                        JOptionPane.showMessageDialog(null, mensaje, "¡Oferta añadida!", JOptionPane.INFORMATION_MESSAGE);

                        yaClickeado = true;
                        favoritoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                        favorito.setBackground(new java.awt.Color(0, 255, 153));
                        favoritoL.setForeground(new java.awt.Color(255, 255, 255));
                    }
                    else{
                        BaseDatos.getInstance().eliminarFavoritos(oferta.getId(), Main.getIntance().getUsuarioActivo().getId());
                        JOptionPane.showMessageDialog(null, "¡Oferta eliminada!", "", JOptionPane.INFORMATION_MESSAGE);
                        yaClickeado = false;
                        favoritoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
                        favorito.setBackground(new java.awt.Color(255, 255, 255));
                        favoritoL.setForeground(new java.awt.Color(0, 255, 153));
                    }
                }
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                if(yaClickeado == false){
                    favoritoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
                    favorito.setBackground(new java.awt.Color(0, 255, 153));
                    favoritoL.setForeground(new java.awt.Color(255, 255, 255));
                }
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                if(yaClickeado == false){
                    favoritoL.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 255, 153)));
                    favorito.setBackground(new java.awt.Color(255, 255, 255));
                    favoritoL.setForeground(new java.awt.Color(0, 255, 153));
                }
            }
        });
        
        JScrollPane descScroll = new JScrollPane();
        JTextArea descArea = new JTextArea();
        
        descArea.setEditable(false);
        descArea.setColumns(20);
        descArea.setRows(5);
        descArea.setBorder(null);
        descArea.setText(oferta.getDesc());
        descArea.setFocusable(false);
        
        descScroll.setViewportView(descArea);
        
        panel.add(descScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(65, 115, 808, 96));
        
        panel.add(nombreLabel, new AbsoluteConstraints(10, 0, 230, 30));
        panel.add(nombreOferta, new AbsoluteConstraints(10, 30, 430, 30));
        
        panel.add(valorVivienda1, new AbsoluteConstraints(65, 80, 112, 29));
        valorVivienda1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        
        panel.add(valorVivienda2, new AbsoluteConstraints(183, 86, 78, 16));
        
        panel.add(tipoContrato1, new AbsoluteConstraints(267, 80, 96, 29));
        tipoContrato1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        
        panel.add(tipoContrato2, new AbsoluteConstraints(369, 86, 70, 16));
        
        panel.add(salario1, new AbsoluteConstraints(469, 80, 41, 29));
        salario1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        
        panel.add(salario2, new AbsoluteConstraints(516, 86, 70, 16));
        
        panel.add(aporteMaximo1, new AbsoluteConstraints(602, 80, 91, 29));
        aporteMaximo1.setFont(new java.awt.Font("Segoe UI", 1, 12));
        
        panel.add(aporteMaximo2, new AbsoluteConstraints(699, 86, 70, 16));
        
        panel.add(favorito, new AbsoluteConstraints(773, 217, 100, 43));
        
        return panel;
    }

    public void filtrado(ArrayList<Oferta> ofertas){
        
        String vVF = valorViviendaFiltro.getSelectedItem().toString();
        String tCF = tipoContratoFiltro.getSelectedItem().toString();
        String iTF = ingresosTotalesFiltro.getSelectedItem().toString();
        String aMF = aporteMaximoFiltro.getSelectedItem().toString();
        
        Boolean filtro;
        
        ArrayList<Oferta> ofertasFiltradas = new ArrayList<>();
        
        ofertasFiltradas.clear();

        for(int i=0; i<ofertas.size(); i++){
            
            filtro = true;
            
            if(!ofertas.get(i).getValorVivienda().equals(vVF) && !vVF.equals("Valor vivienda")){
                filtro = false;
            }
            
            if(!ofertas.get(i).getContrato().equals(tCF) && !tCF.equals("Contrato")){
                filtro = false;
            }
            
            if(!ofertas.get(i).getSalario().equals(iTF) && !iTF.equals("Ingresos")){
                filtro = false;
            }
            
            if(!ofertas.get(i).getAporteMaximo().equals(aMF) && !aMF.equals("Aporte min")){
                filtro = false;
            }
            
            if(filtro == true){
                ofertasFiltradas.add(ofertas.get(i));
            }
            
        }
        
        cargarOfertas(ofertasFiltradas);
             
    }
    
    public void filtradoBusqueda(ArrayList<Oferta> ofertas){
        
        String condicion = busc.getText().toLowerCase();
        ArrayList<Oferta> ofertasFiltradas = new ArrayList<>();
        
        for(Oferta oferta : ofertas){
            if(oferta.getNombre().toLowerCase().contains(condicion) || oferta.getNombreBanco().toLowerCase().contains(condicion)){
                ofertasFiltradas.add(oferta);
            }
        }
        
        if(ofertasFiltradas.isEmpty()){
            JOptionPane.showMessageDialog(this, "No hay resultados para su búsqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        
        cargarOfertas(ofertasFiltradas);
        
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
        navbar2 = new javax.swing.JPanel();
        usuarioB = new javax.swing.JLabel();
        valorViviendaFiltro = new javax.swing.JComboBox<>();
        tipoContratoFiltro = new javax.swing.JComboBox<>();
        ingresosTotalesFiltro = new javax.swing.JComboBox<>();
        aporteMaximoFiltro = new javax.swing.JComboBox<>();
        busc = new javax.swing.JTextField();
        favoritos = new javax.swing.JButton();
        filtroOferL = new javax.swing.JLabel();
        expositorPane = new javax.swing.JScrollPane();
        expositor = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        navbar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usuarioB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioBMouseClicked(evt);
            }
        });
        navbar2.add(usuarioB, new org.netbeans.lib.awtextra.AbsoluteConstraints(1051, 6, 40, 40));

        valorViviendaFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Valor vivienda", "<100.000 €", "<200.000 €", "<300.000 €", ">300.000 €" }));
        valorViviendaFiltro.setToolTipText("");
        valorViviendaFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorViviendaFiltroActionPerformed(evt);
            }
        });
        navbar2.add(valorViviendaFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 5, 110, 40));

        tipoContratoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Contrato", "Indefinido", "Temporal", "Autónomo", "Otros" }));
        tipoContratoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoContratoFiltroActionPerformed(evt);
            }
        });
        navbar2.add(tipoContratoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 5, 110, 40));

        ingresosTotalesFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingresos", "<1.000 €", "<3.000 €", ">3.000 €" }));
        ingresosTotalesFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresosTotalesFiltroActionPerformed(evt);
            }
        });
        navbar2.add(ingresosTotalesFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 5, 110, 40));

        aporteMaximoFiltro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aporte min", "<50.000 €", "<100.000 €", ">100.000 €" }));
        aporteMaximoFiltro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aporteMaximoFiltroActionPerformed(evt);
            }
        });
        navbar2.add(aporteMaximoFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 5, 110, 40));

        busc.setForeground(new java.awt.Color(153, 153, 153));
        busc.setText("Buscar...");
        busc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        busc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                buscFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                buscFocusLost(evt);
            }
        });
        busc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscActionPerformed(evt);
            }
        });
        navbar2.add(busc, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, 320, 30));

        favoritos.setBackground(new java.awt.Color(242, 242, 242));
        favoritos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                favoritosMouseClicked(evt);
            }
        });
        navbar2.add(favoritos, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 7, 50, 40));

        filtroOferL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                filtroOferLMouseClicked(evt);
            }
        });
        navbar2.add(filtroOferL, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 7, 50, 40));

        fondo.add(navbar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 72, 1130, 50));

        expositorPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        expositor.setBackground(new java.awt.Color(255, 255, 255));
        expositor.setLayout(new java.awt.GridLayout(8, 1));
        expositorPane.setViewportView(expositor);

        fondo.add(expositorPane, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 910, 460));

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
        this.dispose();
        vPCliente vPC = new vPCliente();
        vPC.setVisible(true);
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

    private void usuarioBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioBMouseClicked
        if(Main.getIntance().getInvitado()==true){
            JOptionPane.showMessageDialog(null, "Debe de iniciar sesión.", "Error", JOptionPane.INFORMATION_MESSAGE);
            LogIn lI = new LogIn();
            this.dispose();
            lI.setVisible(true);
        }
        else{
            this.dispose();
            perfilUsuario pU = new perfilUsuario();
            pU.setVisible(true);
        }
    }//GEN-LAST:event_usuarioBMouseClicked

    private void valorViviendaFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorViviendaFiltroActionPerformed
        filtrado(this.getOfertasBanco());
    }//GEN-LAST:event_valorViviendaFiltroActionPerformed

    private void tipoContratoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoContratoFiltroActionPerformed
        filtrado(this.getOfertasBanco());
    }//GEN-LAST:event_tipoContratoFiltroActionPerformed

    private void ingresosTotalesFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresosTotalesFiltroActionPerformed
        filtrado(this.getOfertasBanco());
    }//GEN-LAST:event_ingresosTotalesFiltroActionPerformed

    private void aporteMaximoFiltroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aporteMaximoFiltroActionPerformed
        filtrado(this.getOfertasBanco());
    }//GEN-LAST:event_aporteMaximoFiltroActionPerformed

    private void buscFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscFocusGained
        if(busc.getText().equals("Buscar...")){
            busc.setText("");
        }
        busc.setForeground(Color.black);
    }//GEN-LAST:event_buscFocusGained

    private void buscFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_buscFocusLost
        if(busc.getText().equals("")){
            busc.setText("Buscar");
        }
        busc.setForeground(new Color(102, 102, 102));
    }//GEN-LAST:event_buscFocusLost

    private void buscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscActionPerformed

        this.filtradoBusqueda(getOfertasBanco());

    }//GEN-LAST:event_buscActionPerformed

    private void favoritosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favoritosMouseClicked
        
        if(Main.getIntance().getInvitado()==true){
            JOptionPane.showMessageDialog(null, "Debe de iniciar sesión.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            int idUsuario = Main.getIntance().getUsuarioActivo().getId();

            ArrayList<Oferta> ofertasFav = new ArrayList<>();

            for (Oferta oferta : getOfertasBanco()) {
                if (BaseDatos.getInstance().verificarFavorito(oferta.getId(), idUsuario)) {
                    ofertasFav.add(oferta);
                }
            }

            cargarOfertas(ofertasFav);
        }
    }//GEN-LAST:event_favoritosMouseClicked

    private void filtroOferLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_filtroOferLMouseClicked
        
        if(Main.getIntance().getInvitado()==true){
            JOptionPane.showMessageDialog(null, "Debe de iniciar sesión.", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            ArrayList<Oferta> ofertasFiltradas = new ArrayList<>();
        
            for(Oferta oferta : getOfertasBanco()){
                if(oferta.getValorVivienda().equals(Main.getIntance().getUsuarioActivo().getValorVivienda()) && 
                        oferta.getContrato().equals(Main.getIntance().getUsuarioActivo().getContrato()) &&
                        oferta.getSalario().equals(Main.getIntance().getUsuarioActivo().getSalario()) &&
                        oferta.getAporteMaximo().equals(Main.getIntance().getUsuarioActivo().getAporteMaximo())){

                    ofertasFiltradas.add(oferta);

                }
            }

            if(ofertasFiltradas.isEmpty()){
                JOptionPane.showMessageDialog(this, "No hay resultados para su búsqueda", "Error", JOptionPane.INFORMATION_MESSAGE);
            }

            cargarOfertas(ofertasFiltradas);
        }
    }//GEN-LAST:event_filtroOferLMouseClicked

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
            java.util.logging.Logger.getLogger(vPCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vPCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vPCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vPCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vPCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> aporteMaximoFiltro;
    private javax.swing.JTextField busc;
    private javax.swing.JPanel exitB;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel expositor;
    private javax.swing.JScrollPane expositorPane;
    private javax.swing.JButton favoritos;
    private javax.swing.JLabel filtroOferL;
    private javax.swing.JPanel fondo;
    private javax.swing.JComboBox<String> ingresosTotalesFiltro;
    private javax.swing.JPanel navbar;
    private javax.swing.JPanel navbar2;
    private javax.swing.JLabel navbarTxt;
    private javax.swing.JComboBox<String> tipoContratoFiltro;
    private javax.swing.JLabel usuarioB;
    private javax.swing.JComboBox<String> valorViviendaFiltro;
    // End of variables declaration//GEN-END:variables

    /**
     * @return the ofertasBanco
     */
    public ArrayList<Oferta> getOfertasBanco() {
        return ofertasBanco;
    }

    /**
     * @param ofertasBanco the ofertasBanco to set
     */
    public void setOfertasBanco(ArrayList<Oferta> ofertasBanco) {
        this.ofertasBanco = ofertasBanco;
    }
}
