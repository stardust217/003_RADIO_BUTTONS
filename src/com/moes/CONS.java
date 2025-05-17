package com.moes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CONS extends JFrame implements ActionListener {
    JRadioButton radio;
    JRadioButton radio2;
    JRadioButton radio3;
    JButton button;
    ButtonGroup group;

    CONS(){
        radio = new JRadioButton("IM GREAT");
        radio.setBounds(0,40, 200,30);
        radio.addActionListener(this);
        radio.setFocusable(false);
        radio2 = new JRadioButton("IM JUST FINE");
        radio2.setBounds(0,65, 200,30);
        radio2.addActionListener(this);
        radio2.setFocusable(false);
        radio3 = new JRadioButton("IT HASN'T BEEN GREAT");
        radio3.setBounds(0,90, 200,30);
        radio3.addActionListener(this);
        radio3.setFocusable(false);


        group = new ButtonGroup();
        group.add(radio);
        group.add(radio2);
        group.add(radio3);

        button =new JButton("Submit");
        button.setBounds(35,115, 100,30);
        button.setBorder(BorderFactory.createEtchedBorder());
        button.setFocusable(false);
        button.addActionListener(this);

        this.add(button);
        this.add(radio);
        this.add(radio2);
        this.add(radio3);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(240,240);
        this.setLayout(null);
        this.setVisible(true);

    }
   @Override
   public void actionPerformed(ActionEvent e) {
       if(e.getSource()==radio) {
           System.out.println("you selected \"IM GREAT\"");
       } else if (e.getSource()==radio2) {
           System.out.println("you selected \"IM JUST FINE\"");
       } else if (e.getSource()==radio3) {
           System.out.println("you selected \"IT HASN'T BEEN GREAT\"");
       }
       if(e.getSource()==button){

           this.dispose();
           if(radio.isSelected()){
               String b1 = "\""+radio.getText()+"\"? That's great to hear from you brother";
               System.out.println("you submitted " + radio.getText());
               JOptionPane.showMessageDialog(null, b1, "RESPONSE", JOptionPane.INFORMATION_MESSAGE);
           }
           else if(radio2.isSelected()){
               String b2 = "GLAD TO HEAR IT FROM YOU. HOPE YOU DO EVEN BETTER";
               System.out.println("you submitted " + radio2.getText());
               JOptionPane.showMessageDialog(null, b2, "RESPONSE", JOptionPane.INFORMATION_MESSAGE);
           }
           else{
               String b3 = "DON'T WORRY THINGS WILL GET BETTER";
               System.out.println("you submitted " + radio3.getText());
               JOptionPane.showMessageDialog(null, b3, "RESPONSE", JOptionPane.INFORMATION_MESSAGE);
           }

       }
   }
}
