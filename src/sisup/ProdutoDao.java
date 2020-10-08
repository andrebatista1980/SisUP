package sisup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author André Batista
 * @version 1
 */
public class ProdutoDao {

    public void inserir(Produto p) throws Exception {
        PreparedStatement ps = null;
        Connection con = Conexao.getInstancia();
        try {
            String sql = "insert into cadpro ( codpro, descpro, ncmpro, cestpro, subgrupopro, grupopro,"
                    + " marcapro,agrupro, unidadepro, localpro, estoquepro, estoqminpro, porcetpro, precompro, "
                    + "calculopro,prevenpro, custoantpro, vendaantpro, situacaopro, mesinativopro, anoinativopro ) "
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getCodigo());
            ps.setString(2, p.getDescricao());
            ps.setString(3, p.getNcm());
            ps.setString(4, p.getCest());
            ps.setInt(5, p.getSubgrup());
            ps.setInt(6, p.getGrupo());
            ps.setInt(7, p.getMarca());
            ps.setInt(8, p.getAgrup());
            ps.setString(9, p.getUnidade());
            ps.setString(10, p.getLocal());
            ps.setInt(11, p.getEstoq());
            ps.setInt(12, p.getEstoqmin());
            ps.setDouble(13, p.getPorcentagem());
            ps.setDouble(14, p.getPrecocompra());
            ps.setInt(15, p.getCalculo());
            ps.setDouble(16, p.getPrecovenda());
            ps.setDouble(17, p.getCustaant());
            ps.setDouble(18, p.getVendaant());
            ps.setDouble(19, p.getInativo());
            ps.setDouble(20, p.getMes());
            ps.setDouble(21, p.getAno());
            ps.executeUpdate();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao inserir um novo produto: " + e.getMessage());
        }
    }

    public int getUltimoCodigo() throws SQLException, Exception {
        Connection con = Conexao.getInstancia();
        PreparedStatement stmt = con.prepareStatement("Select max(codpro+1) as ultimocodigo from cadpro;");
        ResultSet rs = stmt.executeQuery();
        Integer codigo = null;
        if (rs.next()) {
            codigo = rs.getInt("ultimocodigo");
        }
        return codigo;
    }

    public Produto getProduto(Integer codigo) throws Exception {
        Connection con = Conexao.getInstancia();
        PreparedStatement ps = con.prepareStatement("Select * from cadpro where codpro =" + codigo);
        ResultSet rs = ps.executeQuery();
        Produto prod = new Produto();
        try {
            while (rs.next()) {
                prod.setCodigo(Integer.parseInt(rs.getString("codpro")));
                prod.setDescricao(rs.getString("descpro"));
                prod.setNcm(rs.getString("ncmpro"));
                prod.setCest(rs.getString("cestpro"));
                prod.setSubgrup(Integer.parseInt(rs.getString("subgrupopro")));
                prod.setGrupo(Integer.parseInt(rs.getString("grupopro")));
                prod.setMarca(Integer.parseInt(rs.getString("marcapro")));
                prod.setAgrup(Integer.parseInt(rs.getString("agrupro")));
                prod.setLocal(rs.getString("localpro"));
                prod.setEstoq(Integer.parseInt(rs.getString("estoquepro")));
                prod.setEstoqmin(Integer.parseInt(rs.getString("estoqminpro")));
                prod.setPorcentagem(Double.parseDouble(rs.getString("porcetpro")));
                prod.setPrecocompra(Double.parseDouble(rs.getString("precompro")));
                prod.setCalculo(Integer.parseInt(rs.getString("calculopro")));
                prod.setPrecovenda(Double.parseDouble(rs.getString("prevenpro")));
                prod.setCustaant(Double.parseDouble(rs.getString("custoantpro")));
                prod.setVendaant(Double.parseDouble(rs.getString("vendaantpro")));
                prod.setSitua(Integer.parseInt(rs.getString("situacaopro")));
                Integer sit = prod.getSitua();
                if (sit == 0) {
                    break;
                } else {
                    prod.setMes(Integer.parseInt(rs.getString("mesinativopro")));
                    prod.setAno(Integer.parseInt(rs.getString("anoinativopro")));
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Retornou algo invalido: " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro. Contate o Suporte Técnico! " + e.getMessage());
        } finally {
            ps.close();
        }
        return prod;
    }

    public String getGrupo(Integer codigo) throws Exception {
        Produto prod = null;
        String grupoTexto = null;
        Connection con = Conexao.getInstancia();
        PreparedStatement stmt = con.prepareStatement("Select grupogru from cadgru where codgru=" + codigo);
        ResultSet rs = stmt.executeQuery();
        try {
            while (rs.next()) {
                grupoTexto = rs.getString("Grupogru");
            }
        } catch (Exception e) {
            throw (e);
        }
        return grupoTexto;
    }

}
