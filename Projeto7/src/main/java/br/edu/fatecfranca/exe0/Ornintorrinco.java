
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe0;

/**
 *
 * @author 1090482111037
 */
public class Ornintorrinco implements IMamifero, IAve{ //Obriga o ornitorrinco a dar mama e por ovos
    //HERANÇA DE COMPORTAMENTO E NAO DE CÓDIGO
    //Não herdamos códigos dos métodos das interfaces,
    //Mas herdamos os comportamentos desses métodos
    @Override
    public void darMama() {
        System.out.println("Ornintorrinco dando de mama (kappa)");
    }

    @Override
    public void botarOvo() {
        System.out.println("Ornitorrinco botando ovo");
    }
    
}
