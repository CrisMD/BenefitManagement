package InterfataGrafica;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaLogin
{

    private final int CONST_FRAME_WIDTH = 350;
    private final int CONST_FRAME_HEIGHT = 200;

    private JFrame frame;
    private JPanel panel;
    private JLabel labelUtilizator;
    private JTextField fieldUtilizator;
    private JLabel labelParola;
    private JPasswordField fieldParola;
    private JButton buttonSignIn;
    private JButton buttonSignUp;

    public static void main(String[] args)
    {
        PaginaLogin object = new PaginaLogin();
        object.afisareInterfata();
    }

    public void afisareInterfata()
    {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Login");
        frame.setBounds(0, 0, CONST_FRAME_WIDTH, CONST_FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);

        panel = new JPanel();
        panel.setLayout(null);
        panel.setVisible(true);
        panel.setBounds(0, 0, CONST_FRAME_WIDTH, CONST_FRAME_HEIGHT);
        frame.add(panel);

        labelUtilizator = new JLabel("Utilizator");
        panel.add(labelUtilizator);
        labelUtilizator.setLayout(null);
        labelUtilizator.setVisible(true);
        labelUtilizator.setFont(new Font("Arial", Font.BOLD, 12));
        labelUtilizator.setBounds(15, 30, 70, 25);

        fieldUtilizator = new JTextField(10);
        panel.add(fieldUtilizator);
        fieldUtilizator.setLayout(null);
        fieldUtilizator.setVisible(true);
        fieldUtilizator.setBounds(90, 30, 200, 25);

        labelParola = new JLabel("Parola");
        panel.add(labelParola);
        labelParola.setLayout(null);
        labelParola.setVisible(true);
        labelParola.setBounds(15, 60, 70, 25);

        fieldParola = new JPasswordField(10);
        panel.add(fieldParola);
        fieldParola.setLayout(null);
        fieldParola.setVisible(true);
        fieldParola.setBounds(90, 60, 200, 25);

        buttonSignIn = new JButton("Sign in");
        panel.add(buttonSignIn);
        buttonSignIn.setLayout(null);
        buttonSignIn.setVisible(true);
        buttonSignIn.setBounds(90, 100, 100, 30);

        buttonSignUp = new JButton("Sign up");
        panel.add(buttonSignUp);
        buttonSignUp.setLayout(null);
        buttonSignUp.setVisible(true);
        buttonSignUp.setBounds(190, 100, 100, 30);

        buttonSignUp.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                PaginaInregistrare object = new PaginaInregistrare();
                object.afisareInterfata();
            }
        });
    }
}
