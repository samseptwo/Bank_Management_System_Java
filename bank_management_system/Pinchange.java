/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Pinchange extends JFrame implements ActionListener{
   
JLabel text,npin,rpin;
    JPasswordField nfield,rfield;
    JButton change,back;
    String pin;

    public Pinchange(  String pin) {
         this.pin=pin;
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/atm1.jpg"));//get the image from the location
        Image update_image_size=img.getImage().getScaledInstance(1200  , 800,Image.SCALE_DEFAULT );//image size update
        ImageIcon up_img=new ImageIcon(update_image_size);//convert the image into icon bcz we cannot use image in JLabel but we use Imageicon in JLabel
        JLabel atm=new JLabel(up_img);//set imageicon in Jlabel
        add(atm);//add label in jframe
        
        text=new JLabel("Change Your Pin");
        text.setBounds(540, 120, 400, 50);
        text.setFont(new Font("Times New Roman",Font.ITALIC,22));
        text.setForeground(Color.WHITE);
        atm.add(text);
        
        npin=new JLabel("Change Your PIN : ");
        npin.setBounds(390, 200, 400, 50);
        npin.setFont(new Font("Arial",Font.BOLD,18));
        npin.setForeground(Color.WHITE);
        atm.add(npin);
        
        nfield= new JPasswordField();
        nfield.setBounds(600, 210, 250, 30);
        nfield.setBackground(Color.WHITE);
        nfield.setFont(new Font("Arial",Font.BOLD,20));
        atm.add(nfield);
        
        rpin=new JLabel("Re-Enter New PIN : ");
        rpin.setBounds(390, 250, 400, 50);
        rpin.setFont(new Font("Arial",Font.BOLD,18));
        rpin.setForeground(Color.WHITE);
        atm.add(rpin);
        
        rfield= new JPasswordField();
        rfield.setBounds(600, 260, 250, 30);
        rfield.setBackground(Color.WHITE);
        rfield.setFont(new Font("Arial",Font.BOLD,20));
        atm.add(rfield);
        
        change=new JButton("change");
        change.setBounds(695, 375, 150, 35);
        change.setFont(new Font("Arial",Font.PLAIN,15));
        change.setBackground(Color.LIGHT_GRAY);
        change.addActionListener(this);
        atm.add(change);
        
        back=new JButton("Back");
        back.setBounds(695, 420, 150, 35);
        back.setFont(new Font("Arial",Font.PLAIN,15));
        back.setBackground(Color.LIGHT_GRAY);
        back.addActionListener(this);
        atm.add(back);
        
        
        
        setSize(1710,1000);
        setLocation(0,0);
        setVisible(true);
        
    }
    
      @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
        
        }
        else   if(e.getSource()==change){
        
        }
                try {
                    String npin=nfield.getText();
                    String rpin=rfield.getText();
                    
                    if(!npin.equals(rpin)){
                    JOptionPane.showMessageDialog(null, "Entered Pin Does not Match ");
                   return;
                    }
                    
                    if(npin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Enter Pin  ");
                    return;
                    }
                    
                    if(rpin.equals("")){
                    JOptionPane.showMessageDialog(null, "Please Re-Enter Pin  ");
                    return;
                    }
              
                Connectiond con=new Connectiond();
                String q1 = "update transaction set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q2 = "update login set pin = '"+rpin+"' where pin = '"+pin+"' ";
                String q3 = "update reg_3 set pin = '"+rpin+"' where pin = '"+pin+"' ";

                con.s.executeUpdate(q1);
                con.s.executeUpdate(q2);
                con.s.executeUpdate(q3);

                JOptionPane.showMessageDialog(null, "PIN changed successfully");
                setVisible(false);
                new Transaction(rpin).setVisible(true);
          } catch (Exception ee) {
              System.out.println(ee);
          }
    }
    
    
    public static void main(String[] args) {
        new Pinchange("");
    }

  
    
}
