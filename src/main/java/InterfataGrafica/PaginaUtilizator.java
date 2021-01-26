package InterfataGrafica;

import Model.Utilizator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaUtilizator
{
    private final int CONST_FRAME_WIDTH = 400;
    private final int CONST_FRAME_HEIGHT = 400;

    private JFrame frame;
    private JPanel panelHeader;

    private JLabel labelHeader;
    private JButton buttonLogout;

    private Utilizator utilizatorPagina;

    public static void main(String[] args)
    {
        PaginaUtilizator test = new PaginaUtilizator();
        Utilizator user = new Utilizator();
        user.setNume("Nume lung");
        user.setPrenume("Prenume lung");
        test.afisareInterfata(user);
    }

    public void afisareInterfata(Utilizator utilizator)
    {
        utilizatorPagina = utilizator;

        frame = new JFrame();
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setTitle("Meniu Principal");
        frame.setBounds(0, 0, CONST_FRAME_WIDTH, CONST_FRAME_HEIGHT);
        frame.setLocationRelativeTo(null);

        adaugaHeader();
    }

    public void adaugaHeader()
    {
        panelHeader = new JPanel();
        frame.add(panelHeader);
        panelHeader.setLayout(null);
        panelHeader.setVisible(true);
        panelHeader.setBounds(0, 0, CONST_FRAME_WIDTH, 50);
        panelHeader.setBackground(Color.LIGHT_GRAY);

        labelHeader = new JLabel(utilizatorPagina.getNume() + " " + utilizatorPagina.getPrenume());
        panelHeader.add(labelHeader);
        labelHeader.setLayout(null);
        labelHeader.setVisible(true);
        labelHeader.setBounds(15, 15, 200, 25);

        buttonLogout = new JButton("Logout");
        panelHeader.add(buttonLogout);
        buttonLogout.setLayout(null);
        buttonLogout.setVisible(true);
        buttonLogout.setBounds(280, 17, 90, 20);

        buttonLogout.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                frame.dispose();
                PaginaLogin paginaLogin = new PaginaLogin();
                paginaLogin.afisareInterfata();
            }
        });
    }
}
