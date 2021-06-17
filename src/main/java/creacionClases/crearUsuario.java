package creacionClases;

import mainView.MainView;
import clases.Usuario;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class crearUsuario {
    private JFrame frmCrearUsuario;

    public static void main() {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    crearUsuario window = new crearUsuario();
                    window.frmCrearUsuario.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    public crearUsuario() {
        initialize();
    }

    private void initialize() {
        frmCrearUsuario = new JFrame();
        frmCrearUsuario.getContentPane().setForeground(Color.GRAY);
        frmCrearUsuario.setTitle("Personas App");
        frmCrearUsuario.setBounds(100, 100, 273, 308);
        frmCrearUsuario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frmCrearUsuario.getContentPane().setLayout(null);

        JButton btnCrear = new JButton("Crear Usuario");
        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            }
        });
        btnCrear.setBackground(Color.LIGHT_GRAY);
        btnCrear.setBounds(127, 235, 120, 23);
        frmCrearUsuario.getContentPane().add(btnCrear);

        JLabel lblNombre = new JLabel("Nombre");
        lblNombre.setBounds(10, 56, 61, 23);
        frmCrearUsuario.getContentPane().add(lblNombre);

        JTextField inputName = new JTextField();
        inputName.setBounds(62, 57, 106, 20);
        frmCrearUsuario.getContentPane().add(inputName);
        inputName.setColumns(10);

        JLabel lblEdad = new JLabel("Edad");
        lblEdad.setBounds(10, 90, 61, 23);
        frmCrearUsuario.getContentPane().add(lblEdad);

        JTextField inputAge = new JTextField();
        inputAge.setBounds(62, 90, 106, 20);
        frmCrearUsuario.getContentPane().add(inputAge);
        inputAge.setColumns(10);

        JLabel lblApellido = new JLabel("Apellido");
        lblApellido.setBounds(10, 56, 61, 23);
        frmCrearUsuario.getContentPane().add(lblApellido);

        JTextField inputSurName = new JTextField();
        inputSurName.setBounds(62, 57, 106, 20);
        frmCrearUsuario.getContentPane().add(inputSurName);
        inputSurName.setColumns(10);





        btnCrear.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Usuario a = new Usuario(Integer.parseInt(inputAge.getText()), (inputSurName.getText()), inputName.getText());
                MainView.guardarUsuario(a);
                frmCrearUsuario.dispose();
            }
        });
    }
}