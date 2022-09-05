/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projeto2.exe2;

/**
 *
 * @author 1090482111037
 */
public class Testa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno obj1 = new Aluno(123456, "Fulano", 19, 7, 9);
        obj1.notaFinal();
        obj1.dadosAluno();
        
        Aluno obj2 = new Aluno(123569, "Thamy", 17, 7, 10);
        obj2.notaFinal();
        obj2.dadosAluno();
    }
}
