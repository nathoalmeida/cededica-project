/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

/**
 *
 * @author nathoalmeida
 */
public class Orientacao {
    
    private int id;
    private Date dataOrientacao;
    private String conteudo;
    private Adolescente adolescente;
    private Orientador orientador;
    
    public void Orientacao() {
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDataOrientacao() {
        return dataOrientacao;
    }

    public void setDataOrientacao(Date dataOrientacao) {
        this.dataOrientacao = dataOrientacao;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Adolescente getAdolescente() {
        return adolescente;
    }

    public void setAdolescente(Adolescente adolescente) {
        this.adolescente = adolescente;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    @Override
    public String toString() {
        return "Orientacao{" + "id=" + id + ", dataOrientacao=" + dataOrientacao + ", conteudo=" + conteudo + ", adolescente=" + 
                adolescente + ", orientador=" + 
                orientador + '}';
    }
    
    
    
}
