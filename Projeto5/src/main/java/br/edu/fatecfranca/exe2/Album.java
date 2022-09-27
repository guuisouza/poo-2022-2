/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe2;

/**
 *
 * @author 1090482111037
 */
public class Album {
    private int id;
    private String nome;
    private String descricao;

    public Album() {
    }

    public Album(int id, String nome, String descricao) {
        this.setId(id);
        this.setNome(nome);
        this.setDescricao(descricao);
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Album{" + "id=" + id + ", nome=" + nome + ", descricao=" + descricao + '}';
    }
}
