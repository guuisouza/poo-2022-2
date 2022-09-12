/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto3.exe1;

import java.util.Date;

public final class Reserva {
    private int id;
    private Date Data;
    //Agregação
    private Passageiro passageiro;
    //Agregação
    private Voo voo;
    
    public Reserva(){
        
    }

    public Reserva(int id, Date Data, Passageiro passageiro, Voo voo) {
        this.setId(id);
        this.setData(Data);
        this.setPassageiro(passageiro);
        this.setVoo(voo);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getData() {
        return Data;
    }

    public void setData(Date Data) {
        this.Data = Data;
    }

    public Passageiro getPassageiro() {
        return passageiro;
    }

    public void setPassageiro(Passageiro passageiro) {
        this.passageiro = passageiro;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    @Override
    public String toString() {
        return "Reserva{" + "id=" + id + ", Data=" + Data + ", passageiro=" + passageiro + ", voo=" + voo + '}';
    }
    
    
}
