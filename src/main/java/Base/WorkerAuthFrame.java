package Base;

import javax.swing.border.EmptyBorder;
import java.awt.*;
import javax.swing.*;
/** 
* Подключаем необходимые бибилиотеки
*/

public class WorkerAuthFrame extends JFrame {

    private JPanel contentPane;
    private JPasswordField txtPassword;
    private JTextField txtUsername;
    public WorkerAuthFrame() {
        setTitle("Вход в систему");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(219, 138, 170, 32);
        contentPane.add(txtPassword);

        JButton button = new JButton("Вход");
        button.addActionListener(e -> {
            try {
                Main.CurrentUser = UserManagerOffline.SignIn(new String[]{txtUsername.getText(), txtPassword.getText()});
                new CalcFrame();
                hide();
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(),"Oops", JOptionPane.ERROR_MESSAGE);
            }
        });

        button.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        button.setBounds(108, 202, 188, 48);
        contentPane.add(button);

        JLabel lblUsername = new JLabel("Логин");
        lblUsername.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        lblUsername.setBounds(43, 47, 119, 48);
        contentPane.add(lblUsername);

        JLabel lblPassword = new JLabel("Пароль");
        lblPassword.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        lblPassword.setBounds(43, 129, 119, 39);
        contentPane.add(lblPassword);

        txtUsername = new JTextField();
        txtUsername.setBounds(219, 61, 170, 32);
        contentPane.add(txtUsername);
        txtUsername.setColumns(10);

        show();
    }
}