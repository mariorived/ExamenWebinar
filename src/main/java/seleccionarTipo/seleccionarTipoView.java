package seleccionarTipo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import creacionClases.crearUsuario;
import creacionClases.crearMenu;
import creacionClases.crearRestaurante;

public class seleccionarTipoView {

    private JFrame frmSelectType;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    seleccionarTipoView window = new seleccionarTipoView();
                    window.frmSelectType.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public seleccionarTipoView() {
        initialize();
    }

    private void initialize() {
        frmSelectType = new JFrame();
        frmSelectType.getContentPane().setForeground(Color.GRAY);
        frmSelectType.setTitle("Personas App");
        frmSelectType.setBounds(100, 100, 501, 156);
        frmSelectType.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmSelectType.getContentPane().setLayout(null);

        JButton btnUsuario = new JButton("Usuario");
        btnUsuario.setBackground(Color.LIGHT_GRAY);
        btnUsuario.setBounds(26, 44, 120, 23);
        frmSelectType.getContentPane().add(btnUsuario);

        JButton btnMenu = new JButton("Menu");
        btnMenu.setBackground(Color.LIGHT_GRAY);
        btnMenu.setBounds(181, 44, 128, 23);
        frmSelectType.getContentPane().add(btnMenu);

        JButton btnRestaurante = new JButton("Restaurante");
        btnRestaurante.setBackground(Color.LIGHT_GRAY);
        btnRestaurante.setBounds(345, 44, 120, 23);
        frmSelectType.getContentPane().add(btnRestaurante);

        btnUsuario.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearUsuario.main();
            }
        });

        btnMenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearMenu.main();
            }
        });

        btnRestaurante.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                crearRestaurante.main();
            }
        });
    }
}