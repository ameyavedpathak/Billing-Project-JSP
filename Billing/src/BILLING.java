import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ItemListener;
import java.text.DecimalFormat;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BILLING extends JFrame {

	private JPanel contentPane;
	private JTextField itemname;
	private JTextField weight;
	private JTextField mortagagename;
	private JTextField amountmortagage;
	private JTextField totalcost1;
	private JTextField currentrate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BILLING frame = new BILLING();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public BILLING() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 605, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblItemname1 = new JLabel("Item Name :");
		lblItemname1.setBounds(49, 41, 87, 14);
		contentPane.add(lblItemname1);
		
		JLabel lblWeight = new JLabel("Weight :");
		lblWeight.setBounds(49, 66, 87, 14);
		contentPane.add(lblWeight);
		
		JLabel lblMortagageItemName = new JLabel("Mortagage Item Name");
		lblMortagageItemName.setBounds(49, 91, 152, 14);
		contentPane.add(lblMortagageItemName);
		
		JLabel lblAmountOfMortage = new JLabel("Amount of Mortage");
		lblAmountOfMortage.setBounds(49, 116, 152, 14);
		contentPane.add(lblAmountOfMortage);
		
		itemname = new JTextField();
		itemname.setBounds(221, 38, 86, 20);
		contentPane.add(itemname);
		itemname.setColumns(10);
		
		weight = new JTextField();
		weight.setBounds(221, 63, 86, 20);
		weight.setColumns(10);
		contentPane.add(weight);
		
		mortagagename = new JTextField();
		mortagagename.setBounds(221, 88, 86, 20);
		mortagagename.setColumns(10);
		contentPane.add(mortagagename);
		
		amountmortagage = new JTextField();
		amountmortagage.setBounds(221, 113, 86, 20);
		amountmortagage.setColumns(10);
		contentPane.add(amountmortagage);
		
		JLabel lblNewLabel_1 = new JLabel("Total Cost :");
		lblNewLabel_1.setBounds(49, 216, 109, 14);
		contentPane.add(lblNewLabel_1);
		
		totalcost1 = new JTextField();
		totalcost1.setEditable(false);
		totalcost1.setBounds(221, 213, 86, 20);
		contentPane.add(totalcost1);
		totalcost1.setColumns(10);
		

		JLabel lblNewLabel = new JLabel("Current Rate");
		lblNewLabel.setBounds(49, 146, 120, 14);
		contentPane.add(lblNewLabel);
		
		currentrate = new JTextField();
		currentrate.setBounds(221, 143, 86, 20);
		contentPane.add(currentrate);
		currentrate.setColumns(10);
		
		JComboBox type = new JComboBox();
		type.setModel(new DefaultComboBoxModel(new String[] {"Gold", "Silver"}));
		type.setBounds(221, 7, 86, 20);
		contentPane.add(type);
		
		JLabel lbltype = new JLabel("Type");
		lbltype.setBounds(43, 10, 46, 14);
		contentPane.add(lbltype);
		
// *******************************************************declaration******************************************************************
		
	
		JButton btnNewButton = new JButton("Calculate");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String w = weight.getText();
			String r = currentrate.getText();
			String m = amountmortagage.getText();
		
			double w1 = Double.parseDouble(w);
			double r1 = Double.parseDouble(r);
			double m1 = Double.parseDouble(m);
			
			double c = w1*r1-m1;
			DecimalFormat dtime = new DecimalFormat("#.#"); 
			c= Double.valueOf(dtime.format(c));
			
			String c2 = Double.toString(c);
			
			totalcost1.setText(c2);
			
			//JOptionPane.showConfirmDialog(null, "Do you want to cotinue shopping");
			
			}
		});
		btnNewButton.setBounds(443, 212, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Continue Shopping");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String w = weight.getText();
				String r = currentrate.getText();
				String m = amountmortagage.getText();
				
				checkout chk = new checkout(w,r,m);
				chk.setVisible(true);
				
				
			}
		});
		btnNewButton_1.setBounds(443, 160, 109, 23);
		contentPane.add(btnNewButton_1);
		

	}
}
