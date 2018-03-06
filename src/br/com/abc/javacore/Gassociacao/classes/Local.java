package br.com.abc.javacore.Gassociacao.classes;

public class Local {
    private String bairro;
    private String rua;


    public Local() {
    }

    public Local(String bairro, String rua) {
        this.bairro = bairro;
        this.rua = rua;
    }

 public void imprime(){
     System.out.println("---------Relatorio Local---------");
     System.out.println("Rua "+this.rua);
     System.out.println("Bairro "+this.bairro);
 }
    // getters and setters

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }
}
