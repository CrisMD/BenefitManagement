package InterfataGrafica;

import Model.Utilizator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PaginaUtilizator
{
    private final int CONST_FRAME_WIDTH = 801;
    private final int CONST_FRAME_HEIGHT = 600;
    private final int CONST_MAX_BUTTONS = 8;

    // User
    private Utilizator utilizatorPagina;
    private JFrame frame;

    private JPanel panelHeader;
    private JPanel panelTop;
    private JPanel panelBot;

    // Header content
    private JLabel labelHeader;
    private JButton buttonLogout;

    // Top content
    private JToggleButton buttonsTopPanel[] = new JToggleButton[CONST_MAX_BUTTONS];

    private int buttonsTopPanelPositions[][] =
    {
        {20, 20},
        {205, 20},
        {390, 20},
        {575, 20},
        {20, 50},
        {205, 50},
        {390, 50},
        {575, 50},
    };

    private String buttonsTopPanelNames[] =
    {
        "Vizualizeaza Beneficii",
        "Adauga Beneficii",
        "Modifica Beneficii",
        "Sterge Beneficii",
        "Vizualizeaza Categorii",
        "Adauga Categorii",
        "Modifica Categorii",
        "Sterge Categorii"
    };

    public static void main(String[] args)
    {
        PaginaUtilizator test = new PaginaUtilizator();
        Utilizator user = new Utilizator();
        user.setNume("Nume lung");
        user.setPrenume("Prenume lung");
        user.setAdmin(true);
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

        adaugaPanelHeader();
        adaugaPanelTop();
        adaugaPanelBot();

    }

    public void adaugaPanelHeader()
    {
        panelHeader = new JPanel();
        frame.add(panelHeader);
        panelHeader.setLayout(null);
        panelHeader.setVisible(true);
        panelHeader.setBounds(0, 0, CONST_FRAME_WIDTH, 50);

        labelHeader = new JLabel(utilizatorPagina.getNume() + " " + utilizatorPagina.getPrenume());
        panelHeader.add(labelHeader);
        labelHeader.setLayout(null);
        labelHeader.setVisible(true);
        labelHeader.setBounds(20, 15, 200, 25);

        buttonLogout = new JButton("Logout");
        panelHeader.add(buttonLogout);
        buttonLogout.setLayout(null);
        buttonLogout.setVisible(true);
        buttonLogout.setBounds(670, 17, 90, 20);
        buttonLogout.setFocusPainted(false);

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

    public void adaugaPanelTop()
    {
        panelTop = new JPanel();
        frame.add(panelTop);
        panelTop.setLayout(null);
        panelTop.setVisible(true);
        panelTop.setBounds(0, 50, CONST_FRAME_WIDTH, 100);
        panelTop.setBackground(new Color(220, 220, 220));

        for (int i = 0; i < CONST_MAX_BUTTONS; i++)
        {
            buttonsTopPanel[i] = new JToggleButton(buttonsTopPanelNames[i]);
            panelTop.add(buttonsTopPanel[i]);
            buttonsTopPanel[i].setLayout(null);
            buttonsTopPanel[i].setVisible(true);
            buttonsTopPanel[i].setBounds(buttonsTopPanelPositions[i][0], buttonsTopPanelPositions[i][1], 185, 30);
            buttonsTopPanel[i].setFocusPainted(false);
            buttonsTopPanel[i].addActionListener(new ActionListener()
            {
                @Override
                public void actionPerformed(ActionEvent e)
                {
                    JToggleButton pressedButton = (JToggleButton) e.getSource();

                    for (int i = 0; i < buttonsTopPanel.length; i++)
                    {
                        if (pressedButton != buttonsTopPanel[i])
                        {
                            buttonsTopPanel[i].setSelected(false);
                        }
                    }

                    // To add button actions
                }
            });
        }
        handleAccess();
    }

    public void adaugaPanelBot()
    {
        panelBot = new JPanel();
        frame.add(panelBot);
        panelBot.setLayout(null);
        panelBot.setVisible(true);
        panelBot.setBounds(0, 150, CONST_FRAME_WIDTH, CONST_FRAME_HEIGHT);
    }

    public void handleAccess()
    {
        if (!utilizatorPagina.getAdmin())
        {
            for (int i = 1; i < buttonsTopPanel.length; i++)
            {
                buttonsTopPanel[i].setEnabled(false);
            }
        }
    }

    public void clearPanelBot()
    {
        panelBot.removeAll();
        panelBot.revalidate();
        panelBot.repaint();
    }
}
