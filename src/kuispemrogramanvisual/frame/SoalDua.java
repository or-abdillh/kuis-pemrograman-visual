/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Oka Rajeb Abdillah
// 20302022

package kuispemrogramanvisual.frame;

import java.awt.BorderLayout;
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
        
         // 2. Mendefinsikan element button untuk keluar
         JButton btnKeluar = new JButton("Keluar");
        
         // 3. Menambahkan NIM
         Object data[][] = {
            { "01", "20302001",  "Agus", "Pemrograman Visual", "90" },
            { "02", "20302002",  "Andi", "Pemrograman Visual", "80" },
            { "03", "20302003",  "Ani", "Pemrograman Visual", "75" },
            { "04",  "20302004", "April", "Pemrograman Visual", "70" }
        };


        // 4. Menambahkan column "NIM"
        String columnNames[] = { "No", "NIM", "Nama", "Mata Kuliah", "Nilai" };
        
        DefaultTableModel tableModel = new DefaultTableModel();
        
        JTable table = new JTable(tableModel);
        tableModel.addColumn("No");
        tableModel.addColumn("NIM");
        tableModel.addColumn("Nama");
        tableModel.addColumn("Mata Kuliah");
        tableModel.addColumn("Nilai");
        
        tableModel.insertRow(0, data[0]);
        tableModel.insertRow(0, data[1]);
        tableModel.insertRow(0, data[2]);
        tableModel.insertRow(0, data[3]);
        
        frame.setSize(800, 180);
        frame.add( new JScrollPane(table) );
        frame.setVisible(true);
        
         //  5. Meletakkan element button keluar 
         btnKeluar.setBounds(15, 150, 750, 25);
        
         // 6. Menambahkan btnKeluar pada frame
         frame.add(btnKeluar);
        
         frame.setLayout(null);
        
        //  7. Membuat action click untuk keluar
        btnKeluar.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //  8. Membuat message box untuk keluar
                int confirm = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar?", "Keluar lah", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
                if (confirm == 0) {
                    System.exit(0);
                }
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    }
}
