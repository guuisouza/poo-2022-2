/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfraca.projeto1.exe3;

/**
 *
 * @author 1090482111037
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Rio obj1 = new Rio();
        obj1.nome = "Tiete";
        obj1.nivel = 1.50;
        obj1.poluido = true;
        obj1.chover(1.0);
        obj1.limpar();
        obj1.mostra();
        
        Rio obj2 = new Rio("Parana", 2.5, false);
        obj2.ensolarar(0.5);
        obj2.sujar();
        obj2.mostra();
    }  
}
