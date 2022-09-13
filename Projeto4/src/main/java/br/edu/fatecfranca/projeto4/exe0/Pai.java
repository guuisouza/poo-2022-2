/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author 1090482111037
 */
public class Pai {
    //Toda classe pai tem variaveis com visibilidade 
    //protegida (protected).
    //Em herança herdamos a variavel e não seu conteudo
    //Conceito da reutilização de codigo -> herança
    protected String nome;
    protected String sobrenome;
    protected String imoveis;
    protected String cargaGenetica;
    protected int idade;
    //Se fosse private não poderia ser herdada pelo filho
    //Variavel protected significa que as variaveis são publicas
    //para as classes filhas, mas sao privadas para classes que não pertencem
    //a hierarquia
    //Variavel variavel privada é '-',publica é '+', se não é #
    
    //Superclasse - Generalização
    //Subclasse - Especialização
    //Herança simples - O filho pode herdar de apenas de um pai
}
