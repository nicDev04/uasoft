
package Telas;

import java.awt.Color;


public class TelaEdicao extends javax.swing.JDialog {

    public TelaEdicao(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        topbar = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        panelTelasEdit = new javax.swing.JPanel();
        jpEditVendas = new javax.swing.JPanel();
        lblClienteV = new javax.swing.JLabel();
        cbxClienteV = new Components.RoundedComboBox();
        cbxProdutoV = new Components.RoundedComboBox();
        lblProdutoV = new javax.swing.JLabel();
        rtfQuantidadeV = new Components.RoundedTextField();
        lblQuantidadeV = new javax.swing.JLabel();
        lblValorV = new javax.swing.JLabel();
        btSalvarV = new Botoes.JCustomButton2();
        ftfValorV = new Components.RoundedFormattedTextField();
        jpEditConsultas = new javax.swing.JPanel();
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
        jpEditClientes = new javax.swing.JPanel();
        lblNomeCompleto = new javax.swing.JLabel();
        rtfNomeCli = new Components.RoundedTextField();
        lblCPFCli = new javax.swing.JLabel();
        rtfCPFCli = new Components.RoundedTextField();
        lblSexoCli = new javax.swing.JLabel();
        cbxSexoCli = new Components.RoundedComboBox();
        lblTelCli = new javax.swing.JLabel();
        ftfTelCli = new Components.RoundedFormattedTextField();
        lblEndCli = new javax.swing.JLabel();
        rtfEndCli = new Components.RoundedTextField();
        btSalvarCli = new Botoes.JCustomButton2();
        jpEditPets = new javax.swing.JPanel();
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
        jpEditProdutos = new javax.swing.JPanel();
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
        jpEditFuncionario = new javax.swing.JPanel();
        lblNomeFun = new javax.swing.JLabel();
        rtfNomeFun = new Components.RoundedTextField();
        lblCPFFun = new javax.swing.JLabel();
        rtfCPFFun = new Components.RoundedTextField();
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

        panelTelasEdit.setBackground(new java.awt.Color(197, 228, 130));
        panelTelasEdit.setLayout(new java.awt.CardLayout());

        jpEditVendas.setBackground(new java.awt.Color(197, 228, 130));

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
        lblValorV.setText("Valor:");

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

        javax.swing.GroupLayout jpEditVendasLayout = new javax.swing.GroupLayout(jpEditVendas);
        jpEditVendas.setLayout(jpEditVendasLayout);
        jpEditVendasLayout.setHorizontalGroup(
            jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarV, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditVendasLayout.createSequentialGroup()
                .addGroup(jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditVendasLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rtfQuantidadeV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(cbxProdutoV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbxClienteV, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpEditVendasLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addGroup(jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblQuantidadeV)
                            .addComponent(lblClienteV)
                            .addComponent(lblProdutoV))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ftfValorV, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblValorV))
                .addGap(56, 56, 56))
        );
        jpEditVendasLayout.setVerticalGroup(
            jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditVendasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblClienteV)
                    .addComponent(lblValorV))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpEditVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        panelTelasEdit.add(jpEditVendas, "cardCadVendas");

        jpEditConsultas.setBackground(new java.awt.Color(197, 228, 130));

        lblClienteC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblClienteC.setForeground(new java.awt.Color(12, 134, 129));
        lblClienteC.setText("Cliente:");

        cbxClienteC.setEditable(true);
        cbxClienteC.setMaximumRowCount(100);
        cbxClienteC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxClienteC.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblPetC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblPetC.setForeground(new java.awt.Color(12, 134, 129));
        lblPetC.setText("Nome do Pet:");

        cbxPetC.setEditable(true);
        cbxPetC.setMaximumRowCount(100);
        cbxPetC.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
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
        lblValorConC.setText("Valor Consulta:");

        ftfValorConC.setBackground(new java.awt.Color(142, 196, 123));
        ftfValorConC.setForeground(new java.awt.Color(12, 134, 129));
        ftfValorConC.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfValorConC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ftfValorConC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat(""))));

        lblValorMedC.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblValorMedC.setForeground(new java.awt.Color(12, 134, 129));
        lblValorMedC.setText("Valor Medicamentos:");

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

        javax.swing.GroupLayout jpEditConsultasLayout = new javax.swing.GroupLayout(jpEditConsultas);
        jpEditConsultas.setLayout(jpEditConsultasLayout);
        jpEditConsultasLayout.setHorizontalGroup(
            jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditConsultasLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditConsultasLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblClienteC)
                            .addComponent(lblPetC)
                            .addComponent(lblVetC)))
                    .addComponent(cbxVetC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxPetC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxClienteC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ftfValorMedC, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblValorMedC)
                        .addComponent(ftfValorConC, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblValorConC))
                    .addComponent(lblObsC)
                    .addComponent(rtfObsC, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditConsultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpEditConsultasLayout.setVerticalGroup(
            jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditConsultasLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpEditConsultasLayout.createSequentialGroup()
                        .addComponent(lblClienteC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxClienteC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditConsultasLayout.createSequentialGroup()
                        .addComponent(lblValorConC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfValorConC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditConsultasLayout.createSequentialGroup()
                        .addComponent(lblPetC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxPetC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditConsultasLayout.createSequentialGroup()
                        .addComponent(lblValorMedC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfValorMedC, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpEditConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditConsultasLayout.createSequentialGroup()
                        .addComponent(lblVetC)
                        .addGap(5, 5, 5)
                        .addComponent(cbxVetC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpEditConsultasLayout.createSequentialGroup()
                        .addComponent(lblObsC)
                        .addGap(5, 5, 5)
                        .addComponent(rtfObsC, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                        .addGap(50, 50, 50)
                        .addComponent(btSalvarC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
        );

        panelTelasEdit.add(jpEditConsultas, "cardCadConsultas");

        jpEditClientes.setBackground(new java.awt.Color(197, 228, 130));

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

        rtfCPFCli.setBackground(new java.awt.Color(142, 196, 123));
        rtfCPFCli.setForeground(new java.awt.Color(12, 134, 129));
        rtfCPFCli.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfCPFCli.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblSexoCli.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSexoCli.setForeground(new java.awt.Color(12, 134, 129));
        lblSexoCli.setText("Sexo:");

        cbxSexoCli.setEditable(true);
        cbxSexoCli.setMaximumRowCount(100);
        cbxSexoCli.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
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

        javax.swing.GroupLayout jpEditClientesLayout = new javax.swing.GroupLayout(jpEditClientes);
        jpEditClientes.setLayout(jpEditClientesLayout);
        jpEditClientesLayout.setHorizontalGroup(
            jpEditClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditClientesLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpEditClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomeCompleto)
                    .addComponent(rtfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEditClientesLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(lblSexoCli))
                    .addComponent(cbxSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCPFCli)
                    .addComponent(rtfCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 107, Short.MAX_VALUE)
                .addGroup(jpEditClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ftfTelCli, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblTelCli))
                    .addComponent(lblEndCli)
                    .addComponent(rtfEndCli, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(56, 56, 56))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpEditClientesLayout.setVerticalGroup(
            jpEditClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditClientesLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpEditClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpEditClientesLayout.createSequentialGroup()
                        .addComponent(lblNomeCompleto)
                        .addGap(5, 5, 5)
                        .addComponent(rtfNomeCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditClientesLayout.createSequentialGroup()
                        .addComponent(lblTelCli)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfTelCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpEditClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpEditClientesLayout.createSequentialGroup()
                        .addComponent(lblCPFCli)
                        .addGap(5, 5, 5)
                        .addComponent(rtfCPFCli, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblSexoCli))
                    .addGroup(jpEditClientesLayout.createSequentialGroup()
                        .addComponent(lblEndCli)
                        .addGap(5, 5, 5)
                        .addComponent(rtfEndCli, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbxSexoCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(btSalvarCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasEdit.add(jpEditClientes, "cardCadClientes");

        jpEditPets.setBackground(new java.awt.Color(197, 228, 130));

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
        cbxNomeTutorP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxNomeTutorP.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblSexoP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSexoP.setForeground(new java.awt.Color(12, 134, 129));
        lblSexoP.setText("Sexo:");

        cbxSexoP.setEditable(true);
        cbxSexoP.setMaximumRowCount(100);
        cbxSexoP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxSexoP.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblEspecieP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblEspecieP.setForeground(new java.awt.Color(12, 134, 129));
        lblEspecieP.setText("Espécie:");

        cbxEspecieP.setEditable(true);
        cbxEspecieP.setMaximumRowCount(100);
        cbxEspecieP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
        cbxEspecieP.setFocusable(false);
        cbxClienteC.setForeground(new Color(12, 134, 129));

        lblRacaP.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblRacaP.setForeground(new java.awt.Color(12, 134, 129));
        lblRacaP.setText("Raça:");

        cbxRacaP.setEditable(true);
        cbxRacaP.setMaximumRowCount(100);
        cbxRacaP.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
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

        javax.swing.GroupLayout jpEditPetsLayout = new javax.swing.GroupLayout(jpEditPets);
        jpEditPets.setLayout(jpEditPetsLayout);
        jpEditPetsLayout.setHorizontalGroup(
            jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditPetsLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNomePet)
                    .addComponent(rtfNomePetP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxSexoP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxNomeTutorP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSexoP)
                            .addComponent(lblNomeTutorP))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxEspecieP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxRacaP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblEspecieP)
                            .addComponent(lblRacaP)))
                    .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(ftfDataNascP, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                        .addComponent(lblDataNascP)))
                .addGap(55, 55, 55))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditPetsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarP, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpEditPetsLayout.setVerticalGroup(
            jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditPetsLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addComponent(lblNomePet)
                        .addGap(5, 5, 5)
                        .addComponent(rtfNomePetP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addComponent(lblEspecieP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxEspecieP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addComponent(lblNomeTutorP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxNomeTutorP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addComponent(lblRacaP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxRacaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpEditPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addComponent(lblSexoP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSexoP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditPetsLayout.createSequentialGroup()
                        .addComponent(lblDataNascP)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfDataNascP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 113, Short.MAX_VALUE)
                .addComponent(btSalvarP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasEdit.add(jpEditPets, "cardCadPets");

        jpEditProdutos.setBackground(new java.awt.Color(197, 228, 130));

        lblNomeProdPro.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblNomeProdPro.setForeground(new java.awt.Color(12, 134, 129));
        lblNomeProdPro.setText("Nome do Produto:");

        rtfNomeProdP.setBackground(new java.awt.Color(142, 196, 123));
        rtfNomeProdP.setForeground(new java.awt.Color(12, 134, 129));
        rtfNomeProdP.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfNomeProdP.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        cbxUniVendaPro.setEditable(true);
        cbxUniVendaPro.setMaximumRowCount(100);
        cbxUniVendaPro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
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
        lblValorPro.setText("Valor:");

        ftfValorPro.setBackground(new java.awt.Color(142, 196, 123));
        ftfValorPro.setForeground(new java.awt.Color(12, 134, 129));
        ftfValorPro.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        ftfValorPro.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        ftfValorPro.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter()));

        javax.swing.GroupLayout jpEditProdutosLayout = new javax.swing.GroupLayout(jpEditProdutos);
        jpEditProdutos.setLayout(jpEditProdutosLayout);
        jpEditProdutosLayout.setHorizontalGroup(
            jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarPro, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
            .addGroup(jpEditProdutosLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditProdutosLayout.createSequentialGroup()
                        .addGroup(jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbxGrupoPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpEditProdutosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblGrupoPro)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jpEditProdutosLayout.createSequentialGroup()
                        .addGroup(jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblNomeProdPro)
                            .addComponent(rtfNomeProdP, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxMarcaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbxUniVendaPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jpEditProdutosLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMarcaPro)
                                    .addComponent(lblUniVenPro))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addGroup(jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDescPro)
                            .addComponent(rtfDescPro, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ftfValorPro, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblValorPro))
                        .addGap(55, 55, 55))))
        );
        jpEditProdutosLayout.setVerticalGroup(
            jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditProdutosLayout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jpEditProdutosLayout.createSequentialGroup()
                        .addComponent(lblNomeProdPro)
                        .addGap(5, 5, 5)
                        .addComponent(rtfNomeProdP, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditProdutosLayout.createSequentialGroup()
                        .addComponent(lblValorPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfValorPro, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jpEditProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpEditProdutosLayout.createSequentialGroup()
                        .addComponent(lblUniVenPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxUniVendaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMarcaPro)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxMarcaPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditProdutosLayout.createSequentialGroup()
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

        panelTelasEdit.add(jpEditProdutos, "cardCadProdutos");

        jpEditFuncionario.setBackground(new java.awt.Color(197, 228, 130));

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

        rtfCPFFun.setBackground(new java.awt.Color(142, 196, 123));
        rtfCPFFun.setForeground(new java.awt.Color(12, 134, 129));
        rtfCPFFun.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfCPFFun.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N

        lblSexoFun.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblSexoFun.setForeground(new java.awt.Color(12, 134, 129));
        lblSexoFun.setText("Sexo:");

        cbxSexoFun.setEditable(true);
        cbxSexoFun.setMaximumRowCount(100);
        cbxSexoFun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
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
        cbxCargoFun.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Teste", "Teste2" }));
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

        javax.swing.GroupLayout jpEditFuncionarioLayout = new javax.swing.GroupLayout(jpEditFuncionario);
        jpEditFuncionario.setLayout(jpEditFuncionarioLayout);
        jpEditFuncionarioLayout.setHorizontalGroup(
            jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpEditFuncionarioLayout.createSequentialGroup()
                        .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(ftfTelFun, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                            .addComponent(lblTelFun))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                        .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jpEditFuncionarioLayout.createSequentialGroup()
                                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblNomeFun)
                                    .addComponent(rtfNomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCPFFun)
                                    .addComponent(rtfCPFFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEndFun)
                                    .addComponent(rtfEndFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblCargoFun))
                                    .addComponent(cbxCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(lblSexoFun))
                                    .addComponent(cbxSexoFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsuFun)
                                    .addComponent(rtfUsuFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblSenFun)
                                    .addComponent(rtfSenFun, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 58, 58))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpEditFuncionarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSalvarFun, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );
        jpEditFuncionarioLayout.setVerticalGroup(
            jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblEndFun, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblNomeFun, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(5, 5, 5)
                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                        .addComponent(rtfNomeFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCPFFun)
                        .addGap(5, 5, 5)
                        .addComponent(rtfCPFFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                        .addComponent(rtfEndFun, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCargoFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxCargoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblSexoFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSexoFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblUsuFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rtfUsuFun, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jpEditFuncionarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblTelFun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ftfTelFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jpEditFuncionarioLayout.createSequentialGroup()
                        .addComponent(lblSenFun)
                        .addGap(5, 5, 5)
                        .addComponent(rtfSenFun, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btSalvarFun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        panelTelasEdit.add(jpEditFuncionario, "cardCadFuncionarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTelasEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTelasEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
        
    }//GEN-LAST:event_btSalvarVActionPerformed

    private void btSalvarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCActionPerformed
        
    }//GEN-LAST:event_btSalvarCActionPerformed

    private void btSalvarCliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarCliActionPerformed
        
    }//GEN-LAST:event_btSalvarCliActionPerformed

    private void btSalvarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarPActionPerformed
        
    }//GEN-LAST:event_btSalvarPActionPerformed

    private void btSalvarProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarProActionPerformed
        
    }//GEN-LAST:event_btSalvarProActionPerformed

    private void btSalvarFunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSalvarFunActionPerformed
        
    }//GEN-LAST:event_btSalvarFunActionPerformed

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
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaEdicao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TelaEdicao dialog = new TelaEdicao(new javax.swing.JFrame(), true);
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
    private Components.RoundedFormattedTextField ftfDataNascP;
    private Components.RoundedFormattedTextField ftfTelCli;
    private Components.RoundedFormattedTextField ftfTelFun;
    private Components.RoundedFormattedTextField ftfValorConC;
    private Components.RoundedFormattedTextField ftfValorMedC;
    private Components.RoundedFormattedTextField ftfValorPro;
    private Components.RoundedFormattedTextField ftfValorV;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpEditClientes;
    private javax.swing.JPanel jpEditConsultas;
    private javax.swing.JPanel jpEditFuncionario;
    private javax.swing.JPanel jpEditPets;
    private javax.swing.JPanel jpEditProdutos;
    private javax.swing.JPanel jpEditVendas;
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
    private javax.swing.JPanel panelTelasEdit;
    private Components.RoundedTextField rtfCPFCli;
    private Components.RoundedTextField rtfCPFFun;
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
