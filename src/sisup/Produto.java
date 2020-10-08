package sisup;

/**
 *
 * @author André Batista
 * @version 1
 */
public class Produto {

    private Integer codigo = null;
    private String descricao = null;
    private String cest = null;
    private String ncm = null;
    private Integer subgrup = null;
    private Integer grupo = null;
    private String grupotexto = null;
    private Integer marca = null;
    private Integer agrup = null;
    private String unidade = null;
    private String local = null;
    private Integer estoq = null;
    private Integer estoqmin = null;
    private Double porcentagem = null;
    private Double precocompra = null;
    private Integer calculo = null;
    private Double precovenda = null;
    private Double custaant = null;
    private Double vendaant = null;
    private Integer situa = null;
    private Integer mes = null;
    private Integer ano = null;
    private Integer inativo = null;

    public Integer getInativo() {
        return inativo;
    }

    public String getGrupotexto() {
        return grupotexto;
    }

    public void setGrupotexto(String grupotexto) {
        this.grupotexto = grupotexto;
    }

    public void setInativo(Integer inativo) {
        this.inativo = inativo;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;

    }

    public String getCest() {
        return cest;
    }

    public void setCest(String cest) {
        this.cest = cest;
    }

    public Integer getSubgrup() {
        return subgrup;
    }

    public void setSubgrup(Integer subgrup) {
        this.subgrup = subgrup;
    }

    public Integer getGrupo() {
        return grupo;
    }

    public void setGrupo(Integer grupo) {
        this.grupo = grupo;
        this.grupo = 1;

    }

    public Integer getMarca() {
        return marca;
    }

    public void setMarca(Integer marca) {
        this.marca = marca;
    }

    public Integer getAgrup() {
        return agrup;
    }

    public void setAgrup(Integer agrup) {
        this.agrup = agrup;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public Integer getEstoq() {
        return estoq;
    }

    public void setEstoq(Integer estoq) {
        this.estoq = estoq;
    }

    public Integer getEstoqmin() {
        return estoqmin;
    }

    public void setEstoqmin(Integer estoqmin) {
        this.estoqmin = estoqmin;
    }

    public Double getPorcentagem() {
        return porcentagem;
    }

    public void setPorcentagem(Double porcentagem) {
        this.porcentagem = porcentagem;
    }

    public Double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(Double precocompra) {
        this.precocompra = precocompra;
    }

    public Integer getCalculo() {
        return calculo;
    }

    public void setCalculo(Integer calculo) {
        if (calculo == null) {
            this.calculo = 0;
        } else if(calculo == 0) {
            this.calculo = 0;
        }else{
            this.calculo = calculo;
        }
    }

    public Double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(Double precovenda) {
        if (precovenda == null) {
            this.precovenda = 0.0;
        } else {
            this.precovenda = precovenda;
        }
    }

    public Double getCustaant() {
        return custaant;
    }

    public void setCustaant(Double custaant) {
        if (custaant == null) {
            this.custaant = 0.0;
        } else {
            this.custaant = custaant;
        }
    }

    public Double getVendaant() {
        return vendaant;
    }

    public void setVendaant(Double vendaant) {
        if (vendaant == null) {
            this.vendaant = 0.0;
        } else {
            this.vendaant = vendaant;
        }
    }

    public Integer getSitua() {

        return situa;
    }

    public void setSitua(Integer situa) {
        if (situa == null) {
            this.situa = 0;
        } else if (situa == 0) {
            this.situa = 0;
        } else {
            this.situa = 1;
        }
    }

    public Integer getMes() {

        return mes;
    }

    public void setMes(Integer mes) {
        if (mes == null) {
            this.mes = 01;

        } else {
            this.mes = mes;
        }
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        if (ano == null) {
            this.ano = 2017;
        } else {
            this.ano = ano;
        }
    }

    public String getNcm() {
        return ncm;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", descricao=" + descricao + ", cest=" + cest + ", ncm=" + ncm + ", subgrup=" + subgrup + ", grupo=" + grupo + ", marca=" + marca + ", agrup=" + agrup + ", unidade=" + unidade + ", local=" + local + ", estoq=" + estoq + ", estoqmin=" + estoqmin + ", porcentagem=" + porcentagem + ", precocompra=" + precocompra + ", calculo=" + calculo + ", precovenda=" + precovenda + ", custaant=" + custaant + ", vendaant=" + vendaant + ", situa=" + situa + ", mes=" + mes + ", ano=" + ano + ", inativo=" + inativo + '}';
    }

    public void setNcm(String ncm) {
        this.ncm = ncm;
    }

    /* public ResultSet getProduto(String tabela, String codigo) throws SQLException {
        Conexao con = new Conexao();
        con.Conectar();
        getI ResultSet rs = con.getProduto(codigo);

        return rs;
    }*/
}
