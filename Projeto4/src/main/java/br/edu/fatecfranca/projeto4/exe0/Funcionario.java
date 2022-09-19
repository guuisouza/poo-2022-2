/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

/**
 *
 * @author 1090482111037
 */
public class Funcionario {
    //As variavies devem ser com visibilidade protectec
    //para permirtir que as subclasses herdem essas
    protected int codigo;
    protected String nome, cpf;
    protected float salario, cargaHoraria;

    public Funcionario() {
    }

    public Funcionario(int codigo, String nome, String cpf, float salario, float cargaHoraria) {
        this.setCodigo(codigo);
        this.setNome(nome);
        this.setCpf(cpf);
        this.setSalario(salario);
        this.setCargaHoraria(cargaHoraria);
    }

    
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(float cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "codigo=" + codigo + ", nome=" + nome + ", cpf=" + cpf + ", salario=" + salario + ", cargaHoraria=" + cargaHoraria + '}';
    }
    
    public float calculaSalario(){
        return this.salario;
    }
}
