/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usuario;

/**
 *
 * @author Miguel
 */
public class Cliente extends Usuario{
    
    private String edad;
    private String salario;
    private String contrato;
    private String provincia;
    private String valorVivienda;
    private String aporteMaximo;
    private boolean relleno;
    
    public Cliente(int id, String nombre, String mail, String pass, int tipo, String edad, String salario, String contrato, String provincia,
            String valorVivienda, String aporteMaximo) {
        super(id, nombre, mail, pass, tipo);
        
        this.edad = edad;
        this.salario = salario;
        this.contrato = contrato;
        this.provincia = provincia;
        this.valorVivienda = valorVivienda;
        this.aporteMaximo = aporteMaximo;
        
    }

    /**
     * @return the edad
     */
    public String getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(String edad) {
        this.edad = edad;
    }

    /**
     * @return the salario
     */
    public String getSalario() {
        return salario;
    }

    /**
     * @param salario the salario to set
     */
    public void setSalario(String salario) {
        this.salario = salario;
    }

    /**
     * @return the contrato
     */
    public String getContrato() {
        return contrato;
    }

    /**
     * @param contrato the contrato to set
     */
    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    /**
     * @return the provincia
     */
    public String getProvincia() {
        return provincia;
    }

    /**
     * @param provincia the provincia to set
     */
    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    /**
     * @return the valorVivienda
     */
    public String getValorVivienda() {
        return valorVivienda;
    }

    /**
     * @param valorVivienda the valorVivienda to set
     */
    public void setValorVivienda(String valorVivienda) {
        this.valorVivienda = valorVivienda;
    }

    /**
     * @return the aporteMaximo
     */
    public String getAporteMaximo() {
        return aporteMaximo;
    }

    /**
     * @param aporteMaximo the aporteMaximo to set
     */
    public void setAporteMaximo(String aporteMaximo) {
        this.aporteMaximo = aporteMaximo;
    }
    
    /**
     * @return the relleno
     */
    public boolean isRelleno() {
        return relleno;
    }

    /**
     * @param relleno the relleno to set
     */
    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }
    
    public void comprobarDatos(){
        if (edad.isEmpty() && salario.isEmpty() && contrato.isEmpty() &&
            provincia.isEmpty() && valorVivienda.isEmpty() && aporteMaximo.isEmpty()) {
            this.setRelleno(false);
        } 
        else {
            this.setRelleno(true);
        } 
    }
}
