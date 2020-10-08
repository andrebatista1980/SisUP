package sisup;

/**
 *
 * @author andre
 */
public class Cliente extends Pessoa {

    private String cpf;
    private String rg;
    private String nomePai1;
    private String nomeMae;
    private Integer limite;
    private Integer clientePagador;

    public Cliente(String cpf, String rg, String nomePai, String nomeMae, Integer limite, Integer clientePagador, Integer codigo, String tipoPessoa, String nome, String apelido, Integer situacao, String endereco, Integer numero, String cep, Integer codigoCidade, String telefone, String telefoneCelular, String email) {
        super(codigo, tipoPessoa, nome, apelido, situacao, endereco, numero, cep, codigoCidade, telefone, telefoneCelular, email);
        this.cpf = cpf;
        this.rg = rg;
        this.nomePai1 = nomePai;
        this.nomeMae = nomeMae;
        this.limite = limite;
        this.clientePagador = clientePagador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        if (cpf.isEmpty()) {
            this.cpf = null;
        } else {
            this.cpf = cpf;
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        if (rg.isEmpty()) {
            this.rg = null;
        } else {
            this.rg = rg;
        }
    }

    public String getNomePai() {
        return nomePai1;
    }

    public void setNomePai(String nomePai) {
        if (nomePai.isEmpty()) {
            this.nomePai1 = null;
        } else {

            this.nomePai1 = nomePai;
        }

    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        if (nomeMae.isEmpty()) {
            this.nomeMae = null;
        } else {
            this.nomeMae = nomeMae;
        }
    }

    public Integer getLimite() {
        return limite;
    }

    public void setLimite(Integer limite) {
        this.limite = limite;
    }

    public Integer getClientePagador() {
        return clientePagador;
    }

    public void setClientePagador(Integer clientePagador) {
        this.clientePagador = clientePagador;
    }

    public Cliente() {
    }

    @Override
    public String toString() {
        return "Cliente{" + "cpf=" + cpf + ", rg=" + rg + ", nomePai=" + nomePai1 + ", nomeMae=" + nomeMae + ", limite=" + limite + ", clientePagador=" + clientePagador + '}';
    }

}
