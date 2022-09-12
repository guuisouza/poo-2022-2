/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.projeto3.exe1;

import java.util.Date;
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Passageiro objPass = new Passageiro("Fulano", "Franca", 1);
        Voo objVoo = new Voo(10, "São Paulo", "Recife");
        Reserva objReserva =  new Reserva(1, new Date(), objPass, objVoo);
        System.out.println(objReserva.toString());
        
        Voo obj2Voo = new Voo(20, "Campinas", "Belo Horizonte");
        Reserva obj2Reserva =  new Reserva(1, new Date(), objPass, obj2Voo);
        System.out.println(obj2Reserva.toString());
        
        Passageiro obj2Pass = new Passageiro("Thamy", "Franca", 1);
        Reserva obj3Reserva =  new Reserva(1, new Date(), obj2Pass, obj2Voo);
        System.out.println(obj3Reserva.toString());   
    }   
}
