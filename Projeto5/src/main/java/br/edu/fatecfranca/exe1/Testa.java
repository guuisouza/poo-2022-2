/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author 1090482111037
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Computador antes do upgrade: ");
        Computador obj1 = new Computador("Desligado", 8);
        System.out.println(obj1.toString());
        System.out.println("Computador após upgrade: ");
        obj1.upgradeRam(8);
        System.out.println(obj1.toString()); 
    }
    
}
