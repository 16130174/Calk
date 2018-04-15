package Base;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class CalkRab extends JFrame {
	
	private JPanel Date;
	private JTextField Name;
	private JTextField Summa;
	private JTextField Srok;
	private JTextField Proc;
	private JTextField SummaKon;
public static String p;
public static double s;
public static double sr;
public static double summa;
	/**
	 * Launch the application.
	 */

	public CalkRab() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 538);
		Date = new JPanel();
		Date.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Date);
		Date.setLayout(null);
		
		JLabel Zagolovok = new JLabel("\u0412\u0432\u0435\u0434\u0438\u0442\u0435 \u0434\u0430\u043D\u044B\u0435 \u043E \u0432\u043A\u043B\u0430\u0434\u0447\u0438\u043A\u0435:");
		Zagolovok.setBounds(10, 11, 185, 24);
		Date.add(Zagolovok);
		
		JLabel NameVvod = new JLabel("\u0424\u0418\u041E");
		NameVvod.setBounds(32, 46, 163, 24);
		Date.add(NameVvod);
		
		Name = new JTextField();
		Name.setText(qw1.CurrentUser.get("test"));
		Name.setBounds(177, 46, 333, 24);
		Date.add(Name);
		Name.setColumns(10);
		
		
		JLabel SummaVvod = new JLabel("\u0421\u0443\u043C\u043C\u0430 \u0432\u043A\u043B\u0430\u0434\u0430, \u0440\u0443\u0431.");
		SummaVvod.setBounds(32, 100, 122, 24);
		Date.add(SummaVvod);
		
		Summa = new JTextField();
		Summa.setText("");
		Summa.setBounds(177, 101, 333, 22);
		Date.add(Summa);
		Summa.setColumns(10);
		Summa.addKeyListener(new KeyAdapter() {
			public void KeyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
				}}});
		
		JLabel SrokVvod = new JLabel("\u0421\u0440\u043E\u043A \u0432\u043B\u043E\u0436\u0435\u043D\u0438\u044F, \u043C\u0435\u0441.");
		SrokVvod.setBounds(32, 156, 122, 24);
		Date.add(SrokVvod);
		
		Srok = new JTextField();
		Srok.setText("");
		Srok.setBounds(177, 156, 333, 24);
		Date.add(Srok);
		Srok.setColumns(10);
		Srok.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		JLabel ProcVvod = new JLabel("\u041F\u0440\u043E\u0446\u0435\u043D\u0442\u0430\u044F \u0441\u0442\u0430\u0432\u043A\u0430, %");
		ProcVvod.setBounds(32, 218, 122, 24);
		Date.add(ProcVvod);
		
		Proc = new JTextField();
		Proc.setText("");
		Proc.setBounds(177, 218, 333, 24);
		Date.add(Proc);
		Proc.setColumns(10);
		Proc.addKeyListener(new KeyAdapter() {
			public void KeyTyped (KeyEvent e) {
				char c = e.getKeyChar();
				if ( (c < '0') || (c > '9') ) {
					e.consume();
			}
		}});
		
		JCheckBox Capitaliz = new JCheckBox("\u0411\u0435\u0437 \u0435\u0436\u0435\u043C\u0435\u0441\u044F\u0447\u043D\u043E\u0439 \u043A\u0430\u043F\u0438\u0442\u0430\u043B\u0438\u0437\u0430\u0446\u0438\u0438");
		Capitaliz.setBounds(256, 291, 254, 23);
		Date.add(Capitaliz);
		
		JButton button = new JButton("\u0412\u044B\u0447\u0438\u0441\u043B\u0438\u0442\u044C");
		button.setForeground(Color.BLACK);
		button.setFont(new Font("Tahoma", Font.PLAIN, 16));
		button.setBounds(177, 354, 163, 40);
		Date.add(button);
		button.addActionListener(new ActionListener () {
			public void actionPerformed (ActionEvent e) {
				double p = Integer.parseInt(Proc.getText());
				double s = Integer.parseInt(Summa.getText());
				double sr = Integer.parseInt(Srok.getText());
				if  (Capitaliz.isSelected()==true) {
					double summa = s+(((s*p*sr)/100)/12);
					SummaKon.setText(String.valueOf(summa));
				}
				else {
					double summaCap = s*Math.pow(1+sr*p/12/100, sr); 
					SummaKon.setText(String.valueOf(summaCap));
				};
			}
		}
				);
		
		JLabel label = new JLabel("\u0418\u0442\u043E\u0433\u043E\u0432\u0430\u044F \u0441\u0443\u043C\u043C\u0430 \u043D\u0430 \u043A\u043E\u043D\u0435\u0446 \u0441\u0440\u043E\u043A\u0430, \u0440\u0443\u0431");
		label.setBounds(32, 435, 210, 36);
		Date.add(label);
		
		SummaKon = new JTextField();
		SummaKon.setBounds(278, 435, 232, 36);
		Date.add(SummaKon);
		SummaKon.setColumns(10);
	}
}
