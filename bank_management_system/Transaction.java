package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
public class Transaction extends JFrame implements ActionListener{
    JLabel transaction;
    JButton deposit,fastcash,pinchange,cashwithdrawl,ministatement,balanceenquiry,exit;
    String pin;
    
    Transaction(String pin){
        
        this.pin=pin;
 //---------------------------------image-------------------------------------------- 
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/atm1.jpg"));//get the image from the location
        Image update_image_size=img.getImage().getScaledInstance(1200  , 800,Image.SCALE_DEFAULT );//image size update
        ImageIcon up_img=new ImageIcon(update_image_size);//convert the image into icon bcz we cannot use image in JLabel but we use Imageicon in JLabel
        JLabel atm=new JLabel(up_img);//set imageicon in Jlabel
        add(atm);//add label in jframe
        

    //---------------------------------------------Transaction Buttons----------------------------------------------------------------
     
        transaction=new JLabel("Select Your Transaction");
        transaction.setBounds(510, 120, 300, 50);
        transaction.setFont(new Font("Times New Roman",Font.ITALIC,25));
        transaction.setForeground(Color.WHITE);
        atm.add(transaction);
        
        deposit=new JButton("DEPOSIT");
        deposit.setBounds(390, 287, 150, 35);
        deposit.setFont(new Font("Arial",Font.PLAIN,15));
        deposit.setBackground(Color.LIGHT_GRAY);
        deposit.addActionListener(this);
        atm.add(deposit);
        
        fastcash=new JButton("Fast cash");
        fastcash.setBounds(390, 332, 150, 35);
        fastcash.setFont(new Font("Arial",Font.PLAIN,15));
        fastcash.setBackground(Color.LIGHT_GRAY);
        fastcash.addActionListener(this);
        atm.add(fastcash);
        
        pinchange=new JButton("Pin change");
        pinchange.setBounds(390, 377, 150, 35);
        pinchange.setFont(new Font("Arial",Font.PLAIN,15));
        pinchange.setBackground(Color.LIGHT_GRAY);
        pinchange.addActionListener(this);
        atm.add(pinchange);
        
        cashwithdrawl=new JButton("Cash Withdrawl");
        cashwithdrawl.setBounds(695, 285, 150, 35);
        cashwithdrawl.setFont(new Font("Arial",Font.PLAIN,15));
        cashwithdrawl.setBackground(Color.LIGHT_GRAY);
        cashwithdrawl.addActionListener(this);
        atm.add(cashwithdrawl);
        
       
        ministatement=new JButton("Mini statement");
        ministatement.setBounds(695, 330, 150, 35);
        ministatement.setFont(new Font("Arial",Font.PLAIN,15));
        ministatement.setBackground(Color.LIGHT_GRAY);
        ministatement.addActionListener(this);
        atm.add(ministatement);        
        
        balanceenquiry=new JButton("Balance Enquiry");
        balanceenquiry.setBounds(695, 375, 150, 35);
        balanceenquiry.setFont(new Font("Arial",Font.PLAIN,15));
        balanceenquiry.setBackground(Color.LIGHT_GRAY);
        balanceenquiry.addActionListener(this);
        atm.add(balanceenquiry);
        
        exit=new JButton("Exit");
        exit.setBounds(695, 420, 150, 35);
        exit.setFont(new Font("Arial",Font.PLAIN,15));
        exit.setBackground(Color.LIGHT_GRAY);
        exit.addActionListener(this);
        atm.add(exit);
        
        
        
        
        
     
        setSize(1710,1000);
        setLocation(0,0);
        getContentPane().setBackground(Color.WHITE);
        
        setVisible(true);
    }
    
     @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==exit){
            System.exit(0);
        }
        else if(e.getSource()==deposit){
            setVisible(false);
            new Deposite(pin).setVisible(true);
        }
        else if(e.getSource()==cashwithdrawl){
            setVisible(false);
            new Withdrawl(pin).setVisible(true);
        }
        else if(e.getSource()==fastcash){
            setVisible(false);
            new Fastcash(pin).setVisible(true);
        }
        else if(e.getSource()==pinchange){
            setVisible(false);
            new Pinchange(pin).setVisible(true);
        }
        else if(e.getSource()==balanceenquiry){
            setVisible(false);
            new Balanceenqury(pin).setVisible(true);
        }
       
    }
   
    
    public static void main(String[] args) {
        new Transaction("");
    }

   
}
