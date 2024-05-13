/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ofertas;

/**
 *
 * @author Miguel
 */
public class Oferta {

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the idBanco
     */
    public int getIdBanco() {
        return idBanco;
    }

    /**
     * @param idBanco the idBanco to set
     */
    public void setIdBanco(int idBanco) {
        this.idBanco = idBanco;
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
     * @return the desc
     */
    public String getDesc() {
        return desc;
    }

    /**
     * @param desc the desc to set
     */
    public void setDesc(String desc) {
        this.desc = desc;
    }
    
    
    private int id;
    private int idBanco;
    private String valorVivienda;
    private String contrato;
    private String salario;
    private String aporteMaximo;
    private String desc;
    private String nombre;
    private String nombreBanco;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombreBanco
     */
    public String getNombreBanco() {
        return nombreBanco;
    }

    /**
     * @param nombreBanco the nombreBanco to set
     */
    public void setNombreBanco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
    }
    
    
    
}
