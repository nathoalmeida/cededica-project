/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 * @author nathoalmeida
 */
public class Adolescente {
    
    private int id;
    private String nome;
    private String numProcesso;
    private Date dataNasc;
    private Date dataInicio;
    private boolean fazLA;
    private boolean fazPSC;
    private Orientador orientador;
    
    public void Adolescente() {
        fazLA = true;
        fazPSC = false;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumProcesso() {
        return numProcesso;
    }

    public void setNumProcesso(String numProcesso) {
        this.numProcesso = numProcesso;
    }

    public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public boolean fazLA() {
        return fazLA;
    }

    public void setFazLA(boolean fazLA) {
        this.fazLA = fazLA;
    }

    public boolean fazPSC() {
        return fazPSC;
    }

    public void setFazPSC(boolean fazPSC) {
        this.fazPSC = fazPSC;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        if (orientador != null) {
            return "Adolescente{" + "id=" + id + ", nome=" + nome + ", numProcesso=" + numProcesso + ", dataNasc=" + dataNasc + ", dataInicio=" + dataInicio
                + ", fazLA=" + fazLA + ", fazPSC=" + fazPSC + ", orientador=" + orientador.getNome() + '}';
        } else {
        return "Adolescente{" + "id=" + id + ", nome=" + nome + ", numProcesso=" + numProcesso + ", dataNasc=" + dataNasc + ", dataInicio=" + dataInicio
                + ", fazLA=" + fazLA + ", fazPSC=" + fazPSC + ", orientador=" + orientador + '}';
        }
    }
    
    
    
}
