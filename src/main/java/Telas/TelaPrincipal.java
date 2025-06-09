package Telas;

import Botoes.JCustomButton2;
import static Botoes.JCustomButton2.ButtonStyle.EXIT;
import static Botoes.JCustomButton2.ButtonStyle.SECONDARY;
import Classes.Cliente;
import Classes.Consulta;
import Classes.Funcionario;
import Classes.Login;
import Classes.Pet;
import Classes.Produto;
import Classes.Venda;
import ClassesDAO.ClienteDAO;
import ClassesDAO.ConsultaDAO;
import ClassesDAO.FuncionarioDAO;
import ClassesDAO.PetDAO;
import ClassesDAO.ProdutoDAO;
import ClassesDAO.VendaDAO;
import Utilidades.Alerta;
import Utilidades.Formatador;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

public class TelaPrincipal extends javax.swing.JFrame {
    
    private Login login;
    
    public TelaPrincipal(Login login) {
        initComponents();
        this.login = login;
        definirRestricoes(login);
        viewChange("cardVendas");
        atualizarTabelaVendas();
        atualizarTabelaConsultas();
        atualizarTabelaClientes();
        atualizarTabelaPets();
        atualizarTabelaProdutos();
        atualizarTabelaFuncionarios();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sidebar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btVendas = new Botoes.JCustomButton2();
        btConsultas = new Botoes.JCustomButton2();
        btClientes = new Botoes.JCustomButton2();
        btPets = new Botoes.JCustomButton2();
        btProdutos = new Botoes.JCustomButton2();
        btFuncionarios = new Botoes.JCustomButton2();
        btSair = new Botoes.JCustomButton2();
        panelTelas = new javax.swing.JPanel();
        jpVendas = new javax.swing.JPanel();
        spVendas = new javax.swing.JScrollPane();
        tbVendas = new javax.swing.JTable();
        btExcluirVenda = new Botoes.JCustomButton2();
        btAdicionarVenda = new Botoes.JCustomButton2();
        btEditarVenda = new Botoes.JCustomButton2();
        jpConsultas = new javax.swing.JPanel();
        spConsultas = new javax.swing.JScrollPane();
        tbConsultas = new javax.swing.JTable();
        btExcluirConsulta = new Botoes.JCustomButton2();
        btAdicionarConsulta = new Botoes.JCustomButton2();
        btEditarConsulta = new Botoes.JCustomButton2();
        jpClientes = new javax.swing.JPanel();
        btEditarCliente = new Botoes.JCustomButton2();
        spClientes = new javax.swing.JScrollPane();
        tbClientes = new javax.swing.JTable();
        btExcluirCliente = new Botoes.JCustomButton2();
        btAdicionarCliente = new Botoes.JCustomButton2();
        jpPets = new javax.swing.JPanel();
        spPets = new javax.swing.JScrollPane();
        tbPets = new javax.swing.JTable();
        btEditarPet = new Botoes.JCustomButton2();
        btExcluirPet = new Botoes.JCustomButton2();
        btAdicionarPet = new Botoes.JCustomButton2();
        jpProdutos = new javax.swing.JPanel();
        spProdutos = new javax.swing.JScrollPane();
        tbProdutos = new javax.swing.JTable();
        btExcluirProduto = new Botoes.JCustomButton2();
        btAdicionarProduto = new Botoes.JCustomButton2();
        btEditarProduto = new Botoes.JCustomButton2();
        jpFuncionarios = new javax.swing.JPanel();
        spFuncionarios = new javax.swing.JScrollPane();
        tbFuncionarios = new javax.swing.JTable();
        btExcluirFuncionario = new Botoes.JCustomButton2();
        btAdicionarFuncionario = new Botoes.JCustomButton2();
        btEditarFuncionario = new Botoes.JCustomButton2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(197, 228, 130));

        sidebar.setBackground(new java.awt.Color(142, 196, 123));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LOGO UASOFT - VERDE ÁGUA (1).png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(152, 35));

        btVendas.setText("   Vendas");
        btVendas.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btVendas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btVendas.setRound(10);
        btVendas.setStyle(Botoes.JCustomButton2.ButtonStyle.EXIT);
        btVendas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btVendasActionPerformed(evt);
            }
        });

        btConsultas.setText("   Consultas");
        btConsultas.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btConsultas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btConsultas.setRound(10);
        btConsultas.setStyle(Botoes.JCustomButton2.ButtonStyle.EXIT);
        btConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btConsultasActionPerformed(evt);
            }
        });

        btClientes.setText("   Clientes");
        btClientes.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btClientes.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btClientes.setRound(10);
        btClientes.setStyle(Botoes.JCustomButton2.ButtonStyle.EXIT);
        btClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btClientesActionPerformed(evt);
            }
        });

        btPets.setText("   Pets");
        btPets.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btPets.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btPets.setRound(10);
        btPets.setStyle(Botoes.JCustomButton2.ButtonStyle.EXIT);
        btPets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btPetsActionPerformed(evt);
            }
        });

        btProdutos.setText("   Produtos");
        btProdutos.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btProdutos.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btProdutos.setRound(10);
        btProdutos.setStyle(Botoes.JCustomButton2.ButtonStyle.EXIT);
        btProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btProdutosActionPerformed(evt);
            }
        });

        btFuncionarios.setText("   Funcionários");
        btFuncionarios.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btFuncionarios.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btFuncionarios.setRound(10);
        btFuncionarios.setStyle(Botoes.JCustomButton2.ButtonStyle.EXIT);
        btFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btFuncionariosActionPerformed(evt);
            }
        });

        btSair.setText("Sair");
        btSair.setFont(new java.awt.Font("Roboto", 1, 22)); // NOI18N
        btSair.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btSair.setRound(10);
        btSair.setStyle(Botoes.JCustomButton2.ButtonStyle.EXIT);
        btSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btSairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout sidebarLayout = new javax.swing.GroupLayout(sidebar);
        sidebar.setLayout(sidebarLayout);
        sidebarLayout.setHorizontalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btPets, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sidebarLayout.createSequentialGroup()
                            .addGroup(sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)))
                    .addComponent(btFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        sidebarLayout.setVerticalGroup(
            sidebarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(sidebarLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(btVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btPets, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(btFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btSair, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        panelTelas.setBackground(new java.awt.Color(197, 228, 130));
        panelTelas.setLayout(new java.awt.CardLayout());

        jpVendas.setBackground(new java.awt.Color(197, 228, 130));

        spVendas.setBackground(new java.awt.Color(197, 228, 130));
        spVendas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spVendas.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spVendas.setViewportView(null);
        //spVendas.getViewport().setBackground(new java.awt.Color(197, 228, 130));
        spVendas.setViewportBorder(null);

        tbVendas.setBackground(new java.awt.Color(142, 196, 123));
        tbVendas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbVendas.setForeground(new java.awt.Color(12, 134, 129));
        tbVendas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Cliente", "Produto", "Quantidade", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbVendas.setFocusable(false);
        tbVendas.setGridColor(new java.awt.Color(197, 228, 130));
        tbVendas.setRowHeight(40);
        tbVendas.setSelectionBackground(new java.awt.Color(176, 204, 135));
        tbVendas.setSelectionForeground(new java.awt.Color(12, 134, 129));
        tbVendas.setShowHorizontalLines(true);
        tbVendas.setShowVerticalLines(true);
        spVendas.setViewportView(tbVendas);
        if (tbVendas.getColumnModel().getColumnCount() > 0) {
            tbVendas.getColumnModel().getColumn(0).setResizable(false);
            tbVendas.getColumnModel().getColumn(0).setPreferredWidth(35);
        }
        DefaultTableCellRenderer centralizarTabela = new DefaultTableCellRenderer();
        centralizarTabela.setHorizontalAlignment(SwingConstants.CENTER);

        for (int i = 0; i < tbVendas.getColumnCount(); i++) {
            tbVendas.getColumnModel().getColumn(i).setCellRenderer(centralizarTabela);
        }

        TableCellRenderer baseRenderer = tbVendas.getTableHeader().getDefaultRenderer();
        tbVendas.getTableHeader().setDefaultRenderer((tbl, value, isSelected, hasFocus, row, column) -> {
            JComponent comp = (JComponent) baseRenderer.getTableCellRendererComponent(tbl, value, isSelected, hasFocus, row, column);
            comp.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            return comp;
        });

        tbVendas.setIntercellSpacing(new Dimension(0, 0));
        tbVendas.getTableHeader().setBackground(new Color(118, 166, 101));
        tbVendas.getTableHeader().setForeground(new Color(197, 228, 130));
        tbVendas.getTableHeader().setSize(70, 70);
        tbVendas.setShowVerticalLines(true);
        tbVendas.getTableHeader().setFont( new Font("Roboto",Font.BOLD, 20));
        tbVendas.setFillsViewportHeight(true);
        tbVendas.setBorder(null);
        tbVendas.getTableHeader().setReorderingAllowed(false);

        btExcluirVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete (1) 2.png"))); // NOI18N
        btExcluirVenda.setRound(10);
        btExcluirVenda.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btExcluirVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirVendaActionPerformed(evt);
            }
        });

        btAdicionarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus (3) 2.png"))); // NOI18N
        btAdicionarVenda.setRound(10);
        btAdicionarVenda.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btAdicionarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarVendaActionPerformed(evt);
            }
        });

        btEditarVenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pen (1) 1.png"))); // NOI18N
        btEditarVenda.setRound(10);
        btEditarVenda.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btEditarVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarVendaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpVendasLayout = new javax.swing.GroupLayout(jpVendas);
        jpVendas.setLayout(jpVendasLayout);
        jpVendasLayout.setHorizontalGroup(
            jpVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(spVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpVendasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpVendasLayout.setVerticalGroup(
            jpVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpVendasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jpVendasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spVendas, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelTelas.add(jpVendas, "cardVendas");

        jpConsultas.setBackground(new java.awt.Color(197, 228, 130));

        spConsultas.setBackground(new java.awt.Color(197, 228, 130));
        spConsultas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spConsultas.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spConsultas.setViewportView(null);
        //spVendas.getViewport().setBackground(new java.awt.Color(197, 228, 130));
        spConsultas.setViewportBorder(null);

        tbConsultas.setBackground(new java.awt.Color(142, 196, 123));
        tbConsultas.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbConsultas.setForeground(new java.awt.Color(12, 134, 129));
        tbConsultas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Data", "Pet", "Tutor", "Veterinário", "Obs.", "Valor Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbConsultas.setFocusable(false);
        tbConsultas.setGridColor(new java.awt.Color(197, 228, 130));
        tbConsultas.setRowHeight(40);
        tbConsultas.setSelectionBackground(new java.awt.Color(176, 204, 135));
        tbConsultas.setSelectionForeground(new java.awt.Color(12, 134, 129));
        tbConsultas.setShowHorizontalLines(true);
        tbConsultas.setShowVerticalLines(true);
        spConsultas.setViewportView(tbConsultas);
        if (tbConsultas.getColumnModel().getColumnCount() > 0) {
            tbConsultas.getColumnModel().getColumn(0).setResizable(false);
            tbConsultas.getColumnModel().getColumn(0).setPreferredWidth(35);
        }
        for (int i = 0; i < tbConsultas.getColumnCount(); i++) {
            tbConsultas.getColumnModel().getColumn(i).setCellRenderer(centralizarTabela);
        }
        tbConsultas.getTableHeader().setDefaultRenderer((tbl, value, isSelected, hasFocus, row, column) -> {
            JComponent comp = (JComponent) baseRenderer.getTableCellRendererComponent(tbl, value, isSelected, hasFocus, row, column);
            comp.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            return comp;
        });

        tbConsultas.setIntercellSpacing(new Dimension(0, 0));
        tbConsultas.getTableHeader().setBackground(new Color(118, 166, 101));
        tbConsultas.getTableHeader().setForeground(new Color(197, 228, 130));
        tbConsultas.getTableHeader().setSize(70, 70);
        tbConsultas.setShowVerticalLines(true);
        tbConsultas.getTableHeader().setFont( new Font("Roboto",Font.BOLD, 20));
        tbConsultas.setFillsViewportHeight(true);
        tbConsultas.setBorder(null);
        tbConsultas.getTableHeader().setReorderingAllowed(false);

        btExcluirConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete (1) 2.png"))); // NOI18N
        btExcluirConsulta.setRound(10);
        btExcluirConsulta.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btExcluirConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirConsultaActionPerformed(evt);
            }
        });

        btAdicionarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus (3) 2.png"))); // NOI18N
        btAdicionarConsulta.setRound(10);
        btAdicionarConsulta.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btAdicionarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarConsultaActionPerformed(evt);
            }
        });

        btEditarConsulta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pen (1) 1.png"))); // NOI18N
        btEditarConsulta.setRound(10);
        btEditarConsulta.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btEditarConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarConsultaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpConsultasLayout = new javax.swing.GroupLayout(jpConsultas);
        jpConsultas.setLayout(jpConsultasLayout);
        jpConsultasLayout.setHorizontalGroup(
            jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultasLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(spConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpConsultasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpConsultasLayout.setVerticalGroup(
            jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpConsultasLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jpConsultasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarConsulta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spConsultas, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelTelas.add(jpConsultas, "cardConsultas");

        jpClientes.setBackground(new java.awt.Color(197, 228, 130));

        btEditarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pen (1) 1.png"))); // NOI18N
        btEditarCliente.setRound(10);
        btEditarCliente.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btEditarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarClienteActionPerformed(evt);
            }
        });

        spClientes.setBackground(new java.awt.Color(197, 228, 130));
        spClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spClientes.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spClientes.setViewportView(null);
        //spVendas.getViewport().setBackground(new java.awt.Color(197, 228, 130));
        spClientes.setViewportBorder(null);

        tbClientes.setBackground(new java.awt.Color(142, 196, 123));
        tbClientes.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbClientes.setForeground(new java.awt.Color(12, 134, 129));
        tbClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo", "Telefone", "Endereço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbClientes.setFocusable(false);
        tbClientes.setGridColor(new java.awt.Color(197, 228, 130));
        tbClientes.setRowHeight(40);
        tbClientes.setSelectionBackground(new java.awt.Color(176, 204, 135));
        tbClientes.setSelectionForeground(new java.awt.Color(12, 134, 129));
        tbClientes.setShowHorizontalLines(true);
        tbClientes.setShowVerticalLines(true);
        spClientes.setViewportView(tbClientes);
        if (tbClientes.getColumnModel().getColumnCount() > 0) {
            tbClientes.getColumnModel().getColumn(0).setResizable(false);
            tbClientes.getColumnModel().getColumn(0).setPreferredWidth(35);
        }
        for (int i = 0; i < tbClientes.getColumnCount(); i++) {
            tbClientes.getColumnModel().getColumn(i).setCellRenderer(centralizarTabela);
        }
        tbClientes.getTableHeader().setDefaultRenderer((tbl, value, isSelected, hasFocus, row, column) -> {
            JComponent comp = (JComponent) baseRenderer.getTableCellRendererComponent(tbl, value, isSelected, hasFocus, row, column);
            comp.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            return comp;
        });

        tbClientes.setIntercellSpacing(new Dimension(0, 0));
        tbClientes.getTableHeader().setBackground(new Color(118, 166, 101));
        tbClientes.getTableHeader().setForeground(new Color(197, 228, 130));
        tbClientes.getTableHeader().setSize(70, 70);
        tbClientes.setShowVerticalLines(true);
        tbClientes.getTableHeader().setFont( new Font("Roboto",Font.BOLD, 20));
        tbClientes.setFillsViewportHeight(true);
        tbClientes.setBorder(null);
        tbClientes.getTableHeader().setReorderingAllowed(false);

        btExcluirCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete (1) 2.png"))); // NOI18N
        btExcluirCliente.setRound(10);
        btExcluirCliente.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btExcluirCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirClienteActionPerformed(evt);
            }
        });

        btAdicionarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus (3) 2.png"))); // NOI18N
        btAdicionarCliente.setRound(10);
        btAdicionarCliente.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btAdicionarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpClientesLayout = new javax.swing.GroupLayout(jpClientes);
        jpClientes.setLayout(jpClientesLayout);
        jpClientesLayout.setHorizontalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClientesLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(spClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpClientesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpClientesLayout.setVerticalGroup(
            jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpClientesLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jpClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelTelas.add(jpClientes, "cardClientes");

        jpPets.setBackground(new java.awt.Color(197, 228, 130));

        spPets.setBackground(new java.awt.Color(197, 228, 130));
        spPets.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spPets.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spPets.setViewportView(null);
        //spVendas.getViewport().setBackground(new java.awt.Color(197, 228, 130));
        spPets.setViewportBorder(null);

        tbPets.setBackground(new java.awt.Color(142, 196, 123));
        tbPets.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbPets.setForeground(new java.awt.Color(12, 134, 129));
        tbPets.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "Tutor", "Sexo", "Espécie", "Raça", "Data Nascimento"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPets.setFocusable(false);
        tbPets.setGridColor(new java.awt.Color(197, 228, 130));
        tbPets.setRowHeight(40);
        tbPets.setSelectionBackground(new java.awt.Color(176, 204, 135));
        tbPets.setSelectionForeground(new java.awt.Color(12, 134, 129));
        tbPets.setShowHorizontalLines(true);
        tbPets.setShowVerticalLines(true);
        spPets.setViewportView(tbPets);
        if (tbPets.getColumnModel().getColumnCount() > 0) {
            tbPets.getColumnModel().getColumn(0).setResizable(false);
            tbPets.getColumnModel().getColumn(0).setPreferredWidth(35);
        }
        for (int i = 0; i < tbPets.getColumnCount(); i++) {
            tbPets.getColumnModel().getColumn(i).setCellRenderer(centralizarTabela);
        }
        tbPets.getTableHeader().setDefaultRenderer((tbl, value, isSelected, hasFocus, row, column) -> {
            JComponent comp = (JComponent) baseRenderer.getTableCellRendererComponent(tbl, value, isSelected, hasFocus, row, column);
            comp.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            return comp;
        });

        tbPets.setIntercellSpacing(new Dimension(0, 0));
        tbPets.getTableHeader().setBackground(new Color(118, 166, 101));
        tbPets.getTableHeader().setForeground(new Color(197, 228, 130));
        tbPets.getTableHeader().setSize(70, 70);
        tbPets.setShowVerticalLines(true);
        tbPets.getTableHeader().setFont( new Font("Roboto",Font.BOLD, 20));
        tbPets.setFillsViewportHeight(true);
        tbPets.setBorder(null);
        tbPets.getTableHeader().setReorderingAllowed(false);

        btEditarPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pen (1) 1.png"))); // NOI18N
        btEditarPet.setRound(10);
        btEditarPet.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btEditarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarPetActionPerformed(evt);
            }
        });

        btExcluirPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete (1) 2.png"))); // NOI18N
        btExcluirPet.setRound(10);
        btExcluirPet.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btExcluirPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirPetActionPerformed(evt);
            }
        });

        btAdicionarPet.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus (3) 2.png"))); // NOI18N
        btAdicionarPet.setRound(10);
        btAdicionarPet.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btAdicionarPet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarPetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpPetsLayout = new javax.swing.GroupLayout(jpPets);
        jpPets.setLayout(jpPetsLayout);
        jpPetsLayout.setHorizontalGroup(
            jpPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPetsLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(spPets, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpPetsLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluirPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpPetsLayout.setVerticalGroup(
            jpPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpPetsLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jpPetsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarPet, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spPets, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelTelas.add(jpPets, "cardPets");

        jpProdutos.setBackground(new java.awt.Color(197, 228, 130));

        spProdutos.setBackground(new java.awt.Color(197, 228, 130));
        spProdutos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spProdutos.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spProdutos.setViewportView(null);
        //spVendas.getViewport().setBackground(new java.awt.Color(197, 228, 130));
        spProdutos.setViewportBorder(null);

        tbProdutos.setBackground(new java.awt.Color(142, 196, 123));
        tbProdutos.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbProdutos.setForeground(new java.awt.Color(12, 134, 129));
        tbProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Produto", "Grupo", "Marca", "UN", "Valor", "Descrição"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbProdutos.setFocusable(false);
        tbProdutos.setGridColor(new java.awt.Color(197, 228, 130));
        tbProdutos.setRowHeight(40);
        tbProdutos.setSelectionBackground(new java.awt.Color(176, 204, 135));
        tbProdutos.setSelectionForeground(new java.awt.Color(12, 134, 129));
        tbProdutos.setShowHorizontalLines(true);
        tbProdutos.setShowVerticalLines(true);
        spProdutos.setViewportView(tbProdutos);
        if (tbProdutos.getColumnModel().getColumnCount() > 0) {
            tbProdutos.getColumnModel().getColumn(0).setResizable(false);
            tbProdutos.getColumnModel().getColumn(0).setPreferredWidth(35);
        }
        for (int i = 0; i < tbProdutos.getColumnCount(); i++) {
            tbProdutos.getColumnModel().getColumn(i).setCellRenderer(centralizarTabela);
        }
        tbProdutos.getTableHeader().setDefaultRenderer((tbl, value, isSelected, hasFocus, row, column) -> {
            JComponent comp = (JComponent) baseRenderer.getTableCellRendererComponent(tbl, value, isSelected, hasFocus, row, column);
            comp.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            return comp;
        });

        tbProdutos.setIntercellSpacing(new Dimension(0, 0));
        tbProdutos.getTableHeader().setBackground(new Color(118, 166, 101));
        tbProdutos.getTableHeader().setForeground(new Color(197, 228, 130));
        tbProdutos.getTableHeader().setSize(70, 70);
        tbProdutos.setShowVerticalLines(true);
        tbProdutos.getTableHeader().setFont( new Font("Roboto",Font.BOLD, 20));
        tbProdutos.setFillsViewportHeight(true);
        tbProdutos.setBorder(null);
        tbProdutos.getTableHeader().setReorderingAllowed(false);

        btExcluirProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete (1) 2.png"))); // NOI18N
        btExcluirProduto.setRound(10);
        btExcluirProduto.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btExcluirProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirProdutoActionPerformed(evt);
            }
        });

        btAdicionarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus (3) 2.png"))); // NOI18N
        btAdicionarProduto.setRound(10);
        btAdicionarProduto.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btAdicionarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarProdutoActionPerformed(evt);
            }
        });

        btEditarProduto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pen (1) 1.png"))); // NOI18N
        btEditarProduto.setRound(10);
        btEditarProduto.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btEditarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarProdutoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpProdutosLayout = new javax.swing.GroupLayout(jpProdutos);
        jpProdutos.setLayout(jpProdutosLayout);
        jpProdutosLayout.setHorizontalGroup(
            jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProdutosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(spProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpProdutosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpProdutosLayout.setVerticalGroup(
            jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpProdutosLayout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addGroup(jpProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        panelTelas.add(jpProdutos, "cardProdutos");

        jpFuncionarios.setBackground(new java.awt.Color(197, 228, 130));

        spFuncionarios.setBackground(new java.awt.Color(197, 228, 130));
        spFuncionarios.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spFuncionarios.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(197, 228, 130)));
        spFuncionarios.setViewportView(null);
        //spVendas.getViewport().setBackground(new java.awt.Color(197, 228, 130));
        spFuncionarios.setViewportBorder(null);

        tbFuncionarios.setBackground(new java.awt.Color(142, 196, 123));
        tbFuncionarios.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        tbFuncionarios.setForeground(new java.awt.Color(12, 134, 129));
        tbFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Nome", "CPF", "Sexo", "Telefone", "Endereço", "Cargo", "Usuário"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbFuncionarios.setFocusable(false);
        tbFuncionarios.setGridColor(new java.awt.Color(197, 228, 130));
        tbFuncionarios.setRowHeight(40);
        tbFuncionarios.setSelectionBackground(new java.awt.Color(176, 204, 135));
        tbFuncionarios.setSelectionForeground(new java.awt.Color(12, 134, 129));
        tbFuncionarios.setShowHorizontalLines(true);
        tbFuncionarios.setShowVerticalLines(true);
        spFuncionarios.setViewportView(tbFuncionarios);
        if (tbFuncionarios.getColumnModel().getColumnCount() > 0) {
            tbFuncionarios.getColumnModel().getColumn(0).setResizable(false);
            tbFuncionarios.getColumnModel().getColumn(0).setPreferredWidth(35);
        }
        for (int i = 0; i < tbFuncionarios.getColumnCount(); i++) {
            tbFuncionarios.getColumnModel().getColumn(i).setCellRenderer(centralizarTabela);
        }
        tbFuncionarios.getTableHeader().setDefaultRenderer((tbl, value, isSelected, hasFocus, row, column) -> {
            JComponent comp = (JComponent) baseRenderer.getTableCellRendererComponent(tbl, value, isSelected, hasFocus, row, column);
            comp.setBorder(BorderFactory.createEmptyBorder(2, 2, 2, 2));
            return comp;
        });

        tbFuncionarios.setIntercellSpacing(new Dimension(0, 0));
        tbFuncionarios.getTableHeader().setBackground(new Color(118, 166, 101));
        tbFuncionarios.getTableHeader().setForeground(new Color(197, 228, 130));
        tbFuncionarios.getTableHeader().setSize(70, 70);
        tbFuncionarios.setShowVerticalLines(true);
        tbFuncionarios.getTableHeader().setFont( new Font("Roboto",Font.BOLD, 20));
        tbFuncionarios.setFillsViewportHeight(true);
        tbFuncionarios.setBorder(null);
        tbFuncionarios.getTableHeader().setReorderingAllowed(false);

        btExcluirFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delete (1) 2.png"))); // NOI18N
        btExcluirFuncionario.setRound(10);
        btExcluirFuncionario.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btExcluirFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btExcluirFuncionarioActionPerformed(evt);
            }
        });

        btAdicionarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/plus (3) 2.png"))); // NOI18N
        btAdicionarFuncionario.setRound(10);
        btAdicionarFuncionario.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btAdicionarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAdicionarFuncionarioActionPerformed(evt);
            }
        });

        btEditarFuncionario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/pen (1) 1.png"))); // NOI18N
        btEditarFuncionario.setRound(10);
        btEditarFuncionario.setStyle(Botoes.JCustomButton2.ButtonStyle.RETURN);
        btEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarFuncionarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpFuncionariosLayout = new javax.swing.GroupLayout(jpFuncionarios);
        jpFuncionarios.setLayout(jpFuncionariosLayout);
        jpFuncionariosLayout.setHorizontalGroup(
            jpFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncionariosLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(spFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 694, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFuncionariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btAdicionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        jpFuncionariosLayout.setVerticalGroup(
            jpFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFuncionariosLayout.createSequentialGroup()
                .addContainerGap(98, Short.MAX_VALUE)
                .addGroup(jpFuncionariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btExcluirFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btAdicionarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spFuncionarios, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        panelTelas.add(jpFuncionarios, "cardFuncionarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(sidebar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(sidebar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelTelas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btVendasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btVendasActionPerformed
        viewChange("cardVendas");
    }//GEN-LAST:event_btVendasActionPerformed

    private void btConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btConsultasActionPerformed
        viewChange("cardConsultas");
    }//GEN-LAST:event_btConsultasActionPerformed

    private void btClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btClientesActionPerformed
        viewChange("cardClientes");
    }//GEN-LAST:event_btClientesActionPerformed

    private void btPetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btPetsActionPerformed
        viewChange("cardPets");
    }//GEN-LAST:event_btPetsActionPerformed

    private void btProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btProdutosActionPerformed
        viewChange("cardProdutos");
    }//GEN-LAST:event_btProdutosActionPerformed

    private void btFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btFuncionariosActionPerformed
        viewChange("cardFuncionarios");
    }//GEN-LAST:event_btFuncionariosActionPerformed

    private void btAdicionarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarVendaActionPerformed
        new TelasCadastro(this, true, "cardCadVendas").setVisible(true);
        
        atualizarTabelaVendas();
    }//GEN-LAST:event_btAdicionarVendaActionPerformed

    private void btAdicionarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarConsultaActionPerformed
        new TelasCadastro(this, true, "cardCadConsultas").setVisible(true);
        
        atualizarTabelaConsultas();
    }//GEN-LAST:event_btAdicionarConsultaActionPerformed

    private void btAdicionarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarClienteActionPerformed
        new TelasCadastro(this, true, "cardCadClientes").setVisible(true);
        
        atualizarTabelaClientes();
    }//GEN-LAST:event_btAdicionarClienteActionPerformed

    private void btAdicionarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarPetActionPerformed
        new TelasCadastro(this, true, "cardCadPets").setVisible(true);
        
        atualizarTabelaPets();
    }//GEN-LAST:event_btAdicionarPetActionPerformed

    private void btAdicionarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarProdutoActionPerformed
        new TelasCadastro(this, true, "cardCadProdutos").setVisible(true);
        
        atualizarTabelaProdutos();
    }//GEN-LAST:event_btAdicionarProdutoActionPerformed

    private void btAdicionarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAdicionarFuncionarioActionPerformed
        new TelasCadastro(this, true, "cardCadFuncionarios").setVisible(true);
        
        atualizarTabelaFuncionarios();
    }//GEN-LAST:event_btAdicionarFuncionarioActionPerformed

    private void btSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btSairActionPerformed
        new TelaLogin().setVisible(true);
        dispose();
    }//GEN-LAST:event_btSairActionPerformed

    private void btEditarVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarVendaActionPerformed
        editarVendas("cardEditVendas");
    }//GEN-LAST:event_btEditarVendaActionPerformed

    private void btEditarConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarConsultaActionPerformed
        editarConsultas("cardEditConsultas");
    }//GEN-LAST:event_btEditarConsultaActionPerformed

    private void btEditarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarClienteActionPerformed
        editarClientes("cardEditClientes");
    }//GEN-LAST:event_btEditarClienteActionPerformed

    private void btEditarPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarPetActionPerformed
        editarPets("cardEditPets");
    }//GEN-LAST:event_btEditarPetActionPerformed

    private void btEditarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarProdutoActionPerformed
        editarProdutos("cardEditProdutos");
    }//GEN-LAST:event_btEditarProdutoActionPerformed

    private void btEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarFuncionarioActionPerformed
        editarFuncionario("cardEditFuncionarios");
    }//GEN-LAST:event_btEditarFuncionarioActionPerformed

    private void btExcluirClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirClienteActionPerformed
        excluirClientes();
    }//GEN-LAST:event_btExcluirClienteActionPerformed

    private void btExcluirVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirVendaActionPerformed
        excluirVendas();
    }//GEN-LAST:event_btExcluirVendaActionPerformed

    private void btExcluirConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirConsultaActionPerformed
        excluirConsultas();
    }//GEN-LAST:event_btExcluirConsultaActionPerformed

    private void btExcluirPetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirPetActionPerformed
        excluirPets();
    }//GEN-LAST:event_btExcluirPetActionPerformed

    private void btExcluirProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirProdutoActionPerformed
        excluirProdutos();
    }//GEN-LAST:event_btExcluirProdutoActionPerformed

    private void btExcluirFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btExcluirFuncionarioActionPerformed
        excluirFuncionarios();
    }//GEN-LAST:event_btExcluirFuncionarioActionPerformed
    
    public void resetarBotoes(JCustomButton2... botoes) { //Método para resetar a cor dos botões da sidebar
        for (JCustomButton2 botao : botoes) {
            botao.setStyle(EXIT);
        }
    }
    
    public void definirRestricoes(Login login) {
        if(login.getFuncionario().getCargoF().equals("Atendente")){
            btAdicionarConsulta.setVisible(false);
            btEditarConsulta.setVisible(false);
            btExcluirConsulta.setVisible(false);
            btExcluirVenda.setVisible(false);
            btExcluirCliente.setVisible(false);
            btFuncionarios.setVisible(false);
        } else if(login.getFuncionario().getCargoF().equals("Veterinário")){
            btExcluirConsulta.setVisible(false);
            btExcluirVenda.setVisible(false);
            btExcluirCliente.setVisible(false);
            btFuncionarios.setVisible(false);
            btExcluirProduto.setVisible(false);
            btExcluirPet.setVisible(false);
        } else if(login.getFuncionario().getCargoF().equals("Gerente")){
            
        }
    }
    
    public void viewChange(String cardName) {  //Método para mudar os cardLayout de acordo com os botões correspondentes da sidebar
        CardLayout layout = (CardLayout) panelTelas.getLayout();
        layout.show(panelTelas, cardName);
        resetarBotoes(btVendas, btConsultas, btClientes, btPets, btProdutos, btFuncionarios);
        
        switch (cardName) {
            case "cardVendas" -> {
                btVendas.setStyle(SECONDARY);
            }
            case "cardConsultas" -> {
                btConsultas.setStyle(SECONDARY);
            }
            case "cardClientes" -> {
                btClientes.setStyle(SECONDARY);
            }
            case "cardPets" -> {
                btPets.setStyle(SECONDARY);
            }
            case "cardProdutos" -> {
                btProdutos.setStyle(SECONDARY);
            }
            case "cardFuncionarios" -> {
                btFuncionarios.setStyle(SECONDARY);
            }
        }
    }
    
    
    public JTable getTbClientes() {
        return tbClientes;
    }
    
    public void setTbClientes(JTable tbClientes) {
        this.tbClientes = tbClientes;
    }
    
    public JTable getTbConsultas() {
        return tbConsultas;
    }
    
    public void setTbConsultas(JTable tbConsultas) {
        this.tbConsultas = tbConsultas;
    }
    
    public JTable getTbVendas() {
        return tbVendas;
    }
    
    public void setTbVendas(JTable tbVendas) {
        this.tbVendas = tbVendas;
    }
    
    public JTable getTbPets() {
        return tbPets;
    }
    
    public void setTbPets(JTable tbPets) {
        this.tbPets = tbPets;
    }
    
    public JTable getTbProdutos() {
        return tbProdutos;
    }
    
    public void setTbProdutos(JTable tbProdutos) {
        this.tbProdutos = tbProdutos;
    }
    
    public JTable getTbFuncionarios() {
        return tbFuncionarios;
    }
    
    public void setTbFuncionarios(JTable tbFuncionarios) {
        this.tbFuncionarios = tbFuncionarios;
    }
    
    public void atualizarTabelaVendas() {
        List<Venda> listaVendas = VendaDAO.listarVendas();

        // Obtendo o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tbVendas.getModel();
        model.setRowCount(0); // Limpa a tabela

        for (Venda venda : listaVendas) {
            model.addRow(new Object[]{
                String.valueOf(venda.getIdVenda()),
                Formatador.converterData(venda.getDataVenda().toString()),// Data Formatada
                venda.getCliente().getNomeC(),
                venda.getProduto().getNomeProd(),
                venda.getQtdProduto(),
                Formatador.converterValorParaReal(venda.getTotalVenda())
            });
        }
        
        tbVendas.setModel(model);
    }
    
    public void atualizarTabelaConsultas() {
        List<Consulta> listaConsultas = ConsultaDAO.listarConsultas();

        // Obtendo o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tbConsultas.getModel();
        model.setRowCount(0); // Limpa a tabela
        for (Consulta consulta : listaConsultas) {
            
            double soma = consulta.getValorConsulta() + consulta.getValorMedicamentos();
            model.addRow(new Object[]{
                String.valueOf(consulta.getIdConsulta()),
                Formatador.converterData(consulta.getDataConsulta().toString()),// Data Formatada
                consulta.getPet().getNomePet(),
                consulta.getCliente().getNomeC(),
                consulta.getFuncionario().getNomeF(),
                consulta.getObservacoes(),
                Formatador.converterValorParaReal(soma)
            });
        }
        
        tbConsultas.setModel(model);
    }
    
    public void atualizarTabelaClientes() {
        List<Cliente> listaClientes = ClienteDAO.listarClientes();

        // Obtendo o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tbClientes.getModel();
        model.setRowCount(0); // Limpa a tabela
        for (Cliente cliente : listaClientes) {            
            model.addRow(new Object[]{
                String.valueOf(cliente.getIdCliente()),
                cliente.getNomeC(),
                Formatador.formatarCPF(cliente.getCpfC()),
                cliente.getSexoC(),
                Formatador.formatarTelefone(cliente.getTelefoneC()),
                cliente.getEnderecoC()
            });
        }
        
        tbClientes.setModel(model);
    }
    
    public void atualizarTabelaPets() {
        List<Pet> listaPets = PetDAO.listarPets();

        // Obtendo o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tbPets.getModel();
        model.setRowCount(0); // Limpa a tabela
        for (Pet pet : listaPets) {            
            model.addRow(new Object[]{
                String.valueOf(pet.getIdPet()),
                pet.getNomePet(),
                pet.getCliente().getNomeC(),
                pet.getSexoPet(),
                pet.getEspecie().getNomeEspecie(),
                pet.getRaca().getNomeRaca(),
                Formatador.converterData(pet.getDataNascPet().toString()) // Data Formatada
            });
        }
        
        tbPets.setModel(model);
    }
    
    public void atualizarTabelaProdutos() {
        List<Produto> listaProdutos = ProdutoDAO.listarProdutos();

        // Obtendo o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tbProdutos.getModel();
        model.setRowCount(0); // Limpa a tabela
        for (Produto produto : listaProdutos) {            
            model.addRow(new Object[]{
                String.valueOf(produto.getIdProduto()),
                produto.getNomeProd(),
                produto.getGrupo().getNomeGrupo(),
                produto.getMarca().getNomeMarca(),
                produto.getUnVenda(),
                Formatador.converterValorParaReal(produto.getValorProd()),
                produto.getDescricaoProd()
            });
        }
        
        tbProdutos.setModel(model);
    }
    
    public void atualizarTabelaFuncionarios() {
        List<Funcionario> listaFuncionarios = FuncionarioDAO.listarFuncionarios();

        // Obtendo o modelo da tabela
        DefaultTableModel model = (DefaultTableModel) tbFuncionarios.getModel();
        model.setRowCount(0); // Limpa a tabela
        for (Funcionario funcionario : listaFuncionarios) {            
            model.addRow(new Object[]{
                String.valueOf(funcionario.getIdFuncionario()),
                funcionario.getNomeF(),
                Formatador.formatarCPF(funcionario.getCpfF()),
                funcionario.getSexoF(),
                Formatador.formatarTelefone(funcionario.getTelefoneF()),
                funcionario.getEnderecoF(),
                funcionario.getCargoF(),
                funcionario.getLogin().getLogin()
            });
        }
        
        tbFuncionarios.setModel(model);
    }
    
    public void editarClientes(String card) {  //Método para editar os clientes que foram cadastrados no banco de dados
        int linhaSelecionada = tbClientes.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada", "Erro na linha");
        } else {
            String idCliente = (String) tbClientes.getValueAt(linhaSelecionada, 0);
            
            new TelaEdicao(this,
                    rootPaneCheckingEnabled,
                    idCliente, card
            ).setVisible(true);
        }
        atualizarTabelaClientes();
    }
    
    public void excluirClientes() {  //Método para excluir os clientes que foram cadastrados no banco de dados
        int linhaSelecionada = tbClientes.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idCliente = (String) tbClientes.getValueAt(linhaSelecionada, 0);
            
            ClienteDAO.excluirClientes(idCliente);
        }
        atualizarTabelaClientes();
    }
    
    public void editarConsultas(String card) {  //Método para editar as consultas que foram cadastradas no banco de dados
        int linhaSelecionada = tbConsultas.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada", "Erro na linha");
        } else {
            String idConsulta = (String) tbConsultas.getValueAt(linhaSelecionada, 0);
            
            new TelaEdicao(this,
                    rootPaneCheckingEnabled,
                    idConsulta, card
            ).setVisible(true);
        }
        atualizarTabelaConsultas();
    }
    
    public void excluirConsultas() {  //Método para excluir as consultas que foram cadastradas no banco de dados
        int linhaSelecionada = tbConsultas.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idConsulta = (String) tbConsultas.getValueAt(linhaSelecionada, 0);
            
            ConsultaDAO.excluirConsultas(idConsulta);
        }
        atualizarTabelaConsultas();
    }
    
    public void editarVendas(String card) {  //Método para editar as vendas que foram cadastrados no banco de dados
        int linhaSelecionada = tbVendas.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idVenda = (String) tbVendas.getValueAt(linhaSelecionada, 0);
            
            new TelaEdicao(this,
                    rootPaneCheckingEnabled,
                    idVenda, card
            ).setVisible(true);
        }
        atualizarTabelaVendas();
    }
    
    public void excluirVendas() {  //Método para excluir as vendas que foram cadastradas no banco de dados
        int linhaSelecionada = tbVendas.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idVenda = (String) tbVendas.getValueAt(linhaSelecionada, 0);
            
            VendaDAO.excluirVendas(idVenda);
        }
        atualizarTabelaVendas();
    }
    
    public void editarPets(String card) {  //Método para editar os pets que foram cadastrados no banco de dados
        int linhaSelecionada = tbPets.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idPet = (String) tbPets.getValueAt(linhaSelecionada, 0);
            
            new TelaEdicao(this,
                    rootPaneCheckingEnabled,
                    idPet, card
            ).setVisible(true);
        }
        atualizarTabelaPets();
    }
    
    public void excluirPets() {  //Método para excluir os pets que foram cadastradas no banco de dados
        int linhaSelecionada = tbPets.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idPet = (String) tbPets.getValueAt(linhaSelecionada, 0);
            
            PetDAO.excluirPets(idPet);
        }
        atualizarTabelaPets();
    }
    
    public void editarFuncionario(String card) {  //Método para editar os funcionarios que foram cadastrados no banco de dados
        int linhaSelecionada = tbFuncionarios.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            Object idFuncionario = tbFuncionarios.getValueAt(linhaSelecionada, 0);
            
            new TelaEdicao(this,
                    rootPaneCheckingEnabled,
                    (String) idFuncionario, card
            ).setVisible(true);
        }
        
        atualizarTabelaFuncionarios();
    }
    
    public void excluirFuncionarios() {  //Método para excluir os funcionarios que foram cadastradas no banco de dados
        int linhaSelecionada = tbFuncionarios.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idFuncionario = (String) tbFuncionarios.getValueAt(linhaSelecionada, 0);
            
            FuncionarioDAO.excluirFuncionarios(idFuncionario);
        }
        atualizarTabelaFuncionarios();
    }
    
    public void editarProdutos(String card) {  //Método para editar os produtos que foram cadastrados no banco de dados
        int linhaSelecionada = tbProdutos.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Erro na linha", "Nenhuma linha selecionada");
        } else {
            String idProduto = (String) tbProdutos.getValueAt(linhaSelecionada, 0);
            
            new TelaEdicao(this,
                    rootPaneCheckingEnabled,
                    idProduto, card
            ).setVisible(true);
        }
        atualizarTabelaProdutos();
    }
    
    public void excluirProdutos() {  //Método para excluir os produtos que foram cadastradas no banco de dados
        int linhaSelecionada = tbProdutos.getSelectedRow();
        
        if (linhaSelecionada == -1) {
            Alerta.Erro("Nenhuma linha selecionada!", "Erro na linha");
        } else {
            String idProduto = (String) tbProdutos.getValueAt(linhaSelecionada, 0);
            
            ProdutoDAO.excluirProdutos(idProduto);
        }
        atualizarTabelaProdutos();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botoes.JCustomButton2 btAdicionarCliente;
    private Botoes.JCustomButton2 btAdicionarConsulta;
    private Botoes.JCustomButton2 btAdicionarFuncionario;
    private Botoes.JCustomButton2 btAdicionarPet;
    private Botoes.JCustomButton2 btAdicionarProduto;
    private Botoes.JCustomButton2 btAdicionarVenda;
    private Botoes.JCustomButton2 btClientes;
    private Botoes.JCustomButton2 btConsultas;
    private Botoes.JCustomButton2 btEditarCliente;
    private Botoes.JCustomButton2 btEditarConsulta;
    private Botoes.JCustomButton2 btEditarFuncionario;
    private Botoes.JCustomButton2 btEditarPet;
    private Botoes.JCustomButton2 btEditarProduto;
    private Botoes.JCustomButton2 btEditarVenda;
    private Botoes.JCustomButton2 btExcluirCliente;
    private Botoes.JCustomButton2 btExcluirConsulta;
    private Botoes.JCustomButton2 btExcluirFuncionario;
    private Botoes.JCustomButton2 btExcluirPet;
    private Botoes.JCustomButton2 btExcluirProduto;
    private Botoes.JCustomButton2 btExcluirVenda;
    private Botoes.JCustomButton2 btFuncionarios;
    private Botoes.JCustomButton2 btPets;
    private Botoes.JCustomButton2 btProdutos;
    private Botoes.JCustomButton2 btSair;
    private Botoes.JCustomButton2 btVendas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jpClientes;
    private javax.swing.JPanel jpConsultas;
    private javax.swing.JPanel jpFuncionarios;
    private javax.swing.JPanel jpPets;
    private javax.swing.JPanel jpProdutos;
    private javax.swing.JPanel jpVendas;
    private javax.swing.JPanel panelTelas;
    private javax.swing.JPanel sidebar;
    private javax.swing.JScrollPane spClientes;
    private javax.swing.JScrollPane spConsultas;
    private javax.swing.JScrollPane spFuncionarios;
    private javax.swing.JScrollPane spPets;
    private javax.swing.JScrollPane spProdutos;
    private javax.swing.JScrollPane spVendas;
    private javax.swing.JTable tbClientes;
    private javax.swing.JTable tbConsultas;
    private javax.swing.JTable tbFuncionarios;
    private javax.swing.JTable tbPets;
    private javax.swing.JTable tbProdutos;
    private javax.swing.JTable tbVendas;
    // End of variables declaration//GEN-END:variables
}
