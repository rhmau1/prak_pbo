package jobsheet11;

import javax.swing.JWindow;

public class SimpleWindow extends JWindow {
    SimpleWindow() {
        super();
        setBounds(250, 225, 300, 150);
    }

    public static void main(String[] args) {
        SimpleWindow sw = new SimpleWindow();
        sw.setVisible(true);
    }
}
