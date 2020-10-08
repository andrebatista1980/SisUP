/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup;

/**
 *
 * @author andre
 */
public class Fornecedor extends Pessoa {

    private String cnpj;
    private String inscricaoEstadual;

    public Fornecedor(String cnpj, String inscricaoEstadual, Integer codigo, String tipoPessoa, String nome, String apelido, Integer situacao, String endereco, Integer numero, String cep, Integer codigoCidade, String telefone, String telefoneCelular, String email) {
        super(codigo, tipoPessoa, nome, apelido, situacao, endereco, numero, cep, codigoCidade, telefone, telefoneCelular, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

  
}
