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

public class Rules2 extends JFrame implements ActionListener {

    JButton Start, Back;

    String name;

    Rules2(){

        this.name = name;

        JLabel heading = new JLabel("Welcome " + name + " to QUIZ TEST");
        heading.setBounds(250, 100, 700, 30);
        heading.setFont(new Font("Mongolian Baiti", Font.BOLD,28));
        heading.setForeground(new Color(22, 99, 54));
        add(heading);

        JLabel rules = new JLabel();
        rules.setBounds(70, 150, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN,16));
        rules.setForeground(new Color(22, 99, 54));
        rules.setText(
                "<html>"+
                        "1. Each question must be answered within 15 seconds." + "<br><br>" +
                        "2. There are a total 10 questions. " + "<br><br>" +
                        "3. Once a question is answered or the time runs out, you cannot go back." + "<br><br>" +
                        "4. No cell phones or other secondary devices in the room or test area." + "<br><br>" +
                        "5. It is forbidden to communicate in any way with another person during the examination." + "<br><br>" +
                        "6. If the time expires, the answer is automatically submitted and the next question will appear." + "<br><br>" +
                        "<html>"

        );
        add(rules);

        Back = new JButton("Back");
        Back.setBounds(250, 500, 100, 30);
        Back.setBackground(new Color(22, 99, 54));
        Back.setForeground(Color.WHITE);
        Back.addActionListener(this);
        add(Back);


        Start = new JButton("Start");
        Start.setBounds(400, 500, 100, 30);
        Start.setBackground(new Color(22, 99, 54));
        Start.setForeground(Color.WHITE);
        Start.addActionListener(this);
        add(Start);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/back.png"));
        Image i = i1.getImage().getScaledInstance(800, 650,Image.SCALE_DEFAULT);
        ImageIcon i2 = new ImageIcon(i);
        JLabel image = new JLabel(i2);
        image.setBounds(0, 0, 800, 650);
        add(image);



        setSize(800, 650);
        setLocation(350, 100);
        setLayout(null);
        setUndecorated(true);
        setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == Start){
            setVisible(false);
            new Quiz3(name);

        }
        else{
            setVisible(false);
            new name();
        }

    }

    public static void main(String args[]){
        new Rules2();
    }
}

