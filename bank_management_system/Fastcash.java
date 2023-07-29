
package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class Fastcash extends JFrame implements ActionListener{
    JLabel withdral;
    JButton a100,a1000,a5000,a500,a2000,a10000,back;
    String pin;

    Fastcash(String pin){
        this.pin=pin;
  
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/atm1.jpg"));//get the image from the location
        Image update_image_size=img.getImage().getScaledInstance(1200  , 800,Image.SCALE_DEFAULT );//image size update
        ImageIcon up_img=new ImageIcon(update_image_size);//convert the image into icon bcz we cannot use image in JLabel but we use Imageicon in JLabel
        JLabel atm=new JLabel(up_img);//set imageicon in Jlabel
        add(atm);//add label in jframe
        
        withdral=new JLabel("Select Withdrawl Amount");
        withdral.setBounds(510, 120, 300, 50);
        withdral.setFont(new Font("Times New Roman",Font.ITALIC,25));
        withdral.setForeground(Color.WHITE);
        atm.add(withdral);
        
        a100=new JButton("100");
        a100.setBounds(390, 287, 150, 35);
        a100.setFont(new Font("Arial",Font.PLAIN,15));
        a100.setBackground(Color.LIGHT_GRAY);
        a100.addActionListener(this);
        atm.add(a100);
        
        a1000=new JButton("1000");
        a1000.setBounds(390, 332, 150, 35);
        a1000.setFont(new Font("Arial",Font.PLAIN,15));
        a1000.setBackground(Color.LIGHT_GRAY);
        a1000.addActionListener(this);
        atm.add(a1000);
        
        a5000=new JButton("5000");
        a5000.setBounds(390, 377, 150, 35);
        a5000.setFont(new Font("Arial",Font.PLAIN,15));
        a5000.setBackground(Color.LIGHT_GRAY);
        a5000.addActionListener(this);
        atm.add(a5000);
        
        a500=new JButton("500");
        a500.setBounds(695, 285, 150, 35);
        a500.setFont(new Font("Arial",Font.PLAIN,15));
        a500.setBackground(Color.LIGHT_GRAY);
        a500.addActionListener(this);
        atm.add(a500);
        
       
        a2000=new JButton("2000");
        a2000.setBounds(695, 330, 150, 35);
        a2000.setFont(new Font("Arial",Font.PLAIN,15));
        a2000.setBackground(Color.LIGHT_GRAY);
        a2000.addActionListener(this);
        atm.add(a2000);        
        
        a10000=new JButton("10000");
        a10000.setBounds(695, 375, 150, 35);
        a10000.setFont(new Font("Arial",Font.PLAIN,15));
        a10000.setBackground(Color.LIGHT_GRAY);
        a10000.addActionListener(this);
        atm.add(a10000);
        
        back=new JButton("BACK");
        back.setBounds(695, 420, 150, 35);
        back.setFont(new Font("Arial",Font.PLAIN,15));
        back.setBackground(Color.LIGHT_GRAY);
        back.addActionListener(this);
        atm.add(back);
        
        
        
        
        
     
        setSize(1710,1000);
        setLocation(0,0);
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==back){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }
       
        else {
           String amount= ((JButton)e.getSource()).getText();
           Connectiond con=new Connectiond();
           try{
           ResultSet rs=con.s.executeQuery("select * from transaction where pin ='"+pin+"'");
           int balance=0;
           while(rs.next()){
           if(rs.getString("type").equals("DEPOSIT")){
           balance=balance +Integer.parseInt(rs.getString("amount"));
           }
           else{
           balance=balance-Integer.parseInt(rs.getString("amount"));
           }
           }
           
            if (e.getSource() != back && balance < Integer.parseInt(amount)) {
                JOptionPane.showMessageDialog(null, "Insuffient Balance");
                return;
            }
             if (e.getSource() == back) {
                this.setVisible(false);
                new Transaction(pin).setVisible(true);
            }else{
                java.util.Date date = new java.util.Date();
                con.s.executeUpdate("insert into transaction values('"+pin+"', '"+date+"', 'Withdrawl', '"+amount+"')");
                JOptionPane.showMessageDialog(null, "Rs. "+amount+" Debited Successfully");
                    
                setVisible(false);
                new Transaction(pin).setVisible(true);
            }
           }catch(Exception ee){
           
           }
           
        }
       
    }
   
    
    public static void main(String[] args) {
        new Fastcash("");
    }

   
}
