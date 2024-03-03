/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import usuario.Cliente;


/**
 *
 * @author Miguel
 */


public class BaseDatos {
    
    private String url = "jdbc:mysql://localhost:3306/hipoteka";
    private String usuarioDB = "root";
    private String contrasenaDB = "miguel2004";
    private Connection connection;
    
    private static BaseDatos mybasedatos;
    
    public BaseDatos(){
        try{
          
           connection = DriverManager.getConnection(url, usuarioDB, contrasenaDB);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public static BaseDatos getInstance(){
        if (mybasedatos == null){
            mybasedatos = new BaseDatos();
        }
        return mybasedatos;
    }
    
    public boolean verificarCredenciales(String correo, String password){
        
        String consulta = "SELECT * FROM usuarios WHERE mail = ? AND pass = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, correo);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if(resultSet.next()){ 

                    int id = resultSet.getInt("id");
                    String nombre = resultSet.getString("nombre");
                    String mail = resultSet.getString("mail");
                    String pass = resultSet.getString("pass");
                    int tipo = resultSet.getInt("tipo");
                    
                    if(tipo == 1){
                        
                        String edad = resultSet.getString("edad");
                        String salario = resultSet.getString("salario");
                        String contrato = resultSet.getString("contrato");
                        String provincia = resultSet.getString("provincia");
                        String valorVivienda = resultSet.getString("valorVivienda");
                        String aporteMaximo = resultSet.getString("aporteMaximo");
                        
                        Cliente uCliente = new Cliente(id, nombre, mail, pass, tipo, edad, salario, contrato, provincia, valorVivienda, aporteMaximo);
                        
                        Main.getIntance().setUsuarioActivo(uCliente);
                        
                    }
                    else{
                        
                    }
                    
                    return true;
                }
            }catch(Exception e){
                
            }            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return false;
    }
}
