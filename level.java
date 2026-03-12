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



public class level extends JFrame implements ActionListener {

    JButton  easy, medium, hard;

    level(){

        JLabel heading = new JLabel("SELECT LEVEL");
        heading.setBounds(290, 100, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,28));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i = i1.getImage().getScaledInstance(800, 650,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 800, 650);
        add(image);

        easy = new JButton("EASY");
        easy.setBounds(290, 200, 200, 50);
        easy.setBackground(new Color(22, 99, 54));
        easy.setForeground(Color.WHITE);
        easy.addActionListener( this);
        add(easy);

        medium = new JButton("MEDIUM");
        medium.setBounds(290, 300, 200, 50);
        medium.setBackground(new Color(22, 99, 54));
        medium.setForeground(Color.WHITE);
        medium.addActionListener( this);
        add(medium);

        hard = new JButton("HARD");
        hard.setBounds(290, 400, 200, 50);
        hard.setBackground(new Color(22, 99, 54));
        hard.setForeground(Color.WHITE);
        hard.addActionListener( this);
        add(hard);



        setSize(800, 650);
        setLocation(350, 100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);
    }

    public static void main(String args[]){ new level();}

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == easy){
            setVisible(false);
            new Rules();

        }
        else if(e.getSource() == medium){
            setVisible(false);
            new Rules1();
        }
        else if(e.getSource() == hard){
            setVisible(false);
            new Rules2();
        }
    }
}
