/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto4.exe0;

public class Gerente extends Funcionario {
    
    private float bonificacao;
    
    public Gerente(){
        super();
    }
    
    public Gerente(float bonificacao, int codigo, String nome, String cpf, 
            float salario, float cargaHoraria) {
        super(codigo, nome, cpf, salario, cargaHoraria);
        this.bonificacao = bonificacao;
    }

    public float getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(float bonificacao) {
        this.bonificacao = bonificacao;
    }

    @Override //anotação override porque estamos fazendo anulação ou sobresvrevendo
    public String toString() {
        return "Gerente{" + super.toString() + "bonificacao=" + bonificacao + '}';
    }
}
