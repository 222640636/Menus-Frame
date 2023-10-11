package za.ac.tut.ui;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuFrames extends JFrame {
    
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;
    private JMenu viewMenu;
    private JMenu editorsViewMenu;
    private JMenu splitViewMenu;
    private JMenu formatMenu;
    private JMenu helpMenu;
    
    private JMenuItem newProjectMenuItem;
    private JMenuItem newFileMenuItem;
    private JMenuItem openProjectMenuItem;
    private JMenuItem openRecentProjectMenuItem;
    private JMenuItem closeAllProjectsMenuItem;
    
    private JMenuItem undoMenuItem;
    private JMenuItem redoMenuItem;
    private JMenuItem cutMenuItem;
    private JMenuItem copyMenuItem;
    private JMenuItem pasteMenuItem;
    
    private JMenuItem sourceMenuItem;
    
    private JMenuItem horizontalMenuItem;
    private JMenuItem verticalMenuItem;
    private JMenuItem clearMenuItem;
    
    private JMenuItem viewHelpMenuItem;
    private JMenuItem sendFeedbackMenuItem;
    private JMenuItem aboutNotepadMenuItem;
    
    public MenuFrames() {
        setTitle("Menus Frame");
        setSize(700, 800);
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setDefaultLookAndFeelDecorated(true);

        //create a menu bar
        menuBar = new JMenuBar();

        //menus
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");
        formatMenu = new JMenu("Format");
        viewMenu = new JMenu("View");
        editorsViewMenu = new JMenu("Editors");
        splitViewMenu = new JMenu("Split");
        helpMenu = new JMenu("Help");

        //file menu items
        newProjectMenuItem = new JMenuItem("New Project...");
        newFileMenuItem = new JMenuItem("New File...");
        openProjectMenuItem = new JMenuItem("Open Project...");
        openRecentProjectMenuItem = new JMenuItem("Open Recent Project");
        closeAllProjectsMenuItem = new JMenuItem("Close All Projects");

        //edit menu items
        undoMenuItem = new JMenuItem("Undo");
        redoMenuItem = new JMenuItem("Redo");
        cutMenuItem = new JMenuItem("Cut");
        copyMenuItem = new JMenuItem("Copy");
        pasteMenuItem = new JMenuItem("Paste");

        //view menu items
        sourceMenuItem = new JMenuItem("Source");
        editorsViewMenu.add(sourceMenuItem);
        
        horizontalMenuItem = new JMenuItem("Horizontally");
        verticalMenuItem = new JMenuItem("Vertically");
        clearMenuItem = new JMenuItem("Clear");
        splitViewMenu.add(horizontalMenuItem);
        splitViewMenu.add(verticalMenuItem);
        splitViewMenu.add(clearMenuItem);
        
        //help menu items
        viewHelpMenuItem = new JMenuItem("View Help");
        sendFeedbackMenuItem = new JMenuItem("Send Feedback");
        aboutNotepadMenuItem = new JMenuItem("About Notepad");
 
        //add file items to the menu
        fileMenu.add(newProjectMenuItem);
        fileMenu.add(newFileMenuItem);
        fileMenu.addSeparator();
        fileMenu.add(openProjectMenuItem);
        fileMenu.add(openRecentProjectMenuItem);
        fileMenu.add(closeAllProjectsMenuItem);
        
        editMenu.add(undoMenuItem);
        editMenu.add(redoMenuItem);
        editMenu.addSeparator();
        editMenu.add(cutMenuItem);
        editMenu.add(copyMenuItem);
        editMenu.add(pasteMenuItem);
        
        viewMenu.add(editorsViewMenu);
        viewMenu.add(splitViewMenu);
        
        helpMenu.add(viewHelpMenuItem);
        helpMenu.add(sendFeedbackMenuItem);
        helpMenu.addSeparator();
        helpMenu.add(aboutNotepadMenuItem);

        //add the menus to the bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(formatMenu);
        menuBar.add(viewMenu);
        menuBar.add(helpMenu);
        

        //add the bar to the frame
        setJMenuBar(menuBar);
        
        setVisible(true);
        
    }
    
}
