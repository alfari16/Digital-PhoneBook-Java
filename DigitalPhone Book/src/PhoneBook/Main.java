/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PhoneBook;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Alfari
 */
public class Main extends javax.swing.JFrame{ 
        public static hash hash;
        public static add add;
        public static Edit Edit;
        public static Delete Delete;
        private int cat;
        String cari;
        array array;
        array[] temp;
        int name;
    /**
     * Creates new form NewJFrame
     */
    public Main() {
        hash = new hash();
        add = new add();
        initComponents();
        start();
    }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        btnEdit = new javax.swing.JButton();
        btnAddNumber = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableArray = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        btnsearch = new javax.swing.JButton();
        RadallFilter = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        RadfamFilter = new javax.swing.JRadioButton();
        radFriendFilter = new javax.swing.JRadioButton();
        radDosenFilter = new javax.swing.JRadioButton();
        applyFilter = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnEdit1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnAddNumber1 = new javax.swing.JButton();
        combNama = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(250, 100));
        setResizable(false);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Fontastique", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Digital PhoneBook");
        jLabel1.setToolTipText("");

        btnEdit.setText("Edit Kontak");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        btnAddNumber.setText("Refresh List");
        btnAddNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNumberActionPerformed(evt);
            }
        });

        tableArray.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nama Depan", "Nama Belakang", "Kategori", "Nomor Telepon"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableArray.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tableArray);

        txtSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchActionPerformed(evt);
            }
        });

        btnsearch.setText("Cari");
        btnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchActionPerformed(evt);
            }
        });

        RadallFilter.setText("Semua");
        RadallFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadallFilterActionPerformed(evt);
            }
        });

        jLabel2.setText("Tampilkan berdasarkan kategori:");

        RadfamFilter.setText("Keluarga");
        RadfamFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadfamFilterActionPerformed(evt);
            }
        });

        radFriendFilter.setText("Teman");
        radFriendFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radFriendFilterActionPerformed(evt);
            }
        });

        radDosenFilter.setText("Dosen/Guru");
        radDosenFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radDosenFilterActionPerformed(evt);
            }
        });

        applyFilter.setText("Apply");
        applyFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyFilterActionPerformed(evt);
            }
        });

        jLabel3.setText("Cari kontak :");

        btnEdit1.setText("Hapus Kontak");
        btnEdit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEdit1ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel4.setText("version 1.0");

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("developed by Alif & Fahrul");

        btnAddNumber1.setText("Tambah Kontak");
        btnAddNumber1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNumber1ActionPerformed(evt);
            }
        });

        combNama.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nama Depan", "Nama Belakang" }));

        jLabel6.setText("Cari berdasarkan :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(combNama, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(RadallFilter, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(applyFilter))
                            .addComponent(radDosenFilter)
                            .addComponent(RadfamFilter)
                            .addComponent(radFriendFilter)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jLabel5))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(btnAddNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnAddNumber1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(0, 13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(9, 9, 9))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsearch)
                    .addComponent(jLabel5)
                    .addComponent(combNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnAddNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddNumber1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEdit1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadallFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radFriendFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RadfamFilter)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(radDosenFilter)
                        .addGap(5, 5, 5)
                        .addComponent(applyFilter))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        new Edit().setVisible(true);
    }//GEN-LAST:event_btnEditActionPerformed

    private void RadallFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadallFilterActionPerformed
        // TODO add your handling code here:
        radDosenFilter.setSelected(false);
        RadfamFilter.setSelected(false);
        radFriendFilter.setSelected(false);
        cat=3;
    }//GEN-LAST:event_RadallFilterActionPerformed

    private void RadfamFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadfamFilterActionPerformed
        // TODO add your handling code here:
        radDosenFilter.setSelected(false);
        RadallFilter.setSelected(false);
        radFriendFilter.setSelected(false);
        cat=0;
    }//GEN-LAST:event_RadfamFilterActionPerformed

    private void radFriendFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radFriendFilterActionPerformed
        // TODO add your handling code here:
        radDosenFilter.setSelected(false);
        RadfamFilter.setSelected(false);
        RadallFilter.setSelected(false);
        cat=1;
    }//GEN-LAST:event_radFriendFilterActionPerformed

    private void radDosenFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radDosenFilterActionPerformed
        // TODO add your handling code here:
        RadallFilter.setSelected(false);
        RadfamFilter.setSelected(false);
        radFriendFilter.setSelected(false);
        cat=2;
    }//GEN-LAST:event_radDosenFilterActionPerformed
    String cat(int key){
        switch(key){
            case 0: return "Keluarga";
            case 1: return "Teman";
            case 2: return "Guru/Dosen";
            default: return null;
        }
    }
    public void showOff(int key) {
        DefaultTableModel model = (DefaultTableModel) tableArray.getModel();
        model.setRowCount(0);
        name=0;
        temp = new array[Main.hash.counter];
        int counter=0;
        for (int i = 0; i < Main.hash.hashFirst[0].length; i++) {
            if(Main.hash.hashFirst[name][i]!=null){
                temp[counter++]=Main.hash.hashFirst[name][i];
            }
        }
        Arrays.sort(temp, new Comparator<array>() {
        public int compare(array o1, array o2) {
                return o1.namaDepan.compareTo(o2.namaDepan);
            }
        });
        for (int i = 0; i < temp.length; i++) {
            if(key==3){
                Object[] row = {
                    temp[i].namaDepan,
                    temp[i].namaBelakang,
                    cat(temp[i].cat),
                    temp[i].number,
                };
                model.addRow(row);
            }else if(temp[i].cat==key){
                Object[] row = {
                    temp[i].namaDepan,
                    temp[i].namaBelakang,
                    cat(temp[i].cat),
                    temp[i].number,
                };
                model.addRow(row);
            }
        }
    }
    void disableRad(){
        radDosenFilter.setSelected(false);
        RadfamFilter.setSelected(false);
        RadallFilter.setSelected(false);
        radFriendFilter.setSelected(false);
    }
    void search(){
        cari=txtSearch.getText().trim();
        name=combNama.getSelectedIndex();
        try{
            String search=Main.hash.convert(cari);
            if(name==1){
                search=cari.toUpperCase();
            }
            int counter=Main.hash.counter(search);
            DefaultTableModel model = (DefaultTableModel) tableArray.getModel();
            model.setRowCount(0);
            int hash=Main.hash.hashFunc(counter);
            if(Main.hash.hashFirst[name][hash]==null) {
                 JOptionPane.showMessageDialog(null, "Not Found");
                 return;
            }
            if(name==0){
                while(Main.hash.hashFirst[name][hash]!=null && search.equals(Main.hash.hashFirst[name][hash].namaDepan)){
                    if(cat==3 | Main.hash.hashFirst[name][hash].cat==cat){
                        Object[] row = {
                            Main.hash.hashFirst[name][hash].namaDepan,
                            Main.hash.hashFirst[name][hash].namaBelakang,
                            cat(Main.hash.hashFirst[name][hash].cat),
                            Main.hash.hashFirst[name][hash].number,
                        };
                        model.addRow(row);
                    }
                    hash=Main.hash.hashFunc(++hash);
                }
            }else{
                while(Main.hash.hashFirst[name][hash]!=null && search.equals(Main.hash.hashFirst[name][hash].namaBelakang)){
                    if(cat==3 | Main.hash.hashFirst[name][hash].cat==cat){
                        Object[] row = {
                            Main.hash.hashFirst[name][hash].namaDepan,
                            Main.hash.hashFirst[name][hash].namaBelakang,
                            cat(Main.hash.hashFirst[name][hash].cat),
                            Main.hash.hashFirst[name][hash].number,
                        };
                        model.addRow(row);
                    }
                    hash=Main.hash.hashFunc(++hash);
                }
            }
        }catch(Exception e){
            showOff(cat);
        }
    }
    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed
        search();
    }//GEN-LAST:event_btnsearchActionPerformed
    void add(){
        new add().setVisible(true);
        showOff(3);
        txtSearch.setText("");
    }
    private void btnAddNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNumberActionPerformed
        showOff(cat);
        txtSearch.setText("");
    }//GEN-LAST:event_btnAddNumberActionPerformed

    private void applyFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyFilterActionPerformed
        if(!txtSearch.getText().equalsIgnoreCase("")){
            search();
        }else showOff(cat);
    }//GEN-LAST:event_applyFilterActionPerformed

    private void btnEdit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEdit1ActionPerformed
       new Delete().setVisible(true);
    }//GEN-LAST:event_btnEdit1ActionPerformed

    private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSearchActionPerformed

    private void btnAddNumber1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNumber1ActionPerformed
        add();
    }//GEN-LAST:event_btnAddNumber1ActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RadallFilter;
    private javax.swing.JRadioButton RadfamFilter;
    private javax.swing.JButton applyFilter;
    private javax.swing.JButton btnAddNumber;
    private javax.swing.JButton btnAddNumber1;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnEdit1;
    private javax.swing.JButton btnsearch;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> combNama;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radDosenFilter;
    private javax.swing.JRadioButton radFriendFilter;
    private javax.swing.JTable tableArray;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    private void start() {
        name=0;
        cat=3;
        cari="";
        showOff(cat);
        RadallFilter.setSelected(true);
        tableArray.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
        tableArray.getColumnModel().getColumn(0).setPreferredWidth(100);
        tableArray.getColumnModel().getColumn(1).setPreferredWidth(100);
        tableArray.getColumnModel().getColumn(2).setPreferredWidth(80);
        tableArray.getColumnModel().getColumn(3).setPreferredWidth(170);
    }
}
