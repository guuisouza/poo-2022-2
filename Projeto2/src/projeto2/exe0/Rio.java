/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto2.exe0;

/**
 *
 * @author 1090482111037
 */
public final class Rio { //final faz com que a classe nao possa ser herdada
    private String nome;
    private double nivel;
    private boolean poluido; //
    
    public Rio (){
        
    }
    
    public Rio (String nome, double nivel, boolean poluido){
        this.setNome(nome);
        this.setNivel(nivel);
        this.setPoluido(poluido);    
    }
    
    //Criando os setters
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setNivel(double nivel){
        if (nivel >= 0){
            this.nivel = nivel;
        }
        else{
            System.out.println("Nivel não pode ser negativo");
        }
    }
    
    public void setPoluido (boolean poluido){
        this.poluido = poluido;
    }
    //Criando os getters
    public String getNome(){
        return this.nome;
    }
    
    public double getNivel(){
        return this.nivel;
    }
    
    public boolean isPoluido(){ //pra booleana ele faz o 'is'
        return this.poluido;
    }
    
    public void chover (double x){
        this.nivel += x;
    }
    public void ensolarar (double x){
        if (this.nivel >= 0) {
            this.nivel -= x;
        }
        else {
            System.out.println("O nivel não pode ser negativo");
        }
    }
    public void limpar(){
        if (this.poluido){
            this.poluido = false;
        }
        else {
            System.out.println("O rio já está limpo");
        }
    }
    public void sujar(){
        if (this.poluido){
            System.out.println("O rio já está poluido");
        }
        else {
            this.poluido = true;
        }
    }
    public void mostra(){
        System.out.println("Nome " + this.nome + " Nível: " + this.nivel + " Poluido: " + 
        (this.poluido ? "Sim" : "Não"));
    }
    
}
