/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package projeto3.exe0;

import java.util.Date;

public class Cursa {
    private int codigo;
    private Date data;
    private Aluno aluno; //agregação definindo dentro de uma classe um objeto de uma outra classe
    //Definimos ou criamos um objeto parte dentro do objeto todo

    public Cursa() {
    }

    public Cursa(int codigo, Date data, Aluno aluno) {
        this.setCodigo(codigo);
        this.setData(data);
        this.setAluno(aluno);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }   
}
