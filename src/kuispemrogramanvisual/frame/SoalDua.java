/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispemrogramanvisual.frame;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author LABKOM2-17
 */
public class SoalDua {
    
    public static void main (String[] args) {  
        soalDua();
    } 
    
    // 1. Menambahkan return type pada method soalDua
    public static void soalDua() {
    
        JFrame frame = new JFrame("Contoh Soal 2");
        JPanel panel = new JPanel();
        
         // 2. Mendefinsikan element button untuk login
         JButton btnKeluar = new JButton("Keluar");
        
         Object data[][] = {
             { "No.", "NIM",  "Nama", " Mata Kuliah", "Nilai" },
            { "01", "20302001",  "Agus", "Pemrograman Visual", "90" },
            { "02", "20302002",  "Andi", "Pemrograman Visual", "80" },
            { "03", "20302003",  "Ani", "Pemrograman Visual", "75" },
            { "04",  "20302004", "April", "Pemrograman Visual", "70" }
        };
        
        String columnNames[] = { "No", "NIM", "Nama", "Mata Kuliah", "Nilai" };
        
        DefaultTableModel tableModel = new DefaultTableModel( data, columnNames ) {
             @Override public Class<?> getColumnClass(int column) {
      return column == 1 ? DefaultComboBoxModel.class : String.class;
    }
        };
        
        JTable table = new JTable(tableModel);
        JTableHeader header = table.getTableHeader();
        frame.add(table);
        frame.setSize(800, 180);
        
        frame.setVisible(true);
        
         //  3. Meletakkan element button login 
        btnKeluar.setBounds(15, 150, 750, 25);
        
         // 4. Menambahkan btnLogin pada frame
         frame.add(btnKeluar);
        
        frame.setLayout(null);
        
        frame.setVisible(true);
        
        //  5. Membuat action click untuk keluar
        btnKeluar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  5. Membuat message box untuk keluar
                int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Keluar lah", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
                if (confirm == 0) {
                    System.exit(0);
                }
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
