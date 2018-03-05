package br.com.abc.javacore.Bintroducaometodos.Classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void printDadosAluno()

    {
        System.out.println("Nome " + this.nome);
        System.out.println("idade " + this.idade);
        for (double nota : this.notas) {
            System.out.print("Nota " + nota + " ");
        }

    }

    public void imprimeMedia() {
        double media = 0;

        for (double num : this.notas) {
            media += num;
        }
        media = media / this.notas.length;

        if (media >= 6) {
            this.aprovado = true;
            System.out.println("\naluno " + this.nome + " media " + media + " Aprovado");
        } else {
            this.aprovado = false;
            System.out.println("\naluno " + this.nome + "  media " + media + " Reprovado ");
        }
    }


 // getters and setters

    public void setNome(String nome){ this.nome = nome; }

    public void setIdade(int idade){ this.idade = idade; }

    public void setNotas(double[] notas){ this.notas = notas; }




    public String getNome(){ return this.nome; }

    public int getIdade(){ return  this.idade;}

    public double[] getNotas(){ return this.notas;}

    public boolean getAprovado(){ return this.aprovado;}

}

