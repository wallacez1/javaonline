package br.com.abc.introdução.operadores;

public class SwitchExercicio {
    public static void main(String[] args) {
        byte dia = 3;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("Fim De Semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia Util");
                break;
            default:
                System.out.println("Opção Invalida");
        }
    }
}
