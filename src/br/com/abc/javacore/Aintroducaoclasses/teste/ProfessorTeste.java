package br.com.abc.javacore.Aintroducaoclasses.teste;

import br.com.abc.javacore.Aintroducaoclasses.classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {

        Professor prof = new Professor();

        prof.nome = "wallace";
        prof.matricula = "124786";
        prof.cpf = "148723";
        prof.rg = "89654";

        System.out.println(prof.cpf);
        System.out.println(prof.rg);
        System.out.println(prof.matricula);
        System.out.println(prof.nome);

    }
}
