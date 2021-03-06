
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.TableColumn;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zaidal-mashhadani
 */
public class studentData extends javax.swing.JFrame {

    Connection con = null;
    Connection con2 = null;
    Statement st = null;
    Statement st2 = null;
    ResultSet rs = null;
    ResultSet rs2 = null;
    
    
    public studentData() {
        initComponents();
        selectingAll();
        jPanel1.setVisible(false);
        //courses();
        
    }

    public void selectingAll(){
   
  
    try{
      
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/CUNY", "IS2560", "IS2560");
        st = con.createStatement();//
        rs = st.executeQuery("select * from student");
        Student.setModel(DbUtils.resultSetToTableModel(rs));
        
     }catch(SQLException e){
         e.printStackTrace();
     }
    }
    public void courses(){
   
  
    try{
      
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/CUNY", "IS2560", "IS2560");
        st = con.createStatement();//
        rs = st.executeQuery("select * from classes");
        classes.setModel(DbUtils.resultSetToTableModel(rs));
        
     }catch(SQLException e){
         e.printStackTrace();
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

        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        classes = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        semestertxtbox = new javax.swing.JTextField();
        filter = new javax.swing.JButton();
        panel1 = new java.awt.Panel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        showClasses = new javax.swing.JButton();
        update = new javax.swing.JButton();
        add = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        idtxtbox = new javax.swing.JTextField();
        gpatxtbox = new javax.swing.JTextField();
        fnametxtbox = new javax.swing.JTextField();
        lnametxtbox = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Student = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(174, 212, 231));

        classes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Class ID", "Class Name", "Credits", "Prerequisites", "Grades", "Semester"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(classes);
        if (classes.getColumnModel().getColumnCount() > 0) {
            classes.getColumnModel().getColumn(0).setResizable(false);
            classes.getColumnModel().getColumn(0).setPreferredWidth(25);
        }

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 204));
        jLabel6.setText("CLASS INFORMATION");

        jLabel7.setText("Semester");

        semestertxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                semestertxtboxActionPerformed(evt);
            }
        });

        filter.setBackground(java.awt.Color.yellow);
        filter.setText("Filter by Semester");
        filter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 762, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(semestertxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(filter)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.CENTER, jPanel1Layout.createSequentialGroup()
                .addGap(299, 299, 299)
                .addComponent(jLabel6)
                .addGap(299, 299, 299))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(semestertxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(filter))
                .addGap(19, 19, 19))
        );

        panel1.setBackground(new java.awt.Color(174, 212, 231));

        jLabel1.setText("ID");

        jLabel2.setText("First Name");

        jLabel3.setText("Last Name");

        jLabel4.setText("GPA");

        showClasses.setBackground(java.awt.Color.yellow);
        showClasses.setText("Show Classes");
        showClasses.setMaximumSize(new java.awt.Dimension(121, 29));
        showClasses.setMinimumSize(new java.awt.Dimension(121, 29));
        showClasses.setPreferredSize(new java.awt.Dimension(137, 29));
        showClasses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showClassesActionPerformed(evt);
            }
        });

        update.setBackground(java.awt.Color.orange);
        update.setText("Update Recode");
        update.setMaximumSize(new java.awt.Dimension(121, 29));
        update.setMinimumSize(new java.awt.Dimension(121, 29));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        add.setBackground(new java.awt.Color(204, 255, 204));
        add.setText("Add Student");
        add.setPreferredSize(new java.awt.Dimension(137, 29));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        delete.setBackground(new java.awt.Color(255, 122, 122));
        delete.setText("Remove Student");
        delete.setMaximumSize(new java.awt.Dimension(121, 29));
        delete.setMinimumSize(new java.awt.Dimension(121, 29));
        delete.setPreferredSize(new java.awt.Dimension(137, 29));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });

        idtxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idtxtboxActionPerformed(evt);
            }
        });

        fnametxtbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametxtboxActionPerformed(evt);
            }
        });

        Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "First Name", "Last Name", "GPA"
            }
        ));
        jScrollPane1.setViewportView(Student);

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 204));
        jLabel5.setText("STUDENT INFORMATION");

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(fnametxtbox)
                    .addComponent(idtxtbox)
                    .addComponent(lnametxtbox)
                    .addComponent(gpatxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 427, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(delete, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(update, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(showClasses, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(286, 286, 286))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel1Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel1Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(idtxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(fnametxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lnametxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gpatxtbox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addComponent(add, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(delete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(showClasses, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        try{
            Integer id = Integer.parseInt(idtxtbox.getText());
            String fn = fnametxtbox.getText();
            String ln = lnametxtbox.getText();
            Double gpa = Double.parseDouble(gpatxtbox.getText());
            
            PreparedStatement add = con.prepareStatement("insert into Student values (?,?,?,?)");
            
            add.setInt(1, id);
            add.setString(2, fn);
            add.setString(3, ln);
            add.setDouble(4, gpa);
            
            int row = add.executeUpdate();
       
     }catch(SQLException e){
         e.printStackTrace();
     }
     selectingAll();
    }//GEN-LAST:event_addActionPerformed

    private void idtxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idtxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idtxtboxActionPerformed

    private void fnametxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametxtboxActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        try{
        
        String sql= "delete from student where student_id ="+idtxtbox.getText();
        Statement del = con.createStatement();
        del.executeUpdate(sql);
        idtxtbox.setText("");
        fnametxtbox.setText("");
        lnametxtbox.setText("");
        gpatxtbox.setText("");
        
     }catch(SQLException e){
         e.printStackTrace();
     }
     selectingAll();
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        try{
        
        String sql= "update student set fname ='"+fnametxtbox.getText()+"'"+ ",lname ='"
                +lnametxtbox.getText()+"'"+ ",gpa ="+Double.parseDouble(gpatxtbox.getText())+ "where student_id = "
                +Integer.parseInt(idtxtbox.getText());
                
                
        Statement update = con.createStatement();
        update.executeQuery(sql);
        
     }catch(SQLException e){
         e.printStackTrace();
     }
     selectingAll();
    }//GEN-LAST:event_updateActionPerformed

    private void showClassesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showClassesActionPerformed
        try{
        jPanel1.setVisible(true);

        String sql= "select cs.class_id, cs.CLASS_NAME, cs.credits, cs.PREREQUISITES,"
                       + " CASE WHEN cs.grades > 92 AND cs.grades < 101  THEN 'A'"
                       + " WHEN cs.grades > 89 AND cs.grades < 91  THEN 'A-'"
                       + " WHEN cs.grades > 86 AND cs.grades < 90  THEN 'B+'"
                       + " WHEN cs.grades > 84 AND cs.grades < 87  THEN 'B'"
                       + " WHEN cs.grades > 79 AND cs.grades < 83  THEN 'B-'"
                       + " WHEN cs.grades > 76 AND cs.grades < 80  THEN 'C+'"
                       + " WHEN cs.grades > 72 AND cs.grades < 77  THEN 'C'"
                       + " WHEN cs.grades > 69 AND cs.grades < 73  THEN 'C-'"
                       + " WHEN cs.grades > 66 AND cs.grades < 70  THEN 'D+'"
                       + " WHEN cs.grades > 62 AND cs.grades < 67  THEN 'D'"
                       + " WHEN cs.grades > 59 AND cs.grades < 63  THEN 'D-'"
                       + " WHEN cs.grades > 1 AND cs.grades < 60  THEN 'D-'"
                       + " ELSE 'N/A' END as grades"
                       + ", sc.semester" +
                    " from schedule sc inner join classes cs on sc.CLASS_ID = cs.CLASS_ID" +
                    " where STUDENT_ID ="+ Integer.parseInt(idtxtbox.getText());
                      
        Statement update = con.createStatement();
        rs = st.executeQuery(sql);
        classes.setModel(DbUtils.resultSetToTableModel(rs));
        
     }catch(SQLException e){
         e.printStackTrace();
     }
    }//GEN-LAST:event_showClassesActionPerformed

    private void semestertxtboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_semestertxtboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_semestertxtboxActionPerformed

    private void filterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filterActionPerformed
        try{
               String sql= "select cs.class_id, cs.CLASS_NAME, cs.credits, cs.PREREQUISITES,"
                       + " CASE WHEN cs.grades > 92 AND cs.grades < 101  THEN 'A'"
                       + " WHEN cs.grades > 89 AND cs.grades < 91  THEN 'A-'"
                       + " WHEN cs.grades > 86 AND cs.grades < 90  THEN 'B+'"
                       + " WHEN cs.grades > 84 AND cs.grades < 87  THEN 'B'"
                       + " WHEN cs.grades > 79 AND cs.grades < 83  THEN 'B-'"
                       + " WHEN cs.grades > 76 AND cs.grades < 80  THEN 'C+'"
                       + " WHEN cs.grades > 72 AND cs.grades < 77  THEN 'C'"
                       + " WHEN cs.grades > 69 AND cs.grades < 73  THEN 'C-'"
                       + " WHEN cs.grades > 66 AND cs.grades < 70  THEN 'D+'"
                       + " WHEN cs.grades > 62 AND cs.grades < 67  THEN 'D'"
                       + " WHEN cs.grades > 59 AND cs.grades < 63  THEN 'D-'"
                       + " WHEN cs.grades > 1 AND cs.grades < 60  THEN 'D-'"
                       + " ELSE 'N/A' END as grades"
                       + ", sc.semester" +
                    " from schedule sc inner join classes cs on sc.CLASS_ID = cs.CLASS_ID" +
                    " where STUDENT_ID ="+ Integer.parseInt(idtxtbox.getText()) +
                       "AND sc.semester LIKE UPPER('%" +semestertxtbox.getText()+"%')";
                      
        Statement update = con.createStatement();
        rs = st.executeQuery(sql);
        classes.setModel(DbUtils.resultSetToTableModel(rs));
        
     }catch(SQLException e){
         e.printStackTrace();
     }
    }//GEN-LAST:event_filterActionPerformed

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
            java.util.logging.Logger.getLogger(studentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentData.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Student;
    private javax.swing.JButton add;
    private javax.swing.JTable classes;
    private javax.swing.JButton delete;
    private javax.swing.JButton filter;
    private javax.swing.JTextField fnametxtbox;
    private javax.swing.JTextField gpatxtbox;
    private javax.swing.JTextField idtxtbox;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField lnametxtbox;
    private java.awt.Panel panel1;
    private javax.swing.JTextField semestertxtbox;
    private javax.swing.JButton showClasses;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
