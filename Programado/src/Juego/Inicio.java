/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Juego;
import Juego.DB;
import java.awt.Font;
import java.util.Iterator;
/**
 *
 * @author Freddy PC
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        setTitle("Dia Mundial del Agua");
        setSize(400,400);
	setLocationRelativeTo(null);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
        setResizable(false);        
        initComponents();
        mejores();
    }
    public  void mejores(){
        DB bd = new DB();
       String[] users = bd.top_usuarios();
       user_1.setText("1 -"+users[0]);
       user_2.setText("2 -"+users[1]);
       user_3.setText("3 -"+users[2]);
       user_4.setText("4 -"+users[3]);
       user_5.setText("5 -"+users[4]);
       user_1.setFont(new Font("Comic Zine", Font.PLAIN, 26));
       user_2.setFont(new Font("Comic Zine", Font.PLAIN, 26));
       user_3.setFont(new Font("Comic Zine", Font.PLAIN, 26));
       user_4.setFont(new Font("Comic Zine", Font.PLAIN, 26));
       user_5.setFont(new Font("Comic Zine", Font.PLAIN, 26));

       for (int i=0; i<=4; i++) {
    System.out.println(users[i]);
        }
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
        btn_iniciar = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        user_1 = new javax.swing.JLabel();
        user_2 = new javax.swing.JLabel();
        user_3 = new javax.swing.JLabel();
        user_4 = new javax.swing.JLabel();
        user_5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        btn_iniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/assets/inicio_btn.png"))); // NOI18N
        btn_iniciar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_iniciarMouseClicked(evt);
            }
        });
        btn_iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_iniciarActionPerformed(evt);
            }
        });
        jPanel1.add(btn_iniciar);
        btn_iniciar.setBounds(340, 70, 180, 50);

        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/assets/salir_btn.png"))); // NOI18N
        btn_salir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_salirMouseClicked(evt);
            }
        });
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        jPanel1.add(btn_salir);
        btn_salir.setBounds(340, 140, 180, 50);

        user_1.setText("jLabel2");
        jPanel1.add(user_1);
        user_1.setBounds(50, 74, 190, 40);

        user_2.setText("jLabel3");
        jPanel1.add(user_2);
        user_2.setBounds(44, 124, 200, 40);

        user_3.setText("jLabel4");
        jPanel1.add(user_3);
        user_3.setBounds(44, 180, 200, 40);

        user_4.setText("jLabel5");
        jPanel1.add(user_4);
        user_4.setBounds(44, 230, 200, 40);

        user_5.setText("jLabel6");
        jPanel1.add(user_5);
        user_5.setBounds(44, 280, 200, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Juego/assets/home.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 360);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 358, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_iniciarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_iniciarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_salirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_salirMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btn_salirMouseClicked

    private void btn_iniciarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_iniciarMouseClicked
        // TODO add your handling code here:
        new Jgame().setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btn_iniciarMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Inicio().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_iniciar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel user_1;
    private javax.swing.JLabel user_2;
    private javax.swing.JLabel user_3;
    private javax.swing.JLabel user_4;
    private javax.swing.JLabel user_5;
    // End of variables declaration//GEN-END:variables
}