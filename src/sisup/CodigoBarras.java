package sisup;

/**
 *
 * @author andre
 */
public class CodigoBarras {
    private Integer codigo;
    private Integer codpro;
    private String codbar;
    private Integer qntdemb;
    private Integer acresdesc;
    private Double preco;
    private Double total;

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        
        this.codigo = codigo;
        
    }

    public Integer getCodpro() {
        return codpro;
    }

    public void setCodpro(Integer codpro) {
        this.codpro = codpro;
    }

    public String getCodbar() {
        return codbar;
    }

    public void setCodbar(String codbar) {
        this.codbar = codbar;
    }

    public Integer getQntdemb() {
        return qntdemb;
    }

    public void setQntdemb(Integer qntdemb) {
        this.qntdemb = qntdemb;
    }

    public Integer getAcresdesc() {
        return acresdesc;
    }

    public void setAcresdesc(Integer acresdesc) {
        this.acresdesc = acresdesc;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

}
