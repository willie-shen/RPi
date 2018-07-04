package GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class createNewUser extends JFrame {

	private JPanel contentPane;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField UserNameField;
	private JTextField FirstNameField;
	private JTextField LastNameField;
	private JTextField EmailField;
	private JCheckBox chckbxVisible;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action Register = new SwingAction_2();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					createNewUser frame = new createNewUser();
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
	public createNewUser() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 397);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JRadioButton rdbtnStudent = new JRadioButton("Student");
		rdbtnStudent.setAction(action_1);
		buttonGroup.add(rdbtnStudent);
		rdbtnStudent.setBounds(55, 25, 90, 23);
		contentPane.add(rdbtnStudent);
		
		JRadioButton rdbtnInstructor = new JRadioButton("Instructor");
		rdbtnInstructor.setAction(action);
		buttonGroup.add(rdbtnInstructor);
		rdbtnInstructor.setBounds(235, 25, 99, 23);
		contentPane.add(rdbtnInstructor);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(112, 65, 80, 16);
		contentPane.add(lblNewLabel);
		
		UserNameField = new JTextField();
		UserNameField.setBounds(204, 60, 130, 26);
		contentPane.add(UserNameField);
		UserNameField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("First Name");
		lblNewLabel_1.setBounds(111, 98, 81, 16);
		contentPane.add(lblNewLabel_1);
		
		FirstNameField = new JTextField();
		FirstNameField.setBounds(204, 93, 130, 26);
		contentPane.add(FirstNameField);
		FirstNameField.setColumns(10);
		
		JLabel lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(112, 136, 66, 16);
		contentPane.add(lblLastName);
		
		LastNameField = new JTextField();
		LastNameField.setBounds(204, 131, 130, 26);
		contentPane.add(LastNameField);
		LastNameField.setColumns(10);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(112, 171, 61, 16);
		contentPane.add(lblEmail);
		
		EmailField = new JTextField();
		EmailField.setBounds(204, 169, 130, 26);
		contentPane.add(EmailField);
		EmailField.setColumns(10);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setAction(Register);
		btnRegister.setBounds(150, 281, 117, 29);
		contentPane.add(btnRegister);
		
		chckbxVisible = new JCheckBox("Visible");
		chckbxVisible.setBounds(139, 207, 128, 23);
		contentPane.add(chckbxVisible);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Instructor");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			chckbxVisible.setEnabled(false);
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Student");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			chckbxVisible.setEnabled(true);
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Register");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
			if(UserNameField.getText().equals("")
				|| FirstNameField.getText().equals("") 
				|| LastNameField.getText().equals("")
				|| EmailField.getText().equals("")) 
			{
				//have an error message pop out
			}
		}
	}
}
