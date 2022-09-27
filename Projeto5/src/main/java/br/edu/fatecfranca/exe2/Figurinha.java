/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe2;

/**
 *
 * @author 1090482111037
 */
public class Figurinha {
    private int id;
    private String nome;
    private boolean especial;

    public Figurinha() {
    }

    public Figurinha(int id, String nome, boolean especial) {
        this.setId(id);
        this.setNome(nome);
        this.setEspecial(especial);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isEspecial() {
        return especial;
    }

    public void setEspecial(boolean especial) {
        this.especial = especial;
    }

    @Override
    public String toString() {
        return "Figurinha{" + "id=" + id + ", nome=" + nome + ", especial=" + especial + '}';
    }
    
    
    
    
}
