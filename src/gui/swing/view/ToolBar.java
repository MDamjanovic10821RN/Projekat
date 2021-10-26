package gui.swing.view;

import gui.swing.command.ActionManager;
import gui.swing.command.InfoAction;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class ToolBar extends JToolBar {
    private JButton btnNew = new JButton("New");
    private JButton btnInfo = new JButton("Info");

    public ToolBar(){
        super(SwingConstants.HORIZONTAL);
        setFloatable(false);
        this.setBackground(Color.white);

        btnNew.setIcon(new ImageIcon("newIcon.jpg")); //SLIKE NE MOGU DA POVEZEM.
        add(btnNew);

        btnInfo.addActionListener(ActionManager.getInstance().getInfoAction());
        btnInfo.setIcon(new ImageIcon("infoIcon.png"));
        btnInfo.setMnemonic(KeyEvent.VK_I);
        add(btnInfo);
        //add (ActionManager.getInstance().getInfoAction()); //NECE DA MI SE POVEZE ACTIONMANAGER NI SLIKE

    }
}
