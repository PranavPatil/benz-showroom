package benz;

import benz.mainfrm;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
import java.util.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Spares 
 {
   JFrame Spareframe;	
 	JButton Okbutton,Canbutton;
 	JLabel lCusName,lBuzzers,lsteergrip,lfans,lfilters,lstand,
 	       lspeakers,lcovers,lsilencer,ltoolkit,lharness,lregulator,
 	       lmusicsys,lalarms,lac,lTotal;
    JLabel pBuzzers,psteergrip,pfans,pfilters,pstand,
 	       pspeakers,pcovers,psilencer,ptoolkit,pharness,pregulator,
 	       pmusicsys,palarms,pac;
 	        	       
    JComboBox CBuzzers,Csteergrip,Cfans,Cfilters,Cstand,
 	       Cspeakers,Ccovers,Csilencer,Ctoolkit,Charness,Cregulator,
 	       Cmusicsys,Calarms,Cac;; 
 	JTextField Txtname;       

   public Spares()
   {
   	 Spareframe = new JFrame();
     Spareframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Spareframe.setSize(316,614);
 	 Spareframe.setTitle("Spares!"); 	 	
 	 Sparespanel panel = new Sparespanel();
 	 Container contentPane = Spareframe.getContentPane();
 	 contentPane.add(panel);
	 JLabel label = new JLabel("                     Spares Receipt");
	 label.setFont(new Font("serif",Font.ITALIC,24));
	 contentPane.add(label,BorderLayout.NORTH);
     Spareframe.show();
    	
   }
   	
   public static void main(String[] args)
   {
 	 Spares spr = new Spares();
   }	   


   class Sparespanel extends JPanel
   {

 	//EventHandler evn;
 	GridBagConstraints cons;
 	
 	public Sparespanel()
 	 {
 	 	super();
 	 		
 	 //	EventHandler evn = new EventHandler(this);
 	  	cons = new GridBagConstraints();
 	 	setLayout(new GridBagLayout());
 	 	setCons(cons);
 	 	cons.anchor = GridBagConstraints.EAST;
 	 	 	 	 	 	
 	 	lCusName = new JLabel(" Customer Name ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 0;
        cons.insets = new Insets(5,10,5,5); 	 
 	 	add(lCusName,cons);
 	 	
 	 	lBuzzers = new JLabel(" Buzzers ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 1;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lBuzzers,cons);
 	 	
 	    lsteergrip = new JLabel(" Steering Grip ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 2;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(lsteergrip,cons);
 	 	
 	    
 	    lfans = new JLabel(" Fans ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 3;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(lfans,cons);
 	 	 
 	 	 
 	 	lfilters = new JLabel(" Air Filters ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 4;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lfilters,cons);
 	 	
 	 	
 	 	lstand = new JLabel(" Luggage Stand ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 5;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(lstand,cons);
 	 	
 	 	
 	 	lspeakers = new JLabel(" Stereo Speakers. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 6;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lspeakers,cons);
 	 	
 	 	lcovers = new JLabel(" Seat Covers. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 7;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lcovers,cons);
 	 	 	 	
 	 	lsilencer = new JLabel(" Silencer. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 8;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lsilencer,cons);
 	 	
 	 	ltoolkit = new JLabel(" Vechicle Toolkit. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 9;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(ltoolkit,cons);

 	 	lharness = new JLabel(" Wiring Harness. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 10;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lharness,cons);

 	 	lregulator = new JLabel(" CDI Regulator. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 11;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lregulator,cons);

 	 	lmusicsys = new JLabel(" Music System. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 12;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lmusicsys,cons);

 	 	lalarms = new JLabel(" Security Alarms. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 13;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lalarms,cons);

 	 	lac = new JLabel(" A.C. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 14;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lsilencer,cons);

 	 	lTotal = new JLabel(" Total. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 15;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lTotal,cons);
 	 	 
 	 	cons.anchor = GridBagConstraints.WEST;
 	 	cons.insets = new Insets(5,10,5,5); 	 	 	 	

 	 	Txtname = new JTextField(10);
 	 	cons.gridx = 1;
 	 	cons.gridy = 0;
 	 	add(Txtname,cons);
 	 	
 	 	pBuzzers = new JLabel(" RS.  100 ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 1;
 	 	add(pBuzzers,cons);
 	 	
 	    psteergrip = new JLabel(" RS.  150 ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 2;
 	 	add(psteergrip,cons);
 	 	
 	    
 	    pfans = new JLabel(" RS.  300 ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 3;
 	 	add(pfans,cons);
 	 	 
 	 	 
 	 	pfilters = new JLabel(" RS.  400 ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 4;
 	 	add(pfilters,cons);
 	 	
 	 	
 	 	pstand = new JLabel(" RS.  400 ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 5;
 	 	add(pstand,cons);
 	 	
 	 	
 	 	pspeakers = new JLabel(" RS.  500. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 6;
 	 	add(pspeakers,cons);
 	 	
 	 /*	pcovers = new JLabel(" 500. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 7;
 	 	add(pcovers,cons);*/
 	 	 	 	
 	 	psilencer = new JLabel(" RS.  500. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 8;
 	 	add(psilencer,cons);
 	 	
 	 	ptoolkit = new JLabel(" RS.  700. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 9;
 	 	add(ptoolkit,cons);

 	 	pharness = new JLabel(" RS.  1000. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 10;
 	 	add(pharness,cons);

 	 	pregulator = new JLabel(" RS.  1000. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 11;
 	 	add(pregulator,cons);

 	 	pmusicsys = new JLabel(" RS.  2000. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 12;
 	 	add(pmusicsys,cons);

 	 	palarms = new JLabel(" RS.  5000. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 13;
 	 	add(palarms,cons);

 	 	pac = new JLabel(" RS.  25000. ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 14;
 	 	add(pac,cons);
 	 	
 	 	 
 	 	cons.anchor = GridBagConstraints.WEST;
 	 	cons.insets = new Insets(5,10,5,5); 	 	 	 	
 	 	
 	 	CBuzzers = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 2;
 	 	add(CBuzzers,cons);
 	 	
 	    Csteergrip = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 3;
 	 	add(Csteergrip,cons);
 	 	
 	    
 	    Cfans = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 4;
 	 	add(Cfans,cons);
 	 	 
 	 	 
 	 	Cfilters = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 5;
 	 	add(Cfilters,cons);
 	 	
 	 	
 	 	Cstand = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 6;
 	 	add(Cstand,cons);
 	 	
 	 	
 	 	Cspeakers = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 7;
 	 	add(Cspeakers,cons);
 	 	
 	 	Ccovers = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 8;
 	 	add(Ccovers,cons);
 	 	 	 	
 	 	Csilencer = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 9;
 	 	add(Csilencer,cons);
 	 	
 	 	Ctoolkit = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 10;
 	 	add(Ctoolkit,cons);

 	 	Charness = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 11;
 	 	add(Charness,cons);

 	 	Cregulator = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 12;
 	 	add(Cregulator,cons);

 	 	Cmusicsys = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 13;
 	 	add(Cmusicsys,cons);

 	 	Calarms = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 14;
 	 	add(Calarms,cons);

 	 	Cac = new JComboBox();
 	 	cons.gridx = 2;
 	 	cons.gridy = 15;
 	 	add(Cac,cons);
 	 	 
 	 	/*txtCusName = new JTextField(15);
 	 	txtCusName.setEditable(false);
 	 	cons.gridx = 1;
 	 	cons.gridy = 0; 	    
 	 	add(txtCusName,cons);
 	 	
 	 	txtCusId = new JTextField(15);
 	 	cons.gridx = 1;
 	 	cons.gridy = 1; 
		cons.insets = new Insets(5,10,5,5); 	 		 
 	 	add(txtCusId,cons); 	 	
 	
 	    txtServices = new JTextField(15);
 	    txtServices.setEditable(false);
 	 	cons.gridx = 1;
 	 	cons.gridy = 2;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(txtServices,cons);
 	 	
 	 	ReadCombo = new JComboBox();
	    ReadCombo.setEditable(true);
 
	    ReadCombo.addItem("--Select Meter Reading--");
	    ReadCombo.addItem("above 500 KMS");
	    ReadCombo.addItem("above 1000 KMS");
	    ReadCombo.addItem("above 2000 KMS");
	    ReadCombo.addItem("above 5000 KMS");
	    ReadCombo.addItem("above 10000 KMS");
	    ReadCombo.addItem("above 20000 KMS");		
	    ReadCombo.addItem("above 30000 KMS");	
	    ReadCombo.addItem("above 50000 KMS");	
	    cons.gridx = 1;
 	 	cons.gridy = 3;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(ReadCombo,cons);
	    //ReadCombo.addActionListener(listener);
 	 	
 	    
 	    txtWash = new JTextField(15);
 	    txtWash.setText("Rs.  100/-");
 	    txtWash.setEditable(false);
 	 	cons.gridx = 1;
 	 	cons.gridy = 4;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(txtWash,cons);
 	 	 
 	 	 
 	 	txtCharges = new JTextField(15);
 	 	txtCharges.setEditable(false);
	 	cons.gridx = 1;
 	 	cons.gridy = 5;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(txtCharges,cons);
 	 	
 	 	
 	 	txtTax = new JTextField(15);
 	 	txtTax.setText("                 ---5%---");
 	 	txtTax.setEditable(false);
 	 	cons.gridx = 1;
 	 	cons.gridy = 6;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(txtTax,cons);
 	 	
 	 	
 	 	txtTotal = new JTextField(15);
 	 	txtTotal.setEditable(false);
 	 	cons.gridx = 1;
 	 	cons.gridy = 7;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(txtTotal,cons);
 	 	 
 	 
 	 	Okbutton = new JButton(" OK");
 	 	cons.gridx = 0;
 	 	cons.gridy = 8;
 	 	cons.insets = new Insets(5,20,5,5);
 	 	add(Okbutton,cons);
 	 	Okbutton.addActionListener( new
	     ActionListener(){
	     	public void actionPerformed(ActionEvent ae)
	     	{
	     		String temp,temp1;
	     		Integer NoOfServices = 0 ;
	     		Integer tem;
	     		try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url= "jdbc:odbc:diws";
					Connection con = DriverManager.getConnection(url);
					stmt1 = con.createStatement();
					temp = new String(txtCusId.getText());
					ResultSet res1 = stmt1.executeQuery("select * from car_record where CUSID = "+temp+"");
					System.out.print("Conn Sucess!");
					res1.next();
					
					temp1 = res1.getString("CUSNAME");					
					txtCusName.setText(temp1);
					
					temp1 = res1.getString("NOOFSERVICES");					
					txtServices.setText(temp1);
					System.out.println("temp1 = " + temp1 + "\n");
					double a = res1.getDouble(6);
					//temp1 = res1.getString("NOOFSERVICES");
					//NoOfServices = a; 		
					System.out.println("NoofSer = " + a);						

		        
				}catch (Exception e){e.printStackTrace();}
				
				Integer MeterReading = 0,ServCharge;
				if (ReadCombo.getSelectedIndex() == 2)
				   MeterReading = 500;
				else if (ReadCombo.getSelectedIndex() == 3)
				   MeterReading = 1000;
				else if (ReadCombo.getSelectedIndex() == 4)
				   MeterReading = 2000;
				else if (ReadCombo.getSelectedIndex() == 5)
				   MeterReading = 5000;
				else if (ReadCombo.getSelectedIndex() == 6)
				   MeterReading = 10000;
				else if (ReadCombo.getSelectedIndex() == 7)
				   MeterReading = 20000;
				else if (ReadCombo.getSelectedIndex() == 8)
				   MeterReading = 30000;
				else if (ReadCombo.getSelectedIndex() == 9)
				   MeterReading = 50000;	
				   			   				   				   				   				   				   
				if (NoOfServices  == 0)
				{
					if (MeterReading < 5000)
						ServCharge = 0;				
					else if (MeterReading >= 5000 && MeterReading < 20000)
						ServCharge = 500;				
					else if (MeterReading < 20000)
						ServCharge = 1000;																
				}
				else 
				{
					if (MeterReading < 5000)
						ServCharge = 100;				
					else if (MeterReading >= 5000 && MeterReading < 20000)
						ServCharge = 600;				
					else if (MeterReading < 20000)
						ServCharge = 1200;																
				}
	     	}	 			
	     } 
	   );
 	 	//Okbutton.addActionListener(evn);
 	 	
 	 
 	 	Canbutton = new JButton(" CANCEL ");
 	 	cons.gridx = 1;
 	 	cons.gridy = 8;
 	 	cons.insets = new Insets(5,50,5,5);
 	 	add(Canbutton,cons);
 	 	Canbutton.addActionListener( new
	    ActionListener(){
	     public void actionPerformed(ActionEvent e)
	     {
	     	benz.mainfrm frm = new benz.mainfrm();
			Serframe.show(false);		     			
	     }	 			
	    } 
	   ); */	 	
 	 }
 	 	
 	
 	private void setCons(GridBagConstraints cons)  
 	 {
 	 	cons.gridx = 0;
 	 	cons.gridy = 0;
 	 	cons.gridwidth = 1;
 	 	cons.gridheight = 1;
 	 	cons.weightx = 0.0;
 	 	cons.weighty = 0.0;
 	 	cons.anchor = GridBagConstraints.CENTER;
 	 	cons.fill = GridBagConstraints.NONE;
 	 	cons.insets = new Insets(0,0,0,0);
 	 	cons.ipadx = 0;
 	 	cons.ipady = 0;
 	 }
 	 
 	
 	/*class EventHandler implements ActionListener
 	 {
 	 	cusdisplaypanel temp;
 	 	EventHandler(cusdisplaypanel ds)
 	 	 {
 	 	   temp=ds;
 	 	 }
 	 	 

 		public void actionPerformed(ActionEvent ae)
 		 {
 		 	

         } 		  	        		
 	 }*/
 	
 	}
}
 	

 	
 	
 	
  	 