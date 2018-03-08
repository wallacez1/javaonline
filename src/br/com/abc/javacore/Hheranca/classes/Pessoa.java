package br.com.abc.javacore.Hheranca.classes;

public class Pessoa {
    /**
     * O modificador protected deixará visível o atributo para todas as outras classes e subclasses que pertencem ao mesmo pacote.
     * A principal diferença é que apenas as classes do mesmo pacote tem acesso ao membro.
     * O pacote da subclasse não tem acesso ao membro.
     */

    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    static {
        System.out.println("Bloco de inicializacao estatico");
    }
    {
        System.out.println("Bloco de inicializacao 1");
    }
    {
        System.out.println("Bloco de inicializacao 2");
    }

    // 1° Construtor
    public Pessoa(String nome) {
        System.out.println("Dentro construtor de pessoa");
        this.nome = nome;
    }

    // 2º com a opção de criar com cpf
    public Pessoa(String nome, String cpf) {
        // this(nome) herda do primeiro construtor, nao repete codigo
        this(nome);
        this.cpf = cpf;
    }

    static {
        System.out.println("Bloco de inicializacao estatico");
    }
    {
        System.out.println("Bloco de inicializacao 1");
    }
    {
        System.out.println("Bloco de inicializacao 2");
    }


    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua());
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
