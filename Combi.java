/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication33;
import javax.swing.*;
import java.awt.event.*;
import java.math.BigInteger;
/**
 *
 * @author Sarabusab
 */
public class Combi extends javax.swing.JFrame {

    /**
     * Creates new form Combi
     */
    public Combi() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        jLabel11.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel11.setText("Enter n:");

        jLabel12.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel12.setText("Enter r:");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        jLabel7.setText("Formula:");

        jLabel2.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        jLabel2.setText("Combination");

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField1KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField1KeyTyped(evt);
            }
        });

        jTextField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTextField2KeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField2KeyTyped(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Papyrus", 0, 10)); // NOI18N
        jButton1.setText("COMPUTE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Papyrus", 0, 18)); // NOI18N
        jLabel5.setText("(Without Repetition)");

        jButton2.setFont(new java.awt.Font("Papyrus", 0, 10)); // NOI18N
        jButton2.setText("WITH REPETITION ->");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Papyrus", 0, 11)); // NOI18N
        jButton3.setText("BACK");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        jLabel6.setText("nCr =");

        jLabel8.setFont(new java.awt.Font("Papyrus", 0, 36)); // NOI18N
        jLabel8.setText("---------------");

        jLabel9.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        jLabel9.setText("n!");

        jLabel10.setFont(new java.awt.Font("Papyrus", 0, 48)); // NOI18N
        jLabel10.setText("r! ( n - r )!");

        jLabel13.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel13.setText("Enter n:");

        jLabel14.setFont(new java.awt.Font("Papyrus", 0, 24)); // NOI18N
        jLabel14.setText("Enter r:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(jTextField2))))
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel8)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(jLabel9)))))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 51, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyPressed

        // ERROR HANDLING (CANNOT TYPE IF INPUT WAS A CHARACTER)

        // DECLARATIONS
        char c = evt.getKeyChar();

        //PROCESS
        if (!(Character.isDigit(c)))
        {
            jTextField1.setEditable(false);         // IF CHARACTER AND SPECIAL CHARACTERS DETECTED, CANNOT TYPE
        }

        if ((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))
        {
            jTextField1.setEditable(true);          // IF INTEGER AND BACKSPACE DETECTED, THEY'RE ALLOWED TO INTERACT WITH THE JTEXTFIELD
        }

    }//GEN-LAST:event_jTextField1KeyPressed

    private void jTextField1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyTyped
        // INPUT LIMITER
        if(jTextField1.getText().length()>=3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField1KeyTyped

    private void jTextField2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyPressed

        // ERROR HANDLING (CANNOT TYPE IF INPUT WAS A CHARACTER)

        // DECLARATIONS
        char c = evt.getKeyChar();

        //PROCESS
        if (!(Character.isDigit(c)))
        {
            jTextField2.setEditable(false);         // IF CHARACTER DETECTED, CANNOT TYPE
        }

        if ((Character.isDigit(c)) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE))
        {
            jTextField2.setEditable(true);          // IF INTEGER AND BACKSPACE DETECTED, THEY'RE ALLOWED TO INTERACT WITH THE JTEXTFIELD
        }

    }//GEN-LAST:event_jTextField2KeyPressed

    private void jTextField2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField2KeyTyped
        // INPUT LIMITER
        if(jTextField2.getText().length()>=3) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextField2KeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // ERROR HANDLING (IF NO INPUT WERE TYPED)
        if (jTextField1.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "First Number: No input detected.");
        } else if (jTextField2.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Second Number: No input detected.");
        } else {
            
        // DECLARATION
        int inputuser = Integer.parseInt(jTextField1.getText());    // GET INPUT
        int inputuserr = Integer.parseInt(jTextField2.getText());   // GET INPUT
        
        if (inputuser > 500){
            JOptionPane.showMessageDialog(null, "First Input Limit Exceeded. Enter numbers ranging 1-500.");
        } else if (inputuserr > 500){
            JOptionPane.showMessageDialog(null, "Second Input Limit Exceeded. Enter numbers ranging 1-500.");
        } else {
            
        // ERROR HANDLING (R is greater than N)
        if (inputuser < inputuserr){
            JOptionPane.showMessageDialog(null, "N should be greater than R.");
        } else if (inputuser == 0){
            JOptionPane.showMessageDialog(null, "N should be greater than 0.");
        } else {

            // CONTINUE PROCESS IF THERE ARE INPUTS PER TEXT FIELD
            
            // FIRST FACTORIAL INPUT (below)

            // DECLARATION
            BigInteger firstfac = new BigInteger("1");                  // FACTORIAL PURPOSES

            // FOR LOOP (FOR FACTORIAL USING BIGINTEGER)
            for (int i = 1; i <= inputuser; i++) {                      // FOR LOOP PROCESS
                firstfac = firstfac.multiply(BigInteger.valueOf(i));    // BigInteger.valueOf TO HANDLE LARGE VALUES
            }
            
            // THIRD FACTORIAL INPUT

            // DECLARATION
            BigInteger tertiaryfac = new BigInteger("1");
            for (int i = 1; i <= inputuserr; i++) {
                tertiaryfac = tertiaryfac.multiply(BigInteger.valueOf(i));      // SECONDARY FACTORIAL
            }
            
            // COMBINATION PROCESS WITH SECOND FACTORIAL INPUT (below)
            
            // SUBTRACTION FOR FORMULA OF COMBINATION
            int combitotal = inputuser - inputuserr;                    // DEDUCTION PROCESS

            // DECLARATION
            BigInteger secondfac = new BigInteger("1");
            
            // FACTORIAL PROCESS
            for (int i = 1; i <= combitotal; i++) {                     // FOR LOOP PROCESS
                secondfac = secondfac.multiply(BigInteger.valueOf(i));  // FACTORIAL RESULT OF DEDUCTED VALUE BETWEEN 1st AND 2nd INPUT SENDS TO "permuprocess"
            }
            
            // DECLARATION WITH MULTIPLICATION FUNCTION "r!(n - r)!
            BigInteger multiplication;
            multiplication = secondfac.multiply(tertiaryfac);
            
            // DECLARATION WITH DIVISION FUNCTION USING BIGINTEGER
            BigInteger division;
            division = firstfac.divide(multiplication);

            // SETTING LABELS FOR THE FORMULA
            jLabel9.setText(inputuser + "!");
            jLabel10.setText(inputuserr + "! ( " + inputuser + " - " + inputuserr + ")!");

            // SHOW OUTPUT
            JOptionPane.showMessageDialog(null, "Combination of " + inputuser + " and " + inputuserr + " is: " + division);
            
            // SETTING LABELS FOR THE FORMULA
            jLabel9.setText("n!");
            jLabel10.setText("r! ( n - r )!");

        }
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TRANSFER WINDOW
        dispose();
        CombiRepe transfercombirepe = new CombiRepe();
        transfercombirepe.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TRANSFER WINDOW
        dispose();
        Selector back = new Selector();
        back.setVisible(true);
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
            java.util.logging.Logger.getLogger(Combi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
