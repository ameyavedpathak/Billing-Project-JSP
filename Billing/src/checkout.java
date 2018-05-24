import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JScrollBar;
import javax.swing.JButton;

public class checkout extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private JButton btnCheckout;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					checkout frame = new checkout(null,null,null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @param m 
	 * @param r 
	 * @param w 
	 */
	public checkout(String w, String r, String m) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 709, 365);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 42, 505, 166);
		contentPane.add(scrollPane);
		
		table = new JTable();
		scrollPane.setViewportView(table);
		
		DefaultTableModel dt= new DefaultTableModel();
		
		String header[] = new String[]{"Item Name", "Weight", "Mortagae Item", "Mortagage Amount", "Current Rate"};
		dt.setColumnIdentifiers(header);
		table.setModel(dt);
		
		
		
		btnNewButton = new JButton("Continue Shopping");
		btnNewButton.setBounds(539, 49, 144, 23);
		contentPane.add(btnNewButton);
		
		btnNewButton_1 = new JButton("Remove Item");
		btnNewButton_1.setBounds(539, 83, 144, 23);
		contentPane.add(btnNewButton_1);
		
		btnCheckout = new JButton("Checkout");
		btnCheckout.setBounds(539, 185, 144, 23);
		contentPane.add(btnCheckout);
	}
}
