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
public class Projeto2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Produto prod1 = new Produto();
       prod1.setNome("microfone");
       prod1.setQtde(-5);
       prod1.setPreco(-94.21);
       prod1.mostrar();
       System.out.println("Quantidade: " + prod1.getQtde());
       System.out.println("Nome: " + prod1.getNome());
       
       Rio rio1 = new Rio();
       rio1.setNome("Rio tiete");
       rio1.setNivel(15);
       rio1.setPoluido(true);
       System.out.println("Nome: " + rio1.getNome());
        
    }
}
