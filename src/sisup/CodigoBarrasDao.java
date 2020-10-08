package sisup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class CodigoBarrasDao {

    public void inserir(CodigoBarras cod) throws Exception {
        PreparedStatement ps;
        Connection con = Conexao.getInstancia();
        try {
            String codigo = "insert into arqbar(codigo, codpro, codbar, qntdemb, acresdesc, preco) values(?,?,?,?,?,?,?);";
            ps = con.prepareStatement(codigo);
            ps.setInt(1, cod.getCodigo());
            ps.setInt(2, cod.getCodpro());
            ps.setString(3, cod.getCodbar());
            ps.setInt(4, cod.getQntdemb());
            ps.setInt(5, cod.getAcresdesc());
            ps.setDouble(6, cod.getPreco());
            ps.setDouble(7, cod.getTotal());
            ps.execute();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro ao inserir um novo produto! Contate o Suporte Técnico! " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro inexperado! Contate o Suporte Técnico! " + e.getMessage());
        }
    }

    public CodigoBarras getCodigoBarras(String codigo) throws Exception {
        Connection con = Conexao.getInstancia();
        PreparedStatement ps = con.prepareStatement("Select * from arqbar where codpro =" + codigo);
        ResultSet rs = ps.executeQuery();
        CodigoBarras barras = new CodigoBarras();
        try {
            while (rs.next()) {
                barras.setCodigo(Integer.parseInt(rs.getString("codpro")));
                barras.setCodpro(rs.getInt("codpro"));
                barras.setCodbar(rs.getString("codbar"));
                barras.setQntdemb(rs.getInt("qntdemb"));
                barras.setAcresdesc(rs.getInt("acresdesc"));
                barras.setPreco(rs.getDouble("preco"));
                barras.setTotal(rs.getDouble("total"));
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Retornou algo invalido: " + e.getMessage());
        } finally {
            ps.close();
        }
        return barras;
    }

    public void excluir(CodigoBarras cb) throws Exception {
        try {
            PreparedStatement ps = null;
            Connection con = Conexao.getInstancia();
            String sql = "Delete from arqbar where codbar = ? and codpro = ?";
            ps = con.prepareStatement(sql);
            ps.setString(1, cb.getCodbar());
            ps.setInt(2, cb.getCodpro());
            ps.executeUpdate();

        } catch (Exception e) {
            throw e;
        }

    }

}
