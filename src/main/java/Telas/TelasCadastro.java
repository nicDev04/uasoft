/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Telas;

import Classes.Cliente;
import Classes.Consulta;
import Classes.Especie;
import Classes.Funcionario;
import Classes.Grupo;
import Classes.Login;
import Classes.Marca;
import Classes.Pet;
import Classes.Produto;
import Classes.Raca;
import Classes.Venda;
import ClassesDAO.ClienteDAO;
import ClassesDAO.ConsultaDAO;
import ClassesDAO.EspecieDAO;
import ClassesDAO.FuncionarioDAO;
import ClassesDAO.GrupoDAO;
import ClassesDAO.MarcaDAO;
import ClassesDAO.PetDAO;
import ClassesDAO.ProdutoDAO;
import ClassesDAO.RacaDAO;
import ClassesDAO.VendaDAO;
import Utilidades.Alerta;
import Utilidades.Formatador;
import Utilidades.Validacoes;
import static Utilidades.Validacoes.formatarValor;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.time.LocalDate;
import java.util.List;
import javax.swing.DefaultComboBoxModel;

public class TelasCadastro extends javax.swing.JDialog {

    private List<Cliente> listaCliente;
    private List<Pet> listaPet;
    private List<Pet> listaPetCliente;
    private List<Funcionario> listaVet;
    private List<Produto> listaProdutos;
    private List<Especie> listaEspecie;
    private List<Raca> listaRacas;
    private List<Grupo> listaGrupos;
    private List<Marca> listaMarcas;

    public TelasCadastro(java.awt.Frame parent, boolean modal, String cardName) {
        super(parent, modal);
        initComponents();
        viewChange(cardName);
        
        this.listaCliente = ClienteDAO.listarClientes();
        this.listaPet = PetDAO.listarPets();
        this.listaProdutos = ProdutoDAO.listarProdutos();
        this.listaVet = FuncionarioDAO.listarVeterinario();
        this.listaEspecie = EspecieDAO.listarEspecie();
        this.listaGrupos = GrupoDAO.listarGrupos();
        this.listaMarcas = MarcaDAO.listarMarcas();
        montarCbxClienteConsulta();
        montarCbxVet(listaVet);
        montarCbxClienteVenda();
        montarCbxProduto();
        montarCbxClientePet();
        montarCbxEspeciePet();
        montarCbxGrupo();
        montarCbxMarca();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panelTelasCad = new javax.swing.JPanel();
        jpCadVendas = new javax.swing.JPanel();
        lblClienteV = new javax.swing.JLabel();
        cbxClienteV = new Components.RoundedComboBox();
        cbxProdutoV = new Components.RoundedComboBox();
        lblProdutoV = new javax.swing.JLabel();
        rtfQuantidadeV = new Components.RoundedTextField();
        lblQuantidadeV = new javax.swing.JLabel();
        lblValorV = new javax.swing.JLabel();
        btSalvarV = new Botoes.JCustomButton2();
        ftfValorV = new Components.RoundedFormattedTextField();
        jpCadConsultas = new javax.swing.JPanel();
        lblClienteC = new javax.swing.JLabel();
        cbxClienteC = new Components.RoundedComboBox();
        lblPetC = new javax.swing.JLabel();
        cbxPetC = new Components.RoundedComboBox();
        lblVetC = new javax.swing.JLabel();
        cbxVetC = new Components.RoundedComboBox();
        lblValorConC = new javax.swing.JLabel();
        ftfValorConC = new Components.RoundedFormattedTextField();
        lblValorMedC = new javax.swing.JLabel();
        ftfValorMedC = new Components.RoundedFormattedTextField();
        btSalvarC = new Botoes.JCustomButton2();
        lblObsC = new javax.swing.JLabel();
        rtfObsC = new Components.RoundedTextField();
        jpCadClientes = new javax.swing.JPanel();
        lblNomeCompleto = new javax.swing.JLabel();
        rtfNomeCli = new Components.RoundedTextField();
        lblCPFCli = new javax.swing.JLabel();
        lblSexoCli = new javax.swing.JLabel();
        cbxSexoCli = new Components.RoundedComboBox();
        lblTelCli = new javax.swing.JLabel();
        ftfTelCli = new Components.RoundedFormattedTextField();
        lblEndCli = new javax.swing.JLabel();
        rtfEndCli = new Components.RoundedTextField();
        btSalvarCli = new Botoes.JCustomButton2();
        ftfCPFCli = new Components.RoundedFormattedTextField();
        jpCadPets = new javax.swing.JPanel();
        lblNomePet = new javax.swing.JLabel();
        rtfNomePetP = new Components.RoundedTextField();
        lblNomeTutorP = new javax.swing.JLabel();
        cbxNomeTutorP = new Components.RoundedComboBox();
        lblSexoP = new javax.swing.JLabel();
        cbxSexoP = new Components.RoundedComboBox();
        lblEspecieP = new javax.swing.JLabel();
        cbxEspecieP = new Components.RoundedComboBox();
        lblRacaP = new javax.swing.JLabel();
        cbxRacaP = new Components.RoundedComboBox();
        lblDataNascP = new javax.swing.JLabel();
        ftfDataNascP = new Components.RoundedFormattedTextField();
        btSalvarP = new Botoes.JCustomButton2();
        jpCadProdutos = new javax.swing.JPanel();
        lblNomeProdPro = new javax.swing.JLabel();
        rtfNomeProdP = new Components.RoundedTextField();
        cbxUniVendaPro = new Components.RoundedComboBox();
        lblUniVenPro = new javax.swing.JLabel();
        lblMarcaPro = new javax.swing.JLabel();
        cbxMarcaPro = new Components.RoundedComboBox();
        lblGrupoPro = new javax.swing.JLabel();
        cbxGrupoPro = new Components.RoundedComboBox();
        lblDescPro = new javax.swing.JLabel();
        rtfDescPro = new Components.RoundedTextField();
        btSalvarPro = new Botoes.JCustomButton2();
        lblValorPro = new javax.swing.JLabel();
        ftfValorPro = new Components.RoundedFormattedTextField();
        jpCadFuncionario = new javax.swing.JPanel();
        lblNomeFun = new javax.swing.JLabel();
        rtfNomeFun = new Components.RoundedTextField();
        lblCPFFun = new javax.swing.JLabel();
        lblSexoFun = new javax.swing.JLabel();
        cbxSexoFun = new Components.RoundedComboBox();
        lblTelFun = new javax.swing.JLabel();
        ftfTelFun = new Components.RoundedFormattedTextField();
        lblEndFun = new javax.swing.JLabel();
        rtfEndFun = new Components.RoundedTextField();
        lblCargoFun = new javax.swing.JLabel();
        cbxCargoFun = new Components.RoundedComboBox();
        btSalvarFun = new Botoes.JCustomButton2();
        rtfUsuFun = new Components.RoundedTextField();
        lblUsuFun = new javax.swing.JLabel();
        lblSenFun = new javax.swing.JLabel();
        rtfSenFun = new Components.RoundedTextField();
        ftfCpfFun = new Components.RoundedFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 228, 130));

        topbar.setBackground(new java.awt.Color(197, 228, 130));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LOGO UASOFT - VERDE ÁGUA.png"))); // NOI18N

        javax.swing.GroupLayout topbarLayout = new javax.swing.GroupLayout(topbar);
        topbar.setLayout(topbarLayout);
        topbarLayout.setHorizontalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(238, 238, 238)
                .addComponent(logo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        topbarLayout.setVerticalGroup(
            topbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(topbarLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        panelTelasCad.setBackground(new java.awt.Color(197, 228, 130));
        panelTelasCad.setLayout(new java.awt.CardLayout());

        jpCadVendas.setBackground(new java.awt.Color(197, 228, 130));

        lblClienteV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblClienteV.setForeground(new java.awt.Color(12, 134, 129));
        lblClienteV.setText("Cliente:");

        cbxClienteV.setEditable(true);
        cbxClienteV.setMaximumRowCount(100);
        cbxClienteV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxClienteV.setFocusable(false);
        cbxClienteV.setForeground(new Color(12, 134, 129));

        cbxProdutoV.setEditable(true);
        cbxProdutoV.setMaximumRowCount(100);
        cbxProdutoV.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxProdutoV.setFocusable(false);
        cbxClienteV.setForeground(new Color(12, 134, 129));

        lblProdutoV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblProdutoV.setForeground(new java.awt.Color(12, 134, 129));
        lblProdutoV.setText("Produto:");

        rtfQuantidadeV.setBackground(new java.awt.Color(142, 196, 123));
        rtfQuantidadeV.setForeground(new java.awt.Color(12, 134, 129));
        rtfQuantidadeV.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfQuantidadeV.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblQuantidadeV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblQuantidadeV.setForeground(new java.awt.Color(12, 134, 129));
        lblQuantidadeV.setText("Quantidade:");

        lblValorV.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblValorV.setForeground(new java.awt.Color(12, 134, 129));
        lblValorV.setText("Valor (R$):");

        btSalvarV.setText("Salvar");
        btSalvarV.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btSalvarV.setRound(10);
        btSalvarV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarVActionPerformed(evt);
            }
        });

        ftfValorV.setBackground(new java.awt.Color(142, 196, 123));
        ftfValorV.setForeground(new java.awt.Color(12, 134, 129));
        ftfValorV.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfValorV.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ftfValorV.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        javax.swing.GroupLayout jpCadVendasLayout = new javax.swing.GroupLayout(jpCadVendas);
        jpCadVendas.setLayout(jpCadVendasLayout);
        jpCadVendasLayout.setHorizontalGroup(
            jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadVendasLayout.createSequentialGroup()
                .addGroup(jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadVendasLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rtfQuantidadeV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxProdutoV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxClienteV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpCadVendasLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidadeV)
                            .addComponent(lblClienteV)
                            .addComponent(lblProdutoV))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftfValorV, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorV))
                .addGap(56, 56, 56))
        );
        jpCadVendasLayout.setVerticalGroup(
            jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadVendasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteV)
                    .addComponent(lblValorV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpCadVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxClienteV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ftfValorV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblProdutoV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxProdutoV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblQuantidadeV)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtfQuantidadeV, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btSalvarV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasCad.add(jpCadVendas, "cardCadVendas");

        jpCadConsultas.setBackground(new java.awt.Color(197, 228, 130));

        lblClienteC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblClienteC.setForeground(new java.awt.Color(12, 134, 129));
        lblClienteC.setText("Cliente:");

        cbxClienteC.setEditable(true);
        cbxClienteC.setMaximumRowCount(100);
        cbxClienteC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxClienteC.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));
        cbxClienteC.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxClienteCItemStateChanged(evt);
            }
        });

        lblPetC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPetC.setForeground(new java.awt.Color(12, 134, 129));
        lblPetC.setText("Nome do Pet:");

        cbxPetC.setEditable(true);
        cbxPetC.setMaximumRowCount(100);
        cbxPetC.setEnabled(false);
        cbxPetC.setFocusable(false);
        cbxPetC.setForeground(new Color(12, 134, 129));

        lblVetC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblVetC.setForeground(new java.awt.Color(12, 134, 129));
        lblVetC.setText("Veterinário:");

        cbxVetC.setEditable(true);
        cbxVetC.setMaximumRowCount(100);
        cbxVetC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxVetC.setFocusable(false);
        cbxVetC.setForeground(new Color(12, 134, 129));

        lblValorConC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblValorConC.setForeground(new java.awt.Color(12, 134, 129));
        lblValorConC.setText("Valor Consulta (R$):");

        ftfValorConC.setBackground(new java.awt.Color(142, 196, 123));
        ftfValorConC.setForeground(new java.awt.Color(12, 134, 129));
        ftfValorConC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfValorConC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ftfValorConC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        lblValorMedC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblValorMedC.setForeground(new java.awt.Color(12, 134, 129));
        lblValorMedC.setText("Valor Medicamentos (R$):");

        ftfValorMedC.setBackground(new java.awt.Color(142, 196, 123));
        ftfValorMedC.setForeground(new java.awt.Color(12, 134, 129));
        ftfValorMedC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfValorMedC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ftfValorMedC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        btSalvarC.setText("Salvar");
        btSalvarC.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btSalvarC.setRound(10);
        btSalvarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCActionPerformed(evt);
            }
        });

        lblObsC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblObsC.setForeground(new java.awt.Color(12, 134, 129));
        lblObsC.setText("Observações:");

        rtfObsC.setBackground(new java.awt.Color(142, 196, 123));
        rtfObsC.setForeground(new java.awt.Color(12, 134, 129));
        rtfObsC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfObsC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        javax.swing.GroupLayout jpCadConsultasLayout = new javax.swing.GroupLayout(jpCadConsultas);
        jpCadConsultas.setLayout(jpCadConsultasLayout);
        jpCadConsultasLayout.setHorizontalGroup(
            jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadConsultasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadConsultasLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClienteC)
                            .addComponent(lblPetC)
                            .addComponent(lblVetC)))
                    .addComponent(cbxVetC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPetC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxClienteC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ftfValorMedC, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblValorMedC)
                        .addComponent(ftfValorConC, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblValorConC))
                    .addComponent(lblObsC)
                    .addComponent(rtfObsC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadConsultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpCadConsultasLayout.setVerticalGroup(
            jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadConsultasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCadConsultasLayout.createSequentialGroup()
                        .addComponent(lblClienteC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxClienteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadConsultasLayout.createSequentialGroup()
                        .addComponent(lblValorConC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfValorConC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadConsultasLayout.createSequentialGroup()
                        .addComponent(lblPetC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPetC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadConsultasLayout.createSequentialGroup()
                        .addComponent(lblValorMedC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfValorMedC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpCadConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadConsultasLayout.createSequentialGroup()
                        .addComponent(lblVetC)
                        .addGap(5, 5, 5)
                        .addComponent(cbxVetC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpCadConsultasLayout.createSequentialGroup()
                        .addComponent(lblObsC)
                        .addGap(5, 5, 5)
                        .addComponent(rtfObsC, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(btSalvarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        panelTelasCad.add(jpCadConsultas, "cardCadConsultas");

        jpCadClientes.setBackground(new java.awt.Color(197, 228, 130));

        lblNomeCompleto.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomeCompleto.setForeground(new java.awt.Color(12, 134, 129));
        lblNomeCompleto.setText("Nome Completo:");

        rtfNomeCli.setBackground(new java.awt.Color(142, 196, 123));
        rtfNomeCli.setForeground(new java.awt.Color(12, 134, 129));
        rtfNomeCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfNomeCli.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblCPFCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCPFCli.setForeground(new java.awt.Color(12, 134, 129));
        lblCPFCli.setText("CPF:");

        lblSexoCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSexoCli.setForeground(new java.awt.Color(12, 134, 129));
        lblSexoCli.setText("Sexo:");

        cbxSexoCli.setEditable(true);
        cbxSexoCli.setMaximumRowCount(100);
        cbxSexoCli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));
        cbxSexoCli.setFocusable(false);
        cbxPetC.setForeground(new Color(12, 134, 129));

        lblTelCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTelCli.setForeground(new java.awt.Color(12, 134, 129));
        lblTelCli.setText("Telefone:");

        ftfTelCli.setBackground(new java.awt.Color(142, 196, 123));
        ftfTelCli.setForeground(new java.awt.Color(12, 134, 129));
        ftfTelCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfTelCli.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        try {
            ftfTelCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblEndCli.setForeground(new java.awt.Color(12, 134, 129));
        lblEndCli.setText("Endereço:");

        rtfEndCli.setBackground(new java.awt.Color(142, 196, 123));
        rtfEndCli.setForeground(new java.awt.Color(12, 134, 129));
        rtfEndCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfEndCli.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        btSalvarCli.setText("Salvar");
        btSalvarCli.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btSalvarCli.setRound(10);
        btSalvarCli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarCliActionPerformed(evt);
            }
        });

        ftfCPFCli.setBackground(new java.awt.Color(142, 196, 123));
        ftfCPFCli.setForeground(new java.awt.Color(12, 134, 129));
        ftfCPFCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfCPFCli.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        try {
            ftfCPFCli.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpCadClientesLayout = new javax.swing.GroupLayout(jpCadClientes);
        jpCadClientes.setLayout(jpCadClientesLayout);
        jpCadClientesLayout.setHorizontalGroup(
            jpCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jpCadClientesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ftfCPFCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblNomeCompleto)
                    .addComponent(rtfNomeCli, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(jpCadClientesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblSexoCli))
                    .addComponent(cbxSexoCli, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(lblCPFCli))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jpCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ftfTelCli, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblTelCli))
                    .addComponent(lblEndCli)
                    .addComponent(rtfEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
        );
        jpCadClientesLayout.setVerticalGroup(
            jpCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadClientesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCadClientesLayout.createSequentialGroup()
                        .addComponent(lblNomeCompleto)
                        .addGap(5, 5, 5)
                        .addComponent(rtfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadClientesLayout.createSequentialGroup()
                        .addComponent(lblTelCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpCadClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCadClientesLayout.createSequentialGroup()
                        .addComponent(lblCPFCli)
                        .addGap(5, 5, 5)
                        .addComponent(ftfCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSexoCli))
                    .addGroup(jpCadClientesLayout.createSequentialGroup()
                        .addComponent(lblEndCli)
                        .addGap(5, 5, 5)
                        .addComponent(rtfEndCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btSalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasCad.add(jpCadClientes, "cardCadClientes");

        jpCadPets.setBackground(new java.awt.Color(197, 228, 130));

        lblNomePet.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomePet.setForeground(new java.awt.Color(12, 134, 129));
        lblNomePet.setText("Nome do Pet:");

        rtfNomePetP.setBackground(new java.awt.Color(142, 196, 123));
        rtfNomePetP.setForeground(new java.awt.Color(12, 134, 129));
        rtfNomePetP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfNomePetP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblNomeTutorP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomeTutorP.setForeground(new java.awt.Color(12, 134, 129));
        lblNomeTutorP.setText("Nome do Tutor:");

        cbxNomeTutorP.setEditable(true);
        cbxNomeTutorP.setMaximumRowCount(100);
        cbxNomeTutorP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste" }));
        cbxNomeTutorP.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblSexoP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSexoP.setForeground(new java.awt.Color(12, 134, 129));
        lblSexoP.setText("Sexo:");

        cbxSexoP.setEditable(true);
        cbxSexoP.setMaximumRowCount(100);
        cbxSexoP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Fêmea", "Macho" }));
        cbxSexoP.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblEspecieP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblEspecieP.setForeground(new java.awt.Color(12, 134, 129));
        lblEspecieP.setText("Espécie:");

        cbxEspecieP.setEditable(true);
        cbxEspecieP.setMaximumRowCount(100);
        cbxEspecieP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste" }));
        cbxEspecieP.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));
        cbxEspecieP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbxEspeciePItemStateChanged(evt);
            }
        });

        lblRacaP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblRacaP.setForeground(new java.awt.Color(12, 134, 129));
        lblRacaP.setText("Raça:");

        cbxRacaP.setEditable(true);
        cbxRacaP.setMaximumRowCount(100);
        cbxRacaP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste" }));
        cbxRacaP.setEnabled(false);
        cbxRacaP.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblDataNascP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDataNascP.setForeground(new java.awt.Color(12, 134, 129));
        lblDataNascP.setText("Data de Nascimento:");

        ftfDataNascP.setBackground(new java.awt.Color(142, 196, 123));
        ftfDataNascP.setForeground(new java.awt.Color(12, 134, 129));
        ftfDataNascP.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ftfDataNascP.setToolTipText("");
        ftfDataNascP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        try {
            ftfDataNascP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btSalvarP.setText("Salvar");
        btSalvarP.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btSalvarP.setRound(10);
        btSalvarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarPActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpCadPetsLayout = new javax.swing.GroupLayout(jpCadPets);
        jpCadPets.setLayout(jpCadPetsLayout);
        jpCadPetsLayout.setHorizontalGroup(
            jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadPetsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomePet)
                    .addComponent(rtfNomePetP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSexoP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNomeTutorP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexoP)
                            .addComponent(lblNomeTutorP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxEspecieP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRacaP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEspecieP)
                            .addComponent(lblRacaP)))
                    .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ftfDataNascP, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblDataNascP)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadPetsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpCadPetsLayout.setVerticalGroup(
            jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadPetsLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addComponent(lblNomePet)
                        .addGap(5, 5, 5)
                        .addComponent(rtfNomePetP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addComponent(lblEspecieP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEspecieP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addComponent(lblNomeTutorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxNomeTutorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addComponent(lblRacaP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxRacaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpCadPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addComponent(lblSexoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSexoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadPetsLayout.createSequentialGroup()
                        .addComponent(lblDataNascP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDataNascP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btSalvarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasCad.add(jpCadPets, "cardCadPets");

        jpCadProdutos.setBackground(new java.awt.Color(197, 228, 130));

        lblNomeProdPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomeProdPro.setForeground(new java.awt.Color(12, 134, 129));
        lblNomeProdPro.setText("Nome do Produto:");

        rtfNomeProdP.setBackground(new java.awt.Color(142, 196, 123));
        rtfNomeProdP.setForeground(new java.awt.Color(12, 134, 129));
        rtfNomeProdP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfNomeProdP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cbxUniVendaPro.setEditable(true);
        cbxUniVendaPro.setMaximumRowCount(100);
        cbxUniVendaPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "UN - Unidade", "CX - Caixa", "FR - Frasco", "BL - Blister", "CP - Comprimido", "ML - Mililitro", "L - Litro", "TB - Tubo", "GD - Gota", "SER - Seringa", "PCT - Pacote", "KG - Quilograma", "G - Grama", "SC - Saco", "PAR - Par", "DZ - Dúzia", "M - Metro", "ROLO - Rolo", "CART - Cartela", "BIS - Bisnaga", "AMP - Ampola" }));
        cbxUniVendaPro.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblUniVenPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblUniVenPro.setForeground(new java.awt.Color(12, 134, 129));
        lblUniVenPro.setText("Unidade  de Venda:");

        lblMarcaPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblMarcaPro.setForeground(new java.awt.Color(12, 134, 129));
        lblMarcaPro.setText("Marca:");

        cbxMarcaPro.setEditable(true);
        cbxMarcaPro.setMaximumRowCount(100);
        cbxMarcaPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxMarcaPro.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblGrupoPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblGrupoPro.setForeground(new java.awt.Color(12, 134, 129));
        lblGrupoPro.setText("Grupo:");

        cbxGrupoPro.setEditable(true);
        cbxGrupoPro.setMaximumRowCount(100);
        cbxGrupoPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxGrupoPro.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblDescPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblDescPro.setForeground(new java.awt.Color(12, 134, 129));
        lblDescPro.setText("Descrição:");

        rtfDescPro.setBackground(new java.awt.Color(142, 196, 123));
        rtfDescPro.setForeground(new java.awt.Color(12, 134, 129));
        rtfDescPro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfDescPro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        btSalvarPro.setText("Salvar");
        btSalvarPro.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btSalvarPro.setRound(10);
        btSalvarPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarProActionPerformed(evt);
            }
        });

        lblValorPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblValorPro.setForeground(new java.awt.Color(12, 134, 129));
        lblValorPro.setText("Valor (R$):");

        ftfValorPro.setBackground(new java.awt.Color(142, 196, 123));
        ftfValorPro.setForeground(new java.awt.Color(12, 134, 129));
        ftfValorPro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfValorPro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ftfValorPro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout jpCadProdutosLayout = new javax.swing.GroupLayout(jpCadProdutos);
        jpCadProdutos.setLayout(jpCadProdutosLayout);
        jpCadProdutosLayout.setHorizontalGroup(
            jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jpCadProdutosLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadProdutosLayout.createSequentialGroup()
                        .addGroup(jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxGrupoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpCadProdutosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblGrupoPro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpCadProdutosLayout.createSequentialGroup()
                        .addGroup(jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeProdPro)
                            .addComponent(rtfNomeProdP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMarcaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUniVendaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpCadProdutosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMarcaPro)
                                    .addComponent(lblUniVenPro))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescPro)
                            .addComponent(rtfDescPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfValorPro, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorPro))
                        .addGap(55, 55, 55))))
        );
        jpCadProdutosLayout.setVerticalGroup(
            jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadProdutosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpCadProdutosLayout.createSequentialGroup()
                        .addComponent(lblNomeProdPro)
                        .addGap(5, 5, 5)
                        .addComponent(rtfNomeProdP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadProdutosLayout.createSequentialGroup()
                        .addComponent(lblValorPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfValorPro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpCadProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCadProdutosLayout.createSequentialGroup()
                        .addComponent(lblUniVenPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxUniVendaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMarcaPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMarcaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadProdutosLayout.createSequentialGroup()
                        .addComponent(lblDescPro)
                        .addGap(5, 5, 5)
                        .addComponent(rtfDescPro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(lblGrupoPro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxGrupoPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btSalvarPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasCad.add(jpCadProdutos, "cardCadProdutos");

        jpCadFuncionario.setBackground(new java.awt.Color(197, 228, 130));

        lblNomeFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomeFun.setForeground(new java.awt.Color(12, 134, 129));
        lblNomeFun.setText("Nome Completo:");

        rtfNomeFun.setBackground(new java.awt.Color(142, 196, 123));
        rtfNomeFun.setForeground(new java.awt.Color(12, 134, 129));
        rtfNomeFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfNomeFun.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblCPFFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCPFFun.setForeground(new java.awt.Color(12, 134, 129));
        lblCPFFun.setText("CPF:");

        lblSexoFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSexoFun.setForeground(new java.awt.Color(12, 134, 129));
        lblSexoFun.setText("Sexo:");

        cbxSexoFun.setEditable(true);
        cbxSexoFun.setMaximumRowCount(100);
        cbxSexoFun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Feminino", "Masculino" }));
        cbxSexoFun.setFocusable(false);
        cbxPetC.setForeground(new Color(12, 134, 129));

        lblTelFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblTelFun.setForeground(new java.awt.Color(12, 134, 129));
        lblTelFun.setText("Telefone:");

        ftfTelFun.setBackground(new java.awt.Color(142, 196, 123));
        ftfTelFun.setForeground(new java.awt.Color(12, 134, 129));
        ftfTelFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfTelFun.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        try {
            ftfTelFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)#####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lblEndFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblEndFun.setForeground(new java.awt.Color(12, 134, 129));
        lblEndFun.setText("Endereço:");

        rtfEndFun.setBackground(new java.awt.Color(142, 196, 123));
        rtfEndFun.setForeground(new java.awt.Color(12, 134, 129));
        rtfEndFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfEndFun.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblCargoFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblCargoFun.setForeground(new java.awt.Color(12, 134, 129));
        lblCargoFun.setText("Cargo:");

        cbxCargoFun.setEditable(true);
        cbxCargoFun.setMaximumRowCount(100);
        cbxCargoFun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Atendente", "Gerente", "Veterinário" }));
        cbxCargoFun.setFocusable(false);
        cbxPetC.setForeground(new Color(12, 134, 129));

        btSalvarFun.setText("Salvar");
        btSalvarFun.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btSalvarFun.setRound(10);
        btSalvarFun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSalvarFunActionPerformed(evt);
            }
        });

        rtfUsuFun.setBackground(new java.awt.Color(142, 196, 123));
        rtfUsuFun.setForeground(new java.awt.Color(12, 134, 129));
        rtfUsuFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfUsuFun.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblUsuFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblUsuFun.setForeground(new java.awt.Color(12, 134, 129));
        lblUsuFun.setText("Login:");

        lblSenFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSenFun.setForeground(new java.awt.Color(12, 134, 129));
        lblSenFun.setText("Senha:");

        rtfSenFun.setBackground(new java.awt.Color(142, 196, 123));
        rtfSenFun.setForeground(new java.awt.Color(12, 134, 129));
        rtfSenFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfSenFun.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        ftfCpfFun.setBackground(new java.awt.Color(142, 196, 123));
        ftfCpfFun.setForeground(new java.awt.Color(12, 134, 129));
        ftfCpfFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfCpfFun.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        try {
            ftfCpfFun.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout jpCadFuncionarioLayout = new javax.swing.GroupLayout(jpCadFuncionario);
        jpCadFuncionario.setLayout(jpCadFuncionarioLayout);
        jpCadFuncionarioLayout.setHorizontalGroup(
            jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCadFuncionarioLayout.createSequentialGroup()
                        .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftfTelFun, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(lblTelFun))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                        .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpCadFuncionarioLayout.createSequentialGroup()
                                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                                        .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNomeFun)
                                            .addComponent(rtfNomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblCPFFun))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE))
                                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                                        .addComponent(ftfCpfFun, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGap(106, 106, 106)))
                                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEndFun)
                                    .addComponent(rtfEndFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblCargoFun))
                                    .addComponent(cbxCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblSexoFun))
                                    .addComponent(cbxSexoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuFun)
                                    .addComponent(rtfUsuFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenFun)
                                    .addComponent(rtfSenFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpCadFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarFun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpCadFuncionarioLayout.setVerticalGroup(
            jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndFun, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeFun, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                        .addComponent(rtfNomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCPFFun))
                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                        .addComponent(rtfEndFun, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCargoFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbxCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfCpfFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblSexoFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSexoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblUsuFun)
                        .addGap(5, 5, 5)
                        .addComponent(rtfUsuFun, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jpCadFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblTelFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfTelFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpCadFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblSenFun)
                        .addGap(5, 5, 5)
                        .addComponent(rtfSenFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btSalvarFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasCad.add(jpCadFuncionario, "cardCadFuncionarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTelasCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTelasCad, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btSalvarVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarVActionPerformed
        validarSalvarVenda();
    }//GEN-LAST:event_btSalvarVActionPerformed

    private void cbxClienteCItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxClienteCItemStateChanged
        cbxPetC.setEnabled(true);

        Cliente clienteSelecionado = listaCliente.stream()
                .filter(cliente -> cliente.getNomeC().equals(cbxClienteC.getSelectedItem().toString()))
                .findFirst()
                .orElse(null);

        listaPet = PetDAO.listarPetsCliente(clienteSelecionado);

        montarCbxPetConsulta(listaPet);
    }//GEN-LAST:event_cbxClienteCItemStateChanged

    private void btSalvarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCActionPerformed
        validarSalvarConsulta();
    }//GEN-LAST:event_btSalvarCActionPerformed

    private void btSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCliActionPerformed
        validarSalvarCliente();
    }//GEN-LAST:event_btSalvarCliActionPerformed

    private void cbxEspeciePItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbxEspeciePItemStateChanged
        cbxRacaP.setEnabled(true);

        Especie especieSelecionada = listaEspecie.stream()
                .filter(especie -> especie.getNomeEspecie().equals(cbxEspecieP.getSelectedItem().toString()))
                .findFirst()
                .orElse(null);

        listaRacas = RacaDAO.listarRaca(especieSelecionada);

        montarCbxRaca(listaRacas);
    }//GEN-LAST:event_cbxEspeciePItemStateChanged

    private void btSalvarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarPActionPerformed
        validarSalvarPet();
    }//GEN-LAST:event_btSalvarPActionPerformed

    private void btSalvarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProActionPerformed
        validarSalvarProduto();
    }//GEN-LAST:event_btSalvarProActionPerformed

    private void btSalvarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarFunActionPerformed
        validarSalvarFuncionario();
    }//GEN-LAST:event_btSalvarFunActionPerformed

    

    public void viewChangeCad(String cardName) {  //Método para mudar os cardLayout de acordo com os botões correspondentes
        CardLayout layout = (CardLayout) panelTelasCad.getLayout();
        layout.show(panelTelasCad, cardName);
    }

    public void validarSalvarConsulta() {
        if (cbxClienteC.getSelectedIndex() == 0 && cbxPetC.getSelectedIndex() == 0
                && cbxVetC.getSelectedIndex() == 0 && Validacoes.formatarValor(ftfValorConC.getText()).isBlank()
                && Validacoes.formatarValor(ftfValorMedC.getText()).isBlank() && rtfObsC.getText().isBlank()) {

            Alerta.Erro("Todos os campos da Consulta estão vazios!", "Campos Vazios!");
        } else if (cbxClienteC.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione um cliente!", "Campo Obrigatório!");
        } else if (cbxPetC.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione um pet!", "Campo Obrigatório!");
        } else if (cbxVetC.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione um veterinário!", "Campo Obrigatório!");
        } else if (Validacoes.formatarValor(ftfValorConC.getText()).isBlank()) {
            Alerta.Erro("Informe o valor da consulta!", "Campo Obrigatório!");
        } else if (Validacoes.formatarValor(ftfValorMedC.getText()).isBlank()) {
            Alerta.Erro("Informe o valor do medicamento!", "Campo Obrigatório!");
        } else if (rtfObsC.getText().isBlank()) {
            Alerta.Erro("Insira uma observação!", "Campo Obrigatório!");
        } else {

            // Cadastro de nova consulta
            Consulta consulta = new Consulta();

            Cliente clienteSelecionado = listaCliente.stream()
                    .filter(cliente -> cliente.getNomeC().equals(cbxClienteC.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            Pet petSelecionado = listaPet.stream()
                    .filter(pet -> pet.getNomePet().equals(cbxPetC.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            Funcionario vetSelecionado = listaVet.stream()
                    .filter(vet -> vet.getNomeF().equals(cbxVetC.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            consulta.setCliente(clienteSelecionado);
            consulta.setPet(petSelecionado);
            consulta.setFuncionario(vetSelecionado);
            consulta.setValorConsulta(Double.parseDouble(Validacoes.formatarValor(ftfValorConC.getText())));
            consulta.setValorMedicamentos(Double.parseDouble(Validacoes.formatarValor(ftfValorMedC.getText())));
            consulta.setObservacoes(rtfObsC.getText());
            consulta.setDataConsulta(LocalDate.now());
            ConsultaDAO.cadastrarConsulta(consulta);

            limparCampos(cbxClienteC, cbxPetC, cbxVetC, ftfValorConC, ftfValorMedC, rtfObsC);
        }
    }

    public void validarSalvarVenda() {
        if (cbxClienteV.getSelectedIndex() == 0 && cbxProdutoV.getSelectedIndex() == 0
                && rtfQuantidadeV.getText().isBlank() && Validacoes.formatarValor(ftfValorV.getText()).isBlank()) {

            Alerta.Erro("Todos os campos da Venda estão vazios!", "Campos Vazios");
        } else if (cbxClienteV.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione um cliente!", "Campo Obrigatório");
        } else if (cbxProdutoV.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione um produto!", "Campo Obrigatório");
        } else if (rtfQuantidadeV.getText().isBlank()) {
            Alerta.Erro("Informe a quantidade!", "Campo Obrigatório");
        } else if (Validacoes.formatarValor(ftfValorV.getText()).isBlank()) {
            Alerta.Erro("Informe o valor!", "Campo Obrigatório");
        } else {

            // Cadastro de nova venda
            Venda venda = new Venda();

            Cliente clienteSelecionadoVenda = listaCliente.stream()
                    .filter(cliente -> cliente.getNomeC().equals(cbxClienteV.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            Produto produtoSelecionadoVenda = listaProdutos.stream()
                    .filter(produto -> produto.getNomeProd().equals(cbxProdutoV.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            venda.setCliente(clienteSelecionadoVenda);
            venda.setProduto(produtoSelecionadoVenda);
            venda.setQtdProduto(Integer.parseInt(rtfQuantidadeV.getText()));
            venda.setTotalVenda(Double.parseDouble(formatarValor(ftfValorV.getText())));
            venda.setDataVenda(LocalDate.now());

            VendaDAO.cadastrarVenda(venda);

            limparCampos(cbxClienteV, cbxProdutoV, rtfQuantidadeV, ftfValorV);
        }
    }

    public void validarSalvarCliente() {

        // Validações de preenchimento
        if (rtfNomeCli.getText().isBlank() && Validacoes.formatarCPF(ftfCPFCli.getText()).isBlank()
                && cbxSexoCli.getSelectedIndex() == 0 && rtfEndCli.getText().isBlank()
                && Validacoes.formatarNumero(ftfTelCli.getText()).isBlank()) {

            Alerta.Erro("Todos os campos do Cliente estão vazios!", "Campos Vazios");
        } else if (rtfNomeCli.getText().isBlank()) {
            Alerta.Erro("Digite o nome do cliente!", "Campo Obrigatório");
        } else if (Validacoes.formatarCPF(ftfCPFCli.getText()).isBlank()) {
            Alerta.Erro("Digite o CPF do cliente!", "Campo Obrigatório");
        } else if (cbxSexoCli.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione o sexo!", "Campo Obrigatório");
        } else if (rtfEndCli.getText().isBlank()) {
            Alerta.Erro("Digite o endereço!", "Campo Obrigatório");
        } else if (Validacoes.formatarNumero(ftfTelCli.getText()).isBlank()) {
            Alerta.Erro("Digite o telefone!", "Campo Obrigatório");
        } else {

            // Cadastro de novo cliente
            Cliente cliente = new Cliente();
            cliente.setNomeC(rtfNomeCli.getText());
            cliente.setCpfC(Validacoes.formatarCPF(ftfCPFCli.getText()));
            cliente.setSexoC(cbxSexoCli.getSelectedItem().toString());
            cliente.setTelefoneC(Validacoes.formatarNumero(ftfTelCli.getText()));
            cliente.setEnderecoC(rtfEndCli.getText());
            ClienteDAO.cadastrarCliente(cliente);

            limparCampos(rtfNomeCli, ftfCPFCli, cbxSexoCli, rtfEndCli, ftfTelCli);

        }
    }

    public void validarSalvarFuncionario() {
        if (rtfNomeFun.getText().isBlank() && ftfCpfFun.getText().isBlank()
                && cbxSexoFun.getSelectedIndex() == 0 && rtfEndFun.getText().isBlank()
                && ftfTelFun.getText().isBlank() && cbxCargoFun.getSelectedIndex() == 0
                && rtfUsuFun.getText().isBlank() && rtfSenFun.getText().isBlank()) {

            Alerta.Erro("Todos os campos do Funcionário estão vazios!", "Campos Vazios");
        } else if (rtfNomeFun.getText().isBlank()) {
            Alerta.Erro("Digite o nome do funcionário!", "Campo Obrigatório");
        } else if (ftfCpfFun.getText().isBlank()) {
            Alerta.Erro("Digite o CPF do funcionário!", "Campo Obrigatório");
        } else if (cbxSexoFun.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione o sexo!", "Campo Obrigatório");
        } else if (rtfEndFun.getText().isBlank()) {
            Alerta.Erro("Digite o endereço!", "Campo Obrigatório");
        } else if (ftfTelFun.getText().isBlank()) {
            Alerta.Erro("Digite o telefone!", "Campo Obrigatório");
        } else if (cbxCargoFun.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione o cargo!", "Campo Obrigatório");
        } else if (rtfUsuFun.getText().isBlank()) {
            Alerta.Erro("Digite o nome de usuário!", "Campo Obrigatório");
        } else if (rtfSenFun.getText().isBlank()) {
            Alerta.Erro("Digite a senha!", "Campo Obrigatório");
        } else {

            // Cadastro de novo funcionario e login
            Funcionario funcionario = new Funcionario();
            Login login = new Login();

            login.setLogin(rtfUsuFun.getText());
            login.setSenha(rtfSenFun.getText());
            funcionario.setNomeF(rtfNomeFun.getText());
            funcionario.setCpfF(Validacoes.formatarCPF(ftfCpfFun.getText()));
            funcionario.setSexoF(cbxSexoFun.getSelectedItem().toString());
            funcionario.setTelefoneF(Validacoes.formatarNumero(ftfTelFun.getText()));
            funcionario.setCargoF(cbxCargoFun.getSelectedItem().toString());
            funcionario.setEnderecoF(rtfEndFun.getText());
            funcionario.setLogin(login);
            login.setFuncionario(funcionario);
            FuncionarioDAO.cadastrarFuncionario(funcionario);

            limparCampos(rtfNomeFun, ftfCpfFun, cbxSexoFun, rtfEndFun, ftfTelFun, cbxCargoFun, rtfUsuFun, rtfSenFun);
        }
    }

    public void validarSalvarPet() {
        if (rtfNomePetP.getText().isBlank() && cbxNomeTutorP.getSelectedIndex() == 0
                && cbxEspecieP.getSelectedIndex() == 0 && cbxRacaP.getSelectedIndex() == 0
                && cbxSexoP.getSelectedIndex() == 0 && ftfDataNascP.getText().isBlank()) {

            Alerta.Erro("Todos os campos do Pet estão vazios!", "Campos Vazios");
        } else if (rtfNomePetP.getText().isBlank()) {
            Alerta.Erro("Digite o nome do pet!", "Campo Obrigatório");
        } else if (cbxNomeTutorP.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione o tutor!", "Campo Obrigatório");
        } else if (cbxEspecieP.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione a espécie!", "Campo Obrigatório");
        } else if (cbxRacaP.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione a raça!", "Campo Obrigatório");
        } else if (cbxSexoP.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione o sexo!", "Campo Obrigatório");
        } else if (Validacoes.formatarData(ftfDataNascP.getText()).isBlank()) {
            Alerta.Erro("Informe a data de nascimento!", "Campo Obrigatório");
        } else {

            // Cadastro de novo Pet
            Pet pet = new Pet();

            Cliente clienteSelecionadoPet = listaCliente.stream()
                    .filter(cliente -> cliente.getNomeC().equals(cbxNomeTutorP.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            Especie especieSelecionada = listaEspecie.stream()
                    .filter(especie -> especie.getNomeEspecie().equals(cbxEspecieP.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            Raca racaSelecionada = listaRacas.stream()
                    .filter(raca -> raca.getNomeRaca().equals(cbxRacaP.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            pet.setNomePet(rtfNomePetP.getText());
            pet.setCliente(clienteSelecionadoPet);
            pet.setEspecie(especieSelecionada);
            pet.setRaca(racaSelecionada);
            pet.setSexoPet(cbxSexoP.getSelectedItem().toString());
            pet.setDataNascPet(LocalDate.parse(Formatador.converterData(ftfDataNascP.getText())));

            PetDAO.cadastrarPet(pet);

            limparCampos(rtfNomePetP, cbxNomeTutorP, cbxEspecieP, cbxRacaP, cbxSexoP, ftfDataNascP);
        }
    }

    public void validarSalvarProduto() {
        if (rtfNomeProdP.getText().isBlank() && rtfDescPro.getText().isBlank()
                && cbxGrupoPro.getSelectedIndex() == 0 && cbxMarcaPro.getSelectedIndex() == 0
                && cbxUniVendaPro.getSelectedIndex() == 0 && Validacoes.formatarValor(ftfValorPro.getText()).isBlank()) {

            Alerta.Erro("Todos os campos do Produto estão vazios!", "Campos Vazios");
        } else if (rtfNomeProdP.getText().isBlank()) {
            Alerta.Erro("Digite o nome do produto!", "Campo Obrigatório");
        } else if (rtfDescPro.getText().isBlank()) {
            Alerta.Erro("Digite a descrição!", "Campo Obrigatório");
        } else if (cbxGrupoPro.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione o grupo!", "Campo Obrigatório");
        } else if (cbxMarcaPro.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione a marca!", "Campo Obrigatório");
        } else if (cbxUniVendaPro.getSelectedIndex() == 0) {
            Alerta.Erro("Selecione a unidade de venda!", "Campo Obrigatório");
        } else if (Validacoes.formatarValor(ftfValorPro.getText()).isBlank()) {
            Alerta.Erro("Informe o valor!", "Campo Obrigatório");
        } else {

            Produto produto = new Produto();

            Grupo grupoSelecionado = listaGrupos.stream()
                    .filter(grupo -> grupo.getNomeGrupo().equals(cbxGrupoPro.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            Marca marcaSelecionada = listaMarcas.stream()
                    .filter(marca -> marca.getNomeMarca().equals(cbxMarcaPro.getSelectedItem().toString()))
                    .findFirst()
                    .orElse(null);

            produto.setNomeProd(rtfNomeProdP.getText());
            produto.setDescricaoProd(rtfDescPro.getText());
            produto.setGrupo(grupoSelecionado);
            produto.setMarca(marcaSelecionada);
            produto.setUnVenda(cbxUniVendaPro.getSelectedItem().toString());
            produto.setValorProd(Double.parseDouble(formatarValor(ftfValorPro.getText())));

            ProdutoDAO.cadastrarProduto(produto);

            limparCampos(rtfNomeProdP, rtfDescPro, cbxGrupoPro, cbxMarcaPro, cbxUniVendaPro, ftfValorPro);

        }
    }

    public void limparCampos(Component... componentes) {
        for (Component comp : componentes) {
            if (comp instanceof Components.RoundedTextField) {
                ((Components.RoundedTextField) comp).setText("");
            } else if (comp instanceof Components.RoundedFormattedTextField) {
                ((Components.RoundedFormattedTextField) comp).setText("");
            } else if (comp instanceof Components.RoundedComboBox) {
                ((Components.RoundedComboBox<?>) comp).setSelectedIndex(0);
            }
        }
    }

    public void montarCbxClienteConsulta() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Cliente cliente : listaCliente) {
            modelo.addElement(cliente.getNomeC());
        }

        cbxClienteC.setModel(modelo);

    }

    public void montarCbxClienteVenda() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Cliente cliente : listaCliente) {
            modelo.addElement(cliente.getNomeC());
        }

        cbxClienteV.setModel(modelo);

    }

    public void montarCbxGrupo() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Grupo grupo : listaGrupos) {
            modelo.addElement(grupo.getNomeGrupo());
        }

        cbxGrupoPro.setModel(modelo);

    }

    public void montarCbxMarca() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Marca marca : listaMarcas) {
            modelo.addElement(marca.getNomeMarca());
        }

        cbxMarcaPro.setModel(modelo);

    }

    public void montarCbxClientePet() {
        DefaultComboBoxModel modelo = new DefaultComboBoxModel();

        modelo.addElement(" ");
        for (Cliente cliente : listaCliente) {
            modelo.addElement(cliente.getNomeC());
        }

        cbxNomeTutorP.setModel(modelo);

    }

    public void montarCbxEspeciePet() {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Especie especie : listaEspecie) {
            modelo.addElement(especie.getNomeEspecie());
        }

        cbxEspecieP.setModel(modelo);

    }

    public void montarCbxPetConsulta(List<Pet> listaPet) {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Pet pet : listaPet) {
            modelo.addElement(pet.getNomePet());
        }

        cbxPetC.setModel(modelo);

    }

    public void montarCbxRaca(List<Raca> listaRacas) {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Raca raca : listaRacas) {
            modelo.addElement(raca.getNomeRaca());
        }

        cbxRacaP.setModel(modelo);

    }

    public void montarCbxProduto() {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Produto produto : listaProdutos) {
            modelo.addElement(produto.getNomeProd());
        }

        cbxProdutoV.setModel(modelo);

    }

    public void montarCbxVet(List<Funcionario> listaVet) {

        DefaultComboBoxModel modelo = new DefaultComboBoxModel();
        modelo.addElement(" ");
        for (Funcionario vet : listaVet) {
            modelo.addElement(vet.getNomeF());
        }

        cbxVetC.setModel(modelo);

    }
    
    public void viewChange(String cardName) {
        CardLayout cl = (CardLayout) panelTelasCad.getLayout();
        cl.show(panelTelasCad, cardName);
    }

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(TelasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelasCadastro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelasCadastro dialog = new TelasCadastro(new javax.swing.JFrame(), true, null);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botoes.JCustomButton2 btSalvarC;
    private Botoes.JCustomButton2 btSalvarCli;
    private Botoes.JCustomButton2 btSalvarFun;
    private Botoes.JCustomButton2 btSalvarP;
    private Botoes.JCustomButton2 btSalvarPro;
    private Botoes.JCustomButton2 btSalvarV;
    private Components.RoundedComboBox cbxCargoFun;
    private Components.RoundedComboBox cbxClienteC;
    private Components.RoundedComboBox cbxClienteV;
    private Components.RoundedComboBox cbxEspecieP;
    private Components.RoundedComboBox cbxGrupoPro;
    private Components.RoundedComboBox cbxMarcaPro;
    private Components.RoundedComboBox cbxNomeTutorP;
    private Components.RoundedComboBox cbxPetC;
    private Components.RoundedComboBox cbxProdutoV;
    private Components.RoundedComboBox cbxRacaP;
    private Components.RoundedComboBox cbxSexoCli;
    private Components.RoundedComboBox cbxSexoFun;
    private Components.RoundedComboBox cbxSexoP;
    private Components.RoundedComboBox cbxUniVendaPro;
    private Components.RoundedComboBox cbxVetC;
    private Components.RoundedFormattedTextField ftfCPFCli;
    private Components.RoundedFormattedTextField ftfCpfFun;
    private Components.RoundedFormattedTextField ftfDataNascP;
    private Components.RoundedFormattedTextField ftfTelCli;
    private Components.RoundedFormattedTextField ftfTelFun;
    private Components.RoundedFormattedTextField ftfValorConC;
    private Components.RoundedFormattedTextField ftfValorMedC;
    private Components.RoundedFormattedTextField ftfValorPro;
    private Components.RoundedFormattedTextField ftfValorV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpCadClientes;
    private javax.swing.JPanel jpCadConsultas;
    private javax.swing.JPanel jpCadFuncionario;
    private javax.swing.JPanel jpCadPets;
    private javax.swing.JPanel jpCadProdutos;
    private javax.swing.JPanel jpCadVendas;
    private javax.swing.JLabel lblCPFCli;
    private javax.swing.JLabel lblCPFFun;
    private javax.swing.JLabel lblCargoFun;
    private javax.swing.JLabel lblClienteC;
    private javax.swing.JLabel lblClienteV;
    private javax.swing.JLabel lblDataNascP;
    private javax.swing.JLabel lblDescPro;
    private javax.swing.JLabel lblEndCli;
    private javax.swing.JLabel lblEndFun;
    private javax.swing.JLabel lblEspecieP;
    private javax.swing.JLabel lblGrupoPro;
    private javax.swing.JLabel lblMarcaPro;
    private javax.swing.JLabel lblNomeCompleto;
    private javax.swing.JLabel lblNomeFun;
    private javax.swing.JLabel lblNomePet;
    private javax.swing.JLabel lblNomeProdPro;
    private javax.swing.JLabel lblNomeTutorP;
    private javax.swing.JLabel lblObsC;
    private javax.swing.JLabel lblPetC;
    private javax.swing.JLabel lblProdutoV;
    private javax.swing.JLabel lblQuantidadeV;
    private javax.swing.JLabel lblRacaP;
    private javax.swing.JLabel lblSenFun;
    private javax.swing.JLabel lblSexoCli;
    private javax.swing.JLabel lblSexoFun;
    private javax.swing.JLabel lblSexoP;
    private javax.swing.JLabel lblTelCli;
    private javax.swing.JLabel lblTelFun;
    private javax.swing.JLabel lblUniVenPro;
    private javax.swing.JLabel lblUsuFun;
    private javax.swing.JLabel lblValorConC;
    private javax.swing.JLabel lblValorMedC;
    private javax.swing.JLabel lblValorPro;
    private javax.swing.JLabel lblValorV;
    private javax.swing.JLabel lblVetC;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel panelTelasCad;
    private Components.RoundedTextField rtfDescPro;
    private Components.RoundedTextField rtfEndCli;
    private Components.RoundedTextField rtfEndFun;
    private Components.RoundedTextField rtfNomeCli;
    private Components.RoundedTextField rtfNomeFun;
    private Components.RoundedTextField rtfNomePetP;
    private Components.RoundedTextField rtfNomeProdP;
    private Components.RoundedTextField rtfObsC;
    private Components.RoundedTextField rtfQuantidadeV;
    private Components.RoundedTextField rtfSenFun;
    private Components.RoundedTextField rtfUsuFun;
    private javax.swing.JPanel topbar;
    // End of variables declaration//GEN-END:variables
}
