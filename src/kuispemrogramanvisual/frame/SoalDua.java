/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuispemrogramanvisual.frame;

import javax.swing.*;
import javax.swing.table.*;
import java.awt.*;

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
        
         Object data[][] = {
            { "01",  "Agus", "Pemrograman Visual", "90" },
            { "02",  "Andi", "Pemrograman Visual", "80" },
            { "03",  "Ani", "Pemrograman Visual", "75" },
            { "04",  "April", "Pemrograman Visual", "70" }
        };
        
        String columnNames[] = { "No", "Nama", "Mata Kuliah", "Nilai" };
        
        DefaultTableModel tableModel = new DefaultTableModel( data, columnNames ) {
             @Override public Class<?> getColumnClass(int column) {
      return column == 1 ? DefaultComboBoxModel.class : String.class;
    }
        };
        
        JTable table = new JTable(tableModel);
        JTableHeader header = table.getTableHeader();
        frame.add(table);
        frame.setSize(460, 200);
        
        frame.setVisible(true);
    }
}
