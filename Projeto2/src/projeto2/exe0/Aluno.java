/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2.exe0;

/**
 *
 * @author 1090482111037
 */
public class Aluno {
    private int numeroAluno;
    private String nomeAluno;
    private int idade;
    private double p1;
    private double p2;
    
    //Definir os metodos construtores
    public Aluno (){
        
    }
    
    public Aluno (int numeroAluno, String nomeAluno, int idade, double p1, double p2){
        this.setNumeroAluno(numeroAluno);
        this.setNomeAluno(nomeAluno);
        this.setIdade(idade);
        
    }
    
    public double notaFinal(){
        return (this.p1 + this.p2) / 2;
    }
    
    public String dadosAluno() {
        return "Numero Aluno: " + this.numeroAluno + " Nome aluno: " + this.nomeAluno + 
        " Idade: " + this.idade + " Nota final: " + this.notaFinal();
    }
    
    public void passou(){
        if(this.notaFinal() >= 6){
            System.out.println("Aluno aprovado");
        }
        else{
            System.out.println("Aluno reprovado");
        }
    }

    private void setNumeroAluno(int numeroAluno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setNomeAluno(String nomeAluno) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void setIdade(int idade) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
