package br.com.abc.javacore.Bintroducaometodos.teste;

import br.com.abc.javacore.Bintroducaometodos.Classes.Professor;

public class ProfessorTeste {
    public static void main(String[] args) {
        Professor prof = new Professor();
        Professor prof2 = new Professor();
         prof.nome= "wallace";
         prof.matricula = "12245";
         prof.rg = "1246687";
         prof.cpf = "14876632";

        prof2.nome= "joana";
        prof2.matricula = "04456";
        prof2.rg = "44562";
        prof2.cpf = "554111";


        prof.imprime();
        prof2.imprime();




    }

}
