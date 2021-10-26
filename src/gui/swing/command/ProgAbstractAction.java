package gui.swing.command;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.URL;

public abstract class ProgAbstractAction extends AbstractAction {

    public Icon LoadIcon(String file){
        URL imageURL = getClass().getResource(file);
        Icon icon = null;

        if(imageURL != null){
            icon = new ImageIcon(imageURL);
        }else{
            System.err.print("Nije pronadjen fascikl: " + file);
        }
        return icon;
    }

}
