/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.edu.fatecfranca.projeto6;

/**
 *
 * @author pc gaming
 */
public class Projeto6 {
    public static void polimorfismo(Funcionario funcionario){
        System.out.println(funcionario.toString());
    }

    public static void main(String[] args) {
        Gerente objGerente = new Gerente(3000, 1, "Fulano", "123",
                1500, 44);
        polimorfismo(objGerente);
        
        Assistente objAssistente = new Assistente(20, "Fulano", 11, "Beltrano", "321",
                1000, 44);
        polimorfismo(objAssistente);
        
        Diretor objDiretor = new Diretor("5", 111, "Ciclano", "656", 5000, 44);
         polimorfismo(objDiretor);
    }
}
