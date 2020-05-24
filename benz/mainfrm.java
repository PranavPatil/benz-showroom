package benz;

import benz.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
import sun.jdbc.odbc.*;

public class mainfrm
{
	public static String glstrname,glstraddress,glcusid;

	private JFrame Main;
	public dialog Adialog,Hdialog;
	MainPanel mnpanel;
	SerTable sertabpanel;
	SprTable sprtabpanel;
	RecordPanel newpanel;
	CustrecPanel Custrec;
	CarrecPanel Carrec;
	Box b,serbox,sprbox,carbox,Cusrecbox,Carecbox;
	Container contain;
	JMenuItem purItem,clgItem,exitItem;
	JMenuItem serItem,tabItem;
	JMenuItem listItem,spurItem;
	JMenuItem carItem,cusItem;
    JMenuItem helpItem,aboutItem;

	public mainfrm()
	{
		Main = new JFrame();
		Main.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Main.show();
		Main.setTitle("Main");
		Main.setSize(595,528);

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
		clgItem = purmenu.add("Car View");
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

		SerTable sertabpanel = new SerTable();
		SprTable sprtabpanel = new SprTable();
		CarTable cartabpanel = new CarTable();
		 Custrec  = new CustrecPanel();
		 Carrec   = new CarrecPanel();
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

   class SerTable extends JPanel
   {
   	 public SerTable()
   	 {
 		serbox = Box.createVerticalBox();
	  	String str = "\n\t THE VEHICLES CAN BE SERVICED AS FOLLOWS \t\n\n" +
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
					serbox.setVisible(false);
					b.setVisible(true);
				}
			}
		);

		JLabel newlabel = new JLabel("Service Chart");
		newlabel.setFont(new Font("serif",Font.ITALIC,24));
		serbox.add(newlabel);
		serbox.add(Box.createVerticalStrut(15));

		JPanel newpanel = new JPanel();
		JScrollPane jscroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		newpanel.add(jscroll,BorderLayout.CENTER);
		serbox.add(newpanel);
		serbox.add(Box.createVerticalStrut(3));
		serbox.add(Box.createHorizontalStrut(600));
		serbox.add(button);
   	 }
   }

   class SprTable extends JPanel
   {
   	 public SprTable()
   	 {

 		sprbox = Box.createVerticalBox();
	  	String str = "\n   NO\t      NAME    \t\tPRICES \tFITTING CHARGES\t\n\n" +
	  	             "    1 :   \t        BUZZERS         \t100 \t FREE\t\n\n" +
	  	             "    2 :   \t        STEERING GRIP         \t150 \t FREE\t\n\n" +
	  	             "    3 :   \t        FANS           \t300 \t FREE\t\n\n" +
	  	             "    4 :   \t        AIR FILTERS         \t400 \t 100\t\n\n" +
	  	             "    5 :   \t       LUGGAGE STAND         \t400 \t 100\t\n\n" +
	  	             "    6 :   \t       STEREO SPEAKERS         \t500 \t 50\t\n\n" +
	  	             "    7 :   \t       SEAT COVERS         \t500 \t FREE\t\n\n" +
	  	             "    8 :   \t       SILENCER         \t500 \t 50\t\n\n" +
	  	             "    9 :   \t       VECHICLE TOOLKIT         \t700 \t FREE\t\n\n" +
	  	             "   10 :   \t       WIRING HARNESS         \t1000 \t 200\t\n\n" +
	  	             "   11 :   \t       CDI REGULATOR         \t1000 \t 100\t\n\n" +
	  	             "   12 :   \t       MUSIC SYSTEM         \t2000 \t 50\t\n\n" +
	  	             "   13 :   \t       SECURITY ALARMS         \t5000 \t 200\t\n\n" +
	  	             "   14 :   \t       AIR CONDITIONER         \t25000 \t 300\t\n\n";

	  	JTextArea text = new JTextArea(str,20,45);
	  	text.setEditable(false);
	  	JButton button = new JButton("OK");
	  	button.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					sprbox.setVisible(false);
					b.setVisible(true);
				}
			}
		);

		JLabel newlabel = new JLabel("Spare Catalog");
		newlabel.setFont(new Font("serif",Font.ITALIC,24));
		sprbox.add(newlabel);
		sprbox.add(Box.createVerticalStrut(15));

		JPanel newpanel = new JPanel();
		JScrollPane jscroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		newpanel.add(jscroll,BorderLayout.CENTER);
		sprbox.add(newpanel);
		sprbox.add(Box.createVerticalStrut(3));
		sprbox.add(Box.createHorizontalStrut(600));
		sprbox.add(button);
   	 }
   }

   class CarTable extends JPanel
   {
   	 public CarTable()
   	 {
 		carbox = Box.createVerticalBox();
	  	JButton button = new JButton("OK");
	  	button.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					carbox.setVisible(false);
					b.setVisible(true);
				}
			}
		);

		JLabel newlabel = new JLabel("Cars Available");
		newlabel.setFont(new Font("serif",Font.ITALIC,24));
		carbox.add(newlabel);
		carbox.add(Box.createVerticalStrut(15));

	    Ppanel picture = new Ppanel();
	  	carbox.add(picture);
		carbox.add(Box.createVerticalStrut(3));
		carbox.add(button);
   	 }
   	 class Ppanel extends JPanel
   	 {
   	  JComboBox Combo;
	  public Ppanel()
	  {
	    Combo = new JComboBox();
	    Combo.setEditable(true);
	  	Combo.addItem("FORD ICON");
	  	Combo.addItem("FERRARI");
	  	Combo.addItem("LANCER");
	  	Combo.addItem("MC LAREN");
	  	Combo.addItem("MERCEDES BENZ");
	  	Combo.addItem("ESTEEM");
	  	Combo.addActionListener
	  	(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent a)
				{
 		  			repaint();
				}
			}
		);
		add(Combo);
	  }
   	  public void paintComponent(Graphics g)
      {
    	super.paintComponent(g);
		Graphics2D g2 = (Graphics2D) g;
		String str = (String)Combo.getSelectedItem();
		Image image = Toolkit.getDefaultToolkit().getImage(str + "1.jpg");
  	    int imagew = image.getWidth(this);
    	int imageh = image.getHeight(this);
		g2.drawImage(image,60,50,imagew,imageh,null);
      }
   	 }
   }


   class CustrecPanel extends JPanel
   {
   	 public CustrecPanel()
   	 {
  		Cusrecbox = Box.createVerticalBox();

	  	JButton button = new JButton("OK");
	  	button.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					Cusrecbox.setVisible(false);
					b.setVisible(true);
				}
			}
		);

		JLabel newlabel = new JLabel("Customer Records");
		newlabel.setFont(new Font("serif",Font.ITALIC,24));
		Cusrecbox.add(newlabel);
		Cusrecbox.add(Box.createVerticalStrut(15));

		RecordPanel newpanel = new RecordPanel("customer");
		//JScrollPane jscroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//newpanel.add(jscroll,BorderLayout.CENTER);
		Cusrecbox.add(newpanel);
		Cusrecbox.add(Box.createVerticalStrut(3));
		Cusrecbox.add(Box.createHorizontalStrut(600));
		Cusrecbox.add(button);
   	 }
   }

  class CarrecPanel extends JPanel
   {
   	 public CarrecPanel()
   	 {
  		Carecbox = Box.createVerticalBox();

	  	JButton button = new JButton("OK");
	  	button.addActionListener
		(
			new ActionListener()
			{
				public void actionPerformed(ActionEvent ae)
				{
					Carecbox.setVisible(false);
					b.setVisible(true);
				}
			}
		);

		JLabel newlabel = new JLabel("Car Records");
		newlabel.setFont(new Font("serif",Font.ITALIC,24));
		Carecbox.add(newlabel);
		Carecbox.add(Box.createVerticalStrut(15));

		RecordPanel newpanel = new RecordPanel("carrecord");
		//JScrollPane jscroll = new JScrollPane(text,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		//newpanel.add(jscroll,BorderLayout.CENTER);
		Carecbox.add(newpanel);
		Carecbox.add(Box.createVerticalStrut(3));
		Carecbox.add(Box.createHorizontalStrut(600));
		Carecbox.add(button);
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
// 		 	  benz.Purchase frm = new benz.Purchase();
			  Main.show(false);
 		 	}
 		 	else if(command.equals("Car View"))
 		 	{
				contain.add(carbox,BorderLayout.CENTER);
 		 	 	b.setVisible(false);
 		 	 	sprbox.setVisible(false);
 		 	 	serbox.setVisible(false);
 		 	 	Cusrecbox.setVisible(false);
 		 	 	Carecbox.setVisible(false);
 		 	 	carbox.setVisible(true);
 		 	}
 		 	else if(command.equals("Exit"))
 		 	{
 		 	   System.exit(0);
 		 	}
 		 	else if(command.equals("Car Service"))
 		 	{
 		 	  benz.Services frm = new benz.Services();
			  Main.show(false);
 		 	}
 		 	else if(command.equals("Service Table"))
 		 	{
				contain.add(serbox,BorderLayout.CENTER);
 		 	 	b.setVisible(false);
 		 	 	sprbox.setVisible(false);
 		 	 	carbox.setVisible(false);
 		 	 	Cusrecbox.setVisible(false);
 		 	 	Carecbox.setVisible(false);
 		 	 	serbox.setVisible(true);
 		 	}
 		 	else if(command.equals("Available Spares"))
 		 	{
 		 	    contain.add(sprbox,BorderLayout.CENTER);
 		 	 	b.setVisible(false);
 		 	 	serbox.setVisible(false);
 		 	 	carbox.setVisible(false);
 		 	 	Cusrecbox.setVisible(false);
 		 	 	Carecbox.setVisible(false);
 		 	 	sprbox.setVisible(true);
 		 	}
 		 	else if(command.equals("Spare Purchase"))
 		 	{

 		 	}
 		 	else if(command.equals("Customer Records"))
 		 	{
				contain.add(Cusrecbox,BorderLayout.CENTER);
 		 	 	b.setVisible(false);
 		 	 	sprbox.setVisible(false);
 		 	 	carbox.setVisible(false);
 		 	 	serbox.setVisible(false);
 		 	 	Carecbox.setVisible(false);
 		 	 	Cusrecbox.setVisible(true);
 		 	}

 		 	else if(command.equals("Car Records"))
 		 	{
				contain.add(Carecbox,BorderLayout.CENTER);
 		 	 	b.setVisible(false);
 		 	 	sprbox.setVisible(false);
 		 	 	carbox.setVisible(false);
 		 	 	serbox.setVisible(false);
 		 	 	Cusrecbox.setVisible(false);
 		 	 	Carecbox.setVisible(true);
 		 	}

    		else if(command.equals("Help"))
 		 	{
 		 		JLabel help = new JLabel("<HTML><H1><I>.      Help   </I>"
                                         +"</H1><HR>" + "" + "<HR>. 1 ->  Click 'Car View to dynamically view all the Cars."
                                         + "<HR>. 2 -> Click 'New Car' to Purchase a Car. "
                                         + "<HR>. 3 -> Type 000 as Customer id if you visit for first time. "
                                         +"<HR>. 4 -> Rates of Cars may change without any prior     Infomation.    </HTML>");

 		 	   if (Hdialog == null)
                  Hdialog = new dialog(Main,help);
               Hdialog.show();
 		 	}

 		 	else if(command.equals("About"))
 		 	{
 		 	  JLabel about = new JLabel("<HTML><H1><I> Car Showroom Management System</I>"
                                         +"</H1><HR>" + "By" + "<HR>. ->  Pranav Patil </HTML>"); 		 	

 		 	  if (Adialog == null)
                  Adialog = new dialog(Main,about);
               Adialog.show();
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
		mainfrm mn = new mainfrm();
	}

   class dialog extends JDialog
   {
    public dialog(JFrame owner,JLabel label)
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
/*-----------------------------------------------------------------------------------------*/
/*                                    RECORD PANEL          							   */

 class RecordPanel extends JPanel
 {
  public RecordPanel(String str)
  {
    try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	}
	catch (Exception ex)
	{
	    System.out.println("JdbcOdbcDriver Exception !!");
	    System.out.println (ex);
	}
  	try
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		String url= "jdbc:odbc:diws";
		Connection con = DriverManager.getConnection(url);
		Statement	stmt=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet res=stmt.executeQuery("select * from " + str);

		ResultSetMetaData	rmd=res.getMetaData();
		String columname[]=new String[rmd.getColumnCount()];

		for (int i = 0; i<rmd.getColumnCount(); i++)
		{
				columname[i]=rmd.getColumnLabel(i+1);
	    }

	    int count=0;
	    while(res.next())	count++;
	    res.beforeFirst();

	    String[][]	data=new String[count][rmd.getColumnCount()];

	    count=0;
	    while(res.next())
	    {
	    	for (int i = 0; i<rmd.getColumnCount(); i++)
	    	{
	    		data[count][i]=res.getString(i+1);
		    }
		    count++;
	    }

	    JTable table=new JTable(data,columname);
	    table.enable(true);
	    add(new JScrollPane(table),
         BorderLayout.CENTER);
	}
	catch (Exception ex)
	{
			System.out.println("Connection Exception !!");
		  	System.out.println(ex);
	}
   }
 }
}
