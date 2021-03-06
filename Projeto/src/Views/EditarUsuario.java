/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import javax.swing.JOptionPane;
import Controllers.UsuariosController;
import Helpers.CaracteresHelper;
import Models.Usuario;

/**
 *
 * @author victor
 */
public class EditarUsuario extends javax.swing.JFrame {
    private String nomeUsuario;

    /**
     * Creates new form CadastrarUsuario
     */
    public EditarUsuario(String idUsuario) {
        this.nomeUsuario = idUsuario;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setUsuario();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    private void verificaNome(){
        if(jTextNome.getText().equals("")){
            jLabelAviso2.setText("Campo obrigatório");
        }
        else{
            jLabelAviso2.setText("");
        }
    }
    
    private void verificaCpf(){
        if(jTextCpf.getText().equals("")){
            jLabelAviso3.setText("Campo obrigatório");
        }
        else if(jTextCpf.getText().length()!=11){
            jLabelAviso3.setText("CPF inválido");
        }
        else{
            jLabelAviso3.setText("");
        }
    }
    
    private void setUsuario(){
        Usuario usuario = new UsuariosController().buscarUsuario(this.nomeUsuario);
        
        jTextNomeUsuario.setText(usuario.getNomeUsuario());
        jTextNome.setText(usuario.getNome());
        jTextCpf.setText(usuario.getCpf());
        
        if(usuario.getTipo().equals("Admin")){
            jComboBoxTipo.setSelectedIndex(1);
        }
        else{
            jComboBoxTipo.setSelectedIndex(0);
        }
    }
    
    private void limpaAvisos(){
        jLabelAviso2.setText("");
        jLabelAviso3.setText("");
    }
    
    private boolean verificarAvisos(){
        return jLabelAviso2.getText().equals("") &&
                jLabelAviso3.getText().equals("");
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPainel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtSalvar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabelAviso2 = new javax.swing.JLabel();
        jLabelAviso3 = new javax.swing.JLabel();
        jTextNomeUsuario = new javax.swing.JFormattedTextField();
        jBtVoltar = new javax.swing.JButton();
        jBtRemover = new javax.swing.JButton();
        jTextNome = new javax.swing.JTextField();
        jTextCpf = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar Usuário");

        jPainel.setBackground(new java.awt.Color(254, 254, 254));
        jPainel.setPreferredSize(new java.awt.Dimension(1100, 600));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setText("Nome:");
        jLabel1.setPreferredSize(new java.awt.Dimension(55, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel2.setText("Usuário:");
        jLabel2.setPreferredSize(new java.awt.Dimension(55, 30));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel4.setText("CPF");
        jLabel4.setPreferredSize(new java.awt.Dimension(55, 30));

        jBtSalvar.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jBtSalvar.setText("Salvar");
        jBtSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtSalvarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel5.setText("Tipo:");
        jLabel5.setPreferredSize(new java.awt.Dimension(55, 30));

        jComboBoxTipo.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Usuário", "Admin" }));
        jComboBoxTipo.setPreferredSize(new java.awt.Dimension(120, 30));

        jLabel3.setFont(new java.awt.Font("Cantarell", 1, 24)); // NOI18N
        jLabel3.setText("Editar Usuário");

        jLabelAviso2.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        jLabelAviso2.setPreferredSize(new java.awt.Dimension(185, 30));

        jLabelAviso3.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N

        jTextNomeUsuario.setEnabled(false);
        jTextNomeUsuario.setPreferredSize(new java.awt.Dimension(185, 30));
        jTextNomeUsuario.setRequestFocusEnabled(false);
        jTextNomeUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextNomeUsuarioFocusLost(evt);
            }
        });
        jTextNomeUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNomeUsuarioKeyTyped(evt);
            }
        });

        jBtVoltar.setText("Voltar");
        jBtVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtVoltarActionPerformed(evt);
            }
        });

        jBtRemover.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jBtRemover.setText("Remover");
        jBtRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtRemoverActionPerformed(evt);
            }
        });

        jTextNome.setPreferredSize(new java.awt.Dimension(185, 30));
        jTextNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextNomeKeyTyped(evt);
            }
        });

        jTextCpf.setPreferredSize(new java.awt.Dimension(185, 30));
        jTextCpf.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextCpfKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPainelLayout = new javax.swing.GroupLayout(jPainel);
        jPainel.setLayout(jPainelLayout);
        jPainelLayout.setHorizontalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(jBtVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelLayout.createSequentialGroup()
                        .addGap(0, 416, Short.MAX_VALUE)
                        .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelLayout.createSequentialGroup()
                                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelLayout.createSequentialGroup()
                                        .addComponent(jBtRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(332, 332, 332))
                                    .addGroup(jPainelLayout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jTextNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextCpf, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jTextNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jBtSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelAviso3, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(205, 205, 205))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPainelLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(459, 459, 459))))))
        );
        jPainelLayout.setVerticalGroup(
            jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPainelLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addGap(93, 93, 93)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addComponent(jLabelAviso2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelAviso3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPainelLayout.createSequentialGroup()
                        .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextNomeUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(jPainelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtRemover)
                    .addComponent(jBtSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addComponent(jBtVoltar)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPainel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void jBtSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtSalvarActionPerformed
        this.limpaAvisos();
        this.verificaNome();
        this.verificaCpf();
        
        if(verificarAvisos()){
            
            Usuario usuario = new Usuario();
            usuario.setNome(jTextNome.getText());
            usuario.setCpf(jTextCpf.getText());
            usuario.setNomeUsuario(jTextNomeUsuario.getText());
            
            if(jComboBoxTipo.getSelectedItem().toString().equals("Usuário")){
                usuario.setTipo("U");
            }
            else{
                usuario.setTipo("A");
            }
            new UsuariosController().atualizarUsuario(usuario);
            JOptionPane.showMessageDialog(null, "Informações Alteradas");
        }
        else{
            JOptionPane.showMessageDialog(null, "Verifique os campos e tente novamente");
        }
        
        
    }//GEN-LAST:event_jBtSalvarActionPerformed

    private void jTextNomeUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextNomeUsuarioFocusLost
        
    }//GEN-LAST:event_jTextNomeUsuarioFocusLost

    private void jBtVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtVoltarActionPerformed
        EditarUsuario.this.dispose();
        new Usuarios().setVisible(true);
    }//GEN-LAST:event_jBtVoltarActionPerformed

    private void jTextNomeUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeUsuarioKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNomeUsuarioKeyTyped

    private void jBtRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtRemoverActionPerformed
        int i;
        i = JOptionPane.showConfirmDialog(null, "Tem certeza que deseja remover"
            + " o usuário: "+ nomeUsuario +"?","Confirmar",
            JOptionPane.YES_NO_OPTION,
            JOptionPane.WARNING_MESSAGE);

        if(i == 0){
            new UsuariosController().removeUsuario(nomeUsuario);
            JOptionPane.showMessageDialog(null,"Usuário Removido");
            
            EditarUsuario.this.dispose();
            new Usuarios().setVisible(true);
        }
    }//GEN-LAST:event_jBtRemoverActionPerformed

    private void jTextNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextNomeKeyTyped
        
    }//GEN-LAST:event_jTextNomeKeyTyped

    private void jTextCpfKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextCpfKeyTyped
        if(!(evt.getKeyChar()+"").matches("[0-9]")){
            evt.consume();
        }
    }//GEN-LAST:event_jTextCpfKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtRemover;
    private javax.swing.JButton jBtSalvar;
    private javax.swing.JButton jBtVoltar;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabelAviso2;
    private javax.swing.JLabel jLabelAviso3;
    private javax.swing.JPanel jPainel;
    private javax.swing.JTextField jTextCpf;
    private javax.swing.JTextField jTextNome;
    private javax.swing.JFormattedTextField jTextNomeUsuario;
    // End of variables declaration//GEN-END:variables
}
