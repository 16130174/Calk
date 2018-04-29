package Base;

import javax.swing.*;

public class Main {

    public static User CurrentUser;

    public static void main(String[] args) {
        SwingUtilities.invokeLater(MainFrame::new);
    }
}
