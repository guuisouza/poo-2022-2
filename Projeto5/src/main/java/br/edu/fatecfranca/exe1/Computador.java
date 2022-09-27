/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe1;

/**
 *
 * @author 1090482111037
 */
public final class Computador {
    private String modo;
    private int memoria;

    public Computador() {
    }

    public Computador(String modo, int memoria) {
        this.setModo(modo);
        this.setMemoria(memoria);
    }

    public String getModo() {
        return modo;
    }

    public void setModo(String modo) {
        this.modo = modo;
    }

    public int getMemoria() {
        return memoria;
    }

    public void setMemoria(int memoria) {
        if (memoria == 4|| memoria == 8|| memoria == 16|| memoria == 32){
          this.memoria = memoria;
        } 
        else System.out.println("Número inválido");
    }
    public void upgradeRam(int x){
        this.setMemoria(this.memoria + x);
    }   
}
