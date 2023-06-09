
import javax.swing.JButton;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Kaye Anne
 */
public class CalculatorUI extends javax.swing.JFrame {

    int prevNum, currNum, ans;
    String operation;
    
    
    /**
     * Creates new form CalculatorUI
     */
    public CalculatorUI() {
        initComponents();
        setLocationRelativeTo(null);
    }
    

    void numClicked(JButton btn){
        if (btn.getText().equals(".") && txtCalculate.getText().contains("."))
            return;
  
        if (txtPrevNum.getText().equals("")){
            txtCalculate.setText(txtCalculate.getText() + btn.getText());
            currNum = Integer.parseInt(txtCalculate.getText());
        } else {
           txtCalculate.setText(txtCalculate.getText() + btn.getText());
           prevNum = Integer.parseInt(txtCalculate.getText());
        }
        
    }
        
    void operationClicked(JButton btn){
        if (txtCalculate.getText().equals("") && !txtPrevNum.getText().equals(""))
            return;
    
        currNum = Integer.parseInt(txtCalculate.getText());
        txtPrevNum.setText(currNum + btn.getText());
        txtCalculate.setText("");
        operation = btn.getText();
       
    }
    
    void calculate(){
        switch (operation){
            case "+":
                ans = currNum + prevNum;
                break;
            case "-":
                ans = currNum - prevNum;
                break;
            case "*":
                ans = currNum * prevNum;
                break;
            case "/":
                ans = currNum / prevNum;
                break;
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

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnClear = new javax.swing.JButton();
        btnClearAll = new javax.swing.JButton();
        btnPercent = new javax.swing.JButton();
        btnDivide = new javax.swing.JButton();
        btnSeven = new javax.swing.JButton();
        btnEight = new javax.swing.JButton();
        btnNine = new javax.swing.JButton();
        btnMultiply = new javax.swing.JButton();
        btnFour = new javax.swing.JButton();
        btnFive = new javax.swing.JButton();
        btnSix = new javax.swing.JButton();
        btnSubtract = new javax.swing.JButton();
        btnOne = new javax.swing.JButton();
        btnTwo = new javax.swing.JButton();
        btnThree = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnZero = new javax.swing.JButton();
        btnDecimal = new javax.swing.JButton();
        btnPN = new javax.swing.JButton();
        btnEquals = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        txtCalculate = new javax.swing.JLabel();
        txtPrevNum = new javax.swing.JLabel();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Basic Calculator");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setLayout(new java.awt.GridLayout(5, 4));

        btnClear.setBackground(new java.awt.Color(102, 102, 102));
        btnClear.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClear.setForeground(new java.awt.Color(255, 255, 255));
        btnClear.setText("C");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel2.add(btnClear);

        btnClearAll.setBackground(new java.awt.Color(102, 102, 102));
        btnClearAll.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnClearAll.setForeground(new java.awt.Color(255, 255, 255));
        btnClearAll.setText("CE");
        btnClearAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearAllActionPerformed(evt);
            }
        });
        jPanel2.add(btnClearAll);

        btnPercent.setBackground(new java.awt.Color(102, 102, 102));
        btnPercent.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPercent.setForeground(new java.awt.Color(255, 255, 255));
        btnPercent.setText("%");
        jPanel2.add(btnPercent);

        btnDivide.setBackground(new java.awt.Color(255, 153, 51));
        btnDivide.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnDivide.setForeground(new java.awt.Color(255, 255, 255));
        btnDivide.setText("/");
        btnDivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDivideActionPerformed(evt);
            }
        });
        jPanel2.add(btnDivide);

        btnSeven.setBackground(new java.awt.Color(102, 102, 102));
        btnSeven.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSeven.setForeground(new java.awt.Color(255, 255, 255));
        btnSeven.setText("7");
        btnSeven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSevenActionPerformed(evt);
            }
        });
        jPanel2.add(btnSeven);

        btnEight.setBackground(new java.awt.Color(102, 102, 102));
        btnEight.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnEight.setForeground(new java.awt.Color(255, 255, 255));
        btnEight.setText("8");
        btnEight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEightActionPerformed(evt);
            }
        });
        jPanel2.add(btnEight);

        btnNine.setBackground(new java.awt.Color(102, 102, 102));
        btnNine.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnNine.setForeground(new java.awt.Color(255, 255, 255));
        btnNine.setText("9");
        btnNine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNineActionPerformed(evt);
            }
        });
        jPanel2.add(btnNine);

        btnMultiply.setBackground(new java.awt.Color(255, 153, 51));
        btnMultiply.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnMultiply.setForeground(new java.awt.Color(255, 255, 255));
        btnMultiply.setText("x");
        btnMultiply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMultiplyActionPerformed(evt);
            }
        });
        jPanel2.add(btnMultiply);

        btnFour.setBackground(new java.awt.Color(102, 102, 102));
        btnFour.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnFour.setForeground(new java.awt.Color(255, 255, 255));
        btnFour.setText("4");
        btnFour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFourActionPerformed(evt);
            }
        });
        jPanel2.add(btnFour);

        btnFive.setBackground(new java.awt.Color(102, 102, 102));
        btnFive.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnFive.setForeground(new java.awt.Color(255, 255, 255));
        btnFive.setText("5");
        btnFive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFiveActionPerformed(evt);
            }
        });
        jPanel2.add(btnFive);

        btnSix.setBackground(new java.awt.Color(102, 102, 102));
        btnSix.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnSix.setForeground(new java.awt.Color(255, 255, 255));
        btnSix.setText("6");
        btnSix.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSixActionPerformed(evt);
            }
        });
        jPanel2.add(btnSix);

        btnSubtract.setBackground(new java.awt.Color(255, 153, 51));
        btnSubtract.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnSubtract.setForeground(new java.awt.Color(255, 255, 255));
        btnSubtract.setText("-");
        btnSubtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubtractActionPerformed(evt);
            }
        });
        jPanel2.add(btnSubtract);

        btnOne.setBackground(new java.awt.Color(102, 102, 102));
        btnOne.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnOne.setForeground(new java.awt.Color(255, 255, 255));
        btnOne.setText("1");
        btnOne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOneActionPerformed(evt);
            }
        });
        jPanel2.add(btnOne);

        btnTwo.setBackground(new java.awt.Color(102, 102, 102));
        btnTwo.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnTwo.setForeground(new java.awt.Color(255, 255, 255));
        btnTwo.setText("2");
        btnTwo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTwoActionPerformed(evt);
            }
        });
        jPanel2.add(btnTwo);

        btnThree.setBackground(new java.awt.Color(102, 102, 102));
        btnThree.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnThree.setForeground(new java.awt.Color(255, 255, 255));
        btnThree.setText("3");
        btnThree.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThreeActionPerformed(evt);
            }
        });
        jPanel2.add(btnThree);

        btnAdd.setBackground(new java.awt.Color(255, 153, 51));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("+");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel2.add(btnAdd);

        btnZero.setBackground(new java.awt.Color(102, 102, 102));
        btnZero.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        btnZero.setForeground(new java.awt.Color(255, 255, 255));
        btnZero.setText("0");
        btnZero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnZeroActionPerformed(evt);
            }
        });
        jPanel2.add(btnZero);

        btnDecimal.setBackground(new java.awt.Color(102, 102, 102));
        btnDecimal.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnDecimal.setForeground(new java.awt.Color(255, 255, 255));
        btnDecimal.setText(".");
        btnDecimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDecimalActionPerformed(evt);
            }
        });
        jPanel2.add(btnDecimal);

        btnPN.setBackground(new java.awt.Color(102, 102, 102));
        btnPN.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnPN.setForeground(new java.awt.Color(255, 255, 255));
        btnPN.setText("+/-");
        btnPN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPNActionPerformed(evt);
            }
        });
        jPanel2.add(btnPN);

        btnEquals.setBackground(new java.awt.Color(255, 153, 51));
        btnEquals.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        btnEquals.setForeground(new java.awt.Color(255, 255, 255));
        btnEquals.setText("=");
        btnEquals.setToolTipText("");
        btnEquals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEqualsActionPerformed(evt);
            }
        });
        jPanel2.add(btnEquals);

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtCalculate.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        txtCalculate.setForeground(new java.awt.Color(255, 255, 255));
        txtCalculate.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        txtPrevNum.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtPrevNum.setForeground(new java.awt.Color(255, 255, 255));
        txtPrevNum.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtPrevNum, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addComponent(txtCalculate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtPrevNum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCalculate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEqualsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEqualsActionPerformed
        try{
            calculate();
            txtPrevNum.setText(txtPrevNum.getText() + txtCalculate.getText() + " =");
            txtCalculate.setText(String.valueOf(ans));
        }catch(NumberFormatException ex){

        }
    }//GEN-LAST:event_btnEqualsActionPerformed

    private void btnDecimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDecimalActionPerformed
        numClicked(btnDecimal);
    }//GEN-LAST:event_btnDecimalActionPerformed

    private void btnZeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnZeroActionPerformed
        numClicked(btnZero);
    }//GEN-LAST:event_btnZeroActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        operationClicked(btnAdd);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnThreeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThreeActionPerformed
        numClicked(btnThree);
    }//GEN-LAST:event_btnThreeActionPerformed

    private void btnTwoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTwoActionPerformed
        numClicked(btnTwo);
    }//GEN-LAST:event_btnTwoActionPerformed

    private void btnOneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOneActionPerformed
        numClicked(btnOne);
    }//GEN-LAST:event_btnOneActionPerformed

    private void btnSubtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubtractActionPerformed
        operationClicked(btnSubtract);
    }//GEN-LAST:event_btnSubtractActionPerformed

    private void btnSixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSixActionPerformed
        numClicked(btnSix);
    }//GEN-LAST:event_btnSixActionPerformed

    private void btnFiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFiveActionPerformed
        numClicked(btnFive);
    }//GEN-LAST:event_btnFiveActionPerformed

    private void btnFourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFourActionPerformed
        numClicked(btnFour);
    }//GEN-LAST:event_btnFourActionPerformed

    private void btnMultiplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiplyActionPerformed
        operationClicked(btnMultiply);
    }//GEN-LAST:event_btnMultiplyActionPerformed

    private void btnNineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNineActionPerformed
        numClicked(btnNine);
    }//GEN-LAST:event_btnNineActionPerformed

    private void btnEightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEightActionPerformed
        numClicked(btnEight);
    }//GEN-LAST:event_btnEightActionPerformed

    private void btnSevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSevenActionPerformed
        numClicked(btnSeven);
    }//GEN-LAST:event_btnSevenActionPerformed

    private void btnDivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDivideActionPerformed
        operationClicked(btnDivide);
    }//GEN-LAST:event_btnDivideActionPerformed

    private void btnClearAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearAllActionPerformed
        if (txtCalculate.getText().length() > 0){
            StringBuilder back = new StringBuilder(txtCalculate.getText());
            back.deleteCharAt(txtCalculate.getText().length()-1);
            txtCalculate.setText(back.toString());
        }
    }//GEN-LAST:event_btnClearAllActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        txtCalculate.setText("");
        txtPrevNum.setText("");
        operation = null;
        prevNum = 0;
        currNum = 0;
        ans = 0;
        

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnPNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPNActionPerformed
        if (!txtCalculate.getText().contains("-"))
        txtCalculate.setText("-"+txtCalculate.getText());
    }//GEN-LAST:event_btnPNActionPerformed

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
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnClearAll;
    private javax.swing.JButton btnDecimal;
    private javax.swing.JButton btnDivide;
    private javax.swing.JButton btnEight;
    private javax.swing.JButton btnEquals;
    private javax.swing.JButton btnFive;
    private javax.swing.JButton btnFour;
    private javax.swing.JButton btnMultiply;
    private javax.swing.JButton btnNine;
    private javax.swing.JButton btnOne;
    private javax.swing.JButton btnPN;
    private javax.swing.JButton btnPercent;
    private javax.swing.JButton btnSeven;
    private javax.swing.JButton btnSix;
    private javax.swing.JButton btnSubtract;
    private javax.swing.JButton btnThree;
    private javax.swing.JButton btnTwo;
    private javax.swing.JButton btnZero;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel txtCalculate;
    private javax.swing.JLabel txtPrevNum;
    // End of variables declaration//GEN-END:variables
}
