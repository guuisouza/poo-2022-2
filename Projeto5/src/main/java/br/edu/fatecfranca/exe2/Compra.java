/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.fatecfranca.exe2;

/**
 *
 * @author 1090482111037
 */
import java.util.Date;
public class Compra {
    private int id;
    private Date date;
    //Agregação
    private Album album;
    private Figurinha figurinha;

    public Compra() {
    }

    public Compra(int id, Date date, Album album, Figurinha figurinha) {
        this.setId(id);
        this.setDate(date);
        this.setAlbum(album);
        this.setFigurinha(figurinha);
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public Figurinha getFigurinha() {
        return figurinha;
    }

    public void setFigurinha(Figurinha figurinha) {
        this.figurinha = figurinha;
    }

    @Override
    public String toString() {
        return "Compra{" + "id=" + id + ", date=" + date + ", album=" + album + ", figurinha=" + figurinha + '}';
    }
}
