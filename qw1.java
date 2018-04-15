package Kalc;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.*;
 
public class qw1 extends JFrame {
	 JFrame panel = new JFrame();
   public qw1() { 
      initComponents(); 
   }
   public JFrame viewForm;
 
   private void initComponents() {
	 
      viewForm = new JFrame("");
      viewForm.setTitle("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F");
      viewForm.setSize(480, 200);
      viewForm.setVisible(true);
      viewForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
 
      JButton button = new JButton("Работник банка");
      button.setVisible(true);
      button.setLocation(10, 58);
      button.setSize(215, 50);
      button.addActionListener(new ActionListener() {
    	  
         public void actionPerformed(ActionEvent e) {
        	 
             panel.dispose();
             new qw_().show();
             
     }
 
      });
      JButton button2 = new JButton("Клиент банка");
      button2.setVisible(true);
      button2.setLocation(239, 58);
      button2.setSize(215, 50);
      button2.addActionListener(new ActionListener() {

		public void actionPerformed(ActionEvent e) {
		
			 panel.dispose();
			 new Klient().show();
		}
 
        
           
      });
      viewForm.getContentPane().setLayout(null);
      viewForm.getContentPane().add(button);
      JLabel label = new JLabel();
      label.setBounds(0, 0, 0, 0);
      viewForm.getContentPane().add(label);
      viewForm.getContentPane().add(button2);
      JLabel label_1 = new JLabel();
      label_1.setBounds(0, 0, 464, 161);
      viewForm.getContentPane().add(label_1);
      
      JLabel label_2 = new JLabel("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F \u0434\u043B\u044F \u0440\u0430\u0431\u043E\u0442\u043D\u0438\u043A\u0430 \u0431\u0430\u043D\u043A\u0430:");
      label_2.setBounds(10, 11, 215, 30);
      viewForm.getContentPane().add(label_2);
      
      JLabel lblNewLabel = new JLabel("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F \u0434\u043B\u044F \u043A\u043B\u0438\u0435\u043D\u0442\u0430 \u0431\u0430\u043D\u043A\u0430:");
      lblNewLabel.setBounds(239, 15, 215, 22);
      viewForm.getContentPane().add(lblNewLabel);
      
   } 
 
   public void actionPerformed(ActionEvent action) {
   }
 
   public static void main(String[] args) {
      SwingUtilities.invokeLater(new Runnable() {
         public void run() {
            new qw1();
         }
      });
   }
}