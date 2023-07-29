/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;
import com.toedter.calendar.JDateChooser;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Registeration_1 extends JFrame implements ActionListener{
   
    JLabel form,name,f_name,dob,gender,email,marital,address,city,state,pincode;
   
   JTextField t_name,t_fname,t_email,t_address,t_city,t_state,t_pin;
   
   JDateChooser date;
   
   JRadioButton male,female,single,married,widow;
   
    
    Registeration_1(){
    setLayout(null);
    /*----------------------Heading-------------------------------------*/
   
    form=new JLabel("Personal Details");
    form.setBounds(670,20,1500,70);
    form.setFont(new Font("Times New Roman",Font.ITALIC,40));
    add(form);
    
    
     /*-------------------  Personal details       ---------------------------------------*/
       /*-------------------  Name    ---------------------------------------*/
     
    name=new JLabel("Full Name : ");
    name.setBounds(500, 100, 500, 70);
    name.setFont(new Font("Times New Roman",Font.BOLD,24));
    
    t_name=new JTextField();
    t_name.setBounds(700,120,400,30);
    t_name.setFont(new Font("Arial",Font.PLAIN,18));
   
   add(name);
   add(t_name);
   
   
     /*-------------------  Father name ---------------------------------------*/
   
     f_name=new JLabel("Father Name : ");
    f_name.setBounds(500, 150, 500, 70);
    f_name.setFont(new Font("Times New Roman",Font.BOLD,24));
    
    t_fname=new JTextField();
    t_fname.setBounds(700,170,400,30);
    t_fname.setFont(new Font("Arial",Font.PLAIN,18));
   
   add(f_name);
   add(t_fname);
   
   
        /*-------------------  Date of Birth ---------------------------------------*/
   
    dob=new JLabel("Date of Birth : ");
    dob.setBounds(500, 200, 500, 70);
    dob.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(dob);
    
    date=new JDateChooser();
    date.setBounds(700,  220, 400, 30);
    date.setFont(new Font("Arial",Font.PLAIN,18));
    add(date);
                
     /*-------------------  Gender ---------------------------------------*/
    
     gender=new JLabel("Gender : ");
    gender.setBounds(500, 250, 500, 70);
    gender.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(gender);

    male=new JRadioButton("Male");
    male.setBounds(700, 270, 100, 30);
    male.setFont(new Font("Arial",Font.BOLD,18));
    male.setBackground(Color.WHITE);
    add(male);
    
    female=new JRadioButton("Female");
    female.setBounds(900, 270, 100, 30);
    female.setFont(new Font("Arial",Font.BOLD,18));
    female.setBackground(Color.WHITE);
    add(female);
    
    ButtonGroup gen=new ButtonGroup();
    gen.add(male);
    gen.add(female);
    
    /*-------------------  email ---------------------------------------*/

    email=new JLabel("Email : ");
    email.setBounds(500, 300, 500, 70);
    email.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(email);
    
    t_email=new JTextField();
    t_email.setBounds(700,320,400,30);
    t_email.setFont(new Font("Arial",Font.PLAIN,18));
    add(t_email);

    
     /*------------------- Marital status ---------------------------------------*/

    marital=new JLabel("Marital Status : ");
    marital.setBounds(500, 350, 500, 70);
    marital.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(marital);
     
    single=new JRadioButton("Single");
    single.setBounds(700, 375, 100, 20);
    single.setFont(new Font("Arial",Font.BOLD,18));
    single.setBackground(Color.WHITE);
    add(single);
    
    married=new JRadioButton("Married");
    married.setBounds(850, 375, 100, 20);
    married.setFont(new Font("Arial",Font.BOLD,18));
    married.setBackground(Color.WHITE);
    add(married);
    
    widow=new JRadioButton("Widow");
    widow.setBounds(1000, 375, 100, 20);
    widow.setFont(new Font("Arial",Font.BOLD,18));
    widow.setBackground(Color.WHITE);
    add(widow);
    
    ButtonGroup mar=new ButtonGroup();
    mar.add(male);
    mar.add(female);
   
            
    
     /*-------------------  Address---------------------------------------*/

    address=new JLabel("Address : ");
    address.setBounds(500, 400, 500, 70);
    address.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(address);
    
    t_address=new JTextField();
    t_address.setBounds(700,420,400,30);
    t_address.setFont(new Font("Arial",Font.PLAIN,18));

    add(t_address);
    
     
    
     /*-------------------  city---------------------------------------*/

    city=new JLabel("City : ");
    city.setBounds(500, 450, 500, 70);
    city.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(city);
    
    t_city=new JTextField();
    t_city.setBounds(700,470,400,30);
    t_city.setFont(new Font("Arial",Font.PLAIN,18));

    add(t_city);
     
    
    
     /*-------------------  state---------------------------------------*/

    state=new JLabel("State : ");
    state.setBounds(500, 500, 500, 70);
    state.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(state);
     
    t_state=new JTextField();
    t_state.setBounds(700,520,400,30);
    t_state.setFont(new Font("Arial",Font.PLAIN,18));
    add(t_state);
    
    
     /*-------------------  pincode---------------------------------------*/

    pincode=new JLabel("Pincode : ");
    pincode.setBounds(500, 550, 500, 70);
    pincode.setFont(new Font("Times New Roman",Font.BOLD,24));
    add(pincode);
     
    t_pin=new JTextField();
    t_pin.setBounds(700,570,400,30);
    t_pin.setFont(new Font("Arial",Font.PLAIN,18));
    add(t_pin);
    
    
    /*-------------------  button---------------------------------------*/
    
    JButton submit=new JButton("Next");
    submit.setBounds(720, 650, 150, 30);
    submit.setFont(new Font("Arial",Font.BOLD,20));
    submit.setForeground(Color.WHITE);
    submit.setBackground(Color.BLACK);
    submit.addActionListener(this);
    add(submit);
    /*----------------------------------------------------------*/
  
     
     
     
    setSize(1710,1000);
    setLocation(0,  0);
    getContentPane().setBackground(Color.WHITE);//change the color of frame
    setTitle("Regiteration Page 1");
    setVisible(true);
    }
    
    
    /*-------------------  Database- --------------------------------------*/
   
    @Override//getText is uesd to get the text from the text from the text field
    public void actionPerformed(ActionEvent e) {
       String name = t_name.getText();
       String fname=t_fname.getText();
       String email=t_email.getText();
       String address=t_address.getText();
       String city=t_city.getText();
       String state=t_state.getText();
       String pin=t_pin.getText();
       String dob=((JTextField) date.getDateEditor().getUiComponent()).getText();//isseme date ko fetch kar raha hai 
       String gender=null;
       if(male.isSelected()){
       gender="Male";
       }
       else if(female.isSelected()){
       gender="Female";
       }
       
       String marital=null;
       if(single.isSelected()){
       gender="single";
       }
       else if(married.isSelected()){
       gender="married";
       }
       else if(widow.isSelected()){
       gender="widow";
       }
   
    try {
        if(name.equals("")){
        JOptionPane.showMessageDialog(null, "Name is required");//dialog box open hoga notificate karne ke liye
        }
        else if(fname.equals("")){
        JOptionPane.showMessageDialog(null, "Father Name is required");
        }
        else   if(dob.equals("")){
        JOptionPane.showMessageDialog(null, "Date is required");
        }
        else if(email.equals("")){
        JOptionPane.showMessageDialog(null, "Email is required");
        }
        else if(address.equals("")){
        JOptionPane.showMessageDialog(null, "Address is required");
        }
          else if(city.equals("")){
        JOptionPane.showMessageDialog(null, "City is required");
        }
           else if(state.equals("")){
        JOptionPane.showMessageDialog(null, "State is required");
        }
           else  if(pin.equals("")){
        JOptionPane.showMessageDialog(null, "Pin is required");
        }    
            else{
                Connectiond con=new Connectiond();//create kiye connection class ka object ko 
                String ins="insert into reg_1 values('"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+state+"','"+pin+"')";
                con.s.executeUpdate(ins);
                
                setVisible(false);
                new Registeration_2().setVisible(true);
           }
    } catch(Exception ee){
        System.out.println(ee);
    }
    
    
    
    
    
    
    
    
    }
    public static void main(String arg[]){
    new Registeration_1();
    }

   
}
