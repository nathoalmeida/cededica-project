/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.Instant;
import java.time.LocalDate;
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
    private int idOrientador;
    
    public Adolescente() {
        fazLA = true;
        dataInicio = Date.from(Instant.now());
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

    public int getIdOrientador() {
        return idOrientador;
    }

    public void setIdOrientador(int idOrientador) {
        this.idOrientador = idOrientador;
    }

    @Override
    public String toString() {
        
        return "Adolescente{" + "id=" + id + ", nome=" + nome + ", numProcesso=" + numProcesso + ", dataNasc=" + dataNasc + ", dataInicio=" + dataInicio
                + ", fazLA=" + fazLA + ", fazPSC=" + fazPSC + ", idOrientador=" + idOrientador + '}';
        }
    
    
    
    
}
