/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bank_management_system;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author aj120
 */
public class Registeration_3 extends JFrame implements ActionListener{
    JLabel head,type,card,digit,cn16,book,pin,digit4,pass,service;
    JRadioButton saving,fixed,current,recurring;
    ButtonGroup account;
    JCheckBox atm,mobile,cheque,internet,email,estste,mess;
    JButton submit,cancel;
    Random ran;
    Registeration_3(){
        setTitle("Registeration Page 3");
        /*-------------------  Heading --------------------------------------*/
        
        head=new JLabel("Account Detail");
        head.setBounds(670, 20, 1500, 70);
        head.setFont(new Font("Times New Roman",Font.ITALIC,40));
        add(head);
        /*-------------------  Account Type --------------------------------------*/

        type=new JLabel("Account Type : ");
        type.setBounds(500, 100, 500, 70);
        type.setFont(new Font("Times New Roman",Font.BOLD,24));
        add(type);
        
        saving=new JRadioButton("Saving Account");
        saving.setBounds(800, 120, 200, 40);
        saving.setFont(new Font("Arial",Font.BOLD,18));
        saving.setBackground(Color.WHITE);
        add(saving);
        
        fixed=new JRadioButton("Fixed Deposite Account");
        fixed.setBounds(1000, 120, 250, 40);
        fixed.setFont(new Font("Arial",Font.BOLD,18));
        fixed.setBackground(Color.WHITE);
        add(fixed);
        
        current=new JRadioButton("Current Account");
        current.setBounds(800, 170, 200, 40);
        current.setFont(new Font("Arial",Font.BOLD,18));
        current.setBackground(Color.WHITE);
        add(current);
        
        recurring=new JRadioButton("Recurring Deposite Account");
        recurring.setBounds(1000, 170, 300, 40);
        recurring.setFont(new Font("Arial",Font.BOLD,18));
        recurring.setBackground(Color.WHITE);
        add(recurring);
        
        account=new ButtonGroup();
        account.add(saving);
        account.add(fixed);
        account.add(current);
        account.add(recurring);
       
        
        /*-------------------  Card number --------------------------------------*/
         card=new JLabel("Card Number : ");
         card.setBounds(500, 250, 500, 70);
         card.setFont(new Font("Times New Roman",Font.BOLD,24)); 
         add(card);
         
         digit=new JLabel("XXXX-XXXX-XXXX-4184");
         digit.setBounds(800, 250, 500, 70);
         digit.setFont(new Font("Times New Roman",Font.BOLD,24)); 
         add(digit);
         
         cn16=new JLabel("(Your 16-digit Card number) ");
         cn16.setBounds(500, 280, 500, 70);
         cn16.setFont(new Font("Times New Roman",Font.BOLD,15)); 
         add(cn16);
         
         book=new JLabel("It would apper on ATM Card/Cheque Book and Statements");
         book.setBounds(800, 280, 500, 70);
         book.setFont(new Font("Times New Roman",Font.BOLD,15)); 
         add(book);
         
         /*-------------------  pin number --------------------------------------*/
         
         pin=new JLabel("PIN : ");
         pin.setBounds(500, 380, 500, 70);
         pin.setFont(new Font("Times New Roman",Font.BOLD,24)); 
         add(pin);
         
         digit4=new JLabel("(4-digit Password) ");
         digit4.setBounds(500, 410, 500, 70);
         digit4.setFont(new Font("Times New Roman",Font.BOLD,15)); 
         add(digit4);
         
         pass=new JLabel("XXXX");
         pass.setBounds(800, 380, 500, 70);
         pass.setFont(new Font("Times New Roman",Font.BOLD,24)); 
         add(pass);
         
         /*-------------------  Services --------------------------------------*/
         
         service=new JLabel("Services Required : ");
         service.setBounds(500, 480, 500, 70);
         service.setFont(new Font("Times New Roman",Font.BOLD,24)); 
         add(service);
         
         atm=new JCheckBox(" ATM Card");
         atm.setBounds(800, 480, 200, 70);
         atm.setFont(new Font("Arial",Font.BOLD,18));
         atm.setBackground(Color.WHITE);
         add(atm);
         
         internet=new JCheckBox(" Internet");
         internet.setBounds(1000, 480, 200, 70);
         internet.setFont(new Font("Arial",Font.BOLD,18));
         internet.setBackground(Color.WHITE);
         add(internet);
         
         mobile=new JCheckBox(" Mobile Banking");
         mobile.setBounds(800, 530, 200, 70);
         mobile.setFont(new Font("Arial",Font.BOLD,18));
         mobile.setBackground(Color.WHITE);
         add(mobile);
         
         cheque=new JCheckBox(" Cheque Book");
         cheque.setBounds(800, 580, 200, 70);
         cheque.setFont(new Font("Arial",Font.BOLD,18));
         cheque.setBackground(Color.WHITE);
         add(cheque);
         
         email=new JCheckBox(" Email Alerts");
         email.setBounds(1000, 530, 200, 70);
         email.setFont(new Font("Arial",Font.BOLD,18));
         email.setBackground(Color.WHITE);
         add(email);
         
         estste=new JCheckBox(" E-Ststement");
         estste.setBounds(1000, 580, 200, 70);
         estste.setFont(new Font("Arial",Font.BOLD,18));
         estste.setBackground(Color.WHITE);
         add(estste);
         
         mess=new JCheckBox(" I hereby declares that the above entered details correct to the best of my knowledge.");
         mess.setBounds(500, 650, 1500, 70);
         mess.setFont(new Font("Arial",Font.BOLD,15));
         mess.setBackground(Color.WHITE);
         add(mess);
         
         /*-------------------  Button --------------------------------------*/
         
         submit=new JButton("Submit");
         submit.setBounds(650, 750, 100, 35);
         submit.setBackground(Color.BLACK);
         submit.setForeground(Color.WHITE);
         submit.setFont(new Font("Times New Roman",Font.BOLD,17));
         submit.addActionListener(this);
         add(submit);
         
         cancel=new JButton("Cancel");
         cancel.setBounds(850, 750, 100, 35);
         cancel.setBackground(Color.BLACK);
         cancel.setForeground(Color.WHITE);
         cancel.setFont(new Font("Times New Roman",Font.BOLD,17));
         cancel.addActionListener(this);
         add(cancel);
         
         
        /*-------------------  Frame adjustment --------------------------------------*/

        setLayout(null);
        setSize(1710, 1000);
        setLocation(0,0);
        getContentPane().setBackground(Color.WHITE);//change the color of frame
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==submit){
        
        String accounttype=null;
      
      if(saving.isSelected()){
       accounttype="saving";
       }
       else if(fixed.isSelected()){
       accounttype="fixed";
       }
      else if(current.isSelected()){
       accounttype="saving";
       }        
      else if(recurring.isSelected()){
       accounttype="current";
       }
     ran=new Random();
      long first7 = (ran.nextLong() % 90000000L) + 5040936000000000L;
        String cardno = "" + Math.abs(first7);
        
        long first3 = (ran.nextLong() % 9000L) + 1000L;
        String pin = "" + Math.abs(first3);
       
        String facility = "";
        if(atm.isSelected()){ 
            facility = facility + " ATM Card";
        }
        if(mobile.isSelected()){ 
            facility = facility + " Internet Banking";
        }
        if(cheque.isSelected()){ 
            facility = facility + " Mobile Banking";
        }
        if(internet.isSelected()){ 
            facility = facility + " EMAIL Alerts";
        }
        if(email.isSelected()){ 
            facility = facility + " Cheque Book";
        }
        if(estste.isSelected()){ 
            facility = facility + " E-Statement";
        }
        
        /*String policy = "";
        if(mess.isSelected()){ 
            policy = policy + " ATM Card";
        }
        */
                
                
        
         try{     
                if(accounttype.equals("")){
                    JOptionPane.showMessageDialog(null, "Fill all the required fields");
                }
           
                
                else{
           Connectiond con=new Connectiond();//create kiye connection class ka object ko 
                    String q1 = "insert into reg_3 values('"+accounttype+"','"+cardno+"','"+pin+"','"+facility+"')";  
                    String q2 = "insert into login values('"+cardno+"','"+pin+"')";
                    con.s.executeUpdate(q1);
                    con.s.executeUpdate(q2);
                    JOptionPane.showMessageDialog(null, "Card Number: " + cardno + "\n Pin:"+ pin);
                    
                   new Deposite(pin).setVisible(true);
                    setVisible(false);
                }   
        }catch(Exception ex){
            ex.printStackTrace();
        }
      }else if(e.getSource()==cancel){  
               setVisible(false);
               new Login_page().setVisible(true);
            }
     }
    public static void main(String[] args) {
        new Registeration_3();
    }

    
}
