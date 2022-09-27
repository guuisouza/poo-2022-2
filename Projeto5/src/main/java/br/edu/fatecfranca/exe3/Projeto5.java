/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.exe3;

/**
 *
 * @author 1090482111037
 */
public class Projeto5 {
    
    //Criando polimorfismo
    public static void polimorfismo(Imovel imovel){
        System.out.println(imovel.toString());
    }
    public static void main(String[] args) {
        Apto objApto = new Apto(15, "Franca, São Paulo");
        polimorfismo(objApto);
        Casa objCasa = new Casa(2, "Restinga, São Paulo");
        polimorfismo(objCasa);
        
        
    }
}
