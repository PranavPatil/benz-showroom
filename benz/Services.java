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

public class Services 
 {
   JFrame Serframe;	
 	JButton Okbutton,Canbutton;
 	JLabel lblCusId,lblCusName,lblServices,lblReading,lblWash,
 	       lblCharges,lblTax,lblTotal;
 	JTextField txtCusId,txtCusName,txtServices,txtWash,
 	       txtCharges,txtTax,txtTotal;
    JComboBox ReadCombo; 
    Statement stmt1;
	Connection con;
	ResultSet res;
	
   public Services()
   {
   	 Serframe = new JFrame();
     Serframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     Serframe.setSize(359,409);
 	 Serframe.setTitle("Services!"); 	 	
 	 Servicespanel panel = new Servicespanel();
 	 Container contentPane = Serframe.getContentPane();
 	 contentPane.add(panel);
	 JLabel label = new JLabel("                     Service Form");
	 label.setFont(new Font("serif",Font.ITALIC,24));
	 contentPane.add(label,BorderLayout.NORTH);
     Serframe.show();
    	
   }
   	
   public static void main(String[] args)
   {
 	 Services pur = new Services();
   }	   


   class Servicespanel extends JPanel
   {

 	//EventHandler evn;
 	GridBagConstraints cons;
 	
 	public Servicespanel()
 	 {
 	 	super();
 	 		
 	 //	EventHandler evn = new EventHandler(this);
 	  	cons = new GridBagConstraints();
 	 	setLayout(new GridBagLayout());
 	 	setCons(cons);
 	 	cons.anchor = GridBagConstraints.EAST;
 	 	 	 	 	 	
 	 	lblCusName = new JLabel(" Customer Name ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 0;
        cons.insets = new Insets(5,10,5,5); 	 
 	 	add(lblCusName,cons);
 	 	
 	 	lblCusId = new JLabel(" Customer ID ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 1;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lblCusId,cons);
 	 	
 	    lblServices = new JLabel(" No of Services ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 2;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(lblServices,cons);
 	 	
 	    
 	    lblReading = new JLabel(" Meter Reading ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 3;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(lblReading,cons);
 	 	 
 	 	 
 	 	lblWash = new JLabel(" Washing Charges ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 4;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lblWash,cons);
 	 	
 	 	
 	 	lblCharges = new JLabel(" Service Charges ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 5;
 	    cons.insets = new Insets(5,10,5,5);
 	 	add(lblCharges,cons);
 	 	
 	 	
 	 	lblTax = new JLabel(" Service Tax. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 6;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lblTax,cons);
 	 	
 	 	lblTotal = new JLabel(" Total Amount. ");
 	 	cons.gridx = 0;
 	 	cons.gridy = 7;
 	 	cons.insets = new Insets(5,10,5,5);
 	 	add(lblTotal,cons);
 	 	 	 	
 	 	cons.anchor = GridBagConstraints.WEST;
 	 	cons.insets = new Insets(5,10,5,5); 	 	 	 	

 	 	txtCusName = new JTextField(15);
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
	     		//Integer NoOfServices = 0 ;
	     		Integer tem;
	     		try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url= "jdbc:odbc:sscl";
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
					temp1 = res1.getString("NOOFSERVICES");
					NoOfServices = a; 		
					System.out.println("NoofSer = " + a);						

		        
				}catch (Exception e){e.printStackTrace();}
				
				double MeterReading,ServCharge;
				//Integer MeterReading = 0,ServCharge;
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
	   ); 	 	
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
 	

 	
 	
 	
  	 