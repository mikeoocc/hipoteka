/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import usuario.Cliente;

/**
 *
 * @author Miguel
 */
public class Main {
    
    private Cliente usuarioActivo;
    private static Main myinstance;
    
    public static void main (String [] args){
        
        
        
        
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
}
