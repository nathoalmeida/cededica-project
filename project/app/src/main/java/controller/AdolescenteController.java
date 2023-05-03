/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Adolescente;
import util.ConnectionFactory;

/**
 *
 * @author nathoalmeida
 */
public class AdolescenteController {
    
    public void save(Adolescente adolescente) {
        String sql = "INSERT INTO ADOLESCENTES (nome, numProcesso, dataNasc, dataInicio, LA, PSC, id_orientador) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, adolescente.getNome());
            statement.setString(2, adolescente.getNumProcesso());
            statement.setDate(3, new Date(adolescente.getDataNasc().getTime()));
            statement.setDate(4, new Date(adolescente.getDataInicio().getTime()));
            statement.setBoolean(5, adolescente.fazLA());
            statement.setBoolean(6, adolescente.fazPSC());
            statement.setInt(7, adolescente.getIdOrientador());
            
            
            
            statement.execute();
        }
        catch(Exception ex) {
            throw new RuntimeException("Erro ao salvar novo adolescente" + ex.getMessage() + ex);
        } 
        finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(Adolescente adolescente) {
        
        String sql = "UPDATE ADOLESCENTES SET nome = ?, "
                + "numProcesso = ?,"
                + "dataNasc = ?,"
                + "dataInicio = ?,"
                + "LA = ?,"
                + "PSC = ?,"
                +"id_orientador = ? "
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setString(1, adolescente.getNome());
            statement.setString(2, adolescente.getNumProcesso());
            statement.setDate(3, new Date(adolescente.getDataNasc().getTime()));
            statement.setDate(4, new Date(adolescente.getDataInicio().getTime()));
            statement.setBoolean(5, adolescente.fazLA());
            statement.setBoolean(6, adolescente.fazPSC());
            statement.setInt(7, adolescente.getIdOrientador());
            statement.setInt(8, adolescente.getId());
            
            
            statement.execute();
            
        } catch(SQLException ex) {
           throw new RuntimeException("Erro ao atualizar registro de adolescente" + ex.getMessage() + ex); 
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public void removeById(int id) {
        
        String sql = "DELETE FROM ADOLESCENTES WHERE ID = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao excluir adolescente " + ex.getMessage() + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public List<Adolescente> getAll() {
        
        String sql = "SELECT * FROM ADOLESCENTES";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Adolescente> adolescentes = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Adolescente adolescente = new Adolescente();
                
                
                adolescente.setId(resultSet.getInt("id"));
                adolescente.setNome(resultSet.getString("nome"));
                adolescente.setNumProcesso(resultSet.getString("numProcesso"));
                adolescente.setDataNasc(resultSet.getDate("dataNasc"));
                adolescente.setDataInicio(resultSet.getDate("dataInicio"));
                adolescente.setFazLA(resultSet.getBoolean("LA"));
                adolescente.setFazPSC(resultSet.getBoolean("PSC"));
                
                
                //preciso "converter" a id do orientador no objeto orientador
                adolescente.setIdOrientador(resultSet.getInt("id_orientador"));
                
               
                
                
                adolescentes.add(adolescente);
                
            }
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao retornar adolescentes " + ex.getMessage() + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return adolescentes;
    }
    public List<Adolescente> getAll(int idOrientador) {
        
        String sql = "SELECT * FROM ADOLESCENTES WHERE id_orientador = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Adolescente> adolescentes = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setInt(1, idOrientador);
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Adolescente adolescente = new Adolescente();
                
                
                adolescente.setId(resultSet.getInt("id"));
                adolescente.setNome(resultSet.getString("nome"));
                adolescente.setNumProcesso(resultSet.getString("numProcesso"));
                adolescente.setDataNasc(resultSet.getDate("dataNasc"));
                adolescente.setDataInicio(resultSet.getDate("dataInicio"));
                adolescente.setFazLA(resultSet.getBoolean("LA"));
                adolescente.setFazPSC(resultSet.getBoolean("PSC"));
                
                
               
                adolescente.setIdOrientador(resultSet.getInt("id_orientador"));
                
               
                
                
                adolescentes.add(adolescente);
                
            }
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao retornar adolescentes " + ex.getMessage() + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return adolescentes;
    }
    
    
    
}
