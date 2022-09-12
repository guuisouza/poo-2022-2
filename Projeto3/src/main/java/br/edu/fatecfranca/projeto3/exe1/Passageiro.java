
package br.edu.fatecfranca.projeto3.exe1;

public final class Passageiro {
    private String nome, cidade;
    private int id;

    public Passageiro() {
    }

    public Passageiro(String nome, String cidade, int id) {
        this.setNome(nome);
        this.setCidade(cidade);
        this.setId(id);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Passageiro{" + "nome=" + nome + ", cidade=" + cidade + ", id=" + id + '}';
    }
    
    
    
    
}
