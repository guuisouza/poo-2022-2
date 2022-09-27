/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe3;

/**
 *
 * @author 1090482111037
 */
public class Apto extends Imovel {
    private int nro; //definindo a variavel como private

    public Apto() {
        super();//chama o construtor da superclasse
    }

    public Apto(int nro) {
        this.nro = nro;
    }

    public Apto(int nro, String endereco) {
        super(endereco);
        this.nro = nro;
    }
    
    public int getNro() {
        return nro;
    }

    public void setNro(int nro) {
        this.nro = nro;
    }

    @Override
    public String toString() {
        return "Apto{" + "nro=" + nro + super.toString() + '}';
    }
}
