/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe3;

/**
 *
 * @author 1090482111037
 */
public class Imovel {
    //Definindo as váriaveis como protected
    protected String endereco;

    public Imovel() {
    }

    public Imovel(String endereco) {
        this.setEndereco(endereco);
    }
    
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Imovel{" + "endereco=" + endereco + '}';
    }
}
