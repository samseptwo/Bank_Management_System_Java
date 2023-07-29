package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;


public class Login_page extends JFrame implements ActionListener{
  
    JButton login,reg;
    JTextField t_card;
    JPasswordField t_pin;
    
   
    Login_page(){
        
         // ----------------------Image----------------------------
 
        ImageIcon img=new ImageIcon(ClassLoader.getSystemResource("image/Bank_icon.png"));//get the image from the location
        Image update_image_size=img.getImage().getScaledInstance(100  , 100,Image.SCALE_DEFAULT );//image size update
        ImageIcon up_img=new ImageIcon(update_image_size);//convert the image into icon bcz we cannot use image in JLabel but we use Imageicon in JLabel
        JLabel label=new JLabel(up_img);//set imageicon in Jlabel
        label.setBounds(520, 60,150,150);//set the location of label in frame
        add(label);//add label in jframe
        
        /* ----------------------Jlabel text----------------------------*/
        JLabel text=new JLabel(" Login Detail");
        text.setBounds(670,100,1500,50);//x - the new x-coordinate of this component
                                                       //y - the new y-coordinate of this component 
                                                       //width - the new width of this component
                                                        // height - the new height of this component
        text.setFont(new Font("Times New Roman",Font.BOLD,30));
        add(text);
        
        /* ----------------------Jlabel Card NO.----------------------------*/
        JLabel cardno=new JLabel("Card Number : ");
        cardno.setBounds(500,200,1500,70);
        cardno.setFont(new Font("Arial",Font.BOLD,25));
        add(cardno);
        
        t_card=new JTextField();//text field
        t_card.setBounds(700, 220, 250, 40);
        t_card.setFont(new Font("Arial",Font.PLAIN,18));
        add(t_card);
        
        
        /* ----------------------Jlabel Pin----------------------------*/
        JLabel pin=new JLabel("PIN Number : ");
        pin.setBounds(500,250,1500,70);
        pin.setFont(new Font("Arial",Font.BOLD,25));
        add(pin);
        
        t_pin=new JPasswordField();
        t_pin.setBounds(700, 270, 250, 40);
        t_pin.setFont(new Font("Arial",Font.PLAIN,18));
        add(t_pin);
       
        /* ----------------------Jlabel Button----------------------------*/

            login=new JButton("Login");
            login.setBounds(550, 350, 150, 32);
            login.setBackground(Color.BLACK);
            login.setForeground(Color.WHITE);
            login.setFont(new Font("Arial",Font.BOLD,18));
            login.addActionListener(this);
            add(login);
           
            
             reg=new JButton("Registeration");
            reg.setBounds(750, 350, 150, 32);
             reg.setBackground(Color.BLACK);
             reg.setForeground(Color.WHITE);
             reg.setFont(new Font("Arial",Font.BOLD,16));
             reg.addActionListener(this);
            add(reg);
            
            
            
           
        setLayout(null);//stop the default layout
        getContentPane().setBackground(Color.WHITE);//get the frame and change the background color
        setTitle("Login Page");
        setSize(1710,1000); //1.set the length and width of frame
        setVisible(true);// set the visibility of frame to the client
        setLocation(0,0);//set location of frame
        
        
    }
    public void actionPerformed(ActionEvent ac){
        if(ac.getSource()==login){
          Connectiond con=new Connectiond();
          String cardno=t_card.getText();
          String pin=t_pin.getText();
          String query="select * from login where cardno='"+cardno+"' and pin='"+pin+"'";
          try{
              ResultSet rs=con.s.executeQuery(query);
              if(rs.next()){
                  setVisible(false);
                  new Transaction(pin).setVisible(true);
              }
              else{
              JOptionPane.showMessageDialog(null, "Inncorrect Card no and Password");
              }
          }catch(Exception e){
          System.out.println(e);
          }
        }
        else if(ac.getSource()==reg){
            setVisible(false);
            new Registeration_1().setVisible(true);
        }
    }
    
    
    
    public static void main(String arg[]){
    new Login_page();
    }
}
