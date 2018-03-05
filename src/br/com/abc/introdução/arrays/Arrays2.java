package br.com.abc.introdução.arrays;

import javax.print.DocFlavor;

public class Arrays2 {
    public static void main(String[] args) {
        String[] nomes = new String[3];

        nomes[0] = "Naruto";
        nomes[1] = "goku";
        nomes [2] = "wallace";

        for(int i=0;i<nomes.length;i++){
            System.out.println( (i+1) + " nome " + nomes[i]);
        }

        nomes =new String[4];

        for(int i=0;i<nomes.length;i++){
            System.out.println(nomes[i]);
        }

    }
}
