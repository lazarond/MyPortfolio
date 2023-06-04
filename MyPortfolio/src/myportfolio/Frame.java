package myportfolio;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Frame extends BaseFrame {
	
	private JPanel contentPane;
	private ContentsPage content;
	JLabel background_lbl = new JLabel("");
	JPanel MainPanel = new JPanel();
	JButton enter_btn = new JButton("");	
	
	 public Frame(String title, int width, int height) {
	        // Call the constructor of the superclass (BaseFrame)
	        super(title, width, height);
	       
	        initializeComponents();
	        setupListeners();
	        
	    }
	 
	 public void initializeComponents() {
		 	contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			contentPane.setBackground(new Color(237, 234, 237));
			setContentPane(contentPane);
			setLocationRelativeTo(null);
			contentPane.setLayout(null);

			MainPanel = new JPanel();
			MainPanel.setBackground(new Color(237, 234, 237));
			MainPanel.setBounds(0, 0, 1081, 736);
			contentPane.add(MainPanel);
			MainPanel.setLayout(null);

			enter_btn = new JButton("");
			enter_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\play.png"));
			enter_btn.setBorderPainted(false);
			enter_btn.setBackground(new Color(75, 91, 99));
			enter_btn.setBounds(489, 576, 134, 100);
			MainPanel.add(enter_btn);

			background_lbl = new JLabel("");
			background_lbl.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\pictures\\cover.png"));
			background_lbl.setBounds(0, 0, 1080, 730);
			MainPanel.add(background_lbl);
	    }
	    
	 public void setupListeners() {
		// Set up listeners 
			enter_btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					content = new ContentsPage();
					content.openContentsPage();
					dispose();
				}
			});
	    }
	 
}



