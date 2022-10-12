import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import javax.swing.JLabel;

public class addNewStudent_form {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void addnewstudent_form(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addNewStudent_form window = new addNewStudent_form();
					window.frame.setVisible(true);
					window.frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public addNewStudent_form() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setUndecorated(true);
		frame.getContentPane().setBackground(new Color(33, 37, 41));
		frame.setBackground(new Color(33, 37, 41));
		frame.setResizable(false);
		frame.setBounds(100, 100, 731, 430);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 214, 408);
		frame.getContentPane().add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JList list_1 = new JList();
		list_1.setBounds(299, 11, 422, 114);
		frame.getContentPane().add(list_1);
		
		JButton btnAdd = new JButton(">");
		btnAdd.setBounds(232, 30, 57, 23);
		frame.getContentPane().add(btnAdd);
		
		JButton btnRemove = new JButton("<");
		btnRemove.setBounds(232, 64, 57, 23);
		frame.getContentPane().add(btnRemove);
		
		JButton btnNewButton = new JButton("GENERATE ID");
		btnNewButton.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		btnNewButton.setBounds(299, 136, 108, 23);
		frame.getContentPane().add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(414, 137, 86, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(299, 208, 201, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(520, 208, 201, 20);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(299, 258, 201, 20);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(520, 258, 201, 20);
		frame.getContentPane().add(textField_4);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 11));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Male", "Female"}));
		comboBox.setBounds(426, 309, 74, 22);
		frame.getContentPane().add(comboBox);
		
		JLabel lblFirstName = new JLabel("First Name");
		lblFirstName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblFirstName.setForeground(new Color(248, 249, 250));
		lblFirstName.setBounds(299, 190, 86, 14);
		frame.getContentPane().add(lblFirstName);
		
		JLabel lblPhoneNumber = new JLabel("Phone Number");
		lblPhoneNumber.setForeground(new Color(248, 249, 250));
		lblPhoneNumber.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblPhoneNumber.setBounds(299, 239, 86, 14);
		frame.getContentPane().add(lblPhoneNumber);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setForeground(new Color(248, 249, 250));
		lblLastName.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblLastName.setBounds(520, 187, 86, 14);
		frame.getContentPane().add(lblLastName);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setForeground(new Color(248, 249, 250));
		lblAddress.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblAddress.setBounds(520, 239, 86, 14);
		frame.getContentPane().add(lblAddress);
		
		JLabel lblSex = new JLabel("Sex", SwingConstants.CENTER);
		lblSex.setForeground(new Color(248, 249, 250));
		lblSex.setFont(new Font("Yu Gothic Medium", Font.PLAIN, 12));
		lblSex.setBounds(359, 313, 57, 14);
		frame.getContentPane().add(lblSex);
	}
}