/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author 1090482111037
 */
public class Projeto4 {
    public static void polimorfismo(Funcionario funcionario){ //pra ter um polimorfismo
        System.out.println(funcionario.toString());//é necessário: herença, anulação de metodos
    }
    
    public static void main(String[] args) {
        Gerente objGerente = new Gerente(3000, 1, "Mendes", "123", 
            1500, 44);
        polimorfismo(objGerente);
        Assistente objAssistente = new Assistente(20, "Mendes", 11, "Beltrano", "321", 
            1000, 44);
        polimorfismo(objAssistente);
        Diretor objDiretor = new Diretor("5", 111, "Ciclano", "656", 2000, 44);
        polimorfismo(objDiretor);
    }   
}
