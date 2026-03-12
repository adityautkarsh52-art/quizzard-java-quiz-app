/*
 Quizzard - Java Quiz Application
 Author: Aditya Utkarsh
 Description: GUI based quiz system using Java Swing.
*/

package firstProject.com;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class login extends JFrame implements ActionListener {

    JTextField text;

    JButton Login, Register;


    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/login.png"));
        Image i = i1.getImage().getScaledInstance(550, 500, Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(450, 0, 550, 500);
        add(image);

        JLabel heading = new JLabel("LOGIN");
        heading.setBounds(150, 60, 300, 45);
        heading.setFont(new Font("Mongolian Baiti" ,Font.BOLD,40));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        JLabel name = new JLabel("Username");
        name.setBounds(160, 150, 300, 20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        name.setForeground(new Color(22, 99, 54));
        add(name);

        text = new JTextField();
        text.setBounds(80, 180, 300, 25);
        text.setFont(new Font("Times New Roman", Font.BOLD,  10));
        add(text);

        JLabel pass = new JLabel("Password");
        pass.setBounds(160, 250, 300, 20);
        pass.setFont(new Font("Mongolian Baiti", Font.BOLD, 22));
        pass.setForeground(new Color(22, 99, 54));
        add(pass);

        text = new JTextField();
        text.setBounds(80, 280, 300, 25);
        text.setFont(new Font("Times New Roman", Font.BOLD,  10));
        add(text);

        Login = new JButton("Login");
        Login.setBounds(100, 400, 120, 25);
        Login.setBackground(new Color(22, 99, 54));
        Login.setForeground(Color.WHITE);
        Login.addActionListener(this);
        add(Login);

        Register = new JButton("Register");
        Register.setBounds(250, 400, 120, 25);
        Register.setBackground(new Color(22, 99, 54));
        Register.setForeground(Color.WHITE);
        Register.addActionListener(this);
        add(Register);

        setSize(1000, 500);
        setLocation(250, 150);
        setUndecorated(true);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Login){
            String name = text.getText();
            setVisible(false);
            new name();

        }
        else if(e.getSource() == Register){
            new register();

        }

    }

    public static void main(String args[]){
        new login();
    }
}
