package sisup;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author André Batista
 * @version 1
 */
public class CadastroProdutoForm extends CadBase {

    CadastroCodBarrasForm enviacodigo;
    ProdutoDao dao = new ProdutoDao();
    Produto prod = null;
    CodigoBarras cb;
    CodigoBarrasDao cbdao;

    public CadastroProdutoForm() throws Exception {
        initComponents();
        init();
    }

    private void getProdutoPeloCodigo() {
        //Busca no banco o produto e transforma em Objeto, jogando nos campos da tela
        try {
            //Pesquisa do banco e transforma em objeto
            prod = dao.getProduto(Integer.parseInt(EdtCodigo.getText()));
            //pega o Objeto e coloca nos campos da tela
            EdtDescricao.setText(prod.getDescricao());
            EdtNcm.setText(prod.getNcm());
            EdtCest.setText(prod.getCest());
            EdtSubGrupo.setText(prod.getSubgrup().toString());
            LblGrupoR.setText(dao.getGrupo(prod.getGrupo()));
            EdtMarca.setText(prod.getMarca().toString());
            EdtAgrupamento.setText(prod.getAgrup().toString());
            EdtUnidade.setText(prod.getUnidade());
            EdtLocalpro.setText(prod.getLocal());
            EdtEstoque.setText(prod.getEstoq().toString());
            EdtEstoquemin.setText(prod.getEstoqmin().toString());
            EdtMargem.setText(prod.getPorcentagem().toString());
            EdtCustoAnterior.setText(prod.getCustaant().toString());
            if (prod.getCalculo().toString().equals("0")) {
                EdtCalculo.setSelected(false);
            } else {
                EdtCalculo.setSelected(true);
            }
            EdtPrecovenda.setText(prod.getPrecovenda().toString());
            EdtCustoAnterior.setText(prod.getCustaant().toString());
            EdtPrecoAnterior.setText(prod.getCustaant().toString());
            if (prod.getSitua().toString().equals("0")) {
                EdtInativo.setSelected(false);
            } else {
                EdtInativo.setSelected(true);
                EdtMesInativo.setText(prod.getMes().toString());
                EdtAnoInativo.setText(prod.getAno().toString());
            }
        } catch (Exception e) {
            //Caso apresente erro durante o processo apresente uma tela com a mensagem de erro
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro inexperado! " + e.getMessage());
            BtoCancelar.doClick();
        }
    }

    public void achouCadastro() {
        //Caso encontre o Objeto, ele altera as opçoes dos botoes
        BtoPesquisar.setEnabled(false);
        BtoCodbar.setEnabled(true);
        BtoExcluir.setEnabled(true);
        BtoSalvar.setEnabled(false);
        BtoReferencia.setEnabled(true);
        BtoAlterar.setEnabled(true);
        BtoSair.setEnabled(false);
    }

    public void novoCadastro() {
        //Quando limpar todos os campos da tela, volta ao padrão de novo cadastro, as propriedades dos botoes
        BtoPesquisar.setEnabled(true);
        BtoCodbar.setEnabled(false);
        BtoExcluir.setEnabled(false);
        BtoSalvar.setEnabled(true);
        BtoReferencia.setEnabled(false);
        BtoAlterar.setEnabled(false);
        BtoSair.setEnabled(true);
    }

    private void init() throws Exception {
        Integer codigo = dao.getUltimoCodigo();
        EdtCodigo.setText(codigo.toString());
        EdtCodigo.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BtoPesquisar = new javax.swing.JButton();
        BtoSalvar = new javax.swing.JButton();
        BtoAlterar = new javax.swing.JButton();
        BtoExcluir = new javax.swing.JButton();
        BtoCancelar = new javax.swing.JButton();
        BtoSair = new javax.swing.JButton();
        LblCodigo = new javax.swing.JLabel();
        EdtCodigo = new javax.swing.JTextField();
        LblProduto = new javax.swing.JLabel();
        EdtDescricao = new javax.swing.JTextField();
        LblNCM = new javax.swing.JLabel();
        EdtNcm = new javax.swing.JFormattedTextField();
        LblCest = new javax.swing.JLabel();
        EdtCest = new javax.swing.JTextField();
        LblSubGrupo = new javax.swing.JLabel();
        EdtSubGrupo = new javax.swing.JTextField();
        LblSubGrupR = new javax.swing.JLabel();
        LblGrupo = new javax.swing.JLabel();
        LblGrupoR = new javax.swing.JLabel();
        LblMarca = new javax.swing.JLabel();
        EdtMarca = new javax.swing.JTextField();
        LblAgrupamento = new javax.swing.JLabel();
        EdtAgrupamento = new javax.swing.JTextField();
        LblAgrupamentoR = new javax.swing.JLabel();
        LblDepartamento = new javax.swing.JLabel();
        LblDepartamentoR = new javax.swing.JLabel();
        LblCustoEnc = new javax.swing.JLabel();
        EdtCusto = new javax.swing.JTextField();
        LblPrecovenda = new javax.swing.JLabel();
        EdtPrecovenda = new javax.swing.JTextField();
        LblCustoAnterior = new javax.swing.JLabel();
        EdtCustoAnterior = new javax.swing.JTextField();
        LblMarcaR = new javax.swing.JLabel();
        LblUnidade = new javax.swing.JLabel();
        EdtUnidade = new javax.swing.JTextField();
        LblPrecoAnterior = new javax.swing.JLabel();
        EdtPrecoAnterior = new javax.swing.JTextField();
        EdtInativo = new javax.swing.JCheckBox();
        EdtMesInativo = new javax.swing.JTextField();
        LblDataInativacao = new javax.swing.JLabel();
        LblMes = new javax.swing.JLabel();
        EdtAnoInativo = new javax.swing.JTextField();
        LblAno = new javax.swing.JLabel();
        LblBarra = new javax.swing.JLabel();
        BtoCodbar = new javax.swing.JButton();
        BtoReferencia = new javax.swing.JButton();
        LblLocalizacao = new javax.swing.JLabel();
        EdtLocalpro = new javax.swing.JTextField();
        LblEstoque = new javax.swing.JLabel();
        EdtEstoque = new javax.swing.JTextField();
        LblEstoquemin = new javax.swing.JLabel();
        EdtEstoquemin = new javax.swing.JTextField();
        LblMargem = new javax.swing.JLabel();
        EdtMargem = new javax.swing.JTextField();
        EdtCalculo = new javax.swing.JCheckBox();
        lblcalculor = new javax.swing.JLabel();
        lblsit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Produto");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImages(null);
        setLocationByPlatform(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.APPLICATION_EXCLUDE);
        setName("CadPro"); // NOI18N
        setSize(new java.awt.Dimension(750, 400));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });

        BtoPesquisar.setText("Pesquisar");

        BtoSalvar.setText("Salvar");
        BtoSalvar.setPreferredSize(new java.awt.Dimension(89, 23));
        BtoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSalvarActionPerformed(evt);
            }
        });

        BtoAlterar.setText("Alterar");
        BtoAlterar.setMaximumSize(new java.awt.Dimension(89, 23));
        BtoAlterar.setMinimumSize(new java.awt.Dimension(89, 23));
        BtoAlterar.setPreferredSize(new java.awt.Dimension(89, 23));
        BtoAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoAlterarActionPerformed(evt);
            }
        });

        BtoExcluir.setText("Excluir");
        BtoExcluir.setPreferredSize(new java.awt.Dimension(89, 23));

        BtoCancelar.setText("Cancelar");
        BtoCancelar.setMaximumSize(new java.awt.Dimension(89, 23));
        BtoCancelar.setMinimumSize(new java.awt.Dimension(89, 23));
        BtoCancelar.setPreferredSize(new java.awt.Dimension(89, 23));
        BtoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoCancelarActionPerformed(evt);
            }
        });

        BtoSair.setText("Sair");
        BtoSair.setMaximumSize(new java.awt.Dimension(89, 23));
        BtoSair.setMinimumSize(new java.awt.Dimension(89, 23));
        BtoSair.setPreferredSize(new java.awt.Dimension(89, 23));
        BtoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoSairActionPerformed(evt);
            }
        });

        LblCodigo.setText("Código.:");

        EdtCodigo.setToolTipText("Código Produto");
        EdtCodigo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EdtCodigo.setMaximumSize(new java.awt.Dimension(6, 20));
        EdtCodigo.setNextFocusableComponent(EdtDescricao);
        EdtCodigo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EdtCodigoFocusLost(evt);
            }
        });

        LblProduto.setText("Descrição Produto.:");

        EdtDescricao.setToolTipText("Descrição do Produto");
        EdtDescricao.setNextFocusableComponent(EdtNcm);

        LblNCM.setText("N.C.M..:");

        EdtNcm.setToolTipText("Código N.C.M. do Produto");
        EdtNcm.setMaximumSize(new java.awt.Dimension(6, 20));
        EdtNcm.setNextFocusableComponent(EdtCest);

        LblCest.setText("Cest.:");

        EdtCest.setToolTipText("Código CEST do Produto");
        EdtCest.setMaximumSize(new java.awt.Dimension(6, 20));
        EdtCest.setNextFocusableComponent(EdtSubGrupo);

        LblSubGrupo.setText("Sub-Grupo.:");

        EdtSubGrupo.setToolTipText("Código do Sub-Grupo do Produto");
        EdtSubGrupo.setNextFocusableComponent(EdtMarca);

        LblSubGrupR.setText("Sub-Grupo");

        LblGrupo.setText("Grupo.:");

        LblGrupoR.setText("Grupo");
        LblGrupoR.setToolTipText("Grupo do Produto");
        LblGrupoR.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                LblGrupoRPropertyChange(evt);
            }
        });

        LblMarca.setText("Marca.:");

        EdtMarca.setToolTipText("Código da Marca do Produto");
        EdtMarca.setNextFocusableComponent(EdtAgrupamento);

        LblAgrupamento.setText("Agru. Preço.:");

        EdtAgrupamento.setToolTipText("Agrupamkento de Preços do Produto");
        EdtAgrupamento.setNextFocusableComponent(EdtUnidade);

        LblAgrupamentoR.setText("Agrupamento");

        LblDepartamento.setText("Departamento.:");

        LblDepartamentoR.setText("Departamento");
        LblDepartamentoR.setToolTipText("Departamento do Produto");

        LblCustoEnc.setText("Custo c/ Enc..:");

        EdtCusto.setToolTipText("Custo com Encargos do Produto");
        EdtCusto.setNextFocusableComponent(EdtCalculo);

        LblPrecovenda.setText("Preço Venda.:");

        EdtPrecovenda.setToolTipText("Preço de Venda do Produto");
        EdtPrecovenda.setNextFocusableComponent(EdtInativo);

        LblCustoAnterior.setText("Custo Anterior.:");

        EdtCustoAnterior.setToolTipText("Custo do Produto Antes da Alteração");
        EdtCustoAnterior.setNextFocusableComponent(EdtPrecoAnterior);

        LblMarcaR.setText("Marca");

        LblUnidade.setText("Unidade.:");

        EdtUnidade.setToolTipText("Tipo de Unidade do Produto");
        EdtUnidade.setNextFocusableComponent(EdtLocalpro);

        LblPrecoAnterior.setText("Preço Anterior.:");

        EdtPrecoAnterior.setToolTipText("Preço de Venda do Produto Antes da Alteração");
        EdtPrecoAnterior.setNextFocusableComponent(BtoSalvar);

        EdtInativo.setText("Inativo");
        EdtInativo.setToolTipText("Ativar ou Inativar Produto");
        EdtInativo.setNextFocusableComponent(EdtMesInativo);
        EdtInativo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EdtInativoActionPerformed(evt);
            }
        });

        EdtMesInativo.setToolTipText("Mes de Inativação do Produto");
        EdtMesInativo.setNextFocusableComponent(EdtAnoInativo);

        LblDataInativacao.setText("Data Inativação.:");

        LblMes.setText("Mês");

        EdtAnoInativo.setToolTipText("Ano de Inativação do Produto");
        EdtAnoInativo.setNextFocusableComponent(BtoSalvar);

        LblAno.setText("Ano");

        LblBarra.setText("/");

        BtoCodbar.setText("Cod. Barras");
        BtoCodbar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoCodbarActionPerformed(evt);
            }
        });

        BtoReferencia.setText("Referencia");
        BtoReferencia.setMaximumSize(new java.awt.Dimension(89, 23));
        BtoReferencia.setMinimumSize(new java.awt.Dimension(89, 23));
        BtoReferencia.setPreferredSize(new java.awt.Dimension(89, 23));
        BtoReferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtoReferenciaActionPerformed(evt);
            }
        });

        LblLocalizacao.setText("Localização.:");

        EdtLocalpro.setNextFocusableComponent(EdtEstoque);

        LblEstoque.setText("Estoque.:");

        EdtEstoque.setNextFocusableComponent(EdtEstoquemin);

        LblEstoquemin.setText("Estoque Minimo.:");

        EdtEstoquemin.setNextFocusableComponent(EdtMargem);

        LblMargem.setText("Margem Tradicional.:");

        EdtMargem.setNextFocusableComponent(EdtCusto);

        EdtCalculo.setText("Calculo automático");
        EdtCalculo.setNextFocusableComponent(EdtPrecovenda);
        EdtCalculo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                EdtCalculoFocusLost(evt);
            }
        });

        lblcalculor.setEnabled(false);

        lblsit.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(EdtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(LblUnidade)
                                    .addComponent(LblCustoEnc)
                                    .addComponent(EdtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(LblLocalizacao)
                                                .addGap(42, 42, 42)
                                                .addComponent(LblEstoque)
                                                .addGap(38, 38, 38)
                                                .addComponent(LblEstoquemin))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(EdtLocalpro, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(EdtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(15, 15, 15)
                                                .addComponent(EdtEstoquemin, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(26, 26, 26)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblMargem)
                                            .addComponent(EdtMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtCalculo)
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblPrecovenda)
                                            .addComponent(EdtPrecovenda, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EdtCustoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblCustoAnterior))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(LblPrecoAnterior, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(EdtPrecoAnterior)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblSubGrupo)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtSubGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LblSubGrupR, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblGrupo)
                                    .addComponent(LblGrupoR, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(EdtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LblCodigo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblProduto)
                                    .addComponent(EdtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EdtNcm, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblNCM))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(EdtCest, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(LblCest)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(LblDepartamento)
                                            .addComponent(LblDepartamentoR, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LblMarcaR, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(10, 10, 10)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtAgrupamento, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(LblAgrupamentoR))
                                    .addComponent(LblAgrupamento)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(EdtInativo)
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(LblDataInativacao)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(EdtMesInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(LblBarra)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(EdtAnoInativo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(10, 10, 10)
                                        .addComponent(LblMes)
                                        .addGap(38, 38, 38)
                                        .addComponent(LblAno)))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(BtoCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtoCodbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtoReferencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtoExcluir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtoAlterar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BtoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(BtoPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(619, 619, 619)
                        .addComponent(lblsit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)))
                .addComponent(lblcalculor, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BtoPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(BtoCodbar)
                        .addGap(18, 18, 18)
                        .addComponent(BtoReferencia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtoSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(BtoAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(BtoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(BtoCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(BtoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblcalculor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblsit, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCodigo)
                            .addComponent(LblProduto)
                            .addComponent(LblNCM)
                            .addComponent(LblCest))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtNcm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtCest, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(LblSubGrupo)
                                    .addComponent(LblGrupo))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LblSubGrupR)
                                        .addComponent(LblGrupoR))
                                    .addComponent(EdtSubGrupo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(LblDepartamento)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(LblDepartamentoR)
                                .addGap(6, 6, 6)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblMarca)
                            .addComponent(LblAgrupamento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblMarcaR)
                            .addComponent(EdtAgrupamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblAgrupamentoR))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LblLocalizacao)
                                        .addComponent(LblEstoque))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LblEstoquemin)
                                        .addComponent(LblMargem, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(EdtLocalpro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EdtEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EdtEstoquemin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(EdtMargem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(LblUnidade)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(EdtUnidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(LblCustoEnc)
                            .addComponent(LblPrecovenda)
                            .addComponent(LblCustoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LblPrecoAnterior))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EdtCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtCalculo)
                            .addComponent(EdtPrecovenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtCustoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EdtPrecoAnterior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LblDataInativacao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(EdtMesInativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(LblBarra)
                                .addComponent(EdtAnoInativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EdtInativo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LblAno)
                            .addComponent(LblMes))
                        .addGap(0, 33, Short.MAX_VALUE))))
        );

        setSize(new java.awt.Dimension(716, 503));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSairActionPerformed
        if (EdtDescricao.getText().equals(null) || EdtDescricao.getText().equals("")) {
            this.dispose();
        } else {
            Object[] opcoes = {"Sim", "Não"};
            if (JOptionPane.showOptionDialog(null, "Sair sem salvar?", "Confirmação", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null, opcoes, opcoes[0]) == 0) {
                this.dispose();
            } else {
                BtoSalvar.doClick();
                this.dispose();
            }
        }
    }//GEN-LAST:event_BtoSairActionPerformed

    private void inativoCheck() {
        //se o campo EdtInativo for marcado ele libera ou bloqueia o mes e ano de inativação
        if (EdtInativo.isSelected()) {
            EdtMesInativo.setEnabled(true);
            EdtAnoInativo.setEnabled(true);
        } else {
            EdtMesInativo.setEnabled(false);
            EdtAnoInativo.setEnabled(false);
        }
    }

    private void BtoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoSalvarActionPerformed
        ArrayList<String> texto = new ArrayList();
        ArrayList<Integer> numero = new ArrayList();
        ArrayList<Double> valor = new ArrayList();
        Integer calculopro = null;
        Integer situacaopro = null;
        Produto produto = new Produto();
        ProdutoDao dao = null;
        try {
            Connection con = Conexao.getInstancia();
            if (EdtCodigo.getText().equalsIgnoreCase(" ")) {
                JOptionPane.showMessageDialog(null, "Codigo não pode ser vazio!");
                EdtCodigo.requestFocus();
            } else {
                numero.add(Integer.parseInt(EdtCodigo.getText()));
            }
            if (EdtDescricao.getText().equalsIgnoreCase(null)) {
                JOptionPane.showMessageDialog(null, "Descrição do produto não pode ser vazio!");
                EdtDescricao.requestFocus();
            } else {
                texto.add(EdtDescricao.getText());
            }
            if (EdtNcm.getText().equalsIgnoreCase("")) {
                texto.add(" ");
            } else {
                texto.add(EdtNcm.getText());
            }
            if (EdtCest.getText().equals("")) {
                texto.add(" ");
            } else {
                texto.add(EdtCest.getText());
            }
            if (EdtSubGrupo.getText().equals("")) {
                numero.add(0);
            } else {
                numero.add(Integer.parseInt(EdtSubGrupo.getText()));
            }
            if (EdtMarca.getText().equals("")) {
                numero.add(0);
            } else {
                numero.add(Integer.parseInt(EdtMarca.getText()));
            }
            if (EdtAgrupamento.getText().equals("")) {
                numero.add(0);
            } else {
                numero.add(Integer.parseInt(EdtAgrupamento.getText()));
            }
            if (EdtUnidade.getText().equals("")) {
                texto.add(" ");
            } else {
                texto.add(EdtUnidade.getText());
            }
            if (EdtLocalpro.getText().equals("")) {
                texto.add(" ");
            } else {
                texto.add(EdtLocalpro.getText());
            }
            if (EdtEstoque.getText().equals("")) {
                numero.add(0);
            } else {
                numero.add(Integer.parseInt(EdtEstoque.getText()));
            }
            if (EdtEstoquemin.getText().equals("")) {
                numero.add(0);
            } else {
                numero.add(Integer.parseInt(EdtEstoquemin.getText()));
                System.out.println(numero.get(5));
            }
            if (EdtMargem.getText().equals("")) {
                valor.add(0.0);
            } else {
                valor.add(Double.parseDouble(EdtMargem.getText()));
            }
            if (EdtCusto.getText().equals("")) {
                valor.add(0.0);
            } else {
                valor.add(Double.parseDouble(EdtCusto.getText()));
            }
            if (EdtCalculo.isSelected()) {
                calculopro = 0;
            } else {
                calculopro = 1;
            }
            if (EdtPrecovenda.getText().equals("")) {
                valor.add(0.0);
            } else {
                valor.add(Double.parseDouble(EdtPrecovenda.getText()));
            }
            if (EdtCustoAnterior.getText().equals("")) {
                valor.add(0.0);
            } else {
                valor.add(Double.parseDouble(EdtCustoAnterior.getText()));
            }
            if (EdtPrecoAnterior.getText().equals("")) {
                valor.add(0.0);
            } else {

                valor.add(Double.parseDouble(EdtPrecoAnterior.getText()));
            }
            if (!EdtInativo.isSelected()) {
                situacaopro = 0;
                numero.add(null);
                numero.add(null);
            } else {
                situacaopro = 1;
                numero.add(Integer.parseInt(EdtMesInativo.getText()));
                numero.add(Integer.parseInt(EdtAnoInativo.getText()));
            }
            produto.setCodigo(numero.get(0));
            produto.setDescricao(texto.get(0));
            produto.setNcm(texto.get(1));
            produto.setCest(texto.get(2));
            produto.setSubgrup(numero.get(1));
            produto.setGrupo(numero.get(1));
            produto.setMarca(numero.get(2));
            produto.setAgrup(numero.get(3));
            produto.setUnidade(texto.get(3));
            produto.setLocal(texto.get(4));
            produto.setEstoq(numero.get(4));
            produto.setEstoqmin(numero.get(5));
            produto.setPorcentagem(valor.get(0));
            produto.setPrecocompra(valor.get(1));
            produto.setCalculo(calculopro);
            produto.setPrecovenda(valor.get(2));
            produto.setCustaant(valor.get(3));
            produto.setVendaant(valor.get(4));
            produto.setInativo(situacaopro);
            produto.setMes(numero.get(6));
            produto.setAno(numero.get(7));
            dao.inserir(produto);

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir produto no Banco de Dados. Contate o Suporte Técnico! " + ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro Inexperado. Contate o Suporte Técnico. " + ex.getMessage());
        }

        BtoCancelar.doClick();
    }//GEN-LAST:event_BtoSalvarActionPerformed

    

    private void BtoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoCancelarActionPerformed
        inativoCheck();
        limpaCampos();
        novoCadastro();
        liberaCampos();
        try {
            Integer codigo = dao.getUltimoCodigo();
            EdtCodigo.setText(codigo.toString());
            EdtCodigo.requestFocus();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro no Banco de Dados" + e.getMessage());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro inexperado!" + e.getMessage());
        }


    }//GEN-LAST:event_BtoCancelarActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.dispose();
    }//GEN-LAST:event_formWindowClosed

    private void EdtInativoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EdtInativoActionPerformed
        // TODO add your handling code here:
        inativoCheck();


    }//GEN-LAST:event_EdtInativoActionPerformed

    private void BtoCodbarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoCodbarActionPerformed
        String vericodigo = EdtCodigo.getText();
        if (vericodigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa estar cadastrando ou alterando um cadastro para abrir o codigo de barras");
            EdtCodigo.requestFocus();
        } else {
            if (enviacodigo == null) {
                enviacodigo = new CadastroCodBarrasForm();
                enviacodigo.setVisible(true);
                enviacodigo.recebecodigo(EdtCodigo.getText(), EdtDescricao.getText());
            } else {
                enviacodigo.setVisible(true);
                enviacodigo.recebecodigo(EdtCodigo.getText(), EdtDescricao.getText());
            }
        }
    }//GEN-LAST:event_BtoCodbarActionPerformed

    private void EdtCodigoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EdtCodigoFocusLost
        try {
            Integer codpro = dao.getUltimoCodigo();
            if (codpro == Integer.parseInt(EdtCodigo.getText())) {

            } else {
                getProdutoPeloCodigo();
                bloqueiaCampos();
                achouCadastro();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro ao pesquisar o Código do Produto. Contate o Suporte Tecnico! "+e.getMessage());
            
            
        }

    }//GEN-LAST:event_EdtCodigoFocusLost

    private void BtoReferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoReferenciaActionPerformed
        String vericodigo = EdtDescricao.getText();
        if (vericodigo.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Você precisa estar cadastrando ou alterando um cadastro para abrir o codigo de barras");
            EdtCodigo.requestFocus();
        } else {
            if (enviacodigo == null) {
                enviacodigo = new CadastroCodBarrasForm();
                enviacodigo.setVisible(true);
                enviacodigo.recebecodigo(EdtCodigo.getText(), EdtDescricao.getText());
            } else {
                enviacodigo.setVisible(true);
                enviacodigo.recebecodigo(EdtCodigo.getText(), EdtDescricao.getText());
            }
        }
    }//GEN-LAST:event_BtoReferenciaActionPerformed

    private void BtoAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtoAlterarActionPerformed
        liberaCampos();
        EdtPrecoAnterior.setEditable(false);
        EdtCustoAnterior.setEditable(false);
    }//GEN-LAST:event_BtoAlterarActionPerformed

    private void EdtCalculoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_EdtCalculoFocusLost
        if (EdtCusto.equals(" ")) {
            EdtCusto.requestFocus();
        } else {
            if (EdtCalculo.isSelected()) {
                EdtPrecovenda.setEnabled(false);
                Double preco = (((Double.parseDouble(EdtMargem.getText())
                        * +Double.parseDouble(EdtCusto.getText())) / 100)
                        + +Double.parseDouble(EdtCusto.getText()));
                EdtPrecovenda.setText(Double.toString(preco));
            } else {
                EdtPrecovenda.setEnabled(true);
            }
        }
    }//GEN-LAST:event_EdtCalculoFocusLost

    private void LblGrupoRPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_LblGrupoRPropertyChange

    }//GEN-LAST:event_LblGrupoRPropertyChange

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProdutoForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        }
        try {

            java.awt.EventQueue.invokeLater(() -> {
                try {
                    new CadastroProdutoForm().setVisible(true);
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro na abertura do Cadastro de Produto " + ex.getMessage());
                }
            });
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro: Ocorreu um erro na abertura do Cadastro de Produto " + e.getMessage());
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtoAlterar;
    private javax.swing.JButton BtoCancelar;
    private javax.swing.JButton BtoCodbar;
    private javax.swing.JButton BtoExcluir;
    private javax.swing.JButton BtoPesquisar;
    private javax.swing.JButton BtoReferencia;
    private javax.swing.JButton BtoSair;
    private javax.swing.JButton BtoSalvar;
    private javax.swing.JTextField EdtAgrupamento;
    private javax.swing.JTextField EdtAnoInativo;
    private javax.swing.JCheckBox EdtCalculo;
    private javax.swing.JTextField EdtCest;
    private javax.swing.JTextField EdtCodigo;
    private javax.swing.JTextField EdtCusto;
    private javax.swing.JTextField EdtCustoAnterior;
    private javax.swing.JTextField EdtDescricao;
    private javax.swing.JTextField EdtEstoque;
    private javax.swing.JTextField EdtEstoquemin;
    private javax.swing.JCheckBox EdtInativo;
    private javax.swing.JTextField EdtLocalpro;
    private javax.swing.JTextField EdtMarca;
    private javax.swing.JTextField EdtMargem;
    private javax.swing.JTextField EdtMesInativo;
    private javax.swing.JFormattedTextField EdtNcm;
    private javax.swing.JTextField EdtPrecoAnterior;
    private javax.swing.JTextField EdtPrecovenda;
    private javax.swing.JTextField EdtSubGrupo;
    private javax.swing.JTextField EdtUnidade;
    private javax.swing.JLabel LblAgrupamento;
    private javax.swing.JLabel LblAgrupamentoR;
    private javax.swing.JLabel LblAno;
    private javax.swing.JLabel LblBarra;
    private javax.swing.JLabel LblCest;
    private javax.swing.JLabel LblCodigo;
    private javax.swing.JLabel LblCustoAnterior;
    private javax.swing.JLabel LblCustoEnc;
    private javax.swing.JLabel LblDataInativacao;
    private javax.swing.JLabel LblDepartamento;
    private javax.swing.JLabel LblDepartamentoR;
    private javax.swing.JLabel LblEstoque;
    private javax.swing.JLabel LblEstoquemin;
    private javax.swing.JLabel LblGrupo;
    private javax.swing.JLabel LblGrupoR;
    private javax.swing.JLabel LblLocalizacao;
    private javax.swing.JLabel LblMarca;
    private javax.swing.JLabel LblMarcaR;
    private javax.swing.JLabel LblMargem;
    private javax.swing.JLabel LblMes;
    private javax.swing.JLabel LblNCM;
    private javax.swing.JLabel LblPrecoAnterior;
    private javax.swing.JLabel LblPrecovenda;
    private javax.swing.JLabel LblProduto;
    private javax.swing.JLabel LblSubGrupR;
    private javax.swing.JLabel LblSubGrupo;
    private javax.swing.JLabel LblUnidade;
    private javax.swing.JLabel lblcalculor;
    private javax.swing.JLabel lblsit;
    // End of variables declaration//GEN-END:variables

    private void If(boolean equalsIgnoreCase) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
