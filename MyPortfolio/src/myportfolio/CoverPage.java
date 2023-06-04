package myportfolio;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CoverPage extends Frame {
	
	/**
	 * Create the frame.
	 */
	
	public CoverPage() {
		
		super("My Portfolio", 1089, 763);
			
		initializeComponents();
		setupListeners();
				
	}
}

	
