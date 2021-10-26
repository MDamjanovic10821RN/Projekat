package gui.swing.view;

import gui.swing.command.ActionManager;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {
    private static MainFrame instance = null;
    private ActionManager actionManager = ActionManager.getInstance();
    private ToolBar toolBar = new ToolBar();
    private MenuBar menuBar;

    private MainFrame(){
        //prazan konstruktor zbog SINGLETON-a.
    }

    private void initialiseGUI(){
        Toolkit kit = Toolkit.getDefaultToolkit();

        Dimension screenSize = kit.getScreenSize();
        int height = screenSize.height;
        int width = screenSize.width;
        this.setSize(width/2,height/2);
        //setSize(500, 500);
        setLocationRelativeTo(null);
        setVisible(true);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setTitle("Projekat mDamjanovic108/21/RN");
        //------------------------------------------------END OF DEFAULT INITIALIZATION.

        menuBar = new MenuBar();
        this.setJMenuBar(menuBar);

        // SETTING UP THE PANES:
        JPanel panTree = new JPanel();
        panTree.setMinimumSize(new Dimension(50,100));
        panTree.setBackground(Color.GRAY);

        JPanel panWorkSpace = new JPanel();
        panWorkSpace.setMinimumSize(new Dimension(500,100));
        panWorkSpace.setBackground(Color.LIGHT_GRAY);

        JSplitPane sp1 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, new JScrollPane(panTree), panWorkSpace);
        sp1.setDividerLocation(200);

        add(sp1, BorderLayout.CENTER);


        //ADDING MENU
        add(toolBar, BorderLayout.NORTH);

    }

    public static MainFrame getInstance(){
        if(instance == null){
            instance = new MainFrame();
            instance.initialiseGUI();
        }
        return instance;
    }

    public ActionManager getActionManager() {
        return actionManager;
    }

    public static void main(String[] args){
        MainFrame mainFrame = MainFrame.getInstance();
        mainFrame.initialiseGUI();
        mainFrame.setLocationRelativeTo(null);
        mainFrame.setVisible(true);
    }

}
