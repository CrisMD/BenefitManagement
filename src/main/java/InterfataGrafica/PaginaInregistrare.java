package InterfataGrafica;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaInregistrare
{
    private final int CONST_FRAME_WIDTH = 350;
    private final int CONST_FRAME_HEIGHT = 260;

    private JFrame frame;
    private JPanel panel;

    private JLabel labelUtilizator;
    private JTextField fieldUtilizator;
    private JLabel labelParola;
    private JPasswordField fieldParola;
    private JLabel labelNume;
    private JTextField fieldNume;
    private JLabel labelPrenume;
    private JTextField fieldPrenume;

    private JButton buttonsignUp;
    private JButton buttonSignIn;

    public void afisareInterfata()
    {
        frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Inregistrare");
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

        labelNume = new JLabel("Nume");
        panel.add(labelNume);
        labelNume.setLayout(null);
        labelNume.setVisible(true);
        labelNume.setBounds(15, 90, 70, 25);

        fieldNume = new JTextField(10);
        panel.add(fieldNume);
        fieldNume.setLayout(null);
        fieldNume.setVisible(true);
        fieldNume.setBounds(90, 90, 200, 25);

        labelPrenume = new JLabel("Prenume");
        panel.add(labelPrenume);
        labelPrenume.setLayout(null);
        labelPrenume.setVisible(true);
        labelPrenume.setBounds(15, 120, 70, 25);

        fieldPrenume = new JTextField(10);
        panel.add(fieldPrenume);
        fieldPrenume.setLayout(null);
        fieldPrenume.setVisible(true);
        fieldPrenume.setBounds(90, 120, 200, 25);

        buttonsignUp = new JButton("Sign up");
        panel.add(buttonsignUp);
        buttonsignUp.setLayout(null);
        buttonsignUp.setVisible(true);
        buttonsignUp.setBounds(90, 160, 100, 30);

        buttonSignIn = new JButton("Sign in");
        panel.add(buttonSignIn);
        buttonSignIn.setLayout(null);
        buttonSignIn.setVisible(true);
        buttonSignIn.setBounds(190, 160, 100, 30);

        buttonSignIn.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                PaginaLogin object = new PaginaLogin();
                object.afisareInterfata();
            }
        });
    }
}
