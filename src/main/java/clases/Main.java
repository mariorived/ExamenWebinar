package clasesl;

import mainView.MainView;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Main {

    public static void main(final String[] args) throws Exception{
        final JFrame window = new JFrame("Home Page");
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                MainView.main(args);
            }
        });
    }
}

