/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import model.Orientacao;
import util.ConnectionFactory;

/**
 *
 * @author nathoalmeida
 */
public class OrientacaoController {
    
    public void save(Orientacao orientacao) {
        String sql = "INSERT INTO ORIENTACOES (dataOrientacao, conteudo, idOrientador, idAdolescente, faltou) " +
                "VALUES (?, ?, ?, ?, ?)";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setDate(1, new Date(orientacao.getDataOrientacao().getTime()));
            statement.setString(2, orientacao.getConteudo());
            statement.setInt(3, orientacao.getIdOrientador());
            statement.setInt(4, orientacao.getIdAdolescente());
            statement.setBoolean(5, orientacao.getFaltou());
            
            
            
            statement.execute();
        }
        catch(Exception ex) {
            throw new RuntimeException("Erro ao salvar nova orientação" + ex.getMessage() + ex);
        } 
        finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    
    public void update(Orientacao orientacao) {
        
        String sql = "UPDATE ORIENTACOES SET dataOrientacao = ?, "
                + "conteudo = ?,"
                + "idOrientador = ?,"
                + "idAdolescente = ?" 
                + "faltou = ?"
                + "WHERE id = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setDate(1, new Date(orientacao.getDataOrientacao().getTime()));
            statement.setString(2, orientacao.getConteudo());
            statement.setInt(3, orientacao.getIdOrientador());
            statement.setInt(4, orientacao.getIdAdolescente());
            statement.setInt(5, orientacao.getId());
            statement.setBoolean(6, orientacao.getFaltou());
            
            
            statement.execute();
            
        } catch(SQLException ex) {
           throw new RuntimeException("Erro ao atualizar registro de orientação" + ex.getMessage() + ex); 
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public void removeById(int id) {
        
        String sql = "DELETE FROM ORIENTACOES WHERE ID = ?";
        
        Connection connection = null;
        PreparedStatement statement = null;
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            statement.setInt(1, id);
            
            statement.execute();
            
        } catch (SQLException ex) {
            
            throw new RuntimeException("Erro ao excluir orientação " + ex.getMessage() + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement);
        }
        
    }
    
    public List<Orientacao> getAll() {
        
        String sql = "SELECT * FROM ORIENTACOES";
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        List<Orientacao> orientacoes = new ArrayList<>();
        
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            
            
            resultSet = statement.executeQuery();
            
            while(resultSet.next()) {
                Orientacao orientacao = new Orientacao();
                
                orientacao.setId(resultSet.getInt("id"));
                orientacao.setConteudo(resultSet.getString("conteudo"));
                orientacao.setDataOrientacao(resultSet.getDate("dataOrientacao"));
                orientacao.setIdAdolescente(resultSet.getInt("idAdolescente"));
                orientacao.setIdOrientador(resultSet.getInt("idOrientador"));
                orientacao.setFaltou(resultSet.getBoolean("faltou"));
                
               
                
                
                orientacoes.add(orientacao);
                
            }
            
        } catch(SQLException ex) {
            throw new RuntimeException("Erro ao retornar orientações " + ex.getMessage() + ex);
        } finally {
            ConnectionFactory.closeConnection(connection, statement, resultSet);
        }
        
        return orientacoes;
    }
    
}
