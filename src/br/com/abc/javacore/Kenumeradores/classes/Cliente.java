package br.com.abc.javacore.Kenumeradores.classes;

public class Cliente {

  public enum tipoPagamento{
        AVISTA,APRAZO;
    }
    private String nome;
    private TipoCliente tipoCliente;
    private tipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, tipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public Cliente() {
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", Tipo Cliente = " + tipoCliente.getNome()+ ", Tipo Pagamento: "+tipoPagamento +
                " , Numero: " +tipoCliente.getTipo();
    }

    public Cliente.tipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(Cliente.tipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}