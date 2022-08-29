package projeto2.exe0;

//uma classe é algo abstrato, serve de modelo
//para a criação de objetos que são instânciados

public final class Produto {
    private String nome;
    private int qtde;
    private double preco;
    
    //metodo construtor vazio - deve ter o mesmo nome da classe
    public Produto(){
        
    }
    //metodo construtor para inicializar as variáveis - deve ter o mesmo nome da classe
    public Produto(String nome, int qtde, double preco){
        //this representa o objeto que chamou o método
        this.setNome(nome);
        this.setQtde(qtde);
        this.setPreco(preco);
    }
    //Metodos setters para conseguir utilizar uma variavel private
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public void setQtde (int qtde){  
        if (qtde >= 0){
            this.qtde = qtde;
        }
        else{
            System.out.println("Qtde não pode ser negativa");
        }
    }
    
    public void setPreco (double preco){  
        if (preco >= 0){
            this.preco = preco;
        }
        else{
            System.out.println("Preço não pode ser negativo");
        }
    }
    
    //Agora criando os getters para por exemplo imprimir valores, ele irá pegar e exibir
    public String getNome(){
        return this.nome;
    }
    public int getQtde (){
        return this.qtde;
    }
    public double getPreco(){
        return this.preco;
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