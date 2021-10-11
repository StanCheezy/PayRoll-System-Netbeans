
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.MessageDigest;
import java.sql.Connection;
import java.util.regex.*;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

public class adminSignUp extends javax.swing.JFrame implements ActionListener {

    Connection conn = null;
    PreparedStatement stmt = null;

    public adminSignUp() {
        initComponents();

        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width / 2 - getWidth() / 2, size.height / 2 - getHeight() / 2);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        user = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        createAdminAccount = new javax.swing.JButton();
        back = new javax.swing.JButton();
        gender = new javax.swing.JComboBox<>();
        pass = new javax.swing.JPasswordField();
        cpass = new javax.swing.JPasswordField();
        lbl_user = new javax.swing.JLabel();
        lbl_pass = new javax.swing.JLabel();
        lbl_lname = new javax.swing.JLabel();
        lbl_fname = new javax.swing.JLabel();
        lbl_cp = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        phnNum = new javax.swing.JTextField();
        lbl_nrc = new javax.swing.JLabel();
        lbl_phn = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        nrcNum = new javax.swing.JTextField();
        lbl_mail = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));

        jLabel9.setBackground(new java.awt.Color(0, 0, 0));
        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("PAYROLL");
        jLabel9.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(243, 243, 243))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("CREATE AN ADMISTRATOR ACCOUNT");

        user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                userKeyReleased(evt);
            }
        });

        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
        });

        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("USERNAME:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("PASSWORD:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("CONFIRM PASSWORD:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("FIRST NAME:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("LAST NAME:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("GENDER:");

        createAdminAccount.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        createAdminAccount.setText("CREATE ACCOUNT");
        createAdminAccount.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        createAdminAccount.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createAdminAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createAdminAccountActionPerformed(evt);
            }
        });

        back.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female", "Other" }));

        pass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                passActionPerformed(evt);
            }
        });

        cpass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpassActionPerformed(evt);
            }
        });
        cpass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cpassKeyReleased(evt);
            }
        });

        lbl_user.setForeground(new java.awt.Color(255, 0, 0));
        lbl_user.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_userKeyReleased(evt);
            }
        });

        lbl_lname.setForeground(new java.awt.Color(255, 0, 0));
        lbl_lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_lnameKeyReleased(evt);
            }
        });

        lbl_fname.setForeground(new java.awt.Color(255, 0, 0));
        lbl_fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_fnameKeyReleased(evt);
            }
        });

        lbl_cp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_cpKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("EMAIL:");

        mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mailKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setText("NRC #:");

        phnNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                phnNumKeyReleased(evt);
            }
        });

        lbl_nrc.setForeground(new java.awt.Color(255, 0, 0));
        lbl_nrc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_nrcKeyReleased(evt);
            }
        });

        lbl_phn.setForeground(new java.awt.Color(255, 0, 0));
        lbl_phn.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_phnKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setText("PHONE #:");

        nrcNum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nrcNumKeyReleased(evt);
            }
        });

        lbl_mail.setForeground(new java.awt.Color(255, 0, 0));
        lbl_mail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lbl_mailKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(createAdminAccount)
                .addGap(189, 189, 189)
                .addComponent(back)
                .addGap(27, 27, 27))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(83, 83, 83)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(198, 198, 198)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(phnNum, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                    .addComponent(lbl_phn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lbl_mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)))
                        .addGap(208, 208, 208))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(lbl_nrc, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nrcNum, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(210, 210, 210))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8)
                                .addComponent(jLabel7)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(181, 181, 181)
                                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(260, 327, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(fname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(cpass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(lbl_cp, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(lbl_pass, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(lbl_user, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addComponent(lbl_fname, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE))
                            .addGap(200, 200, 200)))
                    .addContainerGap()))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(188, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(36, 36, 36)
                .addComponent(jLabel4)
                .addGap(36, 36, 36)
                .addComponent(jLabel5)
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 0, 0)
                .addComponent(lbl_lname, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(nrcNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lbl_nrc, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phnNum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(0, 0, 0)
                .addComponent(lbl_phn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(mail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(1, 1, 1)
                .addComponent(lbl_mail, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createAdminAccount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(back)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(20, 20, 20)
                    .addComponent(user, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(lbl_user, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lbl_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(cpass, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, 0)
                    .addComponent(lbl_cp, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(1, 1, 1)
                    .addComponent(lbl_fname, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(318, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void createAdminAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createAdminAccountActionPerformed

        if (user.getText().trim().isEmpty() && pass.getText().trim().isEmpty()) {
            lbl_user.setText("Username is Empty");
            lbl_pass.setText("Password is Empty");
        } else if (user.getText().trim().isEmpty()) {
            lbl_user.setText("Username is Empty");
        } else if (pass.getText().trim().isEmpty()) {
            lbl_pass.setText("Password is Empty");
        } else {

            try {

                if (user.getText().equals("")
                        || pass.getText().equals("")
                        || cpass.getText().equals("")
                        || fname.getText().equals("")
                        || lname.getText().equals("")
                        || gender.getSelectedItem().equals("Select")) {
                    JOptionPane.showMessageDialog(null, "Please fill up the form before proceeding.");

                } else if (pass.getText().equals(cpass.getText())) {

                    String url = "jdbc:mysql://localhost:3306/payroll";
                    String un = "root";
                    String pas = "root";

                    String query = "INSERT INTO `admin`(`username`, `fname`, `lname`, `NRC_Number`, `email`,"
                            + "`phoneNum`, `gender`, `password`) VALUES (?,?,?,?,?,?,?,?)";

                    conn = DriverManager.getConnection(url, un, pas);
                    stmt = conn.prepareStatement(query);

                    stmt.setString(1, user.getText());
                    stmt.setString(2, fname.getText());
                    stmt.setString(3, lname.getText());
                    stmt.setString(4, nrcNum.getText());
                    stmt.setString(5, mail.getText());
                    stmt.setString(6, phnNum.getText());
                    stmt.setString(7, gender.getSelectedItem().toString());

                    if (md5(pass.getPassword()).equals("")) {

                        JOptionPane.showMessageDialog(null, "There was a problem encrypting password");
                        lbl_pass.setText("Password not Matched");
                        lbl_cp.setText("Password not Matched");
                        return;
                    }
                    stmt.setString(8, md5(pass.getPassword()));

                    stmt.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Account created successfully");

                    new adminLogin().setVisible(true);
                    this.dispose();

                } else {

                    JOptionPane.showMessageDialog(null, "Username Already Exiting.");
                    user.setText("");

                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }

        }

    }//GEN-LAST:event_createAdminAccountActionPerformed

    private String md5(char[] c) {

        try {
            MessageDigest digs = MessageDigest.getInstance("MD5");
            digs.update(new String(c).getBytes("UTF8"));

            String str = new String(digs.digest());

            return str;
        } catch (Exception e) {
            return "";
        }

    }

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        new adminLoginSuccessfully().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void passActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_passActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_passActionPerformed

    private void cpassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpassActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cpassActionPerformed

    private void lbl_cpKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_cpKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_cpKeyReleased

    private void lbl_userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_userKeyReleased
        // TODO add your handling code here:   
    }//GEN-LAST:event_lbl_userKeyReleased

    private void lbl_fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_fnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_fnameKeyReleased

    private void lbl_lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_lnameKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_lnameKeyReleased

    private void lbl_nrcKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_nrcKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_nrcKeyReleased

    private void lbl_phnKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_phnKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_phnKeyReleased

    private void lbl_mailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lbl_mailKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_lbl_mailKeyReleased

    private void cpassKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cpassKeyReleased
        // TODO add your handling code here:
        if (pass.getText().equals(cpass.getText())) {
            lbl_cp.setText(null);
        } else {
            lbl_cp.setText("Password not Matched.");
            
        }
    }//GEN-LAST:event_cpassKeyReleased

    private void userKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Z]{0,1}[a-z]{0,20}$";
        Pattern part = Pattern.compile(PATTERN);
        Matcher match = part.matcher(user.getText());
        if (!match.matches()) {
            lbl_user.setText("Invalid Username");
        } else {
            lbl_user.setText(null);
        }
    }//GEN-LAST:event_userKeyReleased

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Z]{0,1}[a-z]{0,20}$";
        Pattern part = Pattern.compile(PATTERN);
        Matcher match = part.matcher(fname.getText());
        if (!match.matches()) {
            lbl_fname.setText("Invalid Name");
        } else {
            lbl_fname.setText(null);
        }
    }//GEN-LAST:event_fnameKeyReleased

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[A-Z]{0,1}[a-z]{0,20}$";
        Pattern part = Pattern.compile(PATTERN);
        Matcher match = part.matcher(lname.getText());
        if (!match.matches()) {
            lbl_lname.setText("Invalid Name");
        } else {
            lbl_lname.setText(null);
        }
    }//GEN-LAST:event_lnameKeyReleased

    private void nrcNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nrcNumKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,6}[/][0-9]{0,2}[/][0-9]{0,1}$";
        Pattern part = Pattern.compile(PATTERN);
        Matcher match = part.matcher(nrcNum.getText());
        if (!match.matches()) {
            lbl_nrc.setText("Invalid NRC ID");
        } else {
            lbl_nrc.setText(null);
        }
    }//GEN-LAST:event_nrcNumKeyReleased

    private void phnNumKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phnNumKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[0-9]{0,12}$";
        Pattern part = Pattern.compile(PATTERN);
        Matcher match = part.matcher(phnNum.getText());
        if (!match.matches()) {
            lbl_phn.setText("Invalid Phone Number");
        } else {
            lbl_phn.setText(null);
        }
    }//GEN-LAST:event_phnNumKeyReleased

    private void mailKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mailKeyReleased
        // TODO add your handling code here:
        String PATTERN = "^[a-z]{0,15}[0-9]{0,15}[@][a-z]{0,10}[.][com]{0,5}$";
        Pattern part = Pattern.compile(PATTERN);
        Matcher match = part.matcher(mail.getText());
        if (!match.matches()) {
            lbl_mail.setText("Invalid Email");
        } else {
            lbl_mail.setText(null);
        }
    }//GEN-LAST:event_mailKeyReleased

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton back;
    private javax.swing.JPasswordField cpass;
    private javax.swing.JButton createAdminAccount;
    private javax.swing.JTextField fname;
    private javax.swing.JComboBox<String> gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbl_cp;
    private javax.swing.JLabel lbl_fname;
    private javax.swing.JLabel lbl_lname;
    private javax.swing.JLabel lbl_mail;
    private javax.swing.JLabel lbl_nrc;
    private javax.swing.JLabel lbl_pass;
    private javax.swing.JLabel lbl_phn;
    private javax.swing.JLabel lbl_user;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mail;
    private javax.swing.JTextField nrcNum;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField phnNum;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables

    public void actionPerformed(ActionEvent ae) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
