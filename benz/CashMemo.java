package benz;
import benz.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CashMemo
{
	cashframe frm;
	public static void main(String[] args)
	{
		cashframe frm = new cashframe();
		frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frm.show();
	}
}

class cashframe extends JFrame
{
	private JTextField name;
	private JTextField Address;
	private JTextField CarModel;
	private JTextField CusID;
	private JTextField EngineNo;
	private JTextField OnRoadPrice;
	private JTextField InsCharges;
	private JTextField RtoCharges;
	private JTextField SaleTax;
	private JTextField Total;
	
	private JButton btnDone;
	private JButton btnBack;
	
	public cashframe()
	{
		setTitle("Cash-Memo");
		setSize(500,500);
				
		Container contain = getContentPane();
		contain.setLayout(new BorderLayout());
		//setBackground(Color.pink);
		
		JLabel label = new JLabel("CASH-MEMO!");
		label.setFont(new Font("serif",Font.ITALIC,24));
		contain.add(label,BorderLayout.NORTH);
		
		
		JPanel panel = new JPanel();
		
		panel.setLayout(new GridLayout(11,2,10,10));
		panel.add( new JLabel("Name:"));
		name=new JTextField(15);
		name.setText(benz.mainfrm.glstrname);
		name.setEditable(false);
		panel.add(name);
		
		panel.add( new JLabel("Address:"));
		Address=new JTextField(2);
		Address.setText(benz.mainfrm.glstraddress);
		Address.setEditable(false);
		panel.add(Address);	
		
		panel.add( new JLabel("Customer ID:"));
		CusID=new JTextField(2);
		CusID.setText(benz.mainfrm.glcusid);
		CusID.setEditable(false);
		panel.add(CusID);			
		
		panel.add( new JLabel("CarModel:"));
		CarModel=new JTextField(6);
		CarModel.setEditable(false);
		panel.add(CarModel);
		
		panel.add( new JLabel("EngineNo:"));
		EngineNo=new JTextField(2);
		EngineNo.setEditable(false);
		panel.add(EngineNo);
		
		panel.add( new JLabel("Price:"));
		OnRoadPrice=new JTextField(2);
		OnRoadPrice.setEditable(false);
		panel.add(OnRoadPrice);
		
		panel.add( new JLabel("InsCharges:"));
		InsCharges=new JTextField(5);
		InsCharges.setText("Rs.     34567/-");
		InsCharges.setEditable(false);
		panel.add(InsCharges);
		
		panel.add( new JLabel("RtoCharges:"));
		RtoCharges=new JTextField(5);
		RtoCharges.setText("Rs.      6754/-");
		RtoCharges.setEditable(false);
		panel.add(RtoCharges);
		
		panel.add( new JLabel("SaleTax:"));
		SaleTax=new JTextField(4);
		SaleTax.setText("             ---  5% ---");
		SaleTax.setEditable(false);
		panel.add(SaleTax);
		
		panel.add( new JLabel("On Road Price:"));
		Total=new JTextField(5);
		Total.setEditable(false);
		panel.add(Total);
		
 		btnBack= new JButton("Back<<!");panel.add(btnBack); 
 		btnBack.addActionListener(new 
 		ActionListener()
 		{
 			public void actionPerformed(ActionEvent ae)
 			{
 					benz.specification frm = new benz.specification();
					//cashframe.show(false);					
					//cashframe.hide();
 			}
 		});
 		btnDone= new JButton("Done!!");panel.add(btnDone);
			
		contain.add(panel,BorderLayout.CENTER);
	}
}