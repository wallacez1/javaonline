package br.com.abc.javacore.Gassociacao.classes;

public class Seminario {
    private Local local;
    private Professor professor;
    private Aluno[] aluno;
    private String titulo;

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }
    public void imprime(){
        System.out.println("---------Relatorio Seminario---------");
        System.out.println("Titulo "+this.titulo);
        System.out.println("Professor Palestrante: "+ this.professor.getNome());
        System.out.println("Local, Rua: "+ this.local.getRua () + " Bairro: " + this.local.getBairro());

        for(Aluno aluno : aluno){
            System.out.print("Participante: ");
            System.out.println(aluno.getNome() + "  Idade: "+aluno.getIdade());
        }
    }

    // getters and setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
