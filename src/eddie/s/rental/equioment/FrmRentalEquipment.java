/*This is a visual basic Program 
 * 
 *The Price schedule for Eddie's Equipment Rental. Full-Day rentals cost one and
 *a half times half-day rentals. write a program that display in a list box when 
 *an appropriate button is clicked and displays a bill in another list box based
 *on the item number and time period chosen by a customer.
 *The bill should include a $30.00 deposite. 
 *
 *Piece of Equipment:      Half-day          Full-day
 1.Rug cleaner             $16.00            $24.00
 2.Lawn mower              $12.00            $18.00
 3.Paint sprayer           $20.00            $30.00
 *
 */
package eddie.s.rental.equioment;
import javax.swing.DefaultListModel;
/**
 *
 * @author Abongile Mavela
 */
public class FrmRentalEquipment extends javax.swing.JFrame {

    /**
     * Creates new form frmRentalEquipmennt
     */
    public FrmRentalEquipment() {
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

        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        btnRentalRates = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstRental = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtDuration = new javax.swing.JTextField();
        txtSelectItem = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        lstCustomerBill = new javax.swing.JList<>();
        btnCustomerBill = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Welcome to Eddie's Equipment Rental");

        btnRentalRates.setText("Display Rental Rates");
        btnRentalRates.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRentalRatesActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstRental);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel1.setText("Select an item(1,2 or 3):");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Select a duration(H or F):");

        txtDuration.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        txtSelectItem.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N

        jScrollPane2.setViewportView(lstCustomerBill);

        btnCustomerBill.setText("Display Customer Bill");
        btnCustomerBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerBillActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnRentalRates, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(btnClear)
                                .addGap(18, 18, 18)
                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtSelectItem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(70, 70, 70))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCustomerBill, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(62, 62, 62)))
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRentalRates, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear)
                    .addComponent(btnExit))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSelectItem, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDuration, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addComponent(btnCustomerBill, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
DefaultListModel    Number   = new     DefaultListModel(); 
DefaultListModel<String> numberModel = new DefaultListModel<>();
DefaultListModel<String> dlmList = new DefaultListModel<>();

    private void btnRentalRatesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRentalRatesActionPerformed
    numberModel.clear(); 
    
    int intInput; 
    intInput = Integer.parseInt(txtSelectItem.getText());
   
    txtSelectItem.setText("");
    txtSelectItem.requestFocusInWindow();
    
    if (intInput == 1) {
        numberModel.addElement("Price Of Equipment      Half-Day      Full-Day");
        numberModel.addElement("1. Rug Cleaner                $16.00            $24.00");
    } else if (intInput == 2) {
        numberModel.addElement("Price Of Equipment      Half-Day      Full-Day");
        numberModel.addElement("2. Lawn Mower              $12.00            $18.00");
    } else if (intInput == 3) {
        numberModel.addElement("Price Of Equipment      Half-Day      Full-Day");
        numberModel.addElement("3. Paint Sprayer           $20.00            $30.00");
    } else {
        numberModel.addElement("Invalid item number.");
    }

    lstRental.setModel(numberModel);
    }//GEN-LAST:event_btnRentalRatesActionPerformed


    private void btnCustomerBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerBillActionPerformed
        dlmList.clear(); // Clear the previous list

    String duration = txtDuration.getText().toUpperCase(); // Convert to uppercase for case-insensitive comparison

    if (duration.equals("H")) {
        int itemNum = Integer.parseInt(txtSelectItem.getText());
        double itemCost = 0.0;

        switch (itemNum) {
            case 1:
                itemCost = 16.00;
                break;
            case 2:
                itemCost = 12.00;
                break;
            case 3:
                itemCost = 20.00;
                break;
            default:
                dlmList.addElement("Invalid item number.");
                lstCustomerBill.setModel(dlmList);
                return; // Exit the method if the item is invalid
        }

        dlmList.addElement("Receipt   From  Eddie's   Equipment  Rental");
        dlmList.addElement("");
        dlmList.addElement(getItemName(itemNum) + "       $" + itemCost + "   (Half day rental)");
        dlmList.addElement("Deposit                 $30.00");
        dlmList.addElement("");
        dlmList.addElement("Total                      $" + (itemCost + 30.00));
    } else if (duration.equals("F")) {
        int itemNum = Integer.parseInt(txtSelectItem.getText());
        double itemCost = 0.0;

        switch (itemNum) {
            case 1:
                itemCost = 24.00;
                break;
            case 2:
                itemCost = 18.00;
                break;
            case 3:
                itemCost = 30.00;
                break;
            default:
                dlmList.addElement("Invalid item number.");
                lstCustomerBill.setModel(dlmList);
                return; // Exit the method if the item is invalid
        }

        dlmList.addElement("Receipt   From  Eddie's   Equipment  Rental");
        dlmList.addElement("");
        dlmList.addElement(getItemName(itemNum) + "       $" + itemCost + "   (Full day rental)");
        dlmList.addElement("Deposit                 $30.00");
        dlmList.addElement("");
        dlmList.addElement("Total                      $" + (itemCost + 30.00));
    } else {
        dlmList.addElement("Invalid duration code.");
    }

    lstCustomerBill.setModel(dlmList);
}

// Helper method to get the item name based on the item number
private String getItemName(int itemNum) {
    switch (itemNum) {
        case 1:
            return "Rug Cleaner";
        case 2:
            return "Lawn Mower";
        case 3:
            return "Paint Sprayer";
        default:
            return "Unknown";
    }

    }//GEN-LAST:event_btnCustomerBillActionPerformed
   
    
    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
     txtSelectItem.setText("");
     txtDuration.setText("");
     
     Number.removeAllElements();
     dlmList.removeAllElements();
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
      System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(FrmRentalEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRentalEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRentalEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRentalEquipment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRentalEquipment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCustomerBill;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnRentalRates;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> lstCustomerBill;
    private javax.swing.JList<String> lstRental;
    private javax.swing.JTextField txtDuration;
    private javax.swing.JTextField txtSelectItem;
    // End of variables declaration//GEN-END:variables
}
