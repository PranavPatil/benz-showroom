import benz.mainfrm;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class login 
{
	JFrame log; 
	JPasswordField tcustid;
	public login()
	{
	 log = new JFrame();	
	 log.setTitle("LOGIN"); 	
  	 log.setSize(w,h);
  	 log.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 log.show();
  	 
  	 Container contentpane = log.getContentPane();
  	 JPanel title = new JPanel();
  	 JPanel label = new JPanel();
  	 JPanel text = new JPanel();
  	 JPanel button = new JPanel();
  	 
  	 label.setLayout(new GridLayout(2,1,0,0));
  	 text.setLayout(new GridLayout(2,1,0,0));	
  	 contentpane.add(title,BorderLayout.NORTH);  	 
  	 contentpane.add(label,BorderLayout.WEST);  	 
  	 contentpane.add(text,BorderLayout.EAST);  	 
  	 contentpane.add(button,BorderLayout.SOUTH);  	 
  	   	   	 
  	 JLabel llogin = new JLabel(" LOGIN ");
  	 llogin.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,18));  	 
  	 JLabel lname = new JLabel(" NAME ");
  	 JLabel lcustid = new JLabel(" Password ");
  	 JTextField tname = new JTextField(10);
  	 tcustid = new JPasswordField(10); 
  	 JButton ok = new JButton("OK");
  	 JButton cancel = new JButton("CANCEL");
   	 
   	 
   	 title.add(llogin);
  	 label.add(lname);
  	 text.add(tname);
  	 label.add(lcustid);
  	 text.add(tcustid);  	
  	 button.add(ok);
  	 button.add(cancel);
  	 
  	 ok.addActionListener( new
	     ActionListener(){
	     	public void actionPerformed(ActionEvent e)
	     	{
	     		
	     		if((tcustid.getText().equals("000")))
	     		{
	     			benz.mainfrm frm = new benz.mainfrm();
					//frm.show(true);
					log.show(false);
	     		}
	     		else
	     		{	     			
	     			JOptionPane.showMessageDialog(null,"INVALID NAME OR PASSWORD !");
	     			        
	     		}	
	     			
	     	}	 			
	     } 
	   );
	   cancel.addActionListener( new
	     ActionListener(){
	     	public void actionPerformed(ActionEvent e)
	     	{
	     		
	     		System.exit(0);
	     			
	     	}	 			
	     } 
	   );
	}
	public static final int w = 300; 
	public static final int h = 150; 

	public static void main(String args[])
	{
		login lg = new login();
	}
}

