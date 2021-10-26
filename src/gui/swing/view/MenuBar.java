package gui.swing.view;

import gui.swing.command.ActionManager;
import gui.swing.command.InfoAction;

import javax.swing.*;

public class MenuBar extends JMenuBar {

    public MenuBar(){
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");

        JMenuItem miNew = new JMenuItem("new");
        JMenuItem miInfo = new JMenuItem("info");

        file.add(miNew);
        help.add(miInfo);

        add(file);
        add(help);

        miInfo.addActionListener(new InfoAction()); //TREBA PREKO GET METODE(ACTIONMANAGER)
    }
}
