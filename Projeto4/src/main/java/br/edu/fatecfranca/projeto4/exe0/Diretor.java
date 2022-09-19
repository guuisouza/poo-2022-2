/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author 1090482111037
 */
public class Diretor extends Funcionario {
    private String partLucros;
    
    public Diretor(){
        super();
    }

    public Diretor(String partLucros, int codigo, String nome, String cpf, float salario, float cargaHoraria) {
        super(codigo, nome, cpf, salario, cargaHoraria);
        this.partLucros = partLucros;
    }

    public String getPartLucros() {
        return partLucros;
    }

    public void setPartLucros(String partLucros) {
        this.partLucros = partLucros;
    }

    @Override
    public String toString() {
        return "Diretor{" + "partLucros=" + partLucros + super.toString() + '}';
    }
}
