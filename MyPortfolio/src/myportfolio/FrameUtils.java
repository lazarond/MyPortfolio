package myportfolio;

import javax.swing.JFrame;

public class FrameUtils {

	public static void openFrame(JFrame frame) {
        frame.setVisible(true);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null); // Center the frame
    }
    
    public static void closeCurrentFrame(JFrame frame) {
        frame.dispose();
    }
	
}
