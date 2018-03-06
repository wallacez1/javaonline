package br.com.abc.javacore.Gassociacao.classes;

public class Aluno {
    private Seminario seminario;
    private String nome;
    private int idade;



    public Aluno() {
    }

    public Aluno(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void imprime(){
        System.out.println("---------Relatorio Aluno---------");
        System.out.println("Nome: "+this.nome);
        System.out.println("Idade: "+this.idade);
        if(this.seminario != null)
            System.out.println("Seminario: "+this.seminario.getTitulo());
        else
            System.out.println("Aluno não esta escrito em nenhum seminario");
    }

    // getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Seminario getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario seminario) {
        this.seminario = seminario;
    }
}
