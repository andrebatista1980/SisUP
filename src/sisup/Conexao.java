package sisup;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author André Batista
 * @version 1
 */
public class Conexao {

    private static Connection con;

    Conexao() throws java.sql.SQLException {
        try {
            
            String conexao = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://127.0.0.1:3306/UpInfo?useSSL=false";
            String usuario = "root";
            String senha = "Marial@2";
            Class.forName(conexao);
            con = DriverManager.getConnection(url, usuario, senha);
            con.setAutoCommit(true);
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Erro de conexão com o Banco de Dados: " + ex.getMessage());
        }
    }

    public ResultSet getConsulta(String tabela) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("Select * from " + tabela);
        ResultSet rs = stmt.executeQuery();
        return rs;
    }

    public ResultSet getConsultaCodigo(String tabela, String campo, String codigo) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("Select * from " + tabela + " where " + campo + "=" + codigo);
        ResultSet rs = stmt.executeQuery();
        return rs;
    }

    public ResultSet getProduto(String codigo) throws SQLException {
        PreparedStatement stmt = con.prepareStatement("Select * from cadpro where codpro = " + codigo);
        ResultSet rs = stmt.executeQuery();
        return rs;
    }

    void FechaBanco() throws SQLException {
        con.close();
    }

    public ResultSet procuraProduto(String codigo) throws SQLException {
        PreparedStatement st = con.prepareStatement(" Select * from cadpro where codigo=" + codigo);
        ResultSet result = st.executeQuery();
        return result;
    }

    public int PegaUltimoRegistro(String tabela, String campo) throws SQLException {
        con.setAutoCommit(false);
        PreparedStatement stmt = con.prepareStatement("Select max(" + campo + ") as ultimocodigo from " + tabela);
        System.out.println(stmt);
        ResultSet rs = stmt.executeQuery();
        Integer codigo = null;
        while (rs.next()) {
            codigo = rs.getInt("ultimocodigo");
        }
        return codigo + 1;
    }

    public void setProduto(String insere) throws SQLException {
        con.setAutoCommit(true);
        PreparedStatement stmt = con.prepareStatement(insere);
        stmt.execute();
    }

    public static Connection getInstancia() throws Exception {
        if (con == null) {
            new Conexao();
        }
        return con;
    }
}
