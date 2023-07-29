package bank_management_system;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import javax.swing.*;
import java.util.*;

class Balanceenqury extends JFrame implements ActionListener {

   
    JButton back;
    JLabel text;
    String pin;

    Balanceenqury(String pin) {
        this.pin = pin;

       ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/atm1.jpg"));//get the image from the location
        Image update_image_size=img.getImage().getScaledInstance(1200  , 800,Image.SCALE_DEFAULT );//image size update
        ImageIcon up_img=new ImageIcon(update_image_size);//convert the image into icon bcz we cannot use image in JLabel but we use Imageicon in JLabel
        JLabel atm=new JLabel(up_img);//set imageicon in Jlabel
        add(atm);//add label in jframe

        text = new JLabel();
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System", Font.BOLD, 16));
        text.setBounds(450, 150, 500, 50);
        atm.add(text);
     
        back=new JButton("Exit");
        back.setBounds(695, 420, 150, 35);
        back.setFont(new Font("Arial",Font.PLAIN,15));
        back.setBackground(Color.LIGHT_GRAY);
        back.addActionListener(this);
        atm.add(back);
        
        int balance = 0;
        try{
           Connectiond con=new Connectiond();
            ResultSet rs = con.s.executeQuery("select * from transaction where pin = '"+pin+"'");
            while (rs.next()) {
                if (rs.getString("type").equals("DEPOSIT")) {
                    balance += Integer.parseInt(rs.getString("amount"));
                } else {
                    balance -= Integer.parseInt(rs.getString("amount"));
                }
            }
        }catch(Exception e){}
        
        text.setText("Your Current Account Balance is Rs "+balance);

      
        setSize(1710,1000);
        setLocation(0,0);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Transaction(pin).setVisible(true);
    }

    public static void main(String[] args) {
        new Balanceenqury("").setVisible(true);
    }
}
