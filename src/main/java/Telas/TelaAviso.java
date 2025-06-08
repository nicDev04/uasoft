
package Telas;

public class TelaAviso extends javax.swing.JDialog {

    public TelaAviso(java.awt.Frame parent, boolean modal, String mensagem, String titulo) {
        super(parent, modal);
        initComponents();
        lblAviso.setText(mensagem);
        setTitle(titulo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelAviso = new javax.swing.JPanel();
        btOkAviso = new Botoes.JCustomButton2();
        lblAviso = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        panelAviso.setBackground(new java.awt.Color(197, 228, 130));

        btOkAviso.setText("Ok");
        btOkAviso.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        btOkAviso.setRound(10);
        btOkAviso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btOkAvisoActionPerformed(evt);
            }
        });

        lblAviso.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        lblAviso.setForeground(new java.awt.Color(12, 134, 129));
        lblAviso.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout panelAvisoLayout = new javax.swing.GroupLayout(panelAviso);
        panelAviso.setLayout(panelAvisoLayout);
        panelAvisoLayout.setHorizontalGroup(
            panelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvisoLayout.createSequentialGroup()
                .addContainerGap(281, Short.MAX_VALUE)
                .addComponent(btOkAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
            .addGroup(panelAvisoLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lblAviso)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelAvisoLayout.setVerticalGroup(
            panelAvisoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelAvisoLayout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(lblAviso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btOkAviso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelAviso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btOkAvisoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btOkAvisoActionPerformed
        dispose();
    }//GEN-LAST:event_btOkAvisoActionPerformed

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Botoes.JCustomButton2 btOkAviso;
    private javax.swing.JLabel lblAviso;
    private javax.swing.JPanel panelAviso;
    // End of variables declaration//GEN-END:variables
}
