package bank_management_system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Registeration_2 extends JFrame implements ActionListener{
    JLabel head,religion,category,income,education,occupation,pan,adhar,senior,existing;
    JTextField t_pan,t_adhar;
    JRadioButton syes,sno,eyes,eno;
    JButton submit;
    JComboBox creligion,cate,inc,educ,occ;
    
    
    Registeration_2(){
    
        /*-------------------  Frame --------------------------------------*/

       
        setTitle("Registeration Page 2");
        
        /*-------------------  Heading --------------------------------------*/
        head=new JLabel("Addition Information");
        head.setBounds(670, 20, 1500, 70);
        head.setFont(new Font("Times New Roman",Font.ITALIC,40));
        add(head);
        
        /*-------------------  Religion --------------------------------------*/
         
         religion=new JLabel("Religion : ");
         religion.setBounds(500,100,500,70);
         religion.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(religion);
         
        String rel[]={"Hindu","Muslim","Christian","Sikh"};
         creligion=new JComboBox(rel);
         creligion.setBounds(700,120,300,30);
         creligion.setBackground(Color.WHITE);
         add(creligion);
         
         
         
         
        /*-------------------  CAtegory --------------------------------------*/
         category=new JLabel("Category : ");
         category.setBounds(500,150,500,70);
         category.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(category);
         
         String cat[]={"General","OBC","SC","ST","Other"};
         cate=new JComboBox(cat);
         cate.setBounds(700,170,300,30);
         cate.setBackground(Color.WHITE);
         add(cate);
         
         
         /*-------------------  income --------------------------------------*/
         income=new JLabel("Income : ");
         income.setBounds(500,200,500,70);
         income.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(income);
         
         String inco[]={"NULL","< 1,50,000","< 2,50,0000","< 5,00,000","Upto 10,00,000"};
         inc=new JComboBox(inco);
         inc.setBounds(700, 220, 300, 30);
         inc.setBackground(Color.WHITE);
         add(inc);
                 
         
         /*-------------------  education --------------------------------------*/
         education=new JLabel("Education : ");
         education.setBounds(500,250,500,70);
         education.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(education);
         
         String edu[]={"Non-Gradutation","Graduate","Post-Graduate","Doctrate","Others"};
         educ=new JComboBox(edu);
         educ.setBounds(700,270,300,30);
         educ.setBackground(Color.WHITE);
         add(educ);
         
                 
         
         
         /*-------------------  occupation --------------------------------------*/
         occupation=new JLabel("Occupation : ");
         occupation.setBounds(500,300,500,70);
         occupation.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(occupation);
         
         String oc[]={"Salaried","Self-employed","Bussiness","Students","Retired","Others"};
         occ=new JComboBox(oc);
         occ.setBounds(700,320,300,30);
         occ.setBackground(Color.WHITE);
         add(occ);
        
         
         /*-------------------  pan --------------------------------------*/
         pan=new JLabel("Pan Number : ");
         pan.setBounds(500,350,500,70);
         pan.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(pan);
         
         t_pan=new JTextField();
         t_pan.setBounds(700, 370, 300, 30);
         t_pan.setBackground(Color.WHITE);
         add(t_pan);
         
         /*-------------------  adhar --------------------------------------*/
         adhar=new JLabel("Adhar Number: ");
         adhar.setBounds(500,400,500,70);
         adhar.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(adhar);
         
         t_adhar=new JTextField();
         t_adhar.setBounds(700, 420, 300, 30);
         t_adhar.setBackground(Color.WHITE);
         add(t_adhar);
         
         /*-------------------  senior --------------------------------------*/
         senior=new JLabel("Senior Citizen : ");
         senior.setBounds(500,450,500,70);
         senior.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(senior);
         
         syes=new JRadioButton("Yes");
         syes.setBounds(700, 470, 100, 40);
         syes.setBackground(Color.WHITE);
         add(syes);
         
         sno=new JRadioButton("No");
         sno.setBounds(900, 470, 100, 40);
         sno.setBackground(Color.WHITE);
         add(sno);
         
         
         /*-------------------  existing --------------------------------------*/
         existing=new JLabel("Existing Account : ");
         existing.setBounds(500,500,500,70);
         existing.setFont(new Font("Times New Roman",Font.BOLD,24));
         add(existing);
        
         eyes=new JRadioButton("Yes");
         eyes.setBounds(700, 520, 100, 40);
         eyes.setBackground(Color.WHITE);
         add(eyes);
         
         eno=new JRadioButton("No");
         eno.setBounds(900, 520, 100, 40);
         eno.setBackground(Color.WHITE);
         add(eno);
         
         
         /*-------------------  Button --------------------------------------*/
         submit=new JButton("Next");
         submit.setBounds(750, 600, 100, 35);
         submit.setFont(new Font("Times New Roman",Font.BOLD,17));
         submit.setBackground(Color.BLACK);
         submit.setForeground(Color.WHITE);
         submit.addActionListener(this);
         add(submit);
    
        
        /*-------------------  Frame Adjusment  --------------------------------------*/

         setLayout(null);
         getContentPane().setBackground(Color.WHITE);//change the color of frame
        setSize(1710,1000);
        setLocation(0,0);
        setVisible(true);
    
    }   
    
    @Override
    public void actionPerformed(ActionEvent e) {
       String sreligion =(String) creligion.getSelectedItem();//object ko represent karta hai getselecteditem so string mai convert karna padta hai
       String scategory=(String)cate.getSelectedItem();
       String sincome=(String)inc.getSelectedItem();
       String seducation=(String)educ.getSelectedItem();
       String soccupation=(String)occ.getSelectedItem();
       String span=t_pan.getText();
       String sadhar=t_adhar.getText();
       String senior=null;
       if(syes.isSelected()){
       senior="Yes";
       }
       else if(sno.isSelected()){
       senior="No";
       }
      
       String ex=null;
       if(eyes.isSelected()){
       ex="Yes";
       }
       else if(eno.isSelected()){
       ex="No";
       }
       
       
      
       try{
           if(span.equals("")){
        JOptionPane.showMessageDialog(null, "Fill all the required fields");
        }
           else if(sadhar.equals("")){
        JOptionPane.showMessageDialog(null, "Fill all the required fields");
        }
           else{
           Connectiond con=new Connectiond();//create kiye connection class ka object ko 
           String query2="insert into reg_2 values('"+sreligion+"','"+scategory+"','"+sincome+"','"+seducation+"','"+soccupation+"','"+span+"','"+sadhar+"','"+senior+"','"+ex+"')";
           con.s.executeUpdate(query2);
           
               setVisible(false);
                new Registeration_3().setVisible(true);
           }
       }catch(Exception ee){
       System.out.print(ee);
       }
       
       
       
       
    }
    
    public static void main(String[] args) {
        new Registeration_2();
    }

    
}
