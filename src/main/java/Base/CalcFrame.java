package Base;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalcFrame extends JFrame {

    private JPanel Date;
    private JTextField Name;
    private JTextField Summa;
    private JTextField Srok;
    private JTextField Proc;
    private JTextField SummaKon;

    public CalcFrame() {
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(100, 100, 547, 538);

        Date = new JPanel();
        Date.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(Date);
        Date.setLayout(null);

        JLabel Zagolovok = new JLabel("Введите даные о вкладчике:");
        Zagolovok.setBounds(10, 11, 185, 24);
        Date.add(Zagolovok);

        JLabel NameVvod = new JLabel("ФИО");
        NameVvod.setBounds(32, 46, 163, 24);
        Date.add(NameVvod);

        Name = new JTextField();
        Name.setText(Main.CurrentUser.get("SomeData"));       //Profile Data usage example
        Name.setBounds(177, 46, 333, 24);
        Name.setColumns(10);
        Date.add(Name);

        JLabel SummaVvod = new JLabel("Сумма вклада, руб.");
        SummaVvod.setBounds(32, 100, 122, 24);
        Date.add(SummaVvod);

        Summa = new JTextField();
        Summa.setText("");
        Summa.setBounds(177, 101, 333, 22);
        Summa.setColumns(10);
        Summa.addKeyListener(new KeyAdapter() {
            public void KeyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if ( (c < '0') || (c > '9') ) {
                    e.consume();
                }
            }
        });
        Date.add(Summa);

        JLabel SrokVvod = new JLabel("Срок вложения, мес.");
        SrokVvod.setBounds(32, 156, 122, 24);
        Date.add(SrokVvod);

        Srok = new JTextField();
        Srok.setText("");
        Srok.setBounds(177, 156, 333, 24);
        Srok.setColumns(10);
        Srok.addKeyListener(new KeyAdapter() {
            public void KeyTyped (KeyEvent e) {
                char c = e.getKeyChar();
                if ( (c < '0') || (c > '9') ) {
                    e.consume();
                }
            }
        });
        Date.add(Srok);

        JLabel ProcVvod = new JLabel("Процентая ставка, %");
        ProcVvod.setBounds(32, 218, 122, 24);
        Date.add(ProcVvod);

        Proc = new JTextField();
        Proc.setText("");
        Proc.setBounds(177, 218, 333, 24);
        Proc.setColumns(10);
        Proc.addKeyListener(new KeyAdapter() {
            public void KeyTyped (KeyEvent e) {
                char c = e.getKeyChar();
                if ( (c < '0') || (c > '9') ) {
                    e.consume();
                }
            }
        });
        Date.add(Proc);

        JCheckBox Capitalize = new JCheckBox("Ежемесячная капитализация");
        Capitalize.setBounds(256, 291, 254, 23);
        Date.add(Capitalize);

        JButton button = new JButton("Вычислить");
        button.setForeground(Color.BLACK);
        button.setFont(new Font("Tahoma", Font.PLAIN, 16));
        button.setBounds(177, 354, 163, 40);
        button.addActionListener(e -> {
            if (Capitalize.isSelected()) {
                SummaKon.setText(Calculation.sumWithCapitalize(Proc.getText(), Summa.getText(), Srok.getText()));
            }
            else {
                SummaKon.setText(Calculation.sumWithoutCapitalize(Proc.getText(), Summa.getText(), Srok.getText()));
            }
        });
        Date.add(button);

        JLabel label = new JLabel("Итоговая сумма на конец срока, руб");
        label.setBounds(32, 435, 210, 36);
        Date.add(label);

        SummaKon = new JTextField();
        SummaKon.setBounds(278, 435, 232, 36);
        SummaKon.setColumns(10);
        Date.add(SummaKon);

        show();
    }
}