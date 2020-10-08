package sisup;

public class Pessoa {

    private Integer codigo;
    private String nome;
    private String tipoPessoa;
    private String apelido;
    private Integer situacao;
    private String endereco;
    private Integer numero;
    private String cep;
    private Integer codigoCidade;
    private String telefone;
    private String telefoneCelular;
    private String email;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        if (apelido.isEmpty()) {
            this.apelido = null;
        } else {
            this.apelido = apelido;
        }
    }

    public Integer getSituacao() {
        return situacao;
    }

    public void setSituacao(Integer situacao) {
        this.situacao = situacao;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getCodigoCidade() {
        return codigoCidade;
    }

    public void setCodigoCidade(Integer codigoCidade) {
        this.codigoCidade = codigoCidade;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        if (telefone.isEmpty()) {
            this.telefone = null;
        } else {
            this.telefone = telefone;
        }
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        if (telefoneCelular.isEmpty()) {
            this.telefoneCelular = null;
        } else {
            this.telefoneCelular = telefoneCelular;
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.isEmpty()) {
            this.email = null;
        } else {
            this.email = email;
        }
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public Pessoa(Integer codigo, String tipoPessoa, String nome, String apelido, Integer situacao, String endereco, Integer numero, String cep, Integer codigoCidade, String telefone, String telefoneCelular, String email) {
        this.codigo = codigo;
        this.nome = nome;
        this.tipoPessoa = tipoPessoa;
        this.apelido = apelido;
        this.situacao = situacao;
        this.endereco = endereco;
        this.numero = numero;
        this.cep = cep;
        this.codigoCidade = codigoCidade;
        this.telefone = telefone;
        this.telefoneCelular = telefoneCelular;
        this.email = email;
    }

    public Pessoa() {
    }

    @Override
    public String toString() {
        return "Pessoa{" + "codigo=" + codigo + ", nome=" + nome + ", tipoPessoa=" + tipoPessoa + ", apelido=" + apelido + ", situacao=" + situacao + ", endereco=" + endereco + ", numero=" + numero + ", cep=" + cep + ", codigoCidade=" + codigoCidade + ", telefone=" + telefone + ", telefoneCelular=" + telefoneCelular + ", email=" + email + '}';
    }

}
