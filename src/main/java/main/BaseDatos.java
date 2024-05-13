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
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import ofertas.Oferta;
import usuario.Banco;
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
        
        String consulta = "SELECT * FROM usuarios WHERE mail = ? AND pass = MD5(?)";
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
                        
                        String telef = resultSet.getString("telef");
                        String horario = resultSet.getString("horario");
                        String direccion = resultSet.getString("direccion");
                        
                        Banco uBanco = new Banco(id, nombre, mail, pass, tipo, telef, horario, direccion);
                        
                        Main.getIntance().setBancoActivo(uBanco);
                        
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

    public boolean correoExiste(String correo) {        
        
        String consulta = "SELECT COUNT(*) FROM usuarios WHERE mail = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, correo);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    int cantidad = resultSet.getInt(1);
                    return cantidad > 0; // Si la cantidad es mayor a 0, significa que el correo ya existe
                }
            }catch(Exception e){
                
            }             
        } catch (SQLException e) {
            e.printStackTrace();
        }

        // En caso de error o excepción, asumimos que el correo no existe
        return false;
    }

    public boolean guardarUsuario(String nombre, String correo, String contraseña, int tipo) {
    
        String consulta = "INSERT INTO usuarios (nombre, mail, pass, tipo) VALUES (?, ?, MD5(?), ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, correo);
            preparedStatement.setString(3, contraseña);
            preparedStatement.setInt(4, tipo);

            int filasAfectadas = preparedStatement.executeUpdate();

            return filasAfectadas > 0; // Si se insertaron filas, se considera un éxito
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // En caso de error o excepción
    }
    
    public boolean guardarBanco(String nombre, String correo, String contraseña, int tipo, String telef, String horario, String direccion){
        
        
        String consulta = "INSERT INTO usuarios (nombre, mail, pass, tipo, telef, horario, direccion) VALUES (?, ?, MD5(?), ?, ?, ?, ?)";
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setString(1, nombre);
            preparedStatement.setString(2, correo);
            preparedStatement.setString(3, contraseña);
            preparedStatement.setInt(4, tipo);
            preparedStatement.setString(5, telef);
            preparedStatement.setString(6, horario);
            preparedStatement.setString(7, direccion);

            int filasAfectadas = preparedStatement.executeUpdate();

            return filasAfectadas > 0; // Si se insertaron filas, se considera un éxito
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false; // En caso de error o excepción
        
        
    }

    public void rellenarCampos(){
        
        String sql = "UPDATE usuarios SET edad=?, salario=?, contrato=?, provincia=?, valorVivienda=?, aporteMaximo=? WHERE mail=?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setString(1, Main.getIntance().getUsuarioActivo().getEdad());
            preparedStatement.setString(2, Main.getIntance().getUsuarioActivo().getSalario());
            preparedStatement.setString(3, Main.getIntance().getUsuarioActivo().getContrato());
            preparedStatement.setString(4, Main.getIntance().getUsuarioActivo().getProvincia());
            preparedStatement.setString(5, Main.getIntance().getUsuarioActivo().getValorVivienda());
            preparedStatement.setString(6, Main.getIntance().getUsuarioActivo().getAporteMaximo());
            preparedStatement.setString(7, Main.getIntance().getUsuarioActivo().getMail());
            
            int filasActualizadas = preparedStatement.executeUpdate();

            if (filasActualizadas > 0) {
                System.out.println("Campos actualizados correctamente para el cliente cuyo mail es: " + Main.getIntance().getUsuarioActivo().getMail());
            } else {
                System.out.println("No se encontró al cliente con el mail especificado: " + Main.getIntance().getUsuarioActivo().getMail());
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
       
    }
    
    public void crearOferta(int idBanco, String valorVivienda, String contrato, String salario, String aporteMaximo, String desc, String nombre){

        String consulta = "INSERT INTO ofertas (idBanco, valorVivienda, contrato, salario, aporteMaximo, `desc`, nombre) VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            
            preparedStatement.setInt(1, idBanco);
            preparedStatement.setString(2, valorVivienda);
            preparedStatement.setString(3, contrato);
            preparedStatement.setString(4, salario);
            preparedStatement.setString(5, aporteMaximo);
            preparedStatement.setString(6, desc);
            preparedStatement.setString(7, nombre);

            preparedStatement.executeUpdate();
        
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
    }
    
    public void cargarOfertasBanco(ArrayList<Oferta> ofertas){
        
        String consulta = "SELECT * FROM ofertas WHERE idBanco = ?";
        
        try(PreparedStatement preparedStatement = connection.prepareStatement(consulta)){
            
            preparedStatement.setInt(1, Main.getIntance().getBanco().getId());
            
            try(ResultSet resultSet = preparedStatement.executeQuery()){
            
                while(resultSet.next()){
                    Oferta oferta = new Oferta();
                    oferta.setId(resultSet.getInt("id"));
                    oferta.setIdBanco(resultSet.getInt("idBanco"));
                    oferta.setValorVivienda(resultSet.getString("valorVivienda"));
                    oferta.setContrato(resultSet.getString("contrato"));
                    oferta.setSalario(resultSet.getString("salario"));
                    oferta.setAporteMaximo(resultSet.getString("aporteMaximo"));
                    oferta.setDesc(resultSet.getString("desc"));
                    oferta.setNombre(resultSet.getString("nombre"));

                    ofertas.add(oferta);
                }
        
            }
            
        }catch(SQLException e){
            e.printStackTrace();
        }
        
    }
    
    public void cargarOfertas(ArrayList<Oferta> ofertas){       
        
        String consulta = "SELECT * FROM ofertas";

        try(PreparedStatement preparedStatement = connection.prepareStatement(consulta)){

            try(ResultSet resultSet = preparedStatement.executeQuery()){

                while(resultSet.next()){
                    Oferta oferta = new Oferta();
                    oferta.setId(resultSet.getInt("id"));
                    oferta.setIdBanco(resultSet.getInt("idBanco"));
                    oferta.setValorVivienda(resultSet.getString("valorVivienda"));
                    oferta.setContrato(resultSet.getString("contrato"));
                    oferta.setSalario(resultSet.getString("salario"));
                    oferta.setAporteMaximo(resultSet.getString("aporteMaximo"));
                    oferta.setDesc(resultSet.getString("desc"));
                    oferta.setNombre(resultSet.getString("nombre"));

                    int idBanco = oferta.getIdBanco();
                    String nombreBanco = obtenerNombreBanco(idBanco);
                    oferta.setNombreBanco(nombreBanco);

                    ofertas.add(oferta);
                }

            }

        } catch(SQLException e){
            e.printStackTrace();
        }
    }
    
    private String obtenerNombreBanco(int idBanco) throws SQLException {
        
        String consultaBanco = "SELECT nombre FROM usuarios WHERE id = ?";
    
        try(PreparedStatement preparedStatement = connection.prepareStatement(consultaBanco)){
            preparedStatement.setInt(1, idBanco);
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()) {
                    return resultSet.getString("nombre");
                }
            }
        }
        return null;
    }
    
    public Banco obtenerDatosBanco(int idBanco){
        
        Banco b = new Banco();
        
        String consultaBanco = "SELECT nombre, mail, telef, horario, direccion FROM usuarios WHERE id = ?";
    
        try(PreparedStatement preparedStatement = connection.prepareStatement(consultaBanco)){
            
            preparedStatement.setInt(1, idBanco);
            
            try(ResultSet resultSet = preparedStatement.executeQuery()){
                if(resultSet.next()) {
                    b.setNombre(resultSet.getString("nombre"));
                    b.setMail(resultSet.getString("mail"));
                    b.setTelef(resultSet.getString("telef"));
                    b.setHorario(resultSet.getString("horario"));
                    b.setDireccion(resultSet.getString("direccion"));
                }
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        } 
        
        return b;
    }
    
    public void eliminarOferta(int id){
        
        String consulta = "DELETE FROM ofertas WHERE id = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            
            preparedStatement.setInt(1, id);
            
            preparedStatement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public void anadirFavoritos(int idOferta, int idCliente){
        
        String consulta = "INSERT INTO clientes_interesados (idOferta, idCliente) VALUES (?, ?)";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setInt(1, idOferta);
            preparedStatement.setInt(2, idCliente);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } 
    }
    
    public void eliminarFavoritos(int idOferta, int idCliente){
        
        String consulta = "DELETE FROM clientes_interesados WHERE idOferta = ? AND idCliente = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            preparedStatement.setInt(1, idOferta);
            preparedStatement.setInt(2, idCliente);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
  
    }
    
    public boolean verificarFavorito(int idOferta, int idCliente){
        
        String consulta = "SELECT * FROM clientes_interesados WHERE idOferta = ? AND idCliente = ?";
        
        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            
            preparedStatement.setInt(1, idOferta);
            preparedStatement.setInt(2, idCliente);
        
            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                
                boolean existeFavorito = resultSet.next();
                
                if(existeFavorito) {
                    return true;
                } else {
                    return false;
                }
                
                //return resultSet.next();
            }
            
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    
        return false;
    }
    
    public void cargarLista(JTable listaClientes, int idOferta){
        
        DefaultTableModel modelo = (DefaultTableModel) listaClientes.getModel();
        modelo.setRowCount(0); // Limpiar la tabla antes de cargar nuevos datos

        try {
            String consulta = "SELECT c.nombre, c.mail " +
                              "FROM usuarios c " +
                              "INNER JOIN clientes_interesados ci ON c.id = ci.idCliente " +
                              "WHERE ci.idOferta = ?";

            PreparedStatement pstmt = connection.prepareStatement(consulta);
            pstmt.setInt(1, idOferta);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                
                String nombre = rs.getString("nombre");
                String correo = rs.getString("mail");

                
                modelo.addRow(new Object[]{nombre, correo});
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public void cambiarDatos(String valorVivienda, String contrato, String ingresosTotales, String aporteMinimo) {
        
        String consulta = "UPDATE usuarios SET valorVivienda = ?, contrato = ?, salario = ?, aporteMaximo = ? WHERE id = ?";

        try (PreparedStatement preparedStatement = connection.prepareStatement(consulta)) {
            
            preparedStatement.setString(1, valorVivienda);
            preparedStatement.setString(2, contrato);
            preparedStatement.setString(3, ingresosTotales);
            preparedStatement.setString(4, aporteMinimo);
            preparedStatement.setInt(5, Main.getIntance().getUsuarioActivo().getId());

            
            preparedStatement.executeUpdate();

            System.out.println("Datos actualizados correctamente");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}


