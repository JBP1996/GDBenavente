/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author jbp19
 */
public class Bilheteira {
    private Socio nome; 
    private int quantidade;
    private double quantia;
    
    public Bilheteira(Socio nome, int quantidade, double quantia, String data) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.quantia = quantia;
        this.data = data;
    }
    
    public Socio getNome() {
        return nome;
    }

    public void setNome(Socio nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getQuantia() {
        return quantia;
    }

    public void setQuantia(double quantia) {
        this.quantia = quantia;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    private String data;
}
