package gui.swing.command;

import gui.swing.view.MainFrame;

public class ActionManager {

    private static ActionManager instance = null;

    //-----------------------------------ACTIONS:
    private InfoAction infoAction;
    //-------------------------------------------

    private ActionManager(){

    }
    public static ActionManager getInstance(){
        if(instance == null){
            instance = new ActionManager();
            instance.initialiseActions();
        }
        return instance;
    }


    private void initialiseActions(){
        infoAction = new InfoAction();
    }

    //-------------GETTERS FOR ACTIONS:
    public InfoAction getInfoAction() {
        return infoAction;
    }
}
