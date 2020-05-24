package benz;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;

public class specification
{	
  private JFrame frm;
  private JButton btnDone;
  private JComboBox Combo;
  Statement stmt,stmt1;
  Connection con,con1;
  ResultSet res,res1;
  ResultSetMetaData rsmd,rsmd1;
  JLabel lCarModel,CarModel,lEngine,Engine,lTorque,Torque,
          lRpm,Rpm,lTankCapacity,TankCapacity,lBhp,
          Bhp,lMileage,Mileage,lTopSpeed,TopSpeed,
          lCubicCompression,CubicCompression,lZtoSixty,ZtoSixty,
          lPrice,Price;
	  

	
  public specification()
  {
  	  frm = new JFrame();
	  frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	  frm.show();
      frm.setTitle("Specifications");
      frm.setSize(WIDTH, HEIGHT);

      Container contentPane = frm.getContentPane();
      GridBagLayout layout = new GridBagLayout();
      contentPane.setLayout(layout);
      JLabel label = new JLabel(" SPECIFICATIONS ");
	  label.setFont(new Font("serif",Font.BOLD+Font.ITALIC,24));
	  
	  JLabel lCarModel= new JLabel("Car Model :");
	  CarModel= new JLabel();
		
	  JLabel lEngine = new JLabel("Engine :");
	  Engine = new JLabel();

	  JLabel lTorque = new JLabel("Torque :");
	  Torque = new JLabel();

	  JLabel lRpm = new JLabel("RPM :");
	  Rpm = new JLabel();

	  JLabel lTankCapacity = new JLabel("Tank Capacity :");
	  TankCapacity = new JLabel();

	  JLabel lBhp = new JLabel("BHP :");
	  Bhp = new JLabel();

	  JLabel lMileage = new JLabel("Mileage :");
	  Mileage = new JLabel();

	  JLabel lTopSpeed = new JLabel("TopSpeed :");
	  TopSpeed = new JLabel();

	  JLabel lCubicCompression = new JLabel("Cubic Compression :");
	  CubicCompression = new JLabel();

	  JLabel lZtoSixty = new JLabel("Zero to Sixty :");
	  ZtoSixty = new JLabel();

	  JLabel lPrice = new JLabel("Price :");
	  Price = new JLabel();

	  Combo = new JComboBox();
	  Combo.setEditable(true);
	  Combo.addItem("FORD ICON");
	  Combo.addItem("FERRARI");
	  Combo.addItem("LANCER");
	  Combo.addItem("MC LAREN");
	  Combo.addItem("MERCEDES BENZ");
	  Combo.addItem("ESTEEM");		
	  Combo.addActionListener( new
	  ActionListener(){
	  public void actionPerformed(ActionEvent event)
	  { 
	   frm.repaint();   
	   try
	   {
		String temp_2;  			
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url="jdbc:odbc:sscl";			
		con1 = DriverManager.getConnection(url);
		//stmt = con.createStatement();
		stmt1=con1.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		String str = (String)Combo.getSelectedItem();
		System.out.println("value " + str);
		ResultSet res1 = stmt1.executeQuery("select * from car where CARMODEL = '"+str+"'");
		res1.next();
		temp_2 = res1.getString("CARMODEL");
		CarModel.setText(temp_2);
		temp_2 = res1.getString("ENGINETYPE");
		Engine.setText(temp_2);
		temp_2 = res1.getString("TORQUE");
		Torque.setText(temp_2);
		temp_2 = res1.getString("RPM");
        Rpm.setText(temp_2);
        temp_2 = res1.getString("TANKCAPACITY");        
        TankCapacity.setText(temp_2);
        temp_2 = res1.getString("BHP");
        Bhp.setText(temp_2);
        temp_2 = res1.getString("MILEAGE");
        Mileage.setText(temp_2);
        temp_2 = res1.getString("TOPSPEED");
        TopSpeed.setText(temp_2);
        temp_2 = res1.getString("CUBICCOMPRESSION");
        CubicCompression.setText(temp_2);
        temp_2 = res1.getString("ZERO_TO_60");
        ZtoSixty.setText(temp_2);
        temp_2 = res1.getString("PRICE");
        Price.setText(temp_2);
 
			
		System.out.println("Connection Suceeded");
	    }catch (Exception e){e.printStackTrace();}
       }
      }); 	  		
		
	  JButton btnDone = new JButton("Done!");
	  btnDone.addActionListener(new 
 		ActionListener()
 		{
 			public void actionPerformed(ActionEvent ae)
 			{
 					benz.mainfrm frm = new benz.mainfrm();
					//cashframe.show(false);					
					//frm.show(false);
 			}
 		});

      GridBagConstraints constraints = new GridBagConstraints();

      constraints.fill = GridBagConstraints.HORIZONTAL;
      constraints.anchor = GridBagConstraints.WEST;
      constraints.weightx = 0;
      constraints.weighty = 0;
      constraints.insets.right = 1;      
      constraints.insets.top = 1;      

      constraints.fill = GridBagConstraints.HORIZONTAL;
      constraints.anchor = GridBagConstraints.EAST;
      constraints.weightx = 100;
      constraints.weighty = 100;      


	  add(label,constraints, 2, 0, 1, 1);	
      add(lCarModel, constraints, 0, 0, 1, 1);
      add(lEngine, constraints, 0, 1, 1, 1);
      add(lTorque, constraints, 0, 2, 1, 1);
      add(lRpm, constraints, 0, 3, 1, 1);
      add(lTankCapacity, constraints, 0, 4, 1, 1);
      add(lBhp, constraints, 0, 5, 1, 1);
      add(lMileage, constraints, 0, 6, 1, 1);
      add(lTopSpeed, constraints, 0, 7, 1, 1);
      add(lCubicCompression, constraints, 0, 8, 1, 1);
      add(lZtoSixty, constraints, 0, 9, 1, 1);
      add(lPrice, constraints, 0, 10, 1, 1);
      
      constraints.fill = GridBagConstraints.NONE;
      constraints.anchor = GridBagConstraints.WEST;
      add(CarModel, constraints, 1, 0, 1, 1);
      add(Engine, constraints, 1, 1, 1, 1);
      add(Torque, constraints, 1, 2, 1, 1);
      add(Rpm, constraints, 1, 3, 1, 1);      
      add(TankCapacity, constraints, 1, 4, 1, 1);      
      add(Bhp, constraints, 1, 5, 1, 1);            
      add(Mileage, constraints, 1, 6, 1, 1);            
      add(TopSpeed, constraints, 1, 7, 1, 1);            
      add(CubicCompression, constraints, 1, 8, 1, 1);
      add(ZtoSixty, constraints, 1, 9, 1, 1);      
      add(Price, constraints, 1, 10, 1, 1);	 

      add(Combo, constraints, 0, 11, 1, 1);
      add(btnDone, constraints, 1, 11, 1, 1);

      sppanel picpanel = new sppanel();
      constraints.fill = GridBagConstraints.BOTH;
      constraints.anchor = GridBagConstraints.SOUTHWEST;
      constraints.weightx = 100;
      constraints.weighty = 100;      
      constraints.ipadx = 1;      
      constraints.ipady = 1;      
      constraints.insets.right = 75;      
      constraints.insets.top = 75;      
      //constraints.anchor = GridBagConstraints.EAST;
      add(picpanel, constraints, 2, 0, 2, 10);           
      //update();
      try
		{
			String temp_1;  
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			String url="jdbc:odbc:sscl";			
			con = DriverManager.getConnection(url);
			//stmt = con.createStatement();
			stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
			String str = (String)Combo.getSelectedItem();
			System.out.println("value " + str);
			ResultSet res = stmt.executeQuery("select * from car where CARMODEL = '"+str+"'");
			res.next();

			temp_1 = res.getString("CARMODEL");
			
			CarModel.setText(temp_1);
			temp_1 = res.getString("ENGINETYPE");
			Engine.setText(temp_1);
			temp_1 = res.getString("TORQUE");
			Torque.setText(temp_1);
			temp_1 = res.getString("RPM");
        	Rpm.setText(temp_1);
        	temp_1 = res.getString("TANKCAPACITY");        
        	TankCapacity.setText(temp_1);
        	temp_1 = res.getString("BHP");
        	Bhp.setText(temp_1);
       	 	temp_1 = res.getString("MILEAGE");
        	Mileage.setText(temp_1);
        	temp_1 = res.getString("TOPSPEED");
        	TopSpeed.setText(temp_1);
        	temp_1 = res.getString("CUBICCOMPRESSION");
        	CubicCompression.setText(temp_1);
        	temp_1 = res.getString("ZERO_TO_60");
        	ZtoSixty.setText(temp_1);
        	temp_1 = res.getString("PRICE");
        	Price.setText(temp_1);
            
            res.close();
            con.close();
            stmt.close();
			
				System.out.println("Connection Suceeded");
		}catch (Exception e){e.printStackTrace();}
   }
  
   public void add(Component c, GridBagConstraints constraints,
                   int x, int y, int w, int h)
   {  
      constraints.gridx = x;
      constraints.gridy = y;
      constraints.gridwidth = w;
      constraints.gridheight = h;
      frm.getContentPane().add(c, constraints);
   }
	
   public static void main(String args[])
   {
	 specification sp = new specification(); 
   }		
	
   class sppanel extends JPanel
   {
	public sppanel()
	{
		Border etch = BorderFactory.createEtchedBorder(100,Color.blue,Color.red);
		Border title = BorderFactory.createTitledBorder(etch,"");
		//setBorder(title);		
    }
    public void paintComponent(Graphics g)
    {
    	super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;		
		String str = (String)Combo.getSelectedItem();
		Image image = Toolkit.getDefaultToolkit().getImage(str + ".jpg");
		int imagew = image.getWidth(this);
		int imageh = image.getHeight(this);
		g2.drawImage(image,0,0,imagew,imageh,null);
		
    }	        
   }   

  public static final int WIDTH = 800;
  public static final int HEIGHT = 500;  
}   