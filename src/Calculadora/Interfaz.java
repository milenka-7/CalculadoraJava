package Calculadora;
import Calculadora.calculando;
import Calculadora.evaluacion;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JPanel;

public class Interfaz extends javax.swing.JFrame {  
    private File archivo; 
    public Interfaz() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false); 
        
            ((JPanel)getContentPane()).setOpaque(false);
            ImageIcon uno=new ImageIcon(this.getClass().getResource(""));//<- Fondo de ventana
            JLabel fondo= new JLabel();
            fondo.setIcon(uno);
            getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
            fondo.setBounds(0,0,uno.getIconWidth(),uno.getIconHeight());
        setTitle("Calculadora"); 
      
        this.Boton_convertir.setEnabled(true); 
        this.Boton_Calcular.setEnabled(true);
        this.Label_verTXTinfijo1.setEnabled(true);
        this.Label_verTXTpostfijo1.setEnabled(true);
        this.Label_result.setEnabled(true);
        this.Label_verTXTinfijo1.setEditable(true); 
        this.Label_verTXTpostfijo1.setEditable(true); 
        this.Label_result.setEditable(true); 
        this.archivo = null;    
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        popupMenu1 = new java.awt.PopupMenu();
        popupMenu2 = new java.awt.PopupMenu();
        jLabel3 = new javax.swing.JLabel();
        Label_verTXTinfijo1 = new javax.swing.JTextField();
        Boton_convertir = new javax.swing.JButton();
        Label_verTXTpostfijo1 = new javax.swing.JTextField();
        Boton_Calcular = new javax.swing.JButton();
        Label_result = new javax.swing.JTextField();
        Boton_Salir = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        jLabel5.setFont(new java.awt.Font("BrowalliaUPC", 0, 24)); // NOI18N
        jLabel5.setText("Universidad Libre Seccional Cúcuta Ingenieria TIC Marzo 2019");

        popupMenu1.setLabel("popupMenu1");

        popupMenu2.setLabel("popupMenu2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 153, 204));

        Label_verTXTinfijo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label_verTXTinfijo1ActionPerformed(evt);
            }
        });

        Boton_convertir.setText("Convertir");
        Boton_convertir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_convertirActionPerformed(evt);
            }
        });

        Label_verTXTpostfijo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label_verTXTpostfijo1ActionPerformed(evt);
            }
        });

        Boton_Calcular.setText("Resultado");
        Boton_Calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CalcularActionPerformed(evt);
            }
        });

        Label_result.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Label_resultActionPerformed(evt);
            }
        });

        Boton_Salir.setText("Salir");
        Boton_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_SalirActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Aharoni", 0, 26)); // NOI18N
        jLabel7.setText("CALCULADORA");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Boton_convertir)
                        .addGap(22, 22, 22))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Boton_Calcular)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Label_verTXTpostfijo1, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Label_result, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Label_verTXTinfijo1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_Salir)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(Label_verTXTinfijo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Boton_convertir)
                    .addComponent(Label_verTXTpostfijo1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Label_result, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Boton_Calcular))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Boton_Salir)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public String texto=null;
    
    private void Boton_convertirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_convertirActionPerformed
        this.Label_verTXTpostfijo1.setEnabled(false);
        calculando inf = new calculando();        
        Label_verTXTpostfijo1.setText(inf.Infijo2PosfijoTxt(Label_verTXTinfijo1.getText())); 
    }//GEN-LAST:event_Boton_convertirActionPerformed

    private void Boton_CalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CalcularActionPerformed
        this.Label_result.setEnabled(false); 
        String Postfijo = null;
        Postfijo = Label_verTXTpostfijo1.getText(); 
        evaluacion ev = new evaluacion();  
        this.Label_result.setText(ev.Postfijo2resulTxt(Postfijo));        
      
        float dato = Float.parseFloat(this.Label_result.getText());
        if(dato%1==0){
            this.Label_result.setText(null);
            int dat = (int) dato;           
            String dati = Integer.toString(dat);
          this.Label_result.setText(dati); 
        }
    }//GEN-LAST:event_Boton_CalcularActionPerformed

    private void Boton_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_SalirActionPerformed
        dispose();
    }//GEN-LAST:event_Boton_SalirActionPerformed

    private void Label_resultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label_resultActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_resultActionPerformed

    private void Label_verTXTinfijo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label_verTXTinfijo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_verTXTinfijo1ActionPerformed

    private void Label_verTXTpostfijo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Label_verTXTpostfijo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Label_verTXTpostfijo1ActionPerformed
   
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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Calcular;
    private javax.swing.JButton Boton_Salir;
    private javax.swing.JButton Boton_convertir;
    private javax.swing.JTextField Label_result;
    private javax.swing.JTextField Label_verTXTinfijo1;
    private javax.swing.JTextField Label_verTXTpostfijo1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private java.awt.PopupMenu popupMenu1;
    private java.awt.PopupMenu popupMenu2;
    // End of variables declaration//GEN-END:variables

}
