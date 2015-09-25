package the_project;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Vector;
import javax.swing.JOptionPane;


public class frameBuyFood2 extends javax.swing.JFrame {
    int index1,index2;
    Vector < Vector<Food> > food ;
    Vector < Vector<Device> > device ;
    Vector < Vector<Clothes> > clothes ;
    Vector < Vector < Employee> > employee=null;
    Vector < Manager > Ms=null;
    int quantity;
    public frameBuyFood2() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backToMainPage = new javax.swing.JButton();
        back = new javax.swing.JButton();
        boxType = new javax.swing.JComboBox();
        boxTypeIn = new javax.swing.JComboBox();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buy Food");
        setBackground(new java.awt.Color(204, 204, 255));
        setBounds(new java.awt.Rectangle(100, 40, 0, 0));
        setForeground(java.awt.Color.white);

        backToMainPage.setText("Back To Main Page");
        backToMainPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backToMainPageActionPerformed(evt);
            }
        });

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        boxType.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boxType.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - - - - - - - - -", "Drink", "Dairy", "Meat", "Vegetables", "Fruit" }));
        boxType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTypeActionPerformed(evt);
            }
        });

        boxTypeIn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        boxTypeIn.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "- - - - - - - - - - -" }));
        boxTypeIn.setEnabled(false);
        boxTypeIn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                boxTypeInItemStateChanged(evt);
            }
        });
        boxTypeIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boxTypeInActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel1.setText("Quantity :");

        jButton1.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(153, 0, 153));
        jButton1.setText("Your Buying List");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel2.setText("Select Food :");
        jLabel2.setAlignmentX(0.5F);
        jLabel2.setAutoscrolls(true);

        jLabel3.setText("---");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 3, 14)); // NOI18N
        jLabel4.setText("Price :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(32, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(193, 193, 193)
                                .addComponent(backToMainPage))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(boxTypeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(boxType, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(back, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                        .addComponent(boxTypeIn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(5, 5, 5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        quantity=Integer.parseInt(jTextField1.getText());
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void boxTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTypeActionPerformed
        boxTypeIn.setEnabled(true);       
                boxTypeIn.removeAllItems();
                if(boxType.getSelectedItem().equals("Drink"))
                {
                    for(int i=0;i<food.get(0).size();i++)
                         boxTypeIn.addItem(food.get(0).get(i).getname());
                    index1=0;
                }
                else if(boxType.getSelectedItem().equals("Dairy"))
                {
               //     System.out.println("YES !!");
                    for(int i=0;i<food.get(1).size();i++)
                         boxTypeIn.addItem(food.get(1).get(i).getname());
                    index1=1;
                }
                else if(boxType.getSelectedItem().equals("Meat"))
                {
                    for(int i=0;i<food.get(2).size();i++)
                         boxTypeIn.addItem(food.get(2).get(i).getname());
                    index1=2;
                }
                else if(boxType.getSelectedItem().equals("Vegetables"))
                {
                    for(int i=0;i<food.get(3).size();i++)
                         boxTypeIn.addItem(food.get(3).get(i).getname());
                    index1=3;
                }
                else if(boxType.getSelectedItem().equals("Fruit"))
                {
                    for(int i=0;i<food.get(4).size();i++)
                         boxTypeIn.addItem(food.get(4).get(i).getname());
                    index1=4;
                }
    }//GEN-LAST:event_boxTypeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String name=boxTypeIn.getSelectedItem().toString();
        quantity=Integer.parseInt(jTextField1.getText());
        for(int i=0;i<food.get(index1).size();i++)
        {
            if(food.get(index1).get(i).getname().equals(name))
                index2=i;
        }
        if(food.get(index1).get(index2).getquantity()>=quantity)
        {
            double bate5a =food.get(index1).get(index2).getquantity();
            food.get(index1).get(index2).setquantity(bate5a-quantity);
            JOptionPane.showMessageDialog(null,"Purchasing Done Successfully !");
            BuyingList.BuyingListFood.add(food.get(index1).get(index2));
        }
        else
        {
            JOptionPane.showMessageDialog(null,"This item is not available currently with this quantity !");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void backToMainPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backToMainPageActionPerformed
        FrameMainPage fr= new FrameMainPage(food, device, clothes,employee,Ms);
        setVisible(false);
        fr.setVisible(true);
    }//GEN-LAST:event_backToMainPageActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        FrameBuyingMain fr= new FrameBuyingMain(food, device, clothes,employee,Ms);
        setVisible(false);
        fr.setVisible(true);
    }//GEN-LAST:event_backActionPerformed

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

    private void boxTypeInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boxTypeInActionPerformed
        
    }//GEN-LAST:event_boxTypeInActionPerformed

    private void boxTypeInItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_boxTypeInItemStateChanged
        String name = "";
        if (boxTypeIn.getSelectedItem()!= null)
            name = boxTypeIn.getSelectedItem().toString();
        for(int i=0;i<food.get(index1).size();i++)
        {
            if(food.get(index1).get(i).getname().equals(name))
                index2=i;
        }
        jLabel3.setText(food.get(index1).get(index2).getprice()+"");
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
            java.util.logging.Logger.getLogger(frameBuyFood2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameBuyFood2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameBuyFood2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameBuyFood2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frameBuyFood2().setVisible(true);
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
