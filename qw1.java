package Base;
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
    public static User CurrentUser;
 
   private void initComponents() {
	
      viewForm = new JFrame("Меню"); //Задаем название формы
      viewForm.setTitle("\u0410\u0432\u0442\u043E\u0440\u0438\u0437\u0430\u0446\u0438\u044F"); //Устанавливаем заголовок формы
      viewForm.setSize(480, 200); //Задаем размеры формы
      viewForm.setVisible(true); //Делаем форму видимой 
      viewForm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Определяем действие, которое необходимо выполнить при "выходе из программы"
      
 
      JButton button = new JButton("Работник банка"); //Задаем название кнопки
      button.setVisible(true); //Делеаем кнопку видимой
      button.setLocation(10, 58); //Задаем расположение кнопки
      button.setSize(215, 50); //Задаем размеры кнопки
      button.addActionListener(new ActionListener() { //Добавляем на кнопку слушателя
    	  
         public void actionPerformed(ActionEvent e) {

             panel.dispose(); //Закрываем форму Меню
             new log().show(); //Открываем форму авторизации    
     }
  
      });
      JButton button2 = new JButton("Клиент банка"); // Задаем название кнопки
      button2.setVisible(true); //Делеаем кнопку видимой
      button2.setLocation(239, 58); //Задаем расположение кнопки
      button2.setSize(215, 50); //Задаем размеры кнопки
      button2.addActionListener(new ActionListener() { //Добавляем на кнопку слушателя

		public void actionPerformed(ActionEvent e) {
		
			 panel.dispose(); //Закрываем форму Меню
			 new Klient().show(); //Открываем форму авторизации
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