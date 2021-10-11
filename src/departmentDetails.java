
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.regex.*;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Stan
 */
public class departmentDetails extends javax.swing.JFrame {

    /**
     * Creates new form departmentDetails
     */
    Connection conn;
    PreparedStatement stmt;
    DefaultTableModel model;
    String url = "jdbc:mysql://localhost:3306/payroll";
    String un = "root";
    String pas = "root";

    public departmentDetails() {
        initComponents();
        show_user();
        autoIncrement();

    }

    public ArrayList<department> userlist() {
        ArrayList<department> userslist = new ArrayList<>();

        try {
            //loading the payroll database
            conn = DriverManager.getConnection(url, un, pas);

//          creates sql statements
            String sql = "SELECT `employeeID`, `firstName`, `middleName`, `lastName`, `address`, `phoneNumber` FROM `empdetails`";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);

//            loops through the array
            department user;
            while (rs.next()) {

                user = new department(rs.getString("employeeID"), rs.getString("firstName"), rs.getString("middleName"), rs.getString("lastName"),
                        rs.getString("address"), rs.getInt("phoneNumber"));

                userslist.add(user);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return userslist;
    }

    public void show_user() {
        ArrayList<department> list = userlist();

        //initializing the table created
        this.model = (DefaultTableModel) table.getModel();

        //creating a new row with new values
        model.setRowCount(0);

        Object[] row = new Object[7];

        //looping through the array
        for (int i = 0; i < list.size(); i++) {
            row[0] = list.get(i).getEmpID();
            row[1] = list.get(i).getFname();
            row[2] = list.get(i).getMname();
            row[3] = list.get(i).getLname();
            row[5] = list.get(i).getAdd();
            row[6] = list.get(i).getPhnNum();

            model.addRow(row);
        }
    }

    public void autoIncrement() {

        try {
            String query = "select MAX(departmentID) FROM department";

            conn = DriverManager.getConnection(url, un, pas);
            stmt = conn.prepareStatement(query);
            ResultSet rs = stmt.executeQuery();
            rs.next();

            String max = rs.getString("MAX(departmentID)");

            if (max == null) {
                lbl_depID.setText("PMS-E001");
            } else {
                long depid = Long.parseLong(max.substring(5, max.length()).trim());
                depid++;
                lbl_depID.setText(String.format("PMS-E" + "%03d", depid));
            }

        } catch (SQLException ex) {
            Logger.getLogger(EmployeeSignUp.class.getName()).log(Level.SEVERE, null, ex);
        } catch (NumberFormatException ex) {
            Logger.getLogger(EmployeeSignUp.class.getName()).log(Level.SEVERE, null, ex);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        dep = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lbl_depID = new javax.swing.JLabel();
        id = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        id1 = new javax.swing.JLabel();
        lbl_empID = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dep.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        dep.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Department", "IT Manager", "Software Debugger", "Data Analyst", "Software Developer", "DataBase Specialist", "IT Consultant", "WEB Developer" }));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setText("DEPARTMENT:");

        lbl_depID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_depID.setForeground(new java.awt.Color(32, 13, 5));

        id.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id.setText("DEPARTMENT ID:");

        jButton1.setText("ASSIGN DEPARTMENT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        id1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        id1.setText("EMPLOYEE ID:");

        lbl_empID.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        lbl_empID.setForeground(new java.awt.Color(32, 13, 5));

        table.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EMPLOYEE ID", "FIRST NAME", "MIDDLE NAME", "LAST NAME", "PHONE NUMBER", "ADDRESS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_NEXT_COLUMN);
        table.getTableHeader().setReorderingAllowed(false);
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setResizable(false);
            table.getColumnModel().getColumn(0).setPreferredWidth(150);
            table.getColumnModel().getColumn(1).setResizable(false);
            table.getColumnModel().getColumn(1).setPreferredWidth(150);
            table.getColumnModel().getColumn(2).setResizable(false);
            table.getColumnModel().getColumn(2).setPreferredWidth(150);
            table.getColumnModel().getColumn(3).setResizable(false);
            table.getColumnModel().getColumn(3).setPreferredWidth(150);
            table.getColumnModel().getColumn(4).setResizable(false);
            table.getColumnModel().getColumn(4).setPreferredWidth(150);
            table.getColumnModel().getColumn(5).setResizable(false);
            table.getColumnModel().getColumn(5).setPreferredWidth(250);
        }

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(186, 186, 186)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel7)
                                .addComponent(id))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(id1)))
                        .addGap(145, 145, 145)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lbl_empID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbl_depID, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(334, 334, 334)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 687, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_depID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dep, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_empID, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(jButton1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 996, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (lbl_empID.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "No Row selected...");
        } else if (dep.getSelectedItem().toString().equals("Select Department")) {
            JOptionPane.showMessageDialog(null, "No Department selected...");
        } else {
            try {
                String sql = "INSERT INTO `department`(`departmentID`, `employeeID`, `positionName`) VALUES (?,?,?)";

                conn = DriverManager.getConnection(url, un, pas);
                stmt = conn.prepareStatement(sql);

                stmt.setString(1, lbl_depID.getText());
                stmt.setString(2, lbl_empID.getText());
                stmt.setString(3, dep.getSelectedItem().toString());

                stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Successfully Assigned Postion");

                clearAllFields();
                autoIncrement();

            } //catch (SQLException sQLException) {
            //            JOptionPane.showMessageDialog(null, "There was a problem reaching to you DataBase");
            //} 
            catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        // TODO add your handling code here:
        this.model = (DefaultTableModel) table.getModel();
        int row = table.getSelectedRow();
        selectRow(row);
    }//GEN-LAST:event_tableMouseClicked

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
            java.util.logging.Logger.getLogger(departmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(departmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(departmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(departmentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new departmentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> dep;
    private javax.swing.JLabel id;
    private javax.swing.JLabel id1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbl_depID;
    private javax.swing.JLabel lbl_empID;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

    private void selectRow(int row) {
        lbl_empID.setText(model.getValueAt(row, 0).toString());

    }

    private void clearAllFields() {
        autoIncrement();
        lbl_depID.setText("");
        dep.setSelectedItem("Select Department");
        lbl_empID.setText("");
    }
}
