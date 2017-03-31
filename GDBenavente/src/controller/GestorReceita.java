/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.Receita;
import model.Socio;

/**
 *
 * @author jbp19
 */
public class GestorReceita {
    ArrayList<Receita> arReceitas;
    
    public GestorReceita(ArrayList<Receita> arReceitas){
        super();
        this.arReceitas= arReceitas;
    }
    
    public GestorReceita(){
        this.arReceitas = new ArrayList<>();
    }

    public Socio topSocio(){
        double quantidade = arReceitas.get(0).getQuantidade();
        Socio quem = arReceitas.get(0).getQuemdeu();
        for(Receita r : this.arReceitas){
            if(r.getQuantidade() > quantidade){
                quantidade = r.getQuantidade();
                quem = r.getQuemdeu();
            }
        }
        
        return quem;
    }
    
    public ArrayList<Receita> getArReceitas() {
        return arReceitas;
    }

    public void setArReceitas(ArrayList<Receita> arReceitas) {
        this.arReceitas = arReceitas;
    }
    
}
