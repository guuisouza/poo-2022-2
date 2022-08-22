package br.edu.fatecfranca.projeto1.ex0;

//uma classe é algo abstrato, serve de modelo
//para a criação de objetos que são instânciados

public class Produto {
    public String nome;
    public int qtde;
    public double preco;
    
    //metodo construtor vazio - deve ter o mesmo nome da classe
    public Produto(){
        
    }
    //metodo construtor para inicializar as variáveis - deve ter o mesmo nome da classe
    public Produto(String nome, int qtde, double preco){
        //this representa o objeto que chamou o método
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;
    }
    //comprar um produto
    public void comprar (int x){
        this.qtde = this.qtde + x;
    }
    //vender um produto
    public void vender (int x){
        if(x <= this.qtde){
            this.qtde = this.qtde - x;
        }    
    }
    public void subir (double x){
        this.preco += x;
    }
    public void descer (double x){
        if(x<= this.preco) {
            this.preco -= x;
        }
    }
    public void mostrar(){
        System.out.println("Dados Nome: " + this.nome + " Qtde " + this.qtde + " Preço " + this.preco);
    }    
}