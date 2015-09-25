
package the_project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;

public class frameBuyDevice extends javax.swing.JFrame {
        int index1,index2;
    Vector < Vector<Food> > food ;
    Vector < Vector<Device> > device ;
    Vector < Vector<Clothes> > clothes ;
    Vector < Vector < Employee> > employee;
    Vector < Manager > Ms;
    int quantity;    
    public frameBuyDevice() {
        
        initComponents();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        boxTypeIn = new javax.swing.JComboBox();
        backToMainPage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        boxType = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buy Devices");
        setBounds(new java.awt.Rectangle(100, 40, 0, 0));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Select Device :");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setAutoscrolls(true);

        boxTypeIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boxTypeIn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - - - - - - - - -" }));
        boxTypeIn.setEnabled(false);
        boxTypeIn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTypeInItemStateChanged(evt);
            }
        });

        backToMainPage.setText("Back To Main Page");
        backToMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainPageActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Your Buying List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        boxType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - - - - - - - - -", "Electronical", "Home Appliances" }));
        boxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTypeActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(102, 0, 51));
        jButton2.setText("Confirm");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Quantity :");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Price :");

        jLabel3.setText("---");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(193, 193, 193)
                                    .addComponent(backToMainPage))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(221, 221, 221)
                                    .addComponent(back)))
                            .addComponent(jButton1))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boxTypeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(88, 88, 88))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel4)
                .addGap(17, 17, 17)
                .addComponent(jLabel3)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToMainPage)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(back)
                    .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(boxTypeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backToMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainPageActionPerformed
        FrameMainPage fr= new FrameMainPage(food, device, clothes,employee,Ms);
        setVisible(false);
        fr.setVisible(true);
    }//GEN-LAST:event_backToMainPageActionPerformed

    private void boxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTypeActionPerformed
        boxTypeIn.setEnabled(true);
        boxTypeIn.removeAllItems();
        if(boxType.getSelectedItem().equals("Electronical"))
        {
            for(int i=0;i<device.get(0).size();i++)
            boxTypeIn.addItem(device.get(0).get(i).toString());
        }
        else if(boxType.getSelectedItem().equals("Home Appliances"))
        {
            //     System.out.println("YES !!");
            for(int i=0;i<device.get(1).size();i++)
            boxTypeIn.addItem(device.get(1).get(i).toString());
        }
        
    }//GEN-LAST:event_boxTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name=boxTypeIn.getSelectedItem().toString();
        quantity=Integer.parseInt(jTextField1.getText());
        for(int i=0;i<device.get(index1).size();i++)
        {
            if(device.get(index1).get(i).toString().equals(name))
                index2=i;
        }
        if(device.get(index1).get(index2).getQuantity()>=quantity)
        {
            int bate5a =device.get(index1).get(index2).getQuantity();
            device.get(index1).get(index2).setQuantity(bate5a-quantity);
            JOptionPane.showMessageDialog(null,"Purchasing Done Successfully !");
            BuyingList.BuyingListDevices.add(device.get(index1).get(index2));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"This item is not available currently with this quantity !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        FrameBuyingMain fr= new FrameBuyingMain(food, device, clothes,employee,Ms);
        setVisible(false);
        fr.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        quantity=Integer.parseInt(jTextField1.getText());
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try{
        FileWriter fw = new FileWriter("Buying List.txt");
        BufferedWriter bw= new BufferedWriter(fw);
        bw.append("Food :");
        bw.newLine();
        bw.newLine();
        for(int i=0;i<BuyingList.BuyingListFood.size();i++)
        {
            
                Food temp=BuyingList.BuyingListFood.get(i);
                bw.append("Name: "+temp.getname()+"  Price: "+temp.getprice()+"  Quantity: "+quantity);
                bw.newLine();   
            
        }
        bw.newLine();
        bw.append("Devices :");
        bw.newLine();
        for(int i=0;i<BuyingList.BuyingListDevices.size();i++)
        {
            
                Device temp=BuyingList.BuyingListDevices.get(i);
                bw.append("Type: "+temp.getType()+"  Brand: "+temp.getBrand()+"  Price: "+temp.getPrice()+"  Quantity: "+quantity);
                bw.newLine();
            
        }
        bw.newLine();
        bw.append("Devices :");
        bw.newLine();
        for(int i=0;i<BuyingList.BuyingListClothes.size();i++)
        {
            
                Clothes temp=BuyingList.BuyingListClothes.get(i);
                bw.append("Type: "+temp.getType()+"  Brand: "+temp.getBrand()+"  Price: "+temp.getPrice()+"  Quantity: "+quantity);
                bw.newLine();
            
        }
        bw.newLine();
        bw.newLine();
        bw.close();
        }
        catch (IOException ex)
        {}
        JOptionPane.showMessageDialog(null, "Data Exported !");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void boxTypeInItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTypeInItemStateChanged
        String name = "";
        if (boxTypeIn.getSelectedItem()!= null)
            name = boxTypeIn.getSelectedItem().toString();
        for(int i=0;i<device.get(index1).size();i++)
        {
            if(device.get(index1).get(i).toString().equals(name))
                index2=i;
        }
        jLabel3.setText(device.get(index1).get(index2).getPrice()+"");
    }//GEN-LAST:event_boxTypeInItemStateChanged

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
            java.util.logging.Logger.getLogger(frameBuyDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameBuyDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameBuyDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameBuyDevice.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameBuyDevice().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JButton backToMainPage;
    private javax.swing.JComboBox boxType;
    private javax.swing.JComboBox boxTypeIn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
