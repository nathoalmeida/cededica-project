/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Orientacao;
import model.Orientador;

/**
 *
 * @author nathoalmeida
 */
public class OrientacaoTableModel extends AbstractTableModel {
    
    
    String[] columns = {"Qtd", "Data da orientação", "Conteúdo", "Orientado por:", "Faltou?", "Editar", "Excluir"};
    List<Orientacao> orientacoes = new ArrayList();
    List<Orientador> orientadores = new ArrayList();
    
    @Override
    public int getRowCount() {
        return orientacoes.size();
    }
    
    @Override
    public int getColumnCount() {
        return columns.length;
    }
    
    @Override
    public String getColumnName(int columnIndex) {
        return columns[columnIndex];
        
    }
    
    @Override
    public Class<?> getColumnClass(int columnIndex) {
        if (orientacoes.isEmpty()) {
            return Object.class;
        }
        
        return this.getValueAt(0, columnIndex).getClass();
    }
    
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        
        return columnIndex == 4;    
    }
    
    @Override 
    public Object getValueAt(int rowIndex, int columnIndex) {
        
        switch(columnIndex) {
            case 0: 
                break;
            case 1:
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                return dateFormat.format(orientacoes.get(rowIndex).getDataOrientacao());
                
            case 2:
                return orientacoes.get(rowIndex).getConteudo();
                
            case 3:
                Orientador orientador = new Orientador();
                
                int orientadorId = orientacoes.get(rowIndex).getIdOrientador();
                
                // CRIAR MÉTODO NO ORIENTADOR CONTROLLER ????????
                return orientador.toString();
            
        }
    }
}
