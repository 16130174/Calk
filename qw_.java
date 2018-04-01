package Kalc;
import java.awt.EventQueue;
import java.lang.Math;
import javax.swing.JFrame; 
import javax.swing.JEditorPane;
import java.awt.BorderLayout;
import javax.swing.JButton;
import java.awt.event.*;
import javax.swing.SwingConstants;
import java.awt.TextArea;
import javax.swing.*;
import java.awt.Color;
import java.awt.Font;
public class qw_ extends JFrame {
private JFrame frame;
private JTextField summa;
private JTextField proc;
private JTextField textField_2;
private JTextField srok;
private JLabel lblNewLabel_3;
private JCheckBox chek;
// «апуск приложени€  
public static void main(String[] args) {
EventQueue.invokeLater(new Runnable() {
public void run() {
try { 
qw_ window = new qw_();
window.frame.setVisible(true);
} catch (Exception e) { 
e.printStackTrace();
}
} 
}); 
}
//—оздаетс€ приложение  
 public qw_() {
initialize(); 
}
//»нициализаци€ содержимое фрейма.
private void initialize() {
frame = new JFrame();
frame.setTitle("\u0414\u0435\u043F\u043E\u0437\u0438\u0442\u043D\u044B\u0439 \u043A\u0430\u043B\u044C\u043A\u0443\u043B\u044F\u0442\u043E\u0440");
frame.setBounds(100, 100, 614, 520);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.getContentPane().setLayout(null);
summa = new JTextField(); // объ€вл€ем пол€ дл€ ввода
summa.setFont(new Font("Tahoma", Font.PLAIN, 14));
summa.setBounds(189, 108, 173, 20);
frame.getContentPane().add(summa);
summa.setColumns(10);
summa.addKeyListener(new KeyAdapter() {//добавление слушател€ на поле дл€ ввода
public void keyTyped(KeyEvent e) {
char c = e.getKeyChar();
if ( ((c < '0') || (c > '9'))) {
e.consume(); // запрет ввода символов
}
}
});
proc = new JTextField();
proc.setFont(new Font("Tahoma", Font.PLAIN, 14));
proc.setBounds(189, 229, 173, 20);
frame.getContentPane().add(proc);
proc.setColumns(10);
proc.addKeyListener(new KeyAdapter() {//добавление слушател€ на поле дл€ввода
public void keyTyped(KeyEvent e) {
char c = e.getKeyChar();
if ( ((c < '0') || (c > '9'))) {
e.consume(); // запрет ввода символов
}
}
});
JLabel lblNewLabel = new JLabel("");
lblNewLabel.setBounds(133, 123, 46, 14);
frame.getContentPane().add(lblNewLabel);

JButton btnNewButton = new JButton("\u0412\u044B\u0447\u0438\u0441\u043B\u0438\u0442\u044C");
btnNewButton.setBackground(Color.CYAN);
btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
btnNewButton.setForeground(Color.BLACK);
btnNewButton.addActionListener(new ActionListener() {
 
public void actionPerformed(ActionEvent arg0) {
double p = Integer.parseInt(proc.getText());
double t = Integer.parseInt(summa.getText());
int sr = Integer.parseInt(srok.getText());
if (chek.isSelected()==true){
double s=t+(((t*p*sr)/100)/12); //формула дл€ вычислени€ без ежемес€чной капитализации
textField_2.setText(String.valueOf(s));
}
else
{
double s1=t*Math.pow (1+sr*p/12/100,sr);//формула дл€ вычислени€ с ежемес€чной капитализацией
textField_2.setText(String.valueOf(s1));
};
 }
});
btnNewButton.setBounds(204, 344, 158, 37);
frame.getContentPane().add(btnNewButton);
textField_2 = new JTextField();
textField_2.setFont(new Font("Tahoma", Font.PLAIN, 14)); //форматирование текста в поле ввода
textField_2.setBounds(345, 440, 174, 22);
frame.getContentPane().add(textField_2);
textField_2.setColumns(10);
srok = new JTextField();
srok.setFont(new Font("Tahoma", Font.PLAIN, 14));
srok.setBounds(189, 167, 173, 20);
frame.getContentPane().add(srok);
srok.setColumns(10);
