
package imobilizado;
import imobilizado.paineis.*;
import java.awt.Dimension;
import javax.swing.JDialog;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

/**
 *
 * @author Hg
 */
public class areaAdmin extends javax.swing.JPanel {
 JInternalFrame frame=null;
 JDialog tela;
 icones ic=null;
    /**
     * Creates new form areaAdmin
     */
    public areaAdmin() {
        initComponents();
        crud.setVisible(false);
       
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        crud = new javax.swing.JPanel();
        btn_relatorio = new javax.swing.JToggleButton();
        btn_consultar = new javax.swing.JToggleButton();
        btn_excluir = new javax.swing.JToggleButton();
        btn_alterar = new javax.swing.JToggleButton();
        desk = new javax.swing.JDesktopPane();
        btn_clientes = new javax.swing.JButton();
        btn_empresa = new javax.swing.JButton();
        btn_conta = new javax.swing.JButton();
        btn_bem = new javax.swing.JButton();
        btn_bem1 = new javax.swing.JButton();
        btn_bem2 = new javax.swing.JButton();
        btn_bem3 = new javax.swing.JButton();
        btn_bem4 = new javax.swing.JButton();
        btn_sair = new javax.swing.JToggleButton();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        crud.setOpaque(false);

        btn_relatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobilizado/img/Search.png"))); // NOI18N
        btn_relatorio.setText("Consultar");

        btn_consultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobilizado/img/1431100872_Delete.png"))); // NOI18N
        btn_consultar.setText("Excluir");

        btn_excluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobilizado/img/1431100846_Pencil.png"))); // NOI18N
        btn_excluir.setText("Alterar");
        btn_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_excluirActionPerformed(evt);
            }
        });

        btn_alterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobilizado/img/Add (1).png"))); // NOI18N
        btn_alterar.setText("Novo");

        javax.swing.GroupLayout crudLayout = new javax.swing.GroupLayout(crud);
        crud.setLayout(crudLayout);
        crudLayout.setHorizontalGroup(
            crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(btn_alterar)
                .addGap(58, 58, 58)
                .addComponent(btn_excluir, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(btn_consultar)
                .addGap(75, 75, 75)
                .addComponent(btn_relatorio)
                .addContainerGap(209, Short.MAX_VALUE))
        );
        crudLayout.setVerticalGroup(
            crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crudLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(crudLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_excluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_alterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_consultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_relatorio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        btn_clientes.setText("Cadastro de Usuarios");
        btn_clientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clientesActionPerformed(evt);
            }
        });

        btn_empresa.setText("Cadastro de Empresas");
        btn_empresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_empresaActionPerformed(evt);
            }
        });

        btn_conta.setText("Cadastro de Contas");
        btn_conta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_contaActionPerformed(evt);
            }
        });

        btn_bem.setText("Cadastro de Fornecedores");
        btn_bem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bemActionPerformed(evt);
            }
        });

        btn_bem1.setText("Cadastro de Bens");
        btn_bem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bem1ActionPerformed(evt);
            }
        });

        btn_bem2.setText("Lançamentos");
        btn_bem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bem2ActionPerformed(evt);
            }
        });

        btn_bem3.setText("Consulta Depreciação");
        btn_bem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bem3ActionPerformed(evt);
            }
        });

        btn_bem4.setText("Relatórios");
        btn_bem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_bem4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deskLayout = new javax.swing.GroupLayout(desk);
        desk.setLayout(deskLayout);
        deskLayout.setHorizontalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btn_bem, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_empresa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_clientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_conta, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_bem1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_bem2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_bem3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_bem4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        deskLayout.setVerticalGroup(
            deskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deskLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btn_clientes, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_empresa, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_conta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bem1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(btn_bem, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_bem2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bem3, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btn_bem4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        desk.setLayer(btn_clientes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(btn_empresa, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(btn_conta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(btn_bem, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(btn_bem1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(btn_bem2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(btn_bem3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        desk.setLayer(btn_bem4, javax.swing.JLayeredPane.DEFAULT_LAYER);

        btn_sair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imobilizado/img/1431100857_Exit.png"))); // NOI18N
        btn_sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_sairActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(194, 194, 194)
                .addComponent(crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
            .addComponent(desk)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_sair, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crud, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(desk)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_clientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clientesActionPerformed
        // TODO add your handling code here:
    crud.setVisible(true);// Exibe a barra de Edição
    if (frame == null) {  
        frame = new JInternalFrame(
   "Internal Frame", false, true, false, false );  
   frame.setAlignmentX(CENTER_ALIGNMENT);
   frame.setAlignmentY(CENTER_ALIGNMENT);
   
    cadastro_usuario usu = new cadastro_usuario();
    usu.setSize(500,400);
   
   ic = new icones();
   ic.setSize(970, 63);
  
   frame.add(ic); //adiciona os botões no cabeçalho
   frame.add(usu);//adiciona o frame no conteudo
   
    //Exibe os paineis
   ic.setVisible(true);
   usu.setVisible(true);
   //Determina o tamanho do Frame
   frame.setSize(970,400);

   desk.setSize(this.getHeight(),this.getWidth());
   Dimension desktopSize = this.getSize();
        Dimension jInternalFrameSize = frame.getSize();
        frame.setLocation((desktopSize.width - jInternalFrameSize.width) / 2,
                (desktopSize.height - jInternalFrameSize.height) / 4);
   
   desk.add( frame ); // attach internal frame
    }else JOptionPane.showMessageDialog(null, "Já Existe uma janela aberta");
    frame.setVisible( true );

    try {  
        frame.setSelected(true);  
         
    } catch (java.beans.PropertyVetoException e) {}  
      
    }//GEN-LAST:event_btn_clientesActionPerformed

    private void btn_empresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_empresaActionPerformed
        // TODO add your handling code here:
        frame = null;
        frame = new JInternalFrame(
   "Internal Frame", false, true, false, false );
     icones ic = new icones();
        areaEmpresa emp = new areaEmpresa();
    frame.setAlignmentX(CENTER_ALIGNMENT);
   frame.setAlignmentY(CENTER_ALIGNMENT);
  
   frame.add(ic);
   
  
   
   frame.setSize(970,600);
   ic.setSize(frame.getWidth(), 63);
   ic.setVisible(true);
    frame.add(emp);
     emp.setSize(500,400);
   emp.setVisible(true);
   
        desk.add( frame ); // attach internal frame
   frame.setVisible( true );
    }//GEN-LAST:event_btn_empresaActionPerformed
    
            
    private void btn_bemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bemActionPerformed

    private void btn_contaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_contaActionPerformed
    frame= null;
   
    }//GEN-LAST:event_btn_contaActionPerformed

    private void btn_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_excluirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_excluirActionPerformed

    private void btn_sairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_sairActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_sairActionPerformed

    private void btn_bem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bem1ActionPerformed
        tela = new JDialog();
         ic = new icones();
         ic.setSize(970, 63);
  
        tela.add(ic);
        areaEmpresa usu = new areaEmpresa();
    usu.setSize(500,400);
        tela.add(usu);
        tela.setSize(970,600);
        ic.setVisible(true);
        tela.setResizable(false);
        tela.setLocationRelativeTo(null);
        tela.setModal(true);
        
        tela.setVisible(true);
        
    }//GEN-LAST:event_btn_bem1ActionPerformed

    private void btn_bem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bem2ActionPerformed

    private void btn_bem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bem3ActionPerformed

    private void btn_bem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_bem4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_bem4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JToggleButton btn_alterar;
    private static javax.swing.JButton btn_bem;
    private static javax.swing.JButton btn_bem1;
    private static javax.swing.JButton btn_bem2;
    private static javax.swing.JButton btn_bem3;
    private static javax.swing.JButton btn_bem4;
    private static javax.swing.JButton btn_clientes;
    public static javax.swing.JToggleButton btn_consultar;
    private static javax.swing.JButton btn_conta;
    private static javax.swing.JButton btn_empresa;
    public static javax.swing.JToggleButton btn_excluir;
    public static javax.swing.JToggleButton btn_relatorio;
    public static javax.swing.JToggleButton btn_sair;
    private javax.swing.JPanel crud;
    private javax.swing.JDesktopPane desk;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
