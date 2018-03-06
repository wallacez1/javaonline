package br.com.abc.javacore.Gassociacao.test;

import br.com.abc.javacore.Gassociacao.classes.Aluno;
import br.com.abc.javacore.Gassociacao.classes.Local;
import br.com.abc.javacore.Gassociacao.classes.Professor;
import br.com.abc.javacore.Gassociacao.classes.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno("Wallace",23);
        Aluno aluno2 = new Aluno("Joana",20);

        Seminario seminario1 = new Seminario("Java online");
        Professor prof1 = new Professor("yoda","Programação orientada a objetos");
        Local loca1 = new Local("Vila São sebastiao","Porto Seguro");

        aluno1.setSeminario(seminario1);
        aluno2.setSeminario(seminario1);

        seminario1.setProfessor(prof1);
        seminario1.setLocal(loca1);

        seminario1.setAluno(new Aluno[]{aluno1,aluno2});

        prof1.setSeminario(new Seminario[]{seminario1});

        seminario1.imprime();
        prof1.imprime();
        aluno1.imprime();
        aluno2.imprime();
        loca1.imprime();


    }
}
