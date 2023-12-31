/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package GUI.ThuKho;

/**
 *
 * @author khang
 */
public class DEMOPhieuXuatHang extends javax.swing.JPanel {

    /**
     * Creates new form PhieuXuatHang
     */
    public DEMOPhieuXuatHang() {
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
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jtfMaPhieuXuat = new javax.swing.JTextField();
        jtfMaNhanVien = new javax.swing.JTextField();
        jtfTenKhachHang = new javax.swing.JTextField();
        jtfMaHang = new javax.swing.JTextField();
        jtfTenHang = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jtfDonViTinh = new javax.swing.JTextField();
        jtfSoLuong = new javax.swing.JTextField();
        jtfDonGia = new javax.swing.JTextField();
        jtfThanhTien = new javax.swing.JTextField();
        jtfGhiChu = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnLamMoi = new javax.swing.JButton();
        btnInPhieu = new javax.swing.JButton();
        btnXuatExcel = new javax.swing.JButton();
        btnNhapExcel = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnTinhTien = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePhieuXuatHang = new javax.swing.JTable();

        setLayout(new java.awt.GridLayout(2, 0, 0, 10));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Phiếu xuất hàng"));

        jPanel2.setLayout(new java.awt.GridLayout(5, 0, 0, 12));

        jLabel1.setText("Mã phiếu xuất");
        jPanel2.add(jLabel1);

        jLabel2.setText("Mã nhân viên");
        jPanel2.add(jLabel2);

        jLabel3.setText("Tên khách hàng");
        jPanel2.add(jLabel3);

        jLabel4.setText("Mã hàng");
        jPanel2.add(jLabel4);

        jLabel5.setText("Tên hàng");
        jPanel2.add(jLabel5);

        jPanel4.setLayout(new java.awt.GridLayout(5, 0, 0, 5));
        jPanel4.add(jtfMaPhieuXuat);
        jPanel4.add(jtfMaNhanVien);
        jPanel4.add(jtfTenKhachHang);
        jPanel4.add(jtfMaHang);
        jPanel4.add(jtfTenHang);

        jPanel3.setLayout(new java.awt.GridLayout(5, 0, 0, 12));

        jLabel6.setText("Đơn vị tính");
        jPanel3.add(jLabel6);

        jLabel7.setText("Số lượng");
        jPanel3.add(jLabel7);

        jLabel8.setText("Đơn giá");
        jPanel3.add(jLabel8);

        jLabel9.setText("Thành tiền");
        jPanel3.add(jLabel9);

        jLabel10.setText("Ghi chú");
        jPanel3.add(jLabel10);

        jPanel5.setPreferredSize(new java.awt.Dimension(180, 130));
        jPanel5.setLayout(new java.awt.GridLayout(5, 0, 0, 5));
        jPanel5.add(jtfDonViTinh);
        jPanel5.add(jtfSoLuong);
        jPanel5.add(jtfDonGia);
        jPanel5.add(jtfThanhTien);
        jPanel5.add(jtfGhiChu);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanel7.setLayout(new java.awt.GridLayout(2, 0));

        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        jPanel7.add(btnThem);

        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });
        jPanel7.add(btnSua);

        btnXoa.setText("Xoá");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });
        jPanel7.add(btnXoa);

        btnLamMoi.setText("Làm mới");
        btnLamMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLamMoiActionPerformed(evt);
            }
        });
        jPanel7.add(btnLamMoi);

        btnInPhieu.setText("In phiếu");
        btnInPhieu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInPhieuActionPerformed(evt);
            }
        });
        jPanel7.add(btnInPhieu);

        btnXuatExcel.setText("Xuất Excel");
        btnXuatExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXuatExcelActionPerformed(evt);
            }
        });
        jPanel7.add(btnXuatExcel);

        btnNhapExcel.setText("Nhập Excel");
        btnNhapExcel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhapExcelActionPerformed(evt);
            }
        });
        jPanel7.add(btnNhapExcel);

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        jPanel7.add(btnClear);

        btnTim.setText("Tim");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });
        jPanel7.add(btnTim);

        btnTinhTien.setText("Tính tiền");
        jPanel7.add(btnTinhTien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(jPanel1);

        tablePhieuXuatHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã phiếu xuất", "Mã nhân viên", "Tên khách hàng", "Mã hàng", "Tên hàng", "Đơn vị tính", "Số lượng", "Đơn giá", "Thành tiền", "Ghi chú"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePhieuXuatHang);
        if (tablePhieuXuatHang.getColumnModel().getColumnCount() > 0) {
            tablePhieuXuatHang.getColumnModel().getColumn(0).setPreferredWidth(20);
        }

        add(jScrollPane1);
    }// </editor-fold>//GEN-END:initComponents

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnLamMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLamMoiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLamMoiActionPerformed

    private void btnInPhieuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInPhieuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnInPhieuActionPerformed

    private void btnXuatExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXuatExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnXuatExcelActionPerformed

    private void btnNhapExcelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhapExcelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhapExcelActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnTimActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnInPhieu;
    private javax.swing.JButton btnLamMoi;
    private javax.swing.JButton btnNhapExcel;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTinhTien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btnXuatExcel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jtfDonGia;
    private javax.swing.JTextField jtfDonViTinh;
    private javax.swing.JTextField jtfGhiChu;
    private javax.swing.JTextField jtfMaHang;
    private javax.swing.JTextField jtfMaNhanVien;
    private javax.swing.JTextField jtfMaPhieuXuat;
    private javax.swing.JTextField jtfSoLuong;
    private javax.swing.JTextField jtfTenHang;
    private javax.swing.JTextField jtfTenKhachHang;
    private javax.swing.JTextField jtfThanhTien;
    private javax.swing.JTable tablePhieuXuatHang;
    // End of variables declaration//GEN-END:variables
}
