
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;
import Controller.CashierController;
import Controller.ManagerController;
import Controller.ProductController;
import Model.CashierModel;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Kidurshalini
 */
public class SearchproductC extends javax.swing.JInternalFrame {
CashierController Cashier;
ProductController ProductController;
CashierModel CashierModel=new CashierModel();
    String getProduct=CashierModel.getProduct();
         
    /**
     * Creates new form SearchSP1q
     */
    public SearchproductC() {
        initComponents();
        this.setBorder(javax.swing.BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui=(BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        ui.setEastPane(null);
        ui.setSouthPane(null);
        ui.setWestPane(null);
        Cashier=new CashierController(this);    
        ProductController=new ProductController(this);
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
        jLabel8 = new javax.swing.JLabel();
        SModel = new javax.swing.JTextField();
        Cashirsearch = new javax.swing.JButton();
        CashirP_Clear = new javax.swing.JButton();
        Viewall = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        SProduct = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        viewtbl = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jPanel1.setPreferredSize(new java.awt.Dimension(1070, 690));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setText("Model Name:");

        SModel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SModel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SModelActionPerformed(evt);
            }
        });

        Cashirsearch.setBackground(new java.awt.Color(255, 255, 255));
        Cashirsearch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Cashirsearch.setForeground(new java.awt.Color(0, 0, 102));
        Cashirsearch.setText("SEARCH");
        Cashirsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashirsearchActionPerformed(evt);
            }
        });

        CashirP_Clear.setBackground(new java.awt.Color(255, 204, 204));
        CashirP_Clear.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        CashirP_Clear.setForeground(new java.awt.Color(255, 51, 51));
        CashirP_Clear.setText("CLEAR");
        CashirP_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CashirP_ClearActionPerformed(evt);
            }
        });

        Viewall.setBackground(new java.awt.Color(255, 255, 255));
        Viewall.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Viewall.setForeground(new java.awt.Color(0, 0, 102));
        Viewall.setText("VIEW ALL");
        Viewall.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewallActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 0, 0));
        jLabel2.setText("Not compulsary");

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));

        jSeparator2.setBackground(new java.awt.Color(0, 0, 0));

        SProduct.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mac ", "I-phone", "Airpods", "I-Watchs" }));
        SProduct.setBorder(null);

        viewtbl.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product_ID", "Product_Name", "Model_Name", "Colour", "Storage", "Quantity", "Unit_Price", "Total_Price"
            }
        ));
        viewtbl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                viewtblMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(viewtbl);

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel11.setText("Product Name:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(SModel, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(203, 203, 203)
                        .addComponent(Cashirsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87)
                        .addComponent(CashirP_Clear))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 880, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Viewall, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(SProduct, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SModel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CashirP_Clear)
                    .addComponent(Cashirsearch))
                .addGap(42, 42, 42)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Viewall)
                .addGap(21, 21, 21)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(226, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1060, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SModelActionPerformed

    private void CashirsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashirsearchActionPerformed
        if (SProduct.getSelectedItem() != null || !SModel.getText().isEmpty()) {
        getProduct = SProduct.getSelectedItem().toString();
        String query;

        if (!SModel.getText().isEmpty()) {
            query = "SELECT Product_ID, Product_Name, Model_Name, Colour, Storage, Quantity, Unit_Price, Total_Price FROM product_details WHERE Product_Name=? AND Model_Name=?";
        } else {
            query = "SELECT Product_ID, Product_Name, Model_Name, Colour, Storage, Quantity, Unit_Price, Total_Price FROM product_details WHERE Product_Name=?";
        }

        DefaultTableModel table = (DefaultTableModel) viewtbl.getModel();
        ProductController.Searchproduct(table, getProduct, SModel.getText(), query);
    }
    }//GEN-LAST:event_CashirsearchActionPerformed

    private void CashirP_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CashirP_ClearActionPerformed
        SModel.setText("");
    }//GEN-LAST:event_CashirP_ClearActionPerformed

    private void ViewallActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewallActionPerformed
         String query = "select * from  product_details";  
         DefaultTableModel table = (DefaultTableModel) viewtbl.getModel();
         Cashier.view(query,table);
    }//GEN-LAST:event_ViewallActionPerformed

    private void viewtblMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewtblMouseClicked
    

    }//GEN-LAST:event_viewtblMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CashirP_Clear;
    private javax.swing.JButton Cashirsearch;
    private javax.swing.JTextField SModel;
    private javax.swing.JComboBox<String> SProduct;
    private javax.swing.JButton Viewall;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable viewtbl;
    // End of variables declaration//GEN-END:variables
}
