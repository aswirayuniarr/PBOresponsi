/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settingKaryawan;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ScrollPaneConstants;
import javax.swing.table.DefaultTableModel;
import pboresponsi.PBOresponsi;
import koneksi.Koneksi;
/**
 *
 * @author Aswira Yuniar
 */
public class Tampilan extends JFrame{

    JFrame frame = new JFrame("JDBC");
    public JTable tabel;
     DefaultTableModel model;
    JScrollPane scrollPane;
    public Object namaKolom[] = {"ID", "Nama", "Usia", "Gaji"};
    
    public JButton bKembali = new JButton("KEMBALI");
    
    
    public Tampilan(){
        
        model = new DefaultTableModel(namaKolom, 0);
        tabel = new JTable(model);
        scrollPane = new JScrollPane(tabel);
        
        setTitle("Data Karyawan");
        setSize(1920, 1080);
        setVisible(true);
        setLayout(null);
        add(scrollPane);
        
        scrollPane.setBounds(40, 35, 1800, 100);
        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        add(bKembali);
        bKembali.setBounds(20, 500,100, 30);

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    

    
}
