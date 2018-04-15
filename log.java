package Base;

import javax.swing.border.EmptyBorder;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.*;
import javax.swing.*;
// ?????????? ??????????? ?????????? //

public class log extends JFrame {

	private JPanel contentPane;
	private JPasswordField txtPassword;
	private JTextField txtUsername;

	/**
	 * Create the frame.
	 */
	public log() {
		setTitle("\u0412\u0445\u043E\u0434 \u0432 \u0441\u0438\u0441\u0442\u0435\u043C\u0443");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(219, 138, 170, 32);
		contentPane.add(txtPassword);
		
		JButton button = new JButton("\u0412\u0445\u043E\u0434");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String pass = txtPassword.getText();
				String username = txtUsername.getText();
				try {
					qw1.CurrentUser = UserManagerOffline.SignIn(new String[]{"username", username, "password", pass});
					new CalkRab().show();
				}
				catch (Exception ex){
					JOptionPane.showMessageDialog(null, "Неверные данные","Oops", JOptionPane.ERROR_MESSAGE);
				
				}
			}
		});
		button.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		button.setBounds(108, 202, 188, 48);
		contentPane.add(button);
		
		JLabel lblUsername = new JLabel("\u041B\u043E\u0433\u0438\u043D");
		lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblUsername.setBounds(43, 47, 119, 48);
		contentPane.add(lblUsername);
		
		JLabel lblPassword = new JLabel("\u041F\u0430\u0440\u043E\u043B\u044C");
		lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
		lblPassword.setBounds(43, 129, 119, 39);
		contentPane.add(lblPassword); 
		
		txtUsername = new JTextField();
		txtUsername.setBounds(219, 61, 170, 32);
		contentPane.add(txtUsername);
		txtUsername.setColumns(10);
		

	}
}
