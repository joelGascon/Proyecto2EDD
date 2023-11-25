/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ventanas;

import javax.swing.JOptionPane;
import proyecto2J.MonticuloBinario;
import proyecto2J.NodoDocumento;
import proyecto2J.TablaDeDispersion;
import proyecto2J.NodoUsuario;


public class Menu extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    public static MonticuloBinario bh;
    public static TablaDeDispersion td;
    public int segundos;
    public static Cronometro crono; 
    public static NodoUsuario usuario;
    public Menu(MonticuloBinario bh, TablaDeDispersion td, Cronometro c, NodoUsuario user) {
        initComponents();
        this.setVisible(true);
        this.bh = bh;
        this.td = td;
        this.segundos = 0;
        this.crono = c;
        this.usuario = user;
        this.reg.setText(td.imprimir_usuarios_textarea(""));
        this.cola.setText(bh.print(""));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        crear_doc = new javax.swing.JButton();
        enviar = new javax.swing.JButton();
        eliminar_doc = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        cola = new javax.swing.JTextArea();
        mostrar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        reg = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        crear_doc.setBackground(new java.awt.Color(51, 51, 255));
        crear_doc.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        crear_doc.setForeground(new java.awt.Color(255, 255, 255));
        crear_doc.setText("Crear");
        crear_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crear_docActionPerformed(evt);
            }
        });
        jPanel1.add(crear_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 90, 40));

        enviar.setBackground(new java.awt.Color(51, 51, 255));
        enviar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        enviar.setForeground(new java.awt.Color(255, 255, 255));
        enviar.setText("Enviar a Impresion");
        enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviarActionPerformed(evt);
            }
        });
        jPanel1.add(enviar, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 130, -1, -1));

        eliminar_doc.setBackground(new java.awt.Color(51, 51, 255));
        eliminar_doc.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        eliminar_doc.setForeground(new java.awt.Color(255, 255, 255));
        eliminar_doc.setText("Eliminar");
        eliminar_doc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_docActionPerformed(evt);
            }
        });
        jPanel1.add(eliminar_doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, -1, -1));

        cancelar.setBackground(new java.awt.Color(51, 51, 255));
        cancelar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setText("Eliminar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });
        jPanel1.add(cancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 130, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Documentos en cola:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 220, -1, -1));

        cola.setColumns(20);
        cola.setRows(5);
        jScrollPane1.setViewportView(cola);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 270, 540, 350));

        mostrar.setBackground(new java.awt.Color(51, 51, 255));
        mostrar.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        mostrar.setForeground(new java.awt.Color(255, 255, 255));
        mostrar.setText("Ver ");
        mostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrarActionPerformed(evt);
            }
        });
        jPanel1.add(mostrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1130, 130, -1, -1));

        reg.setColumns(20);
        reg.setRows(5);
        jScrollPane2.setViewportView(reg);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 530, 340));

        jButton1.setBackground(new java.awt.Color(51, 51, 255));
        jButton1.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Avanzar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, -1, -1));

        jButton3.setBackground(new java.awt.Color(51, 51, 255));
        jButton3.setFont(new java.awt.Font("Agency FB", 1, 24)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("SALIR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1290, 20, 90, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Impresora");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 40, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Documentos");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, -1, -1));

        jPanel4.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 40, 170, 50));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));
        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 170, 50));

        jPanel7.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 290, 530, 340));

        jPanel6.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 530, 340));

        jPanel5.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, 170, 50));

        jPanel3.setBackground(new java.awt.Color(0, 0, 153));
        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 50, 170, 50));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Usuarios registrados:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 230, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrarActionPerformed
        // TODO add your handling code here:
        Arbol a = new Arbol(bh);
        a.setVisible(true);
        
    }//GEN-LAST:event_mostrarActionPerformed

    private void crear_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crear_docActionPerformed
        // TODO add your handling code here:
        segundos = crono.segundos;
        System.out.println(segundos);
        CrearUnDocumento cd = new CrearUnDocumento(td, segundos, bh,usuario);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_crear_docActionPerformed

    private void eliminar_docActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_docActionPerformed
        // TODO add your handling code here:
        BorrarUnDocumento ed = new BorrarUnDocumento(td, bh, usuario);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_eliminar_docActionPerformed

    private void enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviarActionPerformed
        // TODO add your handling code here:
        Enviar_A_Imprimir ev = new Enviar_A_Imprimir(td,bh, usuario);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_enviarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
        Eliminar_de_Impresora ci = new Eliminar_de_Impresora(td, bh, usuario);
        this.setVisible(false);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(this.bh.getMonticuloBinario()[0]!= null){
        NodoDocumento impreso = this.bh.eliminarMin();
        JOptionPane.showMessageDialog(rootPane, "Documento impreso: \n " + impreso.getTitulo() + "." + impreso.getTipo()+"");
        this.cola.setText(bh.print(""));
        }else{
            JOptionPane.showMessageDialog(rootPane, "No hay documentos en la impresora");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
        IniciarSesion i = new IniciarSesion(bh, td, crono);
        i.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu(bh, td,crono, usuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JTextArea cola;
    private javax.swing.JButton crear_doc;
    private javax.swing.JButton eliminar_doc;
    private javax.swing.JButton enviar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrar;
    private javax.swing.JTextArea reg;
    // End of variables declaration//GEN-END:variables
}
