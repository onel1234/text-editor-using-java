package javatexteditor;

import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

public class javatexteditor extends JTextPane {

    private static final long serialVersionUID = 1L;
    public final static String AUTHOR_EMAIL = "hi@ph7.me";
    public final static String NAME = "PHNotePad";
    public final static String EDITOR_EMAIL = "contact@achinthagunasekara.com";
    public final static double VERSION = 3.0;

    /**
     * @param args
     */
    public static void main(String[] args) {
    	try {
    		UIManager.setLookAndFeel ("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
    	} catch (ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException e) {
    		e.printStackTrace();
    	}
    	
        //new UI().setVisible(true);
    }

}
