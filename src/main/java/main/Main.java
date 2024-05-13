/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import interfaz.Home;
import usuario.Banco;
import usuario.Cliente;

/**
 *
 * @author Miguel
 */
public class Main {
    
    private Cliente usuarioActivo;
    private Banco bancoActivo;
    private Boolean invitado;
    private static Main myinstance;
    
    public static void main (String [] args){
        
        Home home = new Home();
        home.setVisible(true);
        
        
    }
    
    public static Main getIntance(){
        if (myinstance == null){
            myinstance = new Main();
        }
        return myinstance;
    }
    

    public Cliente getUsuarioActivo() {
        return usuarioActivo;
    }

    public void setUsuarioActivo(Cliente usuarioActivo) {
        this.usuarioActivo = usuarioActivo;
    }
    
    public Banco getBanco(){
        return bancoActivo;
    }
    
    public void setBancoActivo(Banco bancoActivo){
        this.bancoActivo = bancoActivo;
    }

    /**
     * @return the invitado
     */
    public Boolean getInvitado() {
        return invitado;
    }

    /**
     * @param invitado the invitado to set
     */
    public void setInvitado(Boolean invitado) {
        this.invitado = invitado;
    }
    
}
