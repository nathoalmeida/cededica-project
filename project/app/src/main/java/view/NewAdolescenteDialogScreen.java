/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.AdolescenteController;
import controller.OrientadorController;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import model.Adolescente;
import model.Orientador;

/**
 *
 * @author nathoalmeida
 */
public class NewAdolescenteDialogScreen extends javax.swing.JDialog {

    OrientadorController orientadorController;
    AdolescenteController adolescenteController;
    DefaultComboBoxModel orientadorModel;
    Adolescente adolescente;
    
    
    
    
    
    
    public NewAdolescenteDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initDataController();
        loadOrientadores();
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTitle = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jPanelAdolescente = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelDataNasc = new javax.swing.JLabel();
        jFormattedTextFieldDataNasc = new javax.swing.JFormattedTextField();
        jLabelNumProcesso = new javax.swing.JLabel();
        jFormattedTextFieldNumProc = new javax.swing.JFormattedTextField();
        jLabelDataInicio = new javax.swing.JLabel();
        jFormattedTextFieldDataInicio = new javax.swing.JFormattedTextField();
        jLabelTipoMSE = new javax.swing.JLabel();
        jCheckBoxLA = new javax.swing.JCheckBox();
        jCheckBoxPSC = new javax.swing.JCheckBox();
        jLabelOrientador = new javax.swing.JLabel();
        jComboBoxOrientador = new javax.swing.JComboBox<>();
        jButtonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanelTitle.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabelTitle.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 0, 102));
        jLabelTitle.setText("Novo Adolescente");

        javax.swing.GroupLayout jPanelTitleLayout = new javax.swing.GroupLayout(jPanelTitle);
        jPanelTitle.setLayout(jPanelTitleLayout);
        jPanelTitleLayout.setHorizontalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelTitleLayout.setVerticalGroup(
            jPanelTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTitleLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabelTitle)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jLabelNome.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jLabelNome.setText("Nome:");

        jLabelDataNasc.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jLabelDataNasc.setText("Data de nascimento:");

        jFormattedTextFieldDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));
        jFormattedTextFieldDataNasc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDataNascActionPerformed(evt);
            }
        });

        jLabelNumProcesso.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jLabelNumProcesso.setText("Número do Processo:");

        try {
            jFormattedTextFieldNumProc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        jLabelDataInicio.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jLabelDataInicio.setText("Data de Início da MSE:");

        jFormattedTextFieldDataInicio.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yyyy"))));

        jLabelTipoMSE.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jLabelTipoMSE.setText("Tipo de MSE:");

        jCheckBoxLA.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jCheckBoxLA.setSelected(true);
        jCheckBoxLA.setText("LA");
        jCheckBoxLA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBoxLAActionPerformed(evt);
            }
        });

        jCheckBoxPSC.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jCheckBoxPSC.setText("PSC");

        jLabelOrientador.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jLabelOrientador.setText("Orientador:");

        jComboBoxOrientador.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jComboBoxOrientador.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButtonSalvar.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jButtonSalvar.setForeground(new java.awt.Color(0, 0, 102));
        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonSalvarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelAdolescenteLayout = new javax.swing.GroupLayout(jPanelAdolescente);
        jPanelAdolescente.setLayout(jPanelAdolescenteLayout);
        jPanelAdolescenteLayout.setHorizontalGroup(
            jPanelAdolescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdolescenteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAdolescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextFieldNome)
                    .addComponent(jLabelDataNasc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelNumProcesso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldNumProc)
                    .addComponent(jFormattedTextFieldDataNasc)
                    .addComponent(jLabelDataInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                    .addComponent(jFormattedTextFieldDataInicio)
                    .addComponent(jLabelTipoMSE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxOrientador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdolescenteLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar))
                    .addGroup(jPanelAdolescenteLayout.createSequentialGroup()
                        .addGroup(jPanelAdolescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelOrientador)
                            .addGroup(jPanelAdolescenteLayout.createSequentialGroup()
                                .addComponent(jCheckBoxLA, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jCheckBoxPSC, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanelAdolescenteLayout.setVerticalGroup(
            jPanelAdolescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAdolescenteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDataNasc)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelNumProcesso)
                .addGap(12, 12, 12)
                .addComponent(jFormattedTextFieldNumProc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDataInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jFormattedTextFieldDataInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelTipoMSE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanelAdolescenteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxLA)
                    .addComponent(jCheckBoxPSC))
                .addGap(18, 18, 18)
                .addComponent(jLabelOrientador)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jComboBoxOrientador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(jButtonSalvar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanelAdolescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTitle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelAdolescente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxLAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxLAActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBoxLAActionPerformed

    private void jFormattedTextFieldDataNascActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDataNascActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDataNascActionPerformed

    private void jButtonSalvarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonSalvarMouseClicked
     try {
         adolescente = new Adolescente();
         int orientadorIndex = jComboBoxOrientador.getSelectedIndex();
         Orientador orientador = (Orientador) orientadorModel.getElementAt(orientadorIndex);
         adolescente.setIdOrientador(orientador.getId());
         adolescente.setNome(jTextFieldNome.getText());
         adolescente.setNumProcesso(jFormattedTextFieldNumProc.getText());
         adolescente.setFazLA(jCheckBoxLA.isSelected());
         adolescente.setFazPSC(jCheckBoxPSC.isSelected());
         
         SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
         Date birthDate = null;
         Date initDate = null;
         
         birthDate = dateFormat.parse(jFormattedTextFieldDataNasc.getText());
         initDate = dateFormat.parse(jFormattedTextFieldDataInicio.getText());
         
         
         adolescente.setDataNasc(birthDate);
         adolescente.setDataInicio(initDate);
        
         adolescenteController.save(adolescente);
         
         JOptionPane.showMessageDialog(rootPane, "Adolescente adicionado com sucesso");
         
     } catch(Exception e) {
         JOptionPane.showMessageDialog(rootPane, e);
     }
     
     this.dispose();
    }//GEN-LAST:event_jButtonSalvarMouseClicked

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
            java.util.logging.Logger.getLogger(NewAdolescenteDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewAdolescenteDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewAdolescenteDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewAdolescenteDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewAdolescenteDialogScreen dialog = new NewAdolescenteDialogScreen(new javax.swing.JFrame(), true);
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
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JCheckBox jCheckBoxLA;
    private javax.swing.JCheckBox jCheckBoxPSC;
    private javax.swing.JComboBox<String> jComboBoxOrientador;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataInicio;
    private javax.swing.JFormattedTextField jFormattedTextFieldDataNasc;
    private javax.swing.JFormattedTextField jFormattedTextFieldNumProc;
    private javax.swing.JLabel jLabelDataInicio;
    private javax.swing.JLabel jLabelDataNasc;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelNumProcesso;
    private javax.swing.JLabel jLabelOrientador;
    private javax.swing.JLabel jLabelTipoMSE;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelAdolescente;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables

     public void initDataController() {
        
        orientadorController = new OrientadorController();
        adolescenteController = new AdolescenteController();
    }
    
    public void loadOrientadores() {
        
        List<Orientador> orientadores = orientadorController.getAll();
        
        Vector<Orientador> orientadoresVector = new Vector();
        
        for (int i = 0; i< orientadores.size(); i++) {
            Orientador orientador = orientadores.get(i);
            orientadoresVector.add(orientador);
            
            
        }
       
        orientadorModel = new DefaultComboBoxModel(orientadoresVector);
        
      
        
        jComboBoxOrientador.setModel(orientadorModel);
        
       
        
        
    }
}
