// ASSIGNMENT -6 
/* Write a program to create an Swing GUI having three buttons red,green,blue. On clicking on red 
button the next window should be changed as written "red" in Red color  and similarly for all other buttons. */ 
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class GUI implements ActionListener
{
 JButton b1,b2,b3;
 UIManager um=new UIManager();
 GUI()
 {
     JFrame f = new JFrame("Three Buttons");
     JLabel l = new JLabel("Click on any button");
     l.setBounds(100,10,200,100);
     b1= new JButton("Red");
     b1.setBounds(100,100,100,40);
     b1.setBackground(Color.red);
     b1.addActionListener(this);
     b2= new JButton("Green");
     b2.setBounds(300,100,100,40);
     b2.setBackground(Color.green);
     b2.addActionListener(this);
     b3= new JButton("Blue");
     b3.setBounds(500,100,100,40);
     b3.setBackground(Color.blue);
     b3.addActionListener((ActionListener) this);
     f.add(l);
     f.add(b1);
     f.add(b2);
     f.add(b3);
     f.setSize(700,700);
     f.setLayout(null);
     f.setVisible(true); 

 }
 public void actionPerformed(ActionEvent e) 
 {
     String msg = " ";
     if(e.getSource()==b1) 
     {
    	 um.put("OptionPane.messageForeground", Color.red);
         JOptionPane.showMessageDialog(b1,msg+"Red Button",msg,1);  
     }
     if(e.getSource()==b2) 
     {
    	 um.put("OptionPane.messageForeground", Color.green);
         JOptionPane.showMessageDialog(b1,msg+"Green Button",msg,1);
     }
     if(e.getSource()==b3) 
     {
    	 um.put("OptionPane.messageForeground", Color.blue);
         JOptionPane.showMessageDialog(b1,msg+"Blue Button",msg,1);
     }
 }
 public static void main(String args[]) 
 {
     new GUI();
 }
 }