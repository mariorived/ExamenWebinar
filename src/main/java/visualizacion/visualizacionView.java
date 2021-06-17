package visualizacion;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class visualizacionView {
    private JFrame frmViewObjets;

    public static void main(ArrayList<Object> clases) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    visualizacionView window = new visualizacionView(clases);
                    window.frmViewObjets.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public visualizacionView(ArrayList<Object> clases) {
        initialize(clases);
    }

    private void initialize(ArrayList<Object> clases) {
        frmViewObjets = new JFrame();
        frmViewObjets.getContentPane().setForeground(Color.GRAY);
        frmViewObjets.setTitle("Clasess App");
        frmViewObjets.setBounds(100, 100, 571, 373);
        frmViewObjets.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmViewObjets.getContentPane().setLayout(null);

        JLabel lblClases = new JLabel();
        lblClases.setBounds(0, 0, 966, 334);
        frmViewObjets.getContentPane().add(lblClases);

        String textToDisplay = createObjectsText(clases);
        lblClases.setText(textToDisplay);
    }

    private String createObjectsText(ArrayList<Object> clases) {
        String textToDisplay = "<html>";
        for (Object clase : clases) {
            textToDisplay = textToDisplay + clase.toString() + "<br/>";
        }
        return (textToDisplay + "</html>");
    }
}
