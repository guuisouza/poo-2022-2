/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.edu.fatecfranca.exe2;
import java.util.Date;
public class Testa {

    public static void main(String[] args) {
        Figurinha objFig = new Figurinha(2, "Neymar", true);
        Album objAlb = new Album(10, "Album Copa", "Album da copa 2022");
        Compra objCompra =  new Compra(1, new Date(), objAlb, objFig);
        System.out.println(objCompra.toString());
    }
}
