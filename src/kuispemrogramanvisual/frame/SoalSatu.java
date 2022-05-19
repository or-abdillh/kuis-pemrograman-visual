/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Oka Rajeb Abdillah
// 20302022

package kuispemrogramanvisual.frame;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author LABKOM2-17
 */
public class SoalSatu {
    
    public static void main (String args[]) {
    
        JFrame  myFrame = new JFrame("Silahkan login");
        
        JLabel username = new JLabel("username");
        
        // 1. Mendefinsikan element button untuk login
        JButton btnLogin = new JButton("Login");
        
        //  2. Membuat  input field untuk label userame
        JTextField usernameField = new JTextField(20);
        
        JLabel password = new JLabel("password");
        
        JPasswordField passwordField = new JPasswordField(20);
        
        username.setBounds( 10, 50, 100, 25 );
        
        password.setBounds( 10, 100, 100, 25 );
        
        passwordField.setBounds(100, 100, 250, 25);
        
        //  3. Meletakkan element button login 
        btnLogin.setBounds(10, 150, 350, 25);
        
        // 4. Mengatur posisi dari username field yang telah dibuat
        usernameField.setBounds(100, 50, 250, 25);
        
        myFrame.add(username);
        
        myFrame.add(password);
        
        myFrame.add(passwordField);
        
        // 5. Menambahkan usernameField ke dalam frame
        myFrame.add(usernameField);

        // 6. Menambahkan btnLogin pada frame
        myFrame.add(btnLogin);
        
        myFrame.setLayout(null);
        
        myFrame.setVisible(true);

        //  7. Membuat action click untuk keluar
        btnLogin.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
    } 
}
