package Base;
import javax.swing.*;

public class MainFrame extends JFrame {

    public MainFrame() {
        initComponents();
    }

    private void initComponents() {
        setTitle("Авторизация");
        setSize(480, 200);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JButton button = new JButton("ТУДА");
        button.setVisible(true);
        button.setLocation(10, 58);
        button.setSize(215, 50);
        button.addActionListener(e -> {
            new WorkerAuthFrame();
            hide();
        });
        getContentPane().add(button);

        JButton button2 = new JButton("СЮДА");
        button2.setVisible(true);
        button2.setLocation(239, 58);
        button2.setSize(215, 50);
        button2.addActionListener(e -> {
            new ClientInfoFrame();
            hide();
        });
        getContentPane().add(button2);

        getContentPane().setLayout(null);

        JLabel label = new JLabel();
        label.setBounds(0, 0, 0, 0);
        getContentPane().add(label);

        JLabel label_1 = new JLabel();
        label_1.setBounds(0, 0, 464, 161);
        getContentPane().add(label_1);

        JLabel label_2 = new JLabel("Авторизация для работника банка:");
        label_2.setBounds(10, 11, 215, 30);
        getContentPane().add(label_2);

        JLabel lblNewLabel = new JLabel("Авторизация для клиента банка:");
        lblNewLabel.setBounds(239, 15, 215, 22);
        getContentPane().add(lblNewLabel);

        show();
    }
}