
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;

public class w
{
   public static void main(String[] args)
   {  
      FontDialogFrame frame = new FontDialogFrame();
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      frame.show();
   }
}

/**
   A frame that uses a grid bag layout to arrange font
   selection components.
*/
class FontDialogFrame extends JFrame
{  
   private JComboBox Combo;
	
   public FontDialogFrame()
   {  
      setTitle("FontDialog");
      setSize(WIDTH, HEIGHT);

      Container contentPane = getContentPane();
      GridBagLayout layout = new GridBagLayout();
      contentPane.setLayout(layout);

      //ActionListener listener = new FontAction();

      // construct components
      
      JLabel label = new JLabel(" SPECIFICATIONS ");
	  label.setFont(new Font("serif",Font.BOLD+Font.ITALIC,24));

	  JLabel lCarModel= new JLabel("Car Model :");
	  JLabel CarModel= new JLabel("i");
		
	  JLabel lEngine = new JLabel("Engine :");
	  JLabel Engine = new JLabel("i");

	  JLabel lTorque = new JLabel("Torque :");
	  JLabel Torque = new JLabel("i");

	  JLabel lSuspension = new JLabel("Suspension :");
	  JLabel Suspension = new JLabel("i");

	  JLabel lTankCapacity = new JLabel("Tank Capacity :");
	  JLabel TankCapacity = new JLabel("i");

	  JLabel lHorsePower = new JLabel("Horse Power :");
	  JLabel HorsePower = new JLabel("i");

	  JLabel lMileage = new JLabel("Mileage :");
	  JLabel Mileage = new JLabel("i");

	  JLabel lTopSpeed = new JLabel("TopSpeed :");
	  JLabel TopSpeed = new JLabel("i");

	  JLabel lCubicCompression = new JLabel("Cubic Compression :");
	  JLabel CubicCompression = new JLabel("i");

	  JLabel lPrice = new JLabel("Price :");
	  JLabel Price = new JLabel("i");

	  ActionListener listener = new PicAction();

	  Combo = new JComboBox();
	  Combo.setEditable(true);
	  Combo.addItem("FORD ICON");
	  Combo.addItem("FERRARI");
	  Combo.addItem("LANCER");
	  Combo.addItem("MC LAREN");
	  Combo.addItem("MERCEDES BENZ");
	  Combo.addItem("ESTEEM");		
	  Combo.addActionListener(listener);		
		//companel.add(Combo);
		
	  JButton Select = new JButton("SELECT");
//		companel.add(Select);      
      // add components to grid

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

/*      add(lCarModel, constraints, 0, 0, 1, 1);
      add(lEngine, constraints, 0, 1, 1, 1);
      add(lTorque, constraints, 0, 2, 1, 1);
      add(lSuspension, constraints, 0, 3, 1, 1);
      add(lTankCapacity, constraints, 0, 4, 1, 1);
      add(lHorsePower, constraints, 0, 5, 1, 1);
      add(lMileage, constraints, 0, 6, 1, 1);
      add(lTopSpeed, constraints, 0, 7, 1, 1);
      add(lCubicCompression, constraints, 0, 8, 1, 1);
      add(lPrice, constraints, 0, 9, 1, 1);
      
      constraints.fill = GridBagConstraints.NONE;
      constraints.anchor = GridBagConstraints.WEST;
      add(Engine, constraints, 1, 1, 1, 1);
      add(Torque, constraints, 1, 2, 1, 1);
      add(Suspension, constraints, 1, 3, 1, 1);      
      add(TankCapacity, constraints, 1, 4, 1, 1);      
      add(HorsePower, constraints, 1, 5, 1, 1);            
      add(Mileage, constraints, 1, 6, 1, 1);            
      add(TopSpeed, constraints, 1, 7, 1, 1);            
      add(CubicCompression, constraints, 1, 8, 1, 1);      
      add(Price, constraints, 1, 9, 1, 1);
	  add(CarModel, constraints, 1, 0, 1, 1);

      add(Combo, constraints, 0, 10, 1, 1);
      add(Select, constraints, 1, 10, 1, 1);

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
      add(picpanel, constraints, 2, 0, 2, 10);*/      

	  add(label,constraints, 2, 0, 1, 1);	
      add(lCarModel, constraints, 0, 0, 1, 1);
      add(lEngine, constraints, 0, 1, 1, 1);
      add(lTorque, constraints, 0, 2, 1, 1);
      add(lSuspension, constraints, 0, 3, 1, 1);
      add(lTankCapacity, constraints, 0, 4, 1, 1);
      add(lHorsePower, constraints, 0, 5, 1, 1);
      add(lMileage, constraints, 0, 6, 1, 1);
      add(lTopSpeed, constraints, 0, 7, 1, 1);
      add(lCubicCompression, constraints, 0, 8, 1, 1);
      add(lPrice, constraints, 0, 9, 1, 1);
      
      constraints.fill = GridBagConstraints.NONE;
      constraints.anchor = GridBagConstraints.WEST;
      add(Engine, constraints, 1, 1, 1, 1);
      add(Torque, constraints, 1, 2, 1, 1);
      add(Suspension, constraints, 1, 3, 1, 1);      
      add(TankCapacity, constraints, 1, 4, 1, 1);      
      add(HorsePower, constraints, 1, 5, 1, 1);            
      add(Mileage, constraints, 1, 6, 1, 1);            
      add(TopSpeed, constraints, 1, 7, 1, 1);            
      add(CubicCompression, constraints, 1, 8, 1, 1);      
      add(Price, constraints, 1, 9, 1, 1);
	  add(CarModel, constraints, 1, 0, 1, 1);

      add(Combo, constraints, 0, 10, 1, 1);
      add(Select, constraints, 1, 10, 1, 1);

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
      
   }
  

   public void add(Component c, GridBagConstraints constraints,
      int x, int y, int w, int h)
   {  
      constraints.gridx = x;
      constraints.gridy = y;
      constraints.gridwidth = w;
      constraints.gridheight = h;
      getContentPane().add(c, constraints);
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
   private class PicAction implements ActionListener
   {
      public void actionPerformed(ActionEvent event)
      {  
		repaint();         
      }

   }  
   public static final int WIDTH = 900;
   public static final int HEIGHT = 500;  
}
