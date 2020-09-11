/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.src;

/**
 *
 * @author joaod
 */
public class ViewAndEditTask extends javax.swing.JDialog {

    /**
     * Creates new form ViewAndEditTask
     */
    public ViewAndEditTask(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jPanel1 = new javax.swing.JPanel();
        taskNameValue = new javax.swing.JLabel();
        taskNameField = new javax.swing.JTextField();
        datePicker1 = new com.github.lgooddatepicker.components.DatePicker();
        jLabel2 = new javax.swing.JLabel();
        taskPriorityLabel = new javax.swing.JLabel();
        taskPriorityComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        taskOwner = new javax.swing.JLabel();
        taskStartDateValue = new javax.swing.JLabel();
        taskStateLabel = new javax.swing.JLabel();
        taskStateValue = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        associatedUsersLabel = new javax.swing.JLabel();
        removeUserFromTask = new javax.swing.JLabel();
        addUserToTask = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        defaultBackground = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("View and edit your selected Task");
        setModal(true);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        taskNameValue.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        taskNameValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskNameValue.setText("taskName");
        jPanel1.add(taskNameValue);
        taskNameValue.setBounds(0, 35, 432, 43);

        taskNameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taskNameField.setText("jTextField1");
        jPanel1.add(taskNameField);
        taskNameField.setBounds(50, 151, 321, 97);

        datePicker1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(datePicker1);
        datePicker1.setBounds(188, 325, 183, 28);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Limit Date:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(102, 328, 68, 30);

        taskPriorityLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taskPriorityLabel.setText("Priority:");
        jPanel1.add(taskPriorityLabel);
        taskPriorityLabel.setBounds(120, 380, 49, 30);

        taskPriorityComboBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        taskPriorityComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Low", "Medium", "High" }));
        jPanel1.add(taskPriorityComboBox);
        taskPriorityComboBox.setBounds(190, 380, 110, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel1.setText("Start Date:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(102, 282, 68, 30);

        taskOwner.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        taskOwner.setText("jLabel3");
        taskOwner.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jPanel1.add(taskOwner);
        taskOwner.setBounds(0, 96, 432, 20);

        taskStartDateValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taskStartDateValue.setText("jLabel3");
        jPanel1.add(taskStartDateValue);
        taskStartDateValue.setBounds(188, 282, 132, 30);

        taskStateLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taskStateLabel.setText("Task State:");
        jPanel1.add(taskStateLabel);
        taskStateLabel.setBounds(101, 430, 69, 30);

        taskStateValue.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        taskStateValue.setText("jLabel4");
        jPanel1.add(taskStateValue);
        taskStateValue.setBounds(188, 430, 44, 30);

        jList1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(jList1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(188, 476, 183, 76);

        associatedUsersLabel.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        associatedUsersLabel.setText("Associated Users:");
        jPanel1.add(associatedUsersLabel);
        associatedUsersLabel.setBounds(64, 492, 106, 30);

        removeUserFromTask.setIcon(new javax.swing.ImageIcon(String.format("%s\\Images\\RemoveUser.png", System.getProperty("user.dir"))));
        removeUserFromTask.setToolTipText("");
        removeUserFromTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                removeUserFromTaskMouseClicked(evt);
            }
        });
        jPanel1.add(removeUserFromTask);
        removeUserFromTask.setBounds(330, 560, 40, 50);

        addUserToTask.setIcon(new javax.swing.ImageIcon(String.format("%s\\Images\\AddUser.png", System.getProperty("user.dir"))));
        addUserToTask.setToolTipText("");
        addUserToTask.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addUserToTaskMouseClicked(evt);
            }
        });
        jPanel1.add(addUserToTask);
        addUserToTask.setBounds(190, 560, 40, 40);

        jButton1.setText("Save Changes");
        jPanel1.add(jButton1);
        jButton1.setBounds(80, 663, 110, 30);

        jButton2.setText("Exit & Don't Save");
        jPanel1.add(jButton2);
        jButton2.setBounds(223, 663, 130, 30);

        defaultBackground.setIcon(new javax.swing.ImageIcon(String.format("%s\\Images\\DefaultBackground.png", System.getProperty("user.dir"))));
        jPanel1.add(defaultBackground);
        defaultBackground.setBounds(0, 0, 430, 730);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 440, 730);

        setSize(new java.awt.Dimension(448, 767));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addUserToTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addUserToTaskMouseClicked
        
    }//GEN-LAST:event_addUserToTaskMouseClicked

    private void removeUserFromTaskMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeUserFromTaskMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_removeUserFromTaskMouseClicked

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
            java.util.logging.Logger.getLogger(ViewAndEditTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewAndEditTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewAndEditTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewAndEditTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ViewAndEditTask dialog = new ViewAndEditTask(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel addUserToTask;
    private javax.swing.JLabel associatedUsersLabel;
    private com.github.lgooddatepicker.components.DatePicker datePicker1;
    private javax.swing.JLabel defaultBackground;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel removeUserFromTask;
    private javax.swing.JTextField taskNameField;
    private javax.swing.JLabel taskNameValue;
    private javax.swing.JLabel taskOwner;
    private javax.swing.JComboBox<String> taskPriorityComboBox;
    private javax.swing.JLabel taskPriorityLabel;
    private javax.swing.JLabel taskStartDateValue;
    private javax.swing.JLabel taskStateLabel;
    private javax.swing.JLabel taskStateValue;
    // End of variables declaration//GEN-END:variables
}