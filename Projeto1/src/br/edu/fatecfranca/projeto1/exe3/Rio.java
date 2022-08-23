/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfraca.projeto1.exe3;

/**
 *
 * @author 1090482111037
 */
public class Rio {
    public String nome;
    public double nivel;
    public boolean poluido; //
    
    public Rio (){
        
    }
    
    public Rio (String nome, double nivel, boolean poluido){
        this.nome = nome;
        this.nivel = nivel;
        this.poluido = poluido;    
    }
    
    public void chover (double x){
        this.nivel += x;
    }
    public void ensolarar (double x){
        if (this.nivel >= 0) {
            this.nivel -= x;
        }
        else {
            System.out.println("O nivel não pode ser negativo");
        }
    }
    public void limpar(){
        if (this.poluido){
            this.poluido = false;
        }
        else {
            System.out.println("O rio já está limpo");
        }
    }
    public void sujar(){
        if (this.poluido){
            System.out.println("O rio já está poluido");
        }
        else {
            this.poluido = true;
        }
    }
    public void mostra(){
        System.out.println("Nome " + this.nome + " Nível: " + this.nivel + " Poluido: " + 
        (this.poluido ? "Sim" : "Não"));
    }
    
}
