/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import model.Orientador;
import util.ConnectionFactory;

/**
 *
 * @author nathoalmeida
 */
public class OrientadorController {
    
    public void save(Orientador orientador) {
        String sql = "INSERT INTO ORIENTADORES (nome) " +
                "VALUES (?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, orientador.getNome());
            
            
            statement.execute();
        }
        catch(Exception ex) {
            throw new RuntimeException("Erro ao salvar novo orientador " + ex.getMessage() + ex);
        } 
        finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(Orientador orientador) {
        
        String sql = "UPDATE ORIENTADORES SET nome = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, orientador.getNome());
            
            
            statement.execute();
            
        } catch(SQLException ex) {
           throw new RuntimeException("Erro ao atualizar nome do orientador " + ex.getMessage() + ex); 
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public void removeById(int id) {
        
        String sql = "DELETE FROM ORIENTADORES WHERE ID = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao deletar orientador " + ex.getMessage() + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public List<Orientador> getAll() {
        
        String sql = "SELECT * FROM ORIENTADORES";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Orientador> orientadores = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Orientador orientador = new Orientador();
                
                orientador.setId(resultSet.getInt("id"));
                orientador.setNome(resultSet.getString("nome"));
               
                
                
                orientadores.add(orientador);
                
            }
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao retornar orientadores " + ex.getMessage() + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return orientadores;
    }
    
    
}
