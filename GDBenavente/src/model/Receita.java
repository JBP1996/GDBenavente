/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author JBP1996 Atec
 */
public class Receita {
    private Socio quemdeu;
    private int tipo;
    private Date dia;
    private double quantidade;

    public Receita(Socio quemdeu, int tipo, Date dia, double quantidade) {
        this.quemdeu = quemdeu;
        this.tipo = tipo;
        this.dia = dia;
        this.quantidade = quantidade;
    }
    
    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Socio getQuemdeu() {
        return quemdeu;
    }

    public void setQuemdeu(Socio quemdeu) {
        this.quemdeu = quemdeu;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public Date getDia() {
        return dia;
    }

    public void setDia(Date dia) {
        this.dia = dia;
    }
    
    public static final int DONATIVO=0;
    public static final int QUOTA=1;
    public static final int BILHETEIRA=2;
}
