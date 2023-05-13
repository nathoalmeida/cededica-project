/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import java.awt.Color;
import java.awt.Font;
import controller.AdolescenteController;
import controller.OrientadorController;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import model.Adolescente;
import model.Orientador;

/**
 *
 * @author nathoalmeida
 */
public class MainScreen extends javax.swing.JFrame {
    
    OrientadorController orientadorController;
    AdolescenteController adolescenteController;
    DefaultComboBoxModel orientadorModel;
    DefaultListModel adolescenteModel;

    /**
     * Creates new form MainScreen
     */
    public MainScreen() {
        initComponents();
        initDataController();
        loadOrientadores();
        initComponentsModel();
        decorateTableOrientacao();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelTop = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanelOrientador = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jComboBoxOrientadores = new javax.swing.JComboBox<>();
        jPanelAdolescenteTitle = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanelPrincipal = new javax.swing.JPanel();
        jButtonNovaOrientacao = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableOrientacao = new javax.swing.JTable();
        jPanelAdolescenteLista = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jListAdolescentes = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(800, 600));

        jPanelTop.setBackground(new java.awt.Color(0, 0, 102));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pessoas (2).png"))); // NOI18N

        jButton2.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 102));
        jButton2.setText("Novo adolescente");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 0, 102));
        jButton3.setText("Novo orientador");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Carlito", 0, 24)); // NOI18N
        jLabel1.setForeground(java.awt.Color.white);
        jLabel1.setText("Painel do Orientador");

        jLabel5.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("CEDEDICA - Centro de Defesa dos Direitos da Criança e do Adolescente");

        javax.swing.GroupLayout jPanelTopLayout = new javax.swing.GroupLayout(jPanelTop);
        jPanelTop.setLayout(jPanelTopLayout);
        jPanelTopLayout.setHorizontalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTopLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 813, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31))
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanelTopLayout.setVerticalGroup(
            jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTopLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelTopLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)
                        .addComponent(jButton3))
                    .addComponent(jLabel2))
                .addGap(21, 21, 21))
        );

        jPanelOrientador.setBackground(java.awt.Color.white);
        jPanelOrientador.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Selecione um orientador:");

        jComboBoxOrientadores.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jComboBoxOrientadores.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxOrientadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOrientadoresActionPerformed(evt);
            }
        });
        jComboBoxOrientadores.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jComboBoxOrientadoresPropertyChange(evt);
            }
        });

        javax.swing.GroupLayout jPanelOrientadorLayout = new javax.swing.GroupLayout(jPanelOrientador);
        jPanelOrientador.setLayout(jPanelOrientadorLayout);
        jPanelOrientadorLayout.setHorizontalGroup(
            jPanelOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelOrientadorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jComboBoxOrientadores, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelOrientadorLayout.setVerticalGroup(
            jPanelOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelOrientadorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelOrientadorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                    .addComponent(jComboBoxOrientadores, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanelAdolescenteTitle.setBackground(java.awt.Color.white);
        jPanelAdolescenteTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Adolescentes:");

        javax.swing.GroupLayout jPanelAdolescenteTitleLayout = new javax.swing.GroupLayout(jPanelAdolescenteTitle);
        jPanelAdolescenteTitle.setLayout(jPanelAdolescenteTitleLayout);
        jPanelAdolescenteTitleLayout.setHorizontalGroup(
            jPanelAdolescenteTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdolescenteTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelAdolescenteTitleLayout.setVerticalGroup(
            jPanelAdolescenteTitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdolescenteTitleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanelPrincipal.setBackground(java.awt.Color.white);
        jPanelPrincipal.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanelPrincipal.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N
        jPanelPrincipal.setMinimumSize(new java.awt.Dimension(800, 600));

        jButtonNovaOrientacao.setFont(new java.awt.Font("Carlito", 1, 18)); // NOI18N
        jButtonNovaOrientacao.setForeground(new java.awt.Color(0, 0, 102));
        jButtonNovaOrientacao.setText("Nova Orientação");
        jButtonNovaOrientacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNovaOrientacaoActionPerformed(evt);
            }
        });

        jScrollPane3.setAutoscrolls(true);

        jTableOrientacao.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Qtd", "Data", "Conteúdo", "Faltou?", "Orientado por:"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableOrientacao.setRowHeight(40);
        jScrollPane3.setViewportView(jTableOrientacao);

        javax.swing.GroupLayout jPanelPrincipalLayout = new javax.swing.GroupLayout(jPanelPrincipal);
        jPanelPrincipal.setLayout(jPanelPrincipalLayout);
        jPanelPrincipalLayout.setHorizontalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jButtonNovaOrientacao, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanelPrincipalLayout.setVerticalGroup(
            jPanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelPrincipalLayout.createSequentialGroup()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNovaOrientacao)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelAdolescenteLista.setFont(new java.awt.Font("Carlito", 0, 18)); // NOI18N

        jScrollPane1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jListAdolescentes.setFont(new java.awt.Font("Carlito", 0, 16)); // NOI18N
        jListAdolescentes.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jListAdolescentes.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jListAdolescentes.setAlignmentX(1.0F);
        jListAdolescentes.setFixedCellHeight(50);
        jListAdolescentes.setSelectionBackground(new java.awt.Color(0, 0, 102));
        jListAdolescentes.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(jListAdolescentes);

        javax.swing.GroupLayout jPanelAdolescenteListaLayout = new javax.swing.GroupLayout(jPanelAdolescenteLista);
        jPanelAdolescenteLista.setLayout(jPanelAdolescenteListaLayout);
        jPanelAdolescenteListaLayout.setHorizontalGroup(
            jPanelAdolescenteListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAdolescenteListaLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelAdolescenteListaLayout.setVerticalGroup(
            jPanelAdolescenteListaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1277, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAdolescenteTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelAdolescenteLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanelAdolescenteTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelOrientador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanelAdolescenteLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked

        NewOrientadorDialogScreen newOrientadorScreen = new NewOrientadorDialogScreen(this, rootPaneCheckingEnabled);
        newOrientadorScreen.setVisible(true);
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked

        NewAdolescenteDialogScreen newAdolescenteScreen = new NewAdolescenteDialogScreen(this, rootPaneCheckingEnabled);
        newAdolescenteScreen.setVisible(true);
        
        newAdolescenteScreen.addWindowListener(new WindowAdapter() {
        public void windowClosed(WindowEvent e) {
            initComponentsModel();
        }
    });
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButtonNovaOrientacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNovaOrientacaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonNovaOrientacaoActionPerformed

    private void jComboBoxOrientadoresPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jComboBoxOrientadoresPropertyChange
       
        
    }//GEN-LAST:event_jComboBoxOrientadoresPropertyChange

    private void jComboBoxOrientadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOrientadoresActionPerformed
        
        initComponentsModel();
    }//GEN-LAST:event_jComboBoxOrientadoresActionPerformed

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButtonNovaOrientacao;
    private javax.swing.JComboBox<String> jComboBoxOrientadores;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList<String> jListAdolescentes;
    private javax.swing.JPanel jPanelAdolescenteLista;
    private javax.swing.JPanel jPanelAdolescenteTitle;
    private javax.swing.JPanel jPanelOrientador;
    private javax.swing.JPanel jPanelPrincipal;
    private javax.swing.JPanel jPanelTop;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTableOrientacao;
    // End of variables declaration//GEN-END:variables
    
    public void decorateTableOrientacao() {
    
    jTableOrientacao.getTableHeader().setFont(new Font("Carlito", Font.PLAIN, 16));
    jTableOrientacao.getTableHeader().setBackground(new Color(255, 255, 255));
    jTableOrientacao.getTableHeader().setForeground(new Color(0, 0, 102));
    
    jTableOrientacao.setAutoCreateRowSorter(true);
}
    
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
      
        
        jComboBoxOrientadores.setModel(orientadorModel);
        
        
    }
    
    public void loadAdolescentes(int idOrientador) {
        
        adolescenteModel = new DefaultListModel();
        List<Adolescente> adolescentes = adolescenteController.getAll(idOrientador);
        adolescenteModel.clear();
        
        for(int i = 0; i < adolescentes.size(); i++) {
            Adolescente adolescente = adolescentes.get(i);
            adolescenteModel.addElement(adolescente);
        }
        
        jListAdolescentes.setModel(adolescenteModel);
        
    }
    
    
    public void initComponentsModel() {
        
         Orientador orientador;
        
        int orientadorIndex = jComboBoxOrientadores.getSelectedIndex();
        orientador = (Orientador)orientadorModel.getElementAt(orientadorIndex);
        
        
        loadAdolescentes(orientador.getId());
        
        
        
    };
    
    

}
