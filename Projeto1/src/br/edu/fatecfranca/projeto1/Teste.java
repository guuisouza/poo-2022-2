package br.edu.fatecfranca.projeto1;

import br.edu.fatecfranca.projeto1.ex0.Produto;

public class Teste {

    public static void main(String[] args) {
      //vamos criar um objeto da classe produto
      //estamos instanciando a classe Produto
      //ou criando uma instância da classe produto
      Produto obj1 = new Produto();
      obj1.nome = "Bola de basquete";
      obj1.qtde = 3;
      obj1.preco = 90.40;
      obj1.mostrar();
      obj1.comprar(2);
      obj1.vender(1);
      obj1.mostrar();
      
      Produto obj2 = new Produto ("Máscara para Covid-19", 5, 5.20); //chama o metodo construtor
      obj2.mostrar();
      obj2.comprar(2);
      obj2.subir(3);
      obj2.mostrar();
      
      Produto obj3 = new Produto ("Almoço", 2, 12.90); //chama o metodo construtor
      obj3.mostrar();
    }
}
