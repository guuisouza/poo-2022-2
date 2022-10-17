/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author 1090482111037
 */
public class TestaPessoaCidadao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pessoa fulano = new Pessoa();
        
        Cidade franca = new Cidade();
        
        franca.contrata(fulano);//Contrata um professor
        
        //conversão
        franca.contrata((IEmpregado)fulano);//Contrata um empregado
        
        franca.cobraDe(fulano);
        
        franca.registra(fulano);
        
        franca.alimenta(fulano);
    }
}
