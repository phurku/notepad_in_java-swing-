import javax.swing.*;
// import java.awt.event.*;
// import java.awt.*;
import javax.swing.border.Border;
import java.awt.*;

public class NotepadDemo extends JFrame {
    NotepadDemo(){
        JMenuBar menuBar=new JMenuBar();
        setJMenuBar(menuBar);
        JMenu fileMenu=new JMenu("File");
        menuBar.add(fileMenu) ; 
        JMenu editMenu=new JMenu("Edit");
        menuBar.add(editMenu) ; 
        //JMenuItem menuItem=new JMenuItem();
        JMenuItem newMenuItem=new JMenuItem("New");
        fileMenu.add(newMenuItem);
        JMenuItem openMenuItem=new JMenuItem("Open");
        fileMenu.add(openMenuItem);
        JMenuItem saveMenuItem=new JMenuItem("Save");
        fileMenu.add(saveMenuItem);
        JMenuItem exitMenuItem=new JMenuItem("Exit");
        fileMenu.add(exitMenuItem);
    setVisible(true);
    setSize(500,700);
    }
        
    
    public  static void main (String[] args) {
        new NotepadDemo();
        
    }
}
