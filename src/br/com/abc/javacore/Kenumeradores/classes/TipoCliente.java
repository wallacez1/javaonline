package br.com.abc.javacore.Kenumeradores.classes;

public enum TipoCliente {
    PESSOA_JURIDICA(1, "Pessoa Juridica"), PESSOA_FISICA(2, "Pessoa Fisica"){
        public String getid(){
            return "B";
        }
    };

    private int tipo;
    private String nome;

    TipoCliente(int tipo, String cliente) {
        this.tipo = tipo;
        this.nome = cliente;
    }

    public String getid(){
        return "A";
    }

    public int getTipo() { return tipo; }

    public String getNome() { return nome; }
}
