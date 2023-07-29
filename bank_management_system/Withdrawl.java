package bank_management_system;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;

public class Withdrawl extends JFrame implements ActionListener{
    JLabel text;
    JTextField amount;
    JButton deposit,back;
    String pin;
    public Withdrawl(String pin) {
        this.pin=pin;
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/atm1.jpg"));//get the image from the location
        Image update_image_size=img.getImage().getScaledInstance(1200  , 800,Image.SCALE_DEFAULT );//image size update
        ImageIcon up_img=new ImageIcon(update_image_size);//convert the image into icon bcz we cannot use image in JLabel but we use Imageicon in JLabel
        JLabel atm=new JLabel(up_img);//set imageicon in Jlabel
        add(atm);//add label in jframe
        
        text=new JLabel("Enter Amount You Want to Withdrawl");
        text.setBounds(450, 120, 400, 50);
        text.setFont(new Font("Times New Roman",Font.ITALIC,22));
        text.setForeground(Color.WHITE);
        atm.add(text);
        
        amount= new JTextField();
        amount.setBounds(415, 200, 400, 30);
        amount.setBackground(Color.WHITE);
        amount.setFont(new Font("Arial",Font.BOLD,20));
        atm.add(amount);
        
        deposit=new JButton("WITHDRAWL");
         deposit.setBounds(695, 375, 150, 35);
        deposit.setFont(new Font("Arial",Font.PLAIN,15));
        deposit.setBackground(Color.LIGHT_GRAY);
        deposit.addActionListener(this);
        atm.add(deposit);
        
        back=new JButton("BACK");
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
        if(e.getSource()==deposit){
            String tran=amount.getText();
            Date date=new Date();
            if(amount.equals("")){
            JOptionPane.showMessageDialog(null, "Enter sufficient Amount");
            }
            else{
               try{
             Connectiond con=new Connectiond();
             String query="insert into transaction values ('"+pin+"','"+date+"','WITHDRAWL','"+tran+"')";
             con.s.executeUpdate(query);
             JOptionPane.showMessageDialog(null, "RS "+ tran +" WITHDRAWL Succesfully Done");
                   setVisible(false);
                   new Transaction(pin).setVisible(true);
               }catch(Exception ee){
                   System.out.println(ee);
               }
               }
        }

        else if(e.getSource()==back){
            setVisible(false);
            new Transaction(pin).setVisible(true);
        }
    }
    
    
    
    public static void main(String[] args) {
        new Withdrawl("");
    }

   
    
}
