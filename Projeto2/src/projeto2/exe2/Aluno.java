/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projeto2.exe2;

/**
 *
 * @author monitorlab4
 */
public class Aluno {
    private String nroAluno;
    private String nome;
    private int idade;
    private double p1;
    private double p2;
    
    public Aluno(){
        
    }
    
    public Aluno( String nroAluno, String nome, int idade, double p1, double p2){
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public void setNroAluno(String nroAluno){
        if(nroAluno.length() == 6){
            this.nroAluno = nroAluno;
        }
        else System.out.println("Tamanho inválido");
        
    }
}
