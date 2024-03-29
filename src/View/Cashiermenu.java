
package View;

import java.awt.Color;

/**
 *
 * @author Kidurshalini
 */
public class Cashiermenu extends javax.swing.JFrame {

    /**
     * Creates new form Cashier menu
     */
    Color DefaultColor, ClickedColor;

    public Cashiermenu() {
        initComponents();
         DefaultColor=new Color(255,255,255);
        ClickedColor=new Color(204,204,204);

        //set defult color to text on run time
        Search.setBackground(DefaultColor);
        Order.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        Modelname5 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        Storage5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        Price3 = new javax.swing.JTextField();
        Color5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Cashirsearch = new javax.swing.JButton();
        CashirP_Clear = new javax.swing.JButton();
        Cashirviewall = new javax.swing.JButton();
        Productname5 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        Price4 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        Search = new javax.swing.JPanel();
        Csearch = new javax.swing.JLabel();
        Order = new javax.swing.JPanel();
        order = new javax.swing.JLabel();
        Logout = new javax.swing.JPanel();
        logoutC = new javax.swing.JLabel();
        Cashier = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(227, 236, 222));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Product Name:");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setText("Model Name:");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 130, -1));

        Modelname5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Modelname5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Modelname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Modelname5ActionPerformed(evt);
            }
        });
        jPanel2.add(Modelname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 309, 22));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel16.setText("Storage details:");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, -1, -1));

        Storage5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Storage5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Storage5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Storage5ActionPerformed(evt);
            }
        });
        jPanel2.add(Storage5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 309, 22));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel10.setText("Price:");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 130, -1));

        Price3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Price3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Price3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price3ActionPerformed(evt);
            }
        });
        jPanel2.add(Price3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 200, 102, 22));

        Color5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Color5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Color5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Color5ActionPerformed(evt);
            }
        });
        jPanel2.add(Color5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 172, 22));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Colour:");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, 130, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Not compulsary");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 240, -1, 26));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 700, 93));

        Cashirsearch.setBackground(new java.awt.Color(153, 153, 255));
        Cashirsearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cashirsearch.setForeground(new java.awt.Color(0, 0, 102));
        Cashirsearch.setText("SEARCH");
        Cashirsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashirsearchActionPerformed(evt);
            }
        });
        jPanel2.add(Cashirsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, 90, -1));

        CashirP_Clear.setBackground(new java.awt.Color(153, 153, 153));
        CashirP_Clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CashirP_Clear.setForeground(new java.awt.Color(255, 51, 51));
        CashirP_Clear.setText("CLEAR");
        CashirP_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashirP_ClearActionPerformed(evt);
            }
        });
        jPanel2.add(CashirP_Clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, -1, -1));

        Cashirviewall.setBackground(new java.awt.Color(153, 153, 255));
        Cashirviewall.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cashirviewall.setForeground(new java.awt.Color(0, 0, 102));
        Cashirviewall.setText("VIEW ALL");
        Cashirviewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashirviewallActionPerformed(evt);
            }
        });
        jPanel2.add(Cashirviewall, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 110, -1));

        Productname5.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Productname5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Productname5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Productname5ActionPerformed(evt);
            }
        });
        jPanel2.add(Productname5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 70, 309, 22));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setText("to");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, -1, -1));

        Price4.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        Price4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        Price4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Price4ActionPerformed(evt);
            }
        });
        jPanel2.add(Price4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 107, 22));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Not compulsary");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 200, -1, 26));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Not compulsary");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, -1, 26));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Not compulsary");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, -1, 26));

        jLabel21.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 0, 153));
        jLabel21.setText("Search Product Details");
        jPanel2.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, -1));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Search.setBackground(new java.awt.Color(255, 255, 255));
        Search.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SearchMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                SearchMousePressed(evt);
            }
        });

        Csearch.setBackground(new java.awt.Color(0, 0, 0));
        Csearch.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        Csearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/image/search.png"))); // NOI18N
        Csearch.setText("Search Product ");
        Csearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                CsearchMousePressed(evt);
            }
        });

        javax.swing.GroupLayout SearchLayout = new javax.swing.GroupLayout(Search);
        Search.setLayout(SearchLayout);
        SearchLayout.setHorizontalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(SearchLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Csearch)
                .addContainerGap(37, Short.MAX_VALUE))
        );
        SearchLayout.setVerticalGroup(
            SearchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, SearchLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Csearch)
                .addContainerGap())
        );

        jPanel1.add(Search, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 270, 80));

        Order.setBackground(new java.awt.Color(255, 255, 255));
        Order.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OrderMousePressed(evt);
            }
        });
        Order.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        order.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        order.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/image/order.png"))); // NOI18N
        order.setText("Take Order");
        order.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                orderMousePressed(evt);
            }
        });
        Order.add(order, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, -1, 60));

        jPanel1.add(Order, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 270, 80));

        Logout.setBackground(new java.awt.Color(255, 255, 255));
        Logout.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                LogoutMousePressed(evt);
            }
        });

        logoutC.setFont(new java.awt.Font("Times New Roman", 1, 20)); // NOI18N
        logoutC.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/image/logout.png"))); // NOI18N
        logoutC.setText("Logout");
        logoutC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutCMousePressed(evt);
            }
        });

        javax.swing.GroupLayout LogoutLayout = new javax.swing.GroupLayout(Logout);
        Logout.setLayout(LogoutLayout);
        LogoutLayout.setHorizontalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LogoutLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(logoutC)
                .addContainerGap(94, Short.MAX_VALUE))
        );
        LogoutLayout.setVerticalGroup(
            LogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(logoutC, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
        );

        jPanel1.add(Logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 500, 270, 80));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 680));

        Cashier.setBackground(new java.awt.Color(191, 191, 191));
        Cashier.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/image/click.png"))); // NOI18N
        jLabel4.setText("Click The Icon What You Want To Do");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/image/applelogin.png"))); // NOI18N
        jLabel7.setText("jLabel4");

        jLabel6.setFont(new java.awt.Font("Monotype Corsiva", 1, 48)); // NOI18N
        jLabel6.setText("APPLE iSTORE");

        jLabel13.setFont(new java.awt.Font("Monospaced", 1, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 0, 51));
        jLabel13.setText("WELCOME CASHIER");

        javax.swing.GroupLayout CashierLayout = new javax.swing.GroupLayout(Cashier);
        Cashier.setLayout(CashierLayout);
        CashierLayout.setHorizontalGroup(
            CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierLayout.createSequentialGroup()
                .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CashierLayout.createSequentialGroup()
                        .addGap(265, 265, 265)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 589, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CashierLayout.createSequentialGroup()
                        .addGap(343, 343, 343)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CashierLayout.createSequentialGroup()
                        .addGap(367, 367, 367)
                        .addGroup(CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(212, 212, 212))
        );
        CashierLayout.setVerticalGroup(
            CashierLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CashierLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(Cashier, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 0, 1070, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Modelname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Modelname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Modelname5ActionPerformed

    private void Storage5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Storage5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Storage5ActionPerformed

    private void Price3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price3ActionPerformed

    private void Color5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Color5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Color5ActionPerformed

    private void CashirsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashirsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashirsearchActionPerformed

    private void CashirP_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashirP_ClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashirP_ClearActionPerformed

    private void CashirviewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashirviewallActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CashirviewallActionPerformed

    private void Productname5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Productname5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Productname5ActionPerformed

    private void Price4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Price4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Price4ActionPerformed

    private void CsearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CsearchMousePressed

    }//GEN-LAST:event_CsearchMousePressed

    private void orderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMousePressed

    }//GEN-LAST:event_orderMousePressed

    private void logoutCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutCMousePressed

    }//GEN-LAST:event_logoutCMousePressed

    private void SearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMousePressed
        Search.setBackground(ClickedColor);
        Order.setBackground(DefaultColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_SearchMousePressed

    private void OrderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMousePressed
        Search.setBackground(DefaultColor);
        Order.setBackground(ClickedColor);
        Logout.setBackground(DefaultColor);
    }//GEN-LAST:event_OrderMousePressed

    private void LogoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMousePressed
        Search.setBackground(DefaultColor);
        Order.setBackground(DefaultColor);
        Logout.setBackground(ClickedColor);
    }//GEN-LAST:event_LogoutMousePressed

    private void SearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SearchMouseClicked
        SearchproductC SP = new SearchproductC();
        Cashier.removeAll();
        Cashier.add(SP).setVisible(true);
    }//GEN-LAST:event_SearchMouseClicked

    private void OrderMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderMouseClicked
        Placeorder1 PO = new Placeorder1();
        Cashier.removeAll();
        Cashier.add(PO).setVisible(true);
    }//GEN-LAST:event_OrderMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        dispose();
    Loginform lg = new Loginform();
    lg.setVisible(true);

    }//GEN-LAST:event_LogoutMouseClicked

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
            java.util.logging.Logger.getLogger(Cashiermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cashiermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cashiermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cashiermenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cashiermenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Cashier;
    private javax.swing.JButton CashirP_Clear;
    private javax.swing.JButton Cashirsearch;
    private javax.swing.JButton Cashirviewall;
    private javax.swing.JTextField Color5;
    private javax.swing.JLabel Csearch;
    private javax.swing.JPanel Logout;
    private javax.swing.JTextField Modelname5;
    private javax.swing.JPanel Order;
    private javax.swing.JTextField Price3;
    private javax.swing.JTextField Price4;
    private javax.swing.JTextField Productname5;
    private javax.swing.JPanel Search;
    private javax.swing.JTextField Storage5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel logoutC;
    private javax.swing.JLabel order;
    // End of variables declaration//GEN-END:variables
}
