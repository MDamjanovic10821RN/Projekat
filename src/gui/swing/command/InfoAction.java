package gui.swing.command;

import gui.swing.view.MainFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

public class InfoAction extends ProgAbstractAction{

    public InfoAction(){
        putValue(ACCELERATOR_KEY, KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.ALT_MASK));
        putValue(SMALL_ICON, LoadIcon("infoIcon.png"));
        putValue(NAME,"Info");
        putValue(SHORT_DESCRIPTION, "Osnovne informacije o studentu");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(MainFrame.getInstance(),"Ime: MILOS\n\nPrezime: DAMJANOVIC\n\nIndeks: RN 108 / 2021\n", "O studentu",JOptionPane.INFORMATION_MESSAGE);
    }
}
