/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Scanner;
import model.Socio;

/**
 *
 * @author jbp19
 */
public class GestaoSocios {
    Socio so;
    ArrayList<Socio> as;
    
    public void inserirSocio(Socio nSocio){
        System.out.println("INSERIR SOCIOS");
        
        System.out.println("insira o nome do Socio");
        String nome= new Scanner(System.in).nextLine();
        
        System.out.println("insira a localidade do Socio");
        String localidade= new Scanner(System.in).nextLine();
        
        System.out.println("insira o numero de telemovel do Socio");
        String telemovel= new Scanner(System.in).nextLine();
        
        if(as.size()!=0){
            for(int i=0;i<as.size();i++){
                if(!as.get(i).getNome().equals(nome) && !as.get(i).getTelemovel().equals(telemovel)){
                    nSocio.setNome(nome);
                    nSocio.setLocalidade(localidade);
                    nSocio.setTelemovel(telemovel);
                    as.add(nSocio);
                }else{
                    System.out.println("Já existe um socio com esta informacao");
                }
            }
        }
    }
    
    public Object listarSocios(){
        System.out.println("LISTAR SOCIOS");
        for(int i=0;i<=as.size();i++){
            System.out.println(" Nome: "+as.get(i).getNome()+"\n Localidade: "+as.get(i).getLocalidade()+
                    "\n Telemovel: "+as.get(i).getTelemovel()+"\n");
        }
        return as;
    }
}
