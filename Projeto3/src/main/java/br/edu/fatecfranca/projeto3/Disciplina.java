/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.projeto3;

/**
 *
 * @author pc gaming
 */
public final class Disciplina {
    private int id;
    private String sigla;

    public Disciplina() {
    }

    public Disciplina(int id, String sigla) {
        this.setId(id);
        this.setSigla(sigla);
    }

    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return "Disciplina{" + "id=" + id + ", sigla=" + sigla + '}';
    }
}
