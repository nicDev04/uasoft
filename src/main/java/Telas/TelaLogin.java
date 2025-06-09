package Telas;

import Classes.Login;
import ClassesDAO.LoginDAO;
import Utilidades.Alerta;
import Utilidades.Criptografia;

public class TelaLogin extends javax.swing.JFrame {

    public TelaLogin() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        rtfLogin = new Components.RoundedTextField();
        rpfSenha = new Components.RoundedPasswordField();
        lblLogin = new javax.swing.JLabel();
        lblSenha = new javax.swing.JLabel();
        btEntrar = new Botoes.JCustomButton2();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(197, 228, 130));

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/LOGO UASOFT - VERDE ÁGUA.png"))); // NOI18N

        rtfLogin.setBackground(new java.awt.Color(142, 196, 123));
        rtfLogin.setForeground(new java.awt.Color(12, 134, 129));
        rtfLogin.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        rtfLogin.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        rtfLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtfLoginActionPerformed(evt);
            }
        });

        rpfSenha.setBackground(new java.awt.Color(142, 196, 123));
        rpfSenha.setForeground(new java.awt.Color(12, 134, 129));
        rpfSenha.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        lblLogin.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblLogin.setForeground(new java.awt.Color(12, 134, 129));
        lblLogin.setText("Login:");

        lblSenha.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        lblSenha.setForeground(new java.awt.Color(12, 134, 129));
        lblSenha.setText("Senha:");

        btEntrar.setText("Entrar");
        btEntrar.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btEntrar.setRound(35);
        btEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEntrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(117, 117, 117)
                            .addComponent(logo))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblLogin)
                                .addComponent(rtfLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                .addComponent(rpfSenha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblSenha)))))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(logo, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                .addGap(49, 49, 49)
                .addComponent(lblLogin)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rtfLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(lblSenha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(rpfSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
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

    private void rtfLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtfLoginActionPerformed

    }//GEN-LAST:event_rtfLoginActionPerformed

    private void btEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEntrarActionPerformed
        efetuarLogin();
    }//GEN-LAST:event_btEntrarActionPerformed

    public void efetuarLogin() {

        String senha = new String(rpfSenha.getPassword());

        if (rtfLogin.getText().isBlank() && senha.isBlank()) {
            Alerta.Erro("Digite as informações nos campos correspondentes!", "Campos Vazios!");
        } else if (rtfLogin.getText().isBlank()) {
            Alerta.Erro("O campo Login não pode ficar vazio, preencha-o!", "Campo Vazio!");
        } else if (senha.isBlank()) {
            Alerta.Erro("O campo Senha não pode ficar vazio, preencha-o!", "Campo Vazio!");
        } else {
            
            LoginDAO loginDAO = new LoginDAO();
            if (loginDAO.usuario(rtfLogin.getText(), Criptografia.toMD5(senha)) == null) {
                Alerta.Erro("Ocorreu um erro ao realizar o login", "Erro");
            } else {
                Login login = loginDAO.usuario(rtfLogin.getText(), Criptografia.toMD5(senha));

                new TelaPrincipal().setVisible(true);
                dispose();
            }
                       
        }
    }

    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("FlatLightLaf".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botoes.JCustomButton2 btEntrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JLabel lblSenha;
    private javax.swing.JLabel logo;
    private Components.RoundedPasswordField rpfSenha;
    private Components.RoundedTextField rtfLogin;
    // End of variables declaration//GEN-END:variables
}
