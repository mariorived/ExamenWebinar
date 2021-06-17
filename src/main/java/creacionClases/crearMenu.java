package creacionClases;

import mainView.MainView;
import clases.Menu;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class crearMenu {
    private JFrame frmCrearMenu;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    crearMenu window = new crearMenu();
                    window.frmCrearMenu.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public crearMenu() {
        initialize();
    }

    private void initialize() {
        frmCrearMenu = new JFrame();
        frmCrearMenu.getContentPane().setForeground(Color.GRAY);
        frmCrearMenu.setTitle("Personas App");
        frmCrearMenu.setBounds(100, 100, 273, 308);
        frmCrearMenu.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCrearMenu.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Menu");
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(76, 235, 120, 23);
        frmCrearMenu.getContentPane().add(btnCrear);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 56, 61, 23);
        frmCrearMenu.getContentPane().add(lblNombre);

        JTextField inputName = new JTextField();
        inputName.setBounds(62, 57, 106, 20);
        frmCrearMenu.getContentPane().add(inputName);
        inputName.setColumns(10);

        JLabel lblNumero = new JLabel("Numero");
        lblNumero.setBounds(10, 90, 61, 23);
        frmCrearMenu.getContentPane().add(lblNumero);

        JTextField inputNumber = new JTextField();
        inputNumber.setBounds(62, 90, 106, 20);
        frmCrearMenu.getContentPane().add(inputNumber);
        inputNumber.setColumns(10);

        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setBounds(10, 124, 61, 23);
        frmCrearMenu.getContentPane().add(lblPrecio);

        JTextField inputPrize = new JTextField();
        inputPrize.setBounds(62, 124, 106, 20);
        frmCrearMenu.getContentPane().add(inputPrize);
        inputPrize.setColumns(10);

        JLabel lblCalorias = new JLabel("Calorias");
        lblCalorias.setBounds(10, 158, 61, 23);
        frmCrearMenu.getContentPane().add(lblCalorias);

        JTextField inputCalorias = new JTextField();
        inputCalorias.setBounds(62, 158, 106, 20);
        frmCrearMenu.getContentPane().add(inputCalorias);
        inputCalorias.setColumns(10);

        JLabel lblDisponibles = new JLabel("Disponibles");
        lblDisponibles.setBounds(10, 192, 61, 23);
        frmCrearMenu.getContentPane().add(lblDisponibles);

        JTextField inputDisponibles = new JTextField();
        inputDisponibles.setBounds(62, 192, 106, 20);
        frmCrearMenu.getContentPane().add(inputDisponibles);
        inputDisponibles.setColumns(10);

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Menu p = new Menu(Integer.parseInt(inputNumber.getText()), Float.parseFloat(inputPrize.getText()), inputName.getText(), Integer.parseInt(inputCalorias.getText()), Integer.parseInt(inputDisponibles.getText()));
                MainView.guardarMenu(p);
                frmCrearMenu.dispose();
            }
        });
    }
}
