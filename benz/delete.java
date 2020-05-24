package benz;

import benz.specification;
import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class delete
{	
	public Integer intid = 11;
	private JFrame delete;
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
	
	public delete()
	{
		delete = new JFrame();
		delete.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		delete.show();
		delete.setTitle("Purchase");
		delete.setSize(380,300);

			
		Container contain = delete.getContentPane();
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
	     		/*private String strID;
	     		private String strname;
	     		private String strAddress;
	     		private String strOccupation;
	     		private String strtelephone;*/
	     		try
				{
					Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
					String url= "jdbc:odbc:diws";
					Connection con = DriverManager.getConnection(url);
					stmt1 = con.createStatement();										
					
					//stmt1.executeUpdate("INSERT into customer values ("+CusId.getText()+",'"+name.getText()+"','"+Address.getText()+"','"+Occupation.getText()+"',"+Telephone.getText()+")");					
					//while(rs.next())
					//strID = new String(name.get
				//CallableStatement stmt1=con.prepareCall("{call proc_customer("+CusId.getText()+",'"+name.getText()+"','"+Address.getText()+"','"+Occupation.getText()+"',"+Telephone.getText()+")}");	
				CallableStatement stmt1=con.prepareCall("{call proc_customer(?,?,?,?,?)}");	
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
					delete.hide();	     			        
	     		}	     		
	     	}	 			
	     } 
	   );
			
		contain.add(panel,BorderLayout.CENTER);
	}
	
	public static void main(String args[])
	{
		delete pur = new delete();
	}
}