package benz;

import benz.specification;
import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Purchase
{	
    public String strname,straddress,strcustid;
	//public Integer intid = 11;
	private JFrame Purchasefrm;
	//private benz.mainfrm.test;
	private JTextField CusId;
	private JTextField name;
	private JTextField Address;
	private JTextField Occupation;
	private JTextField Telephone;
	Statement stmt1;
	Connection con;
	ResultSet res;
	ResultSetMetaData rsmd;
	private JButton Submit;
	private JButton Clear;
	
	public Purchase()
	{
		Purchasefrm = new JFrame();
		Purchasefrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Purchasefrm.show();
		Purchasefrm.setTitle("Purchase");
		Purchasefrm.setSize(380,300);

			
		Container contain = Purchasefrm.getContentPane();
		//Container contain = getContentPane();

		contain.setLayout(new BorderLayout());
		//setBackground(Color.pink);
		
		JLabel label = new JLabel("Enter the Customers' detail!");
		label.setFont(new Font("serif",Font.ITALIC,24));
		contain.add(label,BorderLayout.NORTH);
		
				
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(6,2,10,10));
		panel.add( new JLabel("CustomerId:"));
		CusId=new JTextField(15);
		panel.add(CusId);
		
		panel.add( new JLabel("Name:"));
		name=new JTextField(15);
		panel.add(name);
		
		panel.add( new JLabel("Address:"));
		Address=new JTextField(2);
		panel.add(Address);	
		
		panel.add( new JLabel("Occupation:"));
		Occupation=new JTextField(2);
		panel.add(Occupation);	
		
		panel.add( new JLabel("Telephone:"));
		Telephone=new JTextField(6);
		panel.add(Telephone);
		
	
 		Clear= new JButton("Clear!!");panel.add(Clear); 
 		Clear.addActionListener(new 
 		ActionListener()
 		{
 			public void actionPerformed(ActionEvent ae)
 			{
 				name.setText("");
 				Address.setText("");
 				Occupation.setText("");
 				Telephone.setText("");
 			}
 		});
 		Submit= new JButton("Submit");
 		panel.add(Submit);
 		Submit.addActionListener( new
	     ActionListener(){
	     	public void actionPerformed(ActionEvent ae)
	     	{
	     		strname = name.getText();
	     		straddress = Address.getText();
	     		strcustid = CusId.getText();
	     		try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url= "jdbc:odbc:diws";
					Connection con = DriverManager.getConnection(url);
					stmt1 = con.createStatement();										
					CallableStatement stmt1=con.prepareCall("{call proc_customer(?,?,?,?,?)}");	
		 		
		 			benz.mainfrm.glstrname = name.getText();
		 			benz.mainfrm.glstraddress = Address.getText();
		 			benz.mainfrm.glcusid = CusId.getText();
		 			
		 			System.out.println("name="+benz.mainfrm.glstrname);
		 			System.out.println("Address="+benz.mainfrm.glstraddress);
		 			System.out.println("CusId="+benz.mainfrm.glcusid);
		 			
		 			//JOptionPane.showMessageDialog("ok");
		 			stmt1.setString(1,CusId.getText());
		 			stmt1.setString(2,name.getText());
		 			stmt1.setString(3,Address.getText()); 
		 			stmt1.setString(4,Occupation.getText());
		 			stmt1.setString(5,Telephone.getText()); 
		 			stmt1.executeUpdate();
		 	
					System.out.println("values Inserted!");
				}catch (Exception e){e.printStackTrace();}
	     		
	     		
	     		if((name.getText().equals("")))
	     		{
	     			JOptionPane.showMessageDialog(null,"Please Enter The Values");	
	     		}
	     		else
	     		{	     			
	     			benz.specification frm = new benz.specification();
					//frm.show(true);					
					Purchasefrm.hide();	     			        
	     		}	     		
	     	}	 			
	     } 
	   );
			
		contain.add(panel,BorderLayout.CENTER);
	}
	
	public static void main(String args[])
	{
		Purchase pur = new Purchase();
	}
}