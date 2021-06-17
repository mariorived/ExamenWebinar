package creacionClases;

import mainView.MainView;
import clases.Restaurante;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class crearRestaurante {
    private JFrame frmCrearRestaurante;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    crearRestaurante window = new crearRestaurante();
                    window.frmCrearRestaurante.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public crearRestaurante() {
        initialize();
    }

    private void initialize() {
        frmCrearRestaurante = new JFrame();
        frmCrearRestaurante.getContentPane().setForeground(Color.GRAY);
        frmCrearRestaurante.setTitle("Personas App");
        frmCrearRestaurante.setBounds(100, 100, 273, 308);
        frmCrearRestaurante.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCrearRestaurante.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Restaurante");
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(76, 235, 120, 23);
        frmCrearRestaurante.getContentPane().add(btnCrear);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 56, 61, 23);
        frmCrearRestaurante.getContentPane().add(lblNombre);

        JTextField inputName = new JTextField();
        inputName.setBounds(62, 57, 106, 20);
        frmCrearRestaurante.getContentPane().add(inputName);
        inputName.setColumns(10);

        JLabel lblTelefono = new JLabel("Telefono");
        lblTelefono.setBounds(10, 90, 61, 23);
        frmCrearRestaurante.getContentPane().add(lblTelefono);

        JTextField inputPhone = new JTextField();
        inputPhone.setBounds(62, 90, 106, 20);
        frmCrearRestaurante.getContentPane().add(inputPhone);
        inputPhone.setColumns(10);

        JLabel lblPrecio = new JLabel("Precio");
        lblPrecio.setBounds(10, 124, 61, 23);
        frmCrearRestaurante.getContentPane().add(lblPrecio);

        JTextField inputPrize = new JTextField();
        inputPrize.setBounds(62, 124, 106, 20);
        frmCrearRestaurante.getContentPane().add(inputPrize);
        inputPrize.setColumns(10);

        JLabel lblNumero = new JLabel("Numero");
        lblNumero.setBounds(10, 158, 61, 23);
        frmCrearRestaurante.getContentPane().add(lblNumero);

        JTextField inputNumber = new JTextField();
        inputNumber.setBounds(62, 158, 106, 20);
        frmCrearRestaurante.getContentPane().add(inputNumber);
        inputNumber.setColumns(10);

        JLabel lblPlatos = new JLabel("Platos");
        lblPlatos.setBounds(10, 192, 61, 23);
        frmCrearRestaurante.getContentPane().add(lblPlatos);

        JTextField inputPlatos = new JTextField();
        inputPlatos.setBounds(62, 192, 106, 20);
        frmCrearRestaurante.getContentPane().add(inputPlatos);
        inputPlatos.setColumns(10);

        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Restaurante d = new Restaurante(Integer.parseInt(inputPhone.getText()), Float.parseFloat(inputPrize.getText()), inputName.getText(), Integer.parseInt(inputNumber.getText()), Integer.parseInt(inputPlatos.getText()));
                MainView.guardarRestaurante(d);
                frmCrearRestaurante.dispose();
            }
        });
    }
}

