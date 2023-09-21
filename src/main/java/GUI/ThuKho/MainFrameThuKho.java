/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI.ThuKho;

import BEAN.DanhMucBean;
import Controller.ThuKhoController;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.List;
import javax.swing.border.Border;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;

/**
 *
 * @author khang
 */
public class MainFrameThuKho extends javax.swing.JFrame {

    /**
     * Creates new form MainFrameThuKho
     */
    public MainFrameThuKho() {

        initComponents();
        TrinhDieuKhien();
        

    }

    private void TrinhDieuKhien() {
        ThuKhoController controller = new ThuKhoController(jpnView);
        controller.setView(panelTrangChu, jLabelTrangChu);
        
        List<DanhMucBean> listItem = new ArrayList<>();
        //listItem.add(new DanhMucBean("TrangChinh",jpnTrangChu,jlbTrangChu));
        listItem.add(new DanhMucBean("PhieuNhap",panelPhieuNhap,jLabelPhieuNhap));
        listItem.add(new DanhMucBean("QuanLyPhieuNhap",panelQuanLyPhieuNhap,jLabelQuanLyPhieuNhap));
        listItem.add(new DanhMucBean("PhieuXuat",panelPhieuXuat,jLabelPhieuXuat));
        listItem.add(new DanhMucBean("QuanLyPhieuXuat",panelQuanLyPhieuXuat,jLabelQuanLyPhieuXuat));
  
        
        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnRoot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        panelMenu = new javax.swing.JPanel();
        panelPhieuXuat = new javax.swing.JPanel();
        jLabelPhieuXuat = new javax.swing.JLabel();
        panelQuanLyPhieuXuat = new javax.swing.JPanel();
        jLabelQuanLyPhieuXuat = new javax.swing.JLabel();
        panelPhieuNhap = new javax.swing.JPanel();
        jLabelPhieuNhap = new javax.swing.JLabel();
        panelQuanLyPhieuNhap = new javax.swing.JPanel();
        jLabelQuanLyPhieuNhap = new javax.swing.JLabel();
        jpnView = new javax.swing.JPanel();
        panelMenuI = new javax.swing.JPanel();
        panelDoiMatKhau = new javax.swing.JPanel();
        jLabelDoiMatKhau = new javax.swing.JLabel();
        panelLogout = new javax.swing.JPanel();
        jLabelLogout = new javax.swing.JLabel();
        panelThoat = new javax.swing.JPanel();
        jLabelThoat = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        panelTrangChu = new javax.swing.JPanel();
        jLabelTrangChu = new javax.swing.JLabel();
        panelMenuBar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(255, 255, 255));

        jScrollPane1.setBackground(new java.awt.Color(189, 205, 214));
        jScrollPane1.setForeground(new java.awt.Color(189, 205, 214));
        jScrollPane1.setHorizontalScrollBar(null);

        panelMenu.setBackground(new java.awt.Color(189, 205, 214));

        jLabelPhieuXuat.setText("Phiếu xuất");

        javax.swing.GroupLayout panelPhieuXuatLayout = new javax.swing.GroupLayout(panelPhieuXuat);
        panelPhieuXuat.setLayout(panelPhieuXuatLayout);
        panelPhieuXuatLayout.setHorizontalGroup(
            panelPhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPhieuXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPhieuXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPhieuXuatLayout.setVerticalGroup(
            panelPhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPhieuXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPhieuXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelQuanLyPhieuXuat.setText("Quản lý phiếu xuất");

        javax.swing.GroupLayout panelQuanLyPhieuXuatLayout = new javax.swing.GroupLayout(panelQuanLyPhieuXuat);
        panelQuanLyPhieuXuat.setLayout(panelQuanLyPhieuXuatLayout);
        panelQuanLyPhieuXuatLayout.setHorizontalGroup(
            panelQuanLyPhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelQuanLyPhieuXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQuanLyPhieuXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelQuanLyPhieuXuatLayout.setVerticalGroup(
            panelQuanLyPhieuXuatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLyPhieuXuatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQuanLyPhieuXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelPhieuNhap.setText("Phiếu nhập");

        javax.swing.GroupLayout panelPhieuNhapLayout = new javax.swing.GroupLayout(panelPhieuNhap);
        panelPhieuNhap.setLayout(panelPhieuNhapLayout);
        panelPhieuNhapLayout.setHorizontalGroup(
            panelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPhieuNhapLayout.setVerticalGroup(
            panelPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelQuanLyPhieuNhap.setText("Quản lý phiếu nhập");

        javax.swing.GroupLayout panelQuanLyPhieuNhapLayout = new javax.swing.GroupLayout(panelQuanLyPhieuNhap);
        panelQuanLyPhieuNhap.setLayout(panelQuanLyPhieuNhapLayout);
        panelQuanLyPhieuNhapLayout.setHorizontalGroup(
            panelQuanLyPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLyPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQuanLyPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelQuanLyPhieuNhapLayout.setVerticalGroup(
            panelQuanLyPhieuNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelQuanLyPhieuNhapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelQuanLyPhieuNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelQuanLyPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panelQuanLyPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addComponent(panelPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelQuanLyPhieuXuat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelQuanLyPhieuNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 83, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(panelMenu);

        jpnView.setBackground(new java.awt.Color(255, 255, 255));

        panelMenuI.setPreferredSize(new java.awt.Dimension(110, 110));
        panelMenuI.setLayout(new java.awt.GridLayout(3, 0));

        jLabelDoiMatKhau.setText("Đổi mật khẩu");

        javax.swing.GroupLayout panelDoiMatKhauLayout = new javax.swing.GroupLayout(panelDoiMatKhau);
        panelDoiMatKhau.setLayout(panelDoiMatKhauLayout);
        panelDoiMatKhauLayout.setHorizontalGroup(
            panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDoiMatKhau, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelDoiMatKhauLayout.setVerticalGroup(
            panelDoiMatKhauLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDoiMatKhauLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelDoiMatKhau)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelMenuI.add(panelDoiMatKhau);

        jLabelLogout.setText("Logout");

        javax.swing.GroupLayout panelLogoutLayout = new javax.swing.GroupLayout(panelLogout);
        panelLogout.setLayout(panelLogoutLayout);
        panelLogoutLayout.setHorizontalGroup(
            panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelLogoutLayout.setVerticalGroup(
            panelLogoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLogoutLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelLogout)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelMenuI.add(panelLogout);

        jLabelThoat.setText("Thoát");

        javax.swing.GroupLayout panelThoatLayout = new javax.swing.GroupLayout(panelThoat);
        panelThoat.setLayout(panelThoatLayout);
        panelThoatLayout.setHorizontalGroup(
            panelThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThoatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelThoatLayout.setVerticalGroup(
            panelThoatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelThoatLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelThoat)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        panelMenuI.add(panelThoat);

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jpnViewLayout = new javax.swing.GroupLayout(jpnView);
        jpnView.setLayout(jpnViewLayout);
        jpnViewLayout.setHorizontalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnViewLayout.createSequentialGroup()
                .addGap(0, 356, Short.MAX_VALUE)
                .addComponent(panelMenuI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnViewLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(48, 48, 48))
        );
        jpnViewLayout.setVerticalGroup(
            jpnViewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnViewLayout.createSequentialGroup()
                .addComponent(panelMenuI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(147, 166, 174));

        jLabelTrangChu.setText("jLabel2");

        javax.swing.GroupLayout panelTrangChuLayout = new javax.swing.GroupLayout(panelTrangChu);
        panelTrangChu.setLayout(panelTrangChuLayout);
        panelTrangChuLayout.setHorizontalGroup(
            panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(135, Short.MAX_VALUE))
        );
        panelTrangChuLayout.setVerticalGroup(
            panelTrangChuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTrangChuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTrangChu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelMenuBarLayout = new javax.swing.GroupLayout(panelMenuBar);
        panelMenuBar.setLayout(panelMenuBarLayout);
        panelMenuBarLayout.setHorizontalGroup(
            panelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelMenuBarLayout.setVerticalGroup(
            panelMenuBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(panelTrangChu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panelMenuBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelTrangChu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelMenuBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jpnView, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnRootLayout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jpnView, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jLabel1MouseClicked
    
    int height = 110;
    int width = 110;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(width==110){
            for (int i = 0; i < width; i++) {
                    panelMenuI.setSize(i, height);
                }
            
        }else{
             for (int i = width; i > 0; i--) {
                    panelMenuI.setSize(i, height);
                }
            
        }

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrameThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrameThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrameThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrameThuKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrameThuKho().setVisible(true);
            }
        });
    }

  

    //mở menu
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelDoiMatKhau;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelPhieuNhap;
    private javax.swing.JLabel jLabelPhieuXuat;
    private javax.swing.JLabel jLabelQuanLyPhieuNhap;
    private javax.swing.JLabel jLabelQuanLyPhieuXuat;
    private javax.swing.JLabel jLabelThoat;
    private javax.swing.JLabel jLabelTrangChu;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpnView;
    private javax.swing.JPanel panelDoiMatKhau;
    private javax.swing.JPanel panelLogout;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelMenuBar;
    private javax.swing.JPanel panelMenuI;
    private javax.swing.JPanel panelPhieuNhap;
    private javax.swing.JPanel panelPhieuXuat;
    private javax.swing.JPanel panelQuanLyPhieuNhap;
    private javax.swing.JPanel panelQuanLyPhieuXuat;
    private javax.swing.JPanel panelThoat;
    private javax.swing.JPanel panelTrangChu;
    // End of variables declaration//GEN-END:variables
}
