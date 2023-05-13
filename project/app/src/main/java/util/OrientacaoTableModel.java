/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import model.Orientacao;

/**
 *
 * @author nathoalmeida
 */
public class OrientacaoTableModel extends AbstractTableModel {
    
    
    String[] columns = {};
    List<Orientacao> orientacoes = new ArrayList();
    
    @Override
    public int getRowCount() {
        return orientacoes.size();
    }
    
    @Override
    public int getColumnCount() {
        
    }
}
