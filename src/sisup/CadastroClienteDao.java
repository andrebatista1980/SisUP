/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author andre
 */
public class CadastroClienteDao {

    public void inserir(Cliente cliente) throws Exception {
        Connection con = Conexao.getInstancia();
        PreparedStatement ps;
        try {
            String sql = "insert into cadPessoa (codigoPessoa, nomePessoa, tipoPessoa, apelidoPessoa, situacaoPessoa, enderecoPessoa,numeroPessoa, cepPessoa, codigoCidadePessoa, telefonePessoa, celularPessoa, emailPessoa) values (?,?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getNome());
            ps.setString(3, cliente.getTipoPessoa());
            ps.setString(4, cliente.getApelido());
            ps.setInt(5, cliente.getSituacao());
            ps.setString(6, cliente.getEndereco());
            ps.setInt(7, cliente.getNumero());
            ps.setString(8, cliente.getCep());
            ps.setInt(9, cliente.getCodigoCidade());
            ps.setString(10, cliente.getTelefone());
            ps.setString(11, cliente.getTelefoneCelular());
            ps.setString(12, cliente.getEmail());
            System.out.println(ps);
            ps.execute();

            sql = "insert into cadCliente (codigoCliente, cpfCliente, rgCliente, nomePaiCliente, nomeMaeCliente, clientePagadorCliente, limiteCliente) values (?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getCodigo());
            ps.setString(2, cliente.getCpf());
            ps.setString(3, cliente.getRg());
            ps.setString(4, cliente.getNomePai());
            ps.setString(5, cliente.getNomeMae());
            ps.setInt(6, cliente.getClientePagador());
            ps.setDouble(7, cliente.getLimite());
            System.out.println(ps);
            ps.execute();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro ao inserir um novo cliente! Contate o Suporte Técnico! " + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro inexperado! Contate o Suporte Técnico! " + e.getMessage());
        }

    }

    public Integer procuraCpf(String cpf) throws Exception {

        Connection con = Conexao.getInstancia();
        PreparedStatement stmt = con.prepareStatement("Select * from cadCliente where cpfCliente= '" + cpf + "';");
        ResultSet rs = stmt.executeQuery();
        Integer cod = null;
        try {
            while (rs.next()) {
                cod = rs.getInt("codigoCliente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro inexperado! Contate o Suporte Técnico! " + e.getMessage());
        }
        return cod;

    }

}
