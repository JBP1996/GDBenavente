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
public class Quota {
    private Socio nome;
    private double quantia;
    private String data;
    private String validade;
    
    public Quota(Socio nome, double quantia, String data, String validade) {
        this.nome = nome;
        this.quantia = quantia;
        this.data = data;
        this.validade = validade;
    }

    public Socio getNome() {
        return nome;
    }

    public void setNome(Socio nome) {
        this.nome = nome;
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

    public String getValidade() {
        return validade;
    }

    public void setValidade(String validade) {
        this.validade = validade;
    }
}
