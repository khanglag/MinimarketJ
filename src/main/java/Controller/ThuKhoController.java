/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import BEAN.DanhMucBean;
import GUI.QuanLy.TrangChinh;
import GUI.ThuKho.PhieuNhapHang;
import GUI.ThuKho.PhieuXuatHang;
import GUI.ThuKho.QuanLyNhapHang;
import GUI.ThuKho.QuanLyXuatHang;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author khang
 */
public class ThuKhoController {
    private JPanel root;
    private String kindSelected="";
    private List<DanhMucBean> listItem = null;

    public ThuKhoController(JPanel jpnRoot) {
        this.root = jpnRoot;
    }
    
    public void setDashboard(JPanel jpnItem, JLabel jlbItem) {
       kindSelected = "TrangChinh";
       jpnItem.setBackground(new Color(96, 100, 191));
       jlbItem.setBackground(new Color(96, 100, 191));
       JPanel node = new TrangChinh();
       root.removeAll();
       root.setLayout(new BorderLayout());
       root.add(node);
       root.validate();
       root.repaint();
}

    public void setView(JPanel jpnItem, JLabel jlbItem){
        kindSelected = "TrangChu";
        
        root.removeAll();
        root.setLayout(new BorderLayout());
        root.add(new TrangChinh());
        root.validate();
        root.repaint();
    }
    
    public void setEvent(List<DanhMucBean> listItem){
        this.listItem = listItem;
        for(DanhMucBean item: listItem){
            item.getJlb().addMouseListener(new LabelEvent(item.getKind(), item.getJpn(), item.getJlb()));
    
        }
        
    }
    class LabelEvent implements MouseListener{
        private JPanel node;
        private String kind;

        private JPanel jpnItem;
        private JLabel jlbItem;

        public LabelEvent( String kind, JPanel jpnItem, JLabel jlbItem) {
            this.kind = kind;
            this.jpnItem = jpnItem;
            this.jlbItem = jlbItem;
        }
        
        

        @Override
        public void mouseClicked(MouseEvent e) {
            switch (kind) {
                case "TrangChinh":
                    node = new TrangChinh();
                    break;
                case "PhieuNhapHang":
                    node = new PhieuNhapHang();
                    break;
                case "QuanLyNhapHang":
                    node = new QuanLyNhapHang();
                    break;
                case "PhieuXuatHang":
                    node = new PhieuXuatHang();
                    break;
                case "QuanLyXuatHang":
                    node = new QuanLyXuatHang();
                    break;

                // more
                default:
                    break;
           }
           root.removeAll();
           root.setLayout(new BorderLayout());
           root.add(node);
           root.validate();
           root.repaint();
            setChangeBackGround(kind);
            
        }

         @Override
      public void mousePressed(MouseEvent e) {
           kindSelected = kind;
           jpnItem.setBackground(new Color(0,0,0));
           jlbItem.setBackground(new Color(0,0,0));
      }

      @Override
      public void mouseReleased(MouseEvent e) {

      }

      @Override
      public void mouseEntered(MouseEvent e) {
          jpnItem.setBackground(new Color(0,0,0));
          jlbItem.setBackground(new Color(0,0,0));
      }

      @Override
      public void mouseExited(MouseEvent e) {
          if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(51,51,51));
                jlbItem.setBackground(new Color(51,51,51));
          }
      }
        
    }
    private void setChangeBackGround(String kind){
        for(DanhMucBean item: listItem){
            if(item.getKind().equalsIgnoreCase(kind)){
                item.getJpn().setBackground(new Color(0,0,0));
                item.getJlb().setBackground(new Color(0,0,0));
            } else{
                item.getJpn().setBackground(new Color(51,51,51));
                item.getJlb().setBackground(new Color(51,51,51));
            }
            
        }
        
    }
}
