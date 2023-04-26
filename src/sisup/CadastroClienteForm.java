/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sisup;

import java.awt.Component;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
/**
 *
 * @author andre
 */
public class CadastroClienteForm extends CadBase {

    Cliente cliente = new Cliente();
    CadastroClienteDao clienteDao = new CadastroClienteDao();
    ValidaCpf validaCpf = new ValidaCpf();
    ValidaCnpj validaCnpj = new ValidaCnpj();

    /**
     * Creates new form CadCli
     */
    public CadastroClienteForm() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        LblCodigo = new javax.swing.JLabel();
        EdtCodigo = new javax.swing.JTextField();
        LblNome = new javax.swing.JLabel();
        EdtNome = new javax.swing.JTextField();
        LblCpf = new javax.swing.JLabel();
        EdtCpf = new javax.swing.JFormattedTextField();
        LblRg = new javax.swing.JLabel();
        EdtRg = new javax.swing.JTextField();
        LblEndereco = new javax.swing.JLabel();
        EdtEndereco = new javax.swing.JTextField();
        LblNumero = new javax.swing.JLabel();
        EdtNumero = new javax.swing.JTextField();
        LblCep = new javax.swing.JLabel();
        EdtCep = new javax.swing.JFormattedTextField();
        RdbPfisica = new javax.swing.JRadioButton();
        RdbPJuridica = new javax.swing.JRadioButton();
        LblApelido = new javax.swing.JLabel();
        EdtApelido = new javax.swing.JTextField();
        LblSituacao = new javax.swing.JLabel();
        LblCidade = new javax.swing.JLabel();
        EdtCidade = new javax.swing.JTextField();
        LblCidadeR = new javax.swing.JLabel();
        LblEstado = new javax.swing.JLabel();
        LblEstadoR = new javax.swing.JLabel();
        LblPais = new javax.swing.JLabel();
        LblPaisR = new javax.swing.JLabel();
        EdtSituacao = new javax.swing.JComboBox<>();
        LblTelefone = new javax.swing.JLabel();
        EdtFone = new javax.swing.JFormattedTextField();
        LblCelular = new javax.swing.JLabel();
        EdtCelular = new javax.swing.JFormattedTextField();
        LblEmail = new javax.swing.JLabel();
        EdtEmail = new javax.swing.JTextField();
        Lblnomepai = new javax.swing.JLabel();
        EdtNomePai = new javax.swing.JTextField();
        EdtNomeMae = new javax.swing.JTextField();
        LblNomemae = new javax.swing.JLabel();
        LblLimite = new javax.swing.JLabel();
        EdtLimite = new javax.swing.JTextField();
        LblClientePagador = new javax.swing.JLabel();
        EdtCodCliPag = new javax.swing.JTextField();
        LblClienteR = new javax.swing.JLabel();
        BtoPesquisar = new javax.swing.JButton();
        BtoSalvar = new javax.swing.JButton();
        BtoAlterar = new javax.swing.JButton();
        BtoExcluir = new javax.swing.JButton();
        BtoCancelar = new javax.swing.JButton();
        BtoSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Cliente");
        setAlwaysOnTop(true);
        setIconImages(null);
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("CadCli"); // NOI18N
        setPreferredSize(new java.awt.Dimension(700, 300));
        setSize(new java.awt.Dimension(700, 300));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        LblCodigo.setText("Código.:");

        EdtCodigo.setToolTipText("Codigo do produto");
        EdtCodigo.setNextFocusableComponent(RdbPfisica);

        LblNome.setText("Nome.:");

        EdtNome.setToolTipText("Nome/Razão Social do Cliente");
        EdtNome.setNextFocusableComponent(EdtApelido);
        EdtNome.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EdtNomeFocusLost(evt);
            }
        });
        EdtNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdtNomeActionPerformed(evt);
            }
        });

        LblCpf.setText("CPF.:");

        try {
            EdtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        EdtCpf.setToolTipText("Cpf/Cnpj do Cliente");
        EdtCpf.setNextFocusableComponent(EdtRg);
        EdtCpf.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EdtCpfFocusLost(evt);
            }
        });

        LblRg.setText("RG.:");

        EdtRg.setToolTipText("RG/Inscrição Estadual");
        EdtRg.setNextFocusableComponent(EdtNome);

        LblEndereco.setText("Endereço.:");

        EdtEndereco.setToolTipText("Endereço do Cliente");
        EdtEndereco.setNextFocusableComponent(EdtNumero);

        LblNumero.setText("Numero.:");

        EdtNumero.setToolTipText("Numero");
        EdtNumero.setNextFocusableComponent(EdtCep);

        LblCep.setText("CEP.:");

        try {
            EdtCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        EdtCep.setToolTipText("Cep Do Cliente");
        EdtCep.setNextFocusableComponent(EdtCidade);

        buttonGroup1.add(RdbPfisica);
        RdbPfisica.setText("Pessoa Física");
        RdbPfisica.setToolTipText("Pessoa Física/Jurídica");
        RdbPfisica.setNextFocusableComponent(EdtCpf);
        RdbPfisica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdbPfisicaActionPerformed(evt);
            }
        });

        buttonGroup1.add(RdbPJuridica);
        RdbPJuridica.setText("Pessoa Jurídica");
        RdbPJuridica.setToolTipText("Pessoa Física/Jurídica");
        RdbPJuridica.setNextFocusableComponent(EdtCpf);
        RdbPJuridica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RdbPJuridicaActionPerformed(evt);
            }
        });

        LblApelido.setText("Apelido.:");

        EdtApelido.setToolTipText("Apelido/Nome Fantasia");
        EdtApelido.setNextFocusableComponent(EdtSituacao);

        LblSituacao.setText("Situação.:");

        LblCidade.setText("Cidade.:");

        EdtCidade.setToolTipText("Codigo da Cidade ");
        EdtCidade.setNextFocusableComponent(EdtFone);

        LblCidadeR.setText("Cidade");

        LblEstado.setText("Estado.:");

        LblEstadoR.setText("Estado");
        LblEstadoR.setToolTipText("Estado do Cliente");

        LblPais.setText("País.:");

        LblPaisR.setText("País");
        LblPaisR.setToolTipText("Pais do Cliente ");

        EdtSituacao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo", "Inadimplente", "Suspenso", "Bloqueado" }));
        EdtSituacao.setToolTipText("Situação do Cliente");
        EdtSituacao.setNextFocusableComponent(EdtEndereco);
        EdtSituacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdtSituacaoActionPerformed(evt);
            }
        });

        LblTelefone.setText("Telefone.:");

        try {
            EdtFone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) ####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        EdtFone.setToolTipText("Telefone do Cliente");
        EdtFone.setNextFocusableComponent(EdtCelular);

        LblCelular.setText("Celular.:");

        try {
            EdtCelular.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##) #####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        EdtCelular.setToolTipText("Celular do Cliente");
        EdtCelular.setNextFocusableComponent(EdtEmail);

        LblEmail.setText("Email.:");

        EdtEmail.setToolTipText("Email do Cliente");
        EdtEmail.setNextFocusableComponent(EdtNomePai);

        Lblnomepai.setText("Nome Pai.:");

        EdtNomePai.setToolTipText("Nome do Pai do Cliente");
        EdtNomePai.setNextFocusableComponent(EdtNomeMae);

        EdtNomeMae.setToolTipText("Nome da Mãe do Cliente");
        EdtNomeMae.setNextFocusableComponent(EdtLimite);

        LblNomemae.setText("Nome Mãe.:");

        LblLimite.setText("Limite.:");

        EdtLimite.setToolTipText("Limite do Cliente");
        EdtLimite.setNextFocusableComponent(EdtCodCliPag);

        LblClientePagador.setText("Cliente Pagador.:");

        EdtCodCliPag.setToolTipText("Codigo do Cliente Pagador");
        EdtCodCliPag.setNextFocusableComponent(BtoSalvar);
        EdtCodCliPag.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdtCodCliPagActionPerformed(evt);
            }
        });

        LblClienteR.setText("Cliente");
        LblClienteR.setToolTipText("Cliente Pagador");

        BtoPesquisar.setText("Pesquisar");

        BtoSalvar.setText("Salvar");
        BtoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSalvarActionPerformed(evt);
            }
        });

        BtoAlterar.setText("Alterar");
        BtoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoAlterarActionPerformed(evt);
            }
        });

        BtoExcluir.setText("Excluir");

        BtoCancelar.setText("Cancelar");
        BtoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoCancelarActionPerformed(evt);
            }
        });

        BtoSair.setText("Sair");
        BtoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblNome)
                                    .addComponent(EdtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblApelido)
                                    .addComponent(EdtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblSituacao)
                                    .addComponent(EdtSituacao, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EdtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblEndereco))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(LblNumero)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LblCep))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(EdtCep, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblCidade)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LblCidadeR)))
                                .addGap(135, 135, 135)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblEstado)
                                    .addComponent(LblEstadoR))
                                .addGap(151, 151, 151)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblPaisR)
                                    .addComponent(LblPais)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(RdbPfisica)
                                        .addGap(18, 18, 18)
                                        .addComponent(RdbPJuridica))
                                    .addComponent(LblCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblCpf))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblRg)
                                    .addComponent(EdtRg, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblTelefone)
                                .addGap(65, 65, 65)
                                .addComponent(LblCelular)
                                .addGap(74, 74, 74)
                                .addComponent(LblEmail))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EdtFone, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(EdtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(EdtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblLimite)
                                    .addComponent(EdtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtCodCliPag, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LblClienteR))
                                    .addComponent(LblClientePagador))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 58, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Lblnomepai)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(EdtNomePai))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(LblNomemae))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(EdtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(86, 86, 86)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtoAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtoPesquisar, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                    .addComponent(BtoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BtoSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblCodigo)
                    .addComponent(LblCpf)
                    .addComponent(LblRg))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(RdbPfisica)
                            .addComponent(RdbPJuridica)
                            .addComponent(EdtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtRg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblNome)
                            .addComponent(LblApelido)
                            .addComponent(LblSituacao))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtApelido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtSituacao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblEndereco)
                            .addComponent(LblNumero)
                            .addComponent(LblCep))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblCidade)
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EdtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblCidadeR)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblEstado)
                                    .addComponent(LblPais))
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblEstadoR)
                                    .addComponent(LblPaisR))))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblTelefone)
                            .addComponent(LblCelular)
                            .addComponent(LblEmail))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtFone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Lblnomepai)
                            .addComponent(LblNomemae))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtNomePai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtNomeMae, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblLimite)
                            .addComponent(LblClientePagador))
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtLimite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtCodCliPag, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblClienteR)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtoPesquisar)
                        .addGap(10, 10, 10)
                        .addComponent(BtoSalvar)
                        .addGap(18, 18, 18)
                        .addComponent(BtoAlterar)
                        .addGap(18, 18, 18)
                        .addComponent(BtoExcluir)
                        .addGap(18, 18, 18)
                        .addComponent(BtoCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(BtoSair)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Cadastro Cliente");

        setSize(new java.awt.Dimension(810, 416));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void RdbPJuridicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdbPJuridicaActionPerformed
        verificaBotoes();

    }//GEN-LAST:event_RdbPJuridicaActionPerformed
    public void salvarRegistro() throws Exception {
        cliente.setCodigo(Integer.valueOf(EdtCodigo.getText()));
        cliente.setNome(EdtNome.getText());
        cliente.setCpf(EdtCpf.getText());
        cliente.setRg(EdtRg.getText());
        cliente.setApelido(EdtApelido.getText());
        cliente.setSituacao(EdtSituacao.getSelectedIndex());
        cliente.setEndereco(EdtEndereco.getText());
        cliente.setNumero(Integer.parseInt(EdtNumero.getText()));
        cliente.setCep(EdtCep.getText());
        cliente.setCodigoCidade(Integer.parseInt(EdtCidade.getText()));
        cliente.setTelefone(EdtFone.getText());
        cliente.setTelefoneCelular(EdtCelular.getText());
        cliente.setEmail(EdtEmail.getText());
        cliente.setNomePai(EdtNomePai.getText());
        cliente.setNomeMae(EdtNomeMae.getText());
        cliente.setLimite(Integer.parseInt(EdtLimite.getText()));
        cliente.setClientePagador(Integer.parseInt(EdtCodCliPag.getText()));

        if (RdbPfisica.isSelected()) {
            cliente.setTipoPessoa(RdbPfisica.getText());
        } else if (RdbPJuridica.isSelected()) {
            cliente.setTipoPessoa(RdbPJuridica.getText());
        }
        cliente.toString();

        clienteDao.inserir(cliente);

    }

    private void RdbPfisicaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RdbPfisicaActionPerformed
        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField field = (JTextField) c;
                field.setText("");
            }
        }
        verificaBotoes();
    }//GEN-LAST:event_RdbPfisicaActionPerformed

    private void BtoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSairActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_BtoSairActionPerformed

    private void BtoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoCancelarActionPerformed
        // TODO add your handling code here:
        
        for (int i = 0; i < getContentPane().getComponentCount(); i++) {
            //varre todos os componentes
            Component c = getContentPane().getComponent(i);
            if (c instanceof JTextField) {
                //apaga os valores
                JTextField field = (JTextField) c;
                field.setText("");
            }
        }


    }//GEN-LAST:event_BtoCancelarActionPerformed

    private void BtoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoAlterarActionPerformed
        bloqueiaCampos();
    }//GEN-LAST:event_BtoAlterarActionPerformed

    private void BtoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSalvarActionPerformed
        
        try {
            salvarRegistro();
        } catch (Exception ex) {
            Logger.getLogger(CadastroClienteForm.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Ocorreu um erro " +ex.getMessage());
        }
        
      BtoCancelar.doClick();
        /* for (int i = 0; i < letra[0].Length(); i++) {
            for (int j = 0; j < num[0].length; j++) {

                System.out.println(letra[i][j]);
                System.out.println(num[i][j]);

            }
        }
         */
    }//GEN-LAST:event_BtoSalvarActionPerformed

    private void EdtSituacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdtSituacaoActionPerformed
        opcoescadcli();
    }//GEN-LAST:event_EdtSituacaoActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        BtoAlterar.setEnabled(false);
        BtoExcluir.setEnabled(false);
        
        
        
        
        try {
            Conexao conecta = new Conexao();
            Integer ultimo = conecta.PegaUltimoRegistro("UpInfo_cadCli", "UpInfo_cadCli_Codigo");
            EdtCodigo.setText(ultimo.toString());
        } catch (SQLException ex) {
            Logger.getLogger(CadastroClienteForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowActivated

    private void EdtCodCliPagActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdtCodCliPagActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdtCodCliPagActionPerformed

    private void EdtCpfFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EdtCpfFocusLost
        if (EdtCpf.getText().equals("___.___.___-__") || EdtCpf.getText().equals("__.___.___.___/____-__")) {
            setAlwaysOnTop(false);
            JOptionPane.showMessageDialog(getFocusTraversalPolicy().getLastComponent(this), "Cpf/Cnpj não pode ser vazio, favor preencher!");
            setAlwaysOnTop(true);
            EdtCpf.requestFocus();

        } else {
            if (RdbPfisica.isSelected()) {
                String cpf = EdtCpf.getText().substring(0, 3) + EdtCpf.getText().substring(4, 7) + EdtCpf.getText().substring(8, 11) + EdtCpf.getText().substring(12, 14);
                boolean valido = validaCpf.isCpf(cpf);
                System.out.println(cpf);
                if (valido) {
                    try {
                        String cadastra = cpf;
                        String verifica = clienteDao.procuraCpf(cadastra);
                        if (verifica == null) {
                            EdtRg.requestFocus();
                        } else {
                            setAlwaysOnTop(false);
                            JOptionPane.showMessageDialog(null, "CPF já cadastrado! Codigo cliente: " + verifica);
                            setAlwaysOnTop(true);
                        }

                    } catch (Exception ex) {
                        JOptionPane.showMessageDialog(null, "Ocorreu um erro durante a pesquisa do CPF! Contate o suporte!");
                    }

                } else {
                    setAlwaysOnTop(false);
                    JOptionPane.showMessageDialog(null, "CPF inválido, por favor digite novamente!");
                    setAlwaysOnTop(true);
                    EdtCpf.setText("");
                    EdtCpf.requestFocus();

                }

            } else if (RdbPJuridica.isSelected()) {
                String cnpj = EdtCpf.getText().substring(0, 2) + EdtCpf.getText().substring(3, 6) + EdtCpf.getText().substring(7, 10) + EdtCpf.getText().substring(11, 15) + EdtCpf.getText().substring(16, 18);
                boolean valido = validaCnpj.isCnpj(cnpj);
                if (valido){
                    
                }

            }

        }
    }//GEN-LAST:event_EdtCpfFocusLost

    private void EdtNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdtNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EdtNomeActionPerformed

    private void EdtNomeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EdtNomeFocusLost
        EdtNome.toString().toUpperCase();
    }//GEN-LAST:event_EdtNomeFocusLost
    private void verificaBotoes() {
        if (RdbPfisica.isSelected()) {
            LblNome.setText("Nome.:");
            LblApelido.setText("Apelido.:");
            LblRg.setText("RG.:");
            LblCpf.setText("CPF.:");
            EdtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(Mascaras.cpf()));

        } else {
            LblNome.setText("Razão Social.:");
            LblApelido.setText("Nome Fantasia.:");
            LblRg.setText("Inscrição Estadual.:");
            LblCpf.setText("CNPJ.:");
            EdtCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(Mascaras.cnpj()));

        }

    }

    private void opcoescadcli() {
        Object[] opcoescli = {"Ativo", "Inativo", "Bloqueado", "Inadimplente", "Suspenso"};

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteForm

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteForm

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteForm

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroClienteForm

.class  


.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroClienteForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoAlterar;
    private javax.swing.JButton BtoCancelar;
    private javax.swing.JButton BtoExcluir;
    private javax.swing.JButton BtoPesquisar;
    private javax.swing.JButton BtoSair;
    private javax.swing.JButton BtoSalvar;
    private javax.swing.JTextField EdtApelido;
    private javax.swing.JFormattedTextField EdtCelular;
    private javax.swing.JFormattedTextField EdtCep;
    private javax.swing.JTextField EdtCidade;
    private javax.swing.JTextField EdtCodCliPag;
    private javax.swing.JTextField EdtCodigo;
    private javax.swing.JFormattedTextField EdtCpf;
    private javax.swing.JTextField EdtEmail;
    private javax.swing.JTextField EdtEndereco;
    private javax.swing.JFormattedTextField EdtFone;
    private javax.swing.JTextField EdtLimite;
    private javax.swing.JTextField EdtNome;
    private javax.swing.JTextField EdtNomeMae;
    private javax.swing.JTextField EdtNomePai;
    private javax.swing.JTextField EdtNumero;
    private javax.swing.JTextField EdtRg;
    private javax.swing.JComboBox<String> EdtSituacao;
    private javax.swing.JLabel LblApelido;
    private javax.swing.JLabel LblCelular;
    private javax.swing.JLabel LblCep;
    private javax.swing.JLabel LblCidade;
    private javax.swing.JLabel LblCidadeR;
    private javax.swing.JLabel LblClientePagador;
    private javax.swing.JLabel LblClienteR;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JLabel LblCpf;
    private javax.swing.JLabel LblEmail;
    private javax.swing.JLabel LblEndereco;
    private javax.swing.JLabel LblEstado;
    private javax.swing.JLabel LblEstadoR;
    private javax.swing.JLabel LblLimite;
    private javax.swing.JLabel LblNome;
    private javax.swing.JLabel LblNomemae;
    private javax.swing.JLabel LblNumero;
    private javax.swing.JLabel LblPais;
    private javax.swing.JLabel LblPaisR;
    private javax.swing.JLabel LblRg;
    private javax.swing.JLabel LblSituacao;
    private javax.swing.JLabel LblTelefone;
    private javax.swing.JLabel Lblnomepai;
    private javax.swing.JRadioButton RdbPJuridica;
    private javax.swing.JRadioButton RdbPfisica;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
