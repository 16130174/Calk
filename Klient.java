 package Base;

import java.awt.BorderLayout; 
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Klient extends JFrame {

	private JPanel contentPane;
	private JTextField Pro;
	private JTextField textField_3;
	private JTextField Sum;
	private JTextField SumKon;

	/**
	 * Create the frame.
	 */
	public Klient() {
		setTitle("\u0421\u043E\u0441\u0442\u043E\u044F\u043D\u0438\u0435 \u0434\u0435\u043F\u043E\u0437\u0438\u0442\u043D\u043E\u0433\u043E \u0441\u0447\u0435\u0442\u0430");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 510, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel label = new JLabel("\u0412\u0430\u0448\u0430 \u043F\u0440\u043E\u0446\u0435\u043D\u0442\u043D\u0430\u044F \u0441\u0442\u0430\u0432\u043A\u0430 \u043F\u043E \u0432\u043A\u043B\u0430\u0434\u0443 \u0441\u043E\u0441\u0442\u0430\u0432\u043B\u044F\u0435\u0442");
		label.setBounds(25, 268, 291, 29); 
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u0432\u043A\u043B\u0430\u0434\u0430");
		label_1.setBounds(25, 217, 243, 29);
		contentPane.add(label_1);
		
		Pro = new JTextField();
		Pro.setBounds(326, 268, 157, 29);
		contentPane.add(Pro);
		Pro.setColumns(10);
	
		
		JLabel label_3 = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0441\u0432\u043E\u0438 \u0434\u0430\u043D\u043D\u044B\u0435:");
		label_3.setBounds(10, 11, 194, 29);
		contentPane.add(label_3);
		
		JLabel label_4 = new JLabel("\u0424\u0418\u041E");
		label_4.setBounds(25, 51, 111, 29);
		contentPane.add(label_4);
		
		JLabel label_5 = new JLabel("\u041D\u043E\u043C\u0435\u0440 \u0441\u0447\u0435\u0442\u0430");
		label_5.setBounds(267, 54, 119, 22);
		contentPane.add(label_5);
		
		textField_3 = new JTextField();
		textField_3.setBounds(267, 82, 194, 29);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton button = new JButton("\u041F\u043E\u043A\u0430\u0437\u0430\u0442\u044C");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBounds(144, 135, 204, 50);
		contentPane.add(button);
		
		Sum = new JTextField();
		Sum.setColumns(10);
		Sum.setBounds(326, 217, 157, 29);
		contentPane.add(Sum);
		
		JLabel label_6 = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u0432\u043A\u043B\u0430\u0434\u0430 \u0441 \u043F\u0440\u043E\u0446\u0435\u043D\u0442\u0430\u043C\u0438 \u043D\u0430 \u043A\u043E\u043D\u0435\u0446 \u0441\u0440\u043E\u043A\u0430");
		label_6.setBounds(25, 323, 264, 29);
		contentPane.add(label_6);
		
		SumKon = new JTextField();
		SumKon.setColumns(10);
		SumKon.setBounds(326, 323, 157, 29);
		contentPane.add(SumKon);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(25, 82, 171, 29);
		contentPane.add(comboBox);
	}
}
