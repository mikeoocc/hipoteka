/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

/**
 *
 * @author Miguel
 */
public class Banco extends Usuario{
    
    private String telef;
    private String horario;
    private String direccion;
    
    public Banco() {
        super();
    }
    
    public Banco(int id, String nombre, String mail, String pass, int tipo, String telef, String horario, String direccion){
        
        super(id, nombre, mail, pass, tipo);
        
        this.telef = telef;
        this.horario = horario;
        this.direccion = direccion;
        
    }
    
    
    

    /**
     * @return the telef
     */
    public String getTelef() {
        return telef;
    }

    /**
     * @param telef the telef to set
     */
    public void setTelef(String telef) {
        this.telef = telef;
    }

    /**
     * @return the horario
     */
    public String getHorario() {
        return horario;
    }

    /**
     * @param horario the horario to set
     */
    public void setHorario(String horario) {
        this.horario = horario;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
}
