package br.com.abc.javacore.Hheranca.classes;

public class Endereco {
    private String rua;
    private String bairro;

    public void imprime(){
        System.out.println("Rua: "+this.rua);

    }

    public void setRua (String rua){
        this.rua = rua;
    }

    public String getRua (){
        return rua;
    }

    public void setBairro(String bairro){
        this.rua = rua;
    }
}
