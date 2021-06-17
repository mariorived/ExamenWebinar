package mainView;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import clases.Usuario;
import clases.Restaurante;
import clases.Menu;
import seleccionarTipo.seleccionarTipoView;
import visualizacion.visualizacionView;

public class MainView {

    private JFrame frmMainView;
    private static final ArrayList<Object> clases = new ArrayList<>();

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainView window = new MainView();
                    window.frmMainView.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public static void guardarUsuario(Usuario usuario) {
        clases.add(usuario);
    }

    public static void guardarMenu(Menu menu) {
        clases.add(menu);
    }

    public static void guardarRestaurante(Restaurante restaurante) {
        clases.add(restaurante);
    }


    public MainView() {
        initialize();
    }

    private void initialize() {
        frmMainView = new JFrame();
        frmMainView.getContentPane().setForeground(Color.GRAY);
        frmMainView.setTitle("Clases App");
        frmMainView.setBounds(100, 100, 353, 156);
        frmMainView.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frmMainView.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Clase");
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(26, 44, 120, 23);
        frmMainView.getContentPane().add(btnCrear);

        JButton btnVer = new JButton("Ver Clases");
        btnVer.setBackground(Color.LIGHT_GRAY);
        btnVer.setBounds(181, 44, 128, 23);
        frmMainView.getContentPane().add(btnVer);

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                seleccionarTipoView.main();
            }
        });

        btnVer.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                visualizacionView.main(clases);
            }
        });
    }
}

