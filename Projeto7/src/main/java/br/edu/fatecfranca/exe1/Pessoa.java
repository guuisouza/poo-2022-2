/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author 1090482111037
 */
public class Pessoa extends Animal implements ICidadão,IContribuinte,IProfessor {
    
    
    @Override
    public void ensina(){
        System.out.println("Pessoa ensinando");
    }
    
    @Override
    public void vota(){
        System.out.println("Pessoa vota");
    }
    
    @Override
    public void obterRg(){
        System.out.println("123456-7");
    }
    
    @Override
    public void trabalha(){
        System.out.println("Pesosa trabalha");
    }
    
    @Override
    public void pagaIR(){
        System.out.println("Pessoa paga IR");
    }
    
    @Override
    public void obterCpf(){
        System.out.println("441.492.108-69");
    }
}
