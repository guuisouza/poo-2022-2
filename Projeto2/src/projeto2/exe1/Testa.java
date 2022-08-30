/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto2.exe1;

/**
 *
 * @author 1090482111037
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cli1 = new Cliente("123456-7", "1234-5", "Fulano", 0);
        cli1.realizarDeposito(1000);
        cli1.realizarSaque(400);
        cli1.mostrar();
    }
    
}
