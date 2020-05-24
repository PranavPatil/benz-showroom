package benz;

import benz.specification;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Main
{
	private JFrame Main;
	public AboutDialog dialog;
	MainPanel mnpanel;
	NewPanel newpanel;
	Box b,newb;
	Container contain;
	JMenuItem purItem,clgItem,exitItem;
	JMenuItem serItem,tabItem;
	JMenuItem listItem,spurItem;
	JMenuItem carItem,cusItem;
    JMenuItem helpItem,aboutItem;

	public Main()
	{
		Main = new JFrame();
		Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main.show();
		Main.setTitle("Main");
		Main.setSize(595,493);

		contain = Main.getContentPane();

		PanelAction listener = new PanelAction();

		JMenuBar menubar = new JMenuBar();
		Main.setJMenuBar(menubar);

		JMenu purmenu = new JMenu("Purchase");
		menubar.add(purmenu);
		JMenu sermenu = new JMenu("Service");
		menubar.add(sermenu);
		JMenu sparemenu = new JMenu("Spares");
		menubar.add(sparemenu);
		JMenu recmenu = new JMenu("Records");
		menubar.add(recmenu);
		JMenu helpmenu = new JMenu("Help");
		menubar.add(helpmenu);

		purItem = purmenu.add("New Car");
		clgItem = purmenu.add("Catalog");
		exitItem = purmenu.add("Exit");

		purItem.addActionListener(listener);
		clgItem.addActionListener(listener);
		exitItem.addActionListener(listener);

		purmenu.addSeparator();


		serItem = sermenu.add("Car Service");
		tabItem = sermenu.add("Service Table");

		serItem.addActionListener(listener);
		tabItem.addActionListener(listener);

		sermenu.addSeparator();

		listItem = sparemenu.add("Available Spares");
		spurItem = sparemenu.add("Spare Purchase");

		listItem.addActionListener(listener);
		spurItem.addActionListener(listener);

		sparemenu.addSeparator();

		carItem = recmenu.add("Customer Records");
		cusItem = recmenu.add("Car Records");

		carItem.addActionListener(listener);
		cusItem.addActionListener(listener);

		recmenu.addSeparator();

		helpItem = helpmenu.add("Help");
		aboutItem = helpmenu.add("About");

		helpItem.addActionListener(listener);
		aboutItem.addActionListener(listener);

		helpmenu.addSeparator();

		mnpanel = new MainPanel();
		contain.add(b,BorderLayout.CENTER);
		b.setVisible(true);

		NewPanel newpanel = new NewPanel();

	}

	class MainPanel extends JPanel
	{
		public MainPanel()
		{
           b = Box.createVerticalBox();
  		   JLabel mainlabel = new JLabel("                  Welcome To Millennium Motors");
		   mainlabel.setFont(new Font("serif",Font.ITALIC,24));
		   b.add(mainlabel);
		   b.add(Box.createVerticalStrut(15));
		   Picpanel defpanel = new Picpanel();
		   b.add(defpanel);
		}
	}

   class NewPanel extends JPanel
   {
   	 public NewPanel()
   	 {

 		newb = Box.createVerticalBox();
	  	String str = "\n\t THE VECHICLES CAN BE SERVICED AS FOLLOWS \t\n\n" +
	  	             "\tSERVICE NO\t      DISTANCE COVERED    \tYEARS \tCHARGES\t\n\n" +
	  	             "\t    1 :   \t           500 KMS         \t1 \t FREE\t\n\n" +
	  	             "\t    2 :   \t          1000 KMS         \t1 \t FREE\t\n\n" +
	  	             "\t    3 :   \t          2000 KMS         \t1 \t FREE\t\n\n" +
	  	             "\t    4 :   \t          5000 KMS         \t2 \t 500\t\n\n" +
	  	             "\t    5 :   \t         10000 KMS         \t2 \t 500\t\n\n" +
	  	             "\t    6 :   \t         20000 KMS         \t2 \t 500\t\n\n" +
	  	             "\t    7 :   \t         30000 KMS         \t3 \t 1000\t\n\n" +
	  	             "\t    8 :   \t         50000 KMS         \t3 \t 1000\t\n\n";

	  	JTextArea text = new JTextArea(str,20,45);
	  	text.setEditable(false);
	  	JButton button = new JButton("OK");
	  	button.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					newb.setVisible(false);
					b.setVisible(true);
				}
			}
		);

		JLabel newlabel = new JLabel("Service Chart");
		newlabel.setFont(new Font("serif",Font.ITALIC,24));
		newb.add(newlabel);
		newb.add(Box.createVerticalStrut(15));

		JPanel newpanel = new JPanel();
		JScrollPane jscroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		newpanel.add(jscroll,BorderLayout.CENTER);
		newb.add(newpanel);
		newb.add(Box.createVerticalStrut(3));
		newb.add(Box.createHorizontalStrut(600));
		newb.add(button);
   	 }
   }

    private class PanelAction implements ActionListener
    {
    	public PanelAction()
    	{
    	}
    	public void actionPerformed(ActionEvent e)
    	{
    		String command = e.getActionCommand();

    		System.out.println(command);

 		 	if(command.equals("New Car"))
 		 	{

 		 	}
 		 	else if(command.equals("Catalog"))
 		 	{

 		 	}
 		 	else if(command.equals("Exit"))
 		 	{
 		 	   System.exit(0);
 		 	}
 		 	else if(command.equals("Car Service"))
 		 	{

 		 	}
 		 	else if(command.equals("Service Table"))
 		 	{
				contain.add(newb,BorderLayout.CENTER);
 		 	 	b.setVisible(false);
 		 	 	newb.setVisible(true);
 		 	}
 		 	else if(command.equals("Available Spares"))
 		 	{

 		 	}
 		 	else if(command.equals("Spare Purchase"))
 		 	{

 		 	}
 		 	else if(command.equals("Customer Records"))
 		 	{

 		 	}

 		 	else if(command.equals("Car Records"))
 		 	{

 		 	}

    		else if(command.equals("Help"))
 		 	{
 		 		/*JLabel help = new JLabel();

 		 	   if (dialog == null)
                  dialog = new AboutDialog(Main,help);
               dialog.show();*/
 		 	}

 		 	else if(command.equals("About"))
 		 	{
 		 	  JLabel about = new JLabel("<HTML><H1><I> Car Showroom Management System</I>"
                                         +"</H1><HR>" + "By" + "<HR>. ->  Pranav Patil </HTML>"); 		 	

 		 	  if (dialog == null)
                  dialog = new AboutDialog(Main,about);
               dialog.show();
 		 	}
    	}
	}



    class Picpanel extends JPanel
    {
     public void paintComponent(Graphics g)
     {
    	super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		Image image = Toolkit.getDefaultToolkit().getImage("car.jpg");
		int imagew = image.getWidth(this);
		int imageh = image.getHeight(this);
		g2.drawImage(image,40,0,imagew,imageh,null);
     }
    }


	public static void main(String args[])
	{
		Main mn = new Main();
	}

   class AboutDialog extends JDialog
   {
    public AboutDialog(JFrame owner,JLabel label)
    {
      super(owner, "About Software", true);
      Container contentPane = getContentPane();

      contentPane.add(label,BorderLayout.CENTER);

      JButton ok = new JButton("Ok");
      ok.addActionListener(new
         ActionListener()
         {
            public void actionPerformed(ActionEvent evt)
            {
               setVisible(false);
            }
         });

      JPanel panel = new JPanel();
      panel.add(ok);
      contentPane.add(panel, BorderLayout.SOUTH);

      setSize(323, 265);
    }
   }

}
