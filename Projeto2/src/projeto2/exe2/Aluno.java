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
public final class Aluno {
    private int nroAluno;
    private String nome;
    private int idade;
    private double p1;
    private double p2;
    
    public Aluno(){ //construtor sem parametro
        
    }
    
    public Aluno(int nroAluno, String nome, int idade, double p1, double p2){ //construtor com parametro
        this.setNroAluno(nroAluno);
        this.setNome(nome);
        this.setIdade(idade);
        this.setP1(p1);
        this.setP2(p2);
    }
    
    public void setNroAluno(int nroAluno){
        //converter int para String
        if (Integer.toString(nroAluno).length() == 6){
            this.nroAluno = nroAluno;
        }
        else System.out.println("Tamanho inválido");
    }
    public void setNome(String nome){
        if(nome.length() <= 30){
            this.nome = nome;
        }
        else System.out.println("Tamanho inválido");
    }
    public void setIdade (int idade){
        if (idade>=0){
            this.idade = idade;
        }
        else System.out.println("Idade inválida");
    }
    public void setP1 (double p1){
        if (p1>=0){
            this.p1 = p1;
        }
        else System.out.println("A nota não pode ser negativa");
    }
    public void setP2 (double p2){
        if (p2>=0){
            this.p2 = p2;
        }
        else System.out.println("A nota não pode ser negativa");
    }
    //Criando getters
    public int getNroAluno(){
        return this.nroAluno;
    }
    public String getNome(){
        return this.nome;
    }
    public int getIdade(){
        return this.idade;
    }
    public double getP1(){
        return this.p1;
    }
    public double getP2(){
        return this.p2;
    }
    //Criando os metodos
    public void notaFinal(){
        double media = (this.p1 + this.p2)/2;
        System.out.println("A nota final do aluno é: " + media);
    }
    public void dadosAluno(){
        System.out.println("Número: " + this.nroAluno + " Nome: " + this.nome + " Idade: " + this.idade);
    }
}
