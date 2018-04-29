package Base;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.Font;

public class ClientInfoFrame extends JFrame {

    private JPanel contentPane;
    private JTextField Pro;
    private JTextField textField_3;
    private JTextField Sum;
    private JTextField SumKon;

    public ClientInfoFrame() {
        setTitle("Состояние депозитного счета");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 510, 424);

        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel label = new JLabel("Ваша процентная ставка по вкладу составляет");
        label.setBounds(25, 268, 291, 29);
        contentPane.add(label);

        JLabel label_1 = new JLabel("Сумма вклада");
        label_1.setBounds(25, 217, 243, 29);
        contentPane.add(label_1);

        Pro = new JTextField();
        Pro.setBounds(326, 268, 157, 29);
        Pro.setColumns(10);
        contentPane.add(Pro);

        JLabel label_3 = new JLabel("Введите свои данные:");
        label_3.setBounds(10, 11, 194, 29);
        contentPane.add(label_3);

        JLabel label_4 = new JLabel("ФИО");
        label_4.setBounds(25, 51, 111, 29);
        contentPane.add(label_4);

        JLabel label_5 = new JLabel("Номер счета");
        label_5.setBounds(267, 54, 119, 22);
        contentPane.add(label_5);

        textField_3 = new JTextField();
        textField_3.setBounds(267, 82, 194, 29);
        contentPane.add(textField_3);
        textField_3.setColumns(10);

        JButton button = new JButton("Показать");
        button.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button.setBounds(144, 135, 204, 50);
        button.addActionListener(e -> {
            ///////////////////////////WHAT DO YOU WANT TO SHOW HERE???////////////////////////////////////////
        });
        contentPane.add(button);

        Sum = new JTextField();
        Sum.setColumns(10);
        Sum.setBounds(326, 217, 157, 29);
        contentPane.add(Sum);

        JLabel label_6 = new JLabel("Сумма вклада с процентами на конец срока");
        label_6.setBounds(25, 323, 264, 29);
        contentPane.add(label_6);

        SumKon = new JTextField();
        SumKon.setColumns(10);
        SumKon.setBounds(326, 323, 157, 29);
        contentPane.add(SumKon);

        JComboBox comboBox = new JComboBox();
        comboBox.setBounds(25, 82, 171, 29);
        contentPane.add(comboBox);

        show();
    }
}