package benz;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;

public class sp
{	
	private JFrame frm;
	private JButton Select;
	private JComboBox Combo;
	
	public sp()
	{
		frm = new JFrame();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.show();
		frm.setTitle("Specifications");
		frm.setSize(1000,500);
				
		Container contain = frm.getContentPane();
		contain.setLayout(new BorderLayout());
			
		GridBagLayout layt = new GridBagLayout();	
		GridBagConstraints cons = new GridBagConstraints();	

		JPanel lbpanel = new JPanel();	    
		JPanel companel = new JPanel();

		cons.fill=GridBagConstraints.VERTICAL;
		cons.weightx=0.3;
		cons.weighty=0.4;
	//	c.gridwidth=2;
		cons.gridx=0;
		cons.gridy=0;
						
		JLabel label = new JLabel(" SPECIFICATIONS ");
		label.setFont(new Font("serif",Font.BOLD+Font.ITALIC,24));
		layt.setConstraints(label,cons);
		lbpanel.add(label);		
		contain.add(lbpanel);
		
		/*constraints.fill = GridBagConstraints.NORTH;
		constraints.insets = new Insets(10, 10, 10, 10);
		constraints.anchor = GridBagConstraints.WEST;
		//constraints.anchor = GridBagConstraints.WEST;
		constraints.weightx = 0;
		constraints.weighty = 0;*/
		
		cons.fill=GridBagConstraints.VERTICAL;
		cons.ipady=0;
		cons.anchor=GridBagConstraints.NORTH;
		cons.gridwidth=1;
		cons.gridx=0;
		cons.gridy=2;
	//	add(label,constraints,0,0,0,1);		
		lbpanel.add( new JLabel("Car Model :"));
		JLabel CarModel=new JLabel("i");
		layt.setConstraints(label,cons);
		lbpanel.add(CarModel);
		
		/*frm.add( new JLabel("Engine :"));
		JLabel Engine=new JLabel("i");
		frm.add(Engine);

		frm.add( new JLabel("Torque :"));
		JLabel Torque=new JLabel("i");
		frm.add(Torque);

		frm.add( new JLabel("Suspension :"));
		JLabel Suspension=new JLabel("i");
		frm.add(Suspension);

		frm.add( new JLabel("TankCapacity :"));
		JLabel TankCapacity=new JLabel("i");
		frm.add(TankCapacity);

		frm.add( new JLabel("HorsePower :"));
		JLabel HorsePower=new JLabel("i");
		frm.add(HorsePower);

		frm.add( new JLabel("Mileage :"));
		JLabel Mileage=new JLabel("i");
		frm.add(Mileage);

		frm.add( new JLabel("TopSpeed :"));
		JLabel TopSpeed=new JLabel("i");
		frm.add(TopSpeed);

		frm.add( new JLabel("CubicCompression :"));
		JLabel CubicCompression=new JLabel("i");
		frm.add(CubicCompression);

		frm.add( new JLabel("Price :"));
		JLabel Price=new JLabel("i");
		frm.add(Price);								

		Combo  = new JComboBox();
		Combo.setEditable(true);
		Combo.addItem("FORD ICON");
		Combo.addItem("FERRARI ");
		Combo.addItem("LANCER ");
		Combo.addItem("MC LAREN ");
		Combo.addItem("MERCEDES BENZ ");
		Combo.addItem("ESTEEM ");				
		frm.add(Combo);
		
		Select = new JButton(" SELECT ");
		frm.add(Select);*/
		
		/*sppanel picpanel = new sppanel();
		contain.add(picpanel);*/

	}
	
	public static void main(String args[])
	{
		sp spfn = new sp(); 
	}		
	public void add(Component c,GridBagConstraints constraints,int x,int y,int w,int h)
	{
		constraints.gridx = x;
		constraints.gridy = y;
		constraints.gridwidth = w;
		constraints.gridheight = h;
		frm.getContentPane().add(c,constraints);
	}	
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
		Image image = Toolkit.getDefaultToolkit().getImage("d.gif");
		int imagew = image.getWidth(this);
		int imageh = image.getHeight(this);
		g2.drawImage(image,0,0,imagew,imageh,null);
		
    }	
}   


/*

		GridBagLayout grid = new GridBagLayout();
		GridBagConstraints cons = new GridBagConstraints();
		cons.insets = new Insets(10, 10, 10, 10);
		cons.anchor = GridBagConstraints.WEST;
		setLayout(grid);
		
		lblName = new JLabel("Name : ");
		cons.gridx = 0;
		cons.gridy = 0;
		this.add(lblName, cons);
		
		txtName = new JTextField("", 15);
		cons.gridx = 1;
		cons.gridy = 0;
		this.add(txtName, cons);
		
		lblAddr = new JLabel("Addr : ");
		cons.gridx = 0;
		cons.gridy = 1;
		this.add(lblAddr, cons);
		
		txtAddr = new JTextField("", 15);
		cons.gridx = 1;
		cons.gridy = 1;
		this.add(txtAddr, cons);
		
		lblAge = new JLabel("Age : ");
		cons.gridx = 0;
		cons.gridy = 2;
		this.add(lblAge, cons);
		
		txtAge = new JTextField("", 15);
		cons.gridx = 1;
		cons.gridy = 2;
		this.add(txtAge, cons);
		
		
		btnOk = new JButton("Add");
		cons.gridx = 1;
		cons.gridy = 3;
		this.add(btnOk, cons);
		
		btnCancel = new JButton("Cancel");
		cons.gridx = 1;
		cons.gridy = 3;
		cons.anchor = GridBagConstraints.EAST;
		this.add(btnCancel, cons);
*/