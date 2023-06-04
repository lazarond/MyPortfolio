package myportfolio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.plaf.basic.BasicScrollBarUI;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JScrollBar;
import javax.swing.ScrollPaneConstants;


public class PersonalInfoPage extends Frame {
	
		private Clip clip;
		private JPanel contentPane;
		private ContentsPage content;
		JButton next_btn = new JButton("");
		JButton return_btn = new JButton("");
					
	
	private void playMusic() {
		
	    try {
	        // Load the audio file
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\LAZARO\\MyPortfolio\\bgm\\to_me.wav"));
	        
	        // Create a clip and open the audio stream
	        clip = AudioSystem.getClip();
	        clip.open(audioInputStream);
	        
	        // Start playing the music
	        clip.start();
	        
	        // Loop the music indefinitely
	        clip.loop(Clip.LOOP_CONTINUOUSLY);
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	 private void stopMusic() {
	        if (clip != null && clip.isRunning()) {
	            clip.stop();
	            clip.close();
	        }
	    }

	

	/**
	 * Create the frame.
	 */
	
	public PersonalInfoPage() {
		
		super("My Personal Information", 1082, 740);

		content = new ContentsPage();

        playMusic();

		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 234, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		next_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				stopMusic();
				content.openLogofolio();
				dispose();
				
			}
		});
		
		return_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				stopMusic();
				content.openContentsPage();
				dispose();

			}
		});
		
		JButton content_btn = new JButton("");
		content_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				stopMusic();
				content.openContentsPage();
				dispose();

				
			}
		});
		
		content_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\content_btn.png"));
		content_btn.setBorderPainted(false);
		content_btn.setBackground(new Color(237, 234, 237));
		content_btn.setBounds(301, 179, 32, 31);
		contentPane.add(content_btn);
		
		next_btn.setBorderPainted(false);
		next_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\next_btn.png"));
		next_btn.setBackground(new Color(237, 234, 237));
		next_btn.setBounds(732, 179, 25, 31);
		contentPane.add(next_btn);
		
		return_btn.setBorderPainted(false);
		return_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\return_btn.png"));
		return_btn.setBackground(new Color(237, 234, 237));
		return_btn.setBounds(687, 179, 25, 31);
		contentPane.add(return_btn);
		
		JPanel insta_panel = new JPanel();
		insta_panel.setBackground(new Color(75, 91, 99));
		insta_panel.setBounds(0, 229, 416, 519);
		contentPane.add(insta_panel);
		insta_panel.setLayout(null);
		
		JTextArea txtrHello = new JTextArea();
		txtrHello.setBounds(126, 26, 170, 41);
		txtrHello.setText("natstagram");
		txtrHello.setForeground(new Color(255, 255, 255));
		txtrHello.setFont(new Font("Lucida Handwriting", Font.BOLD, 22));
		txtrHello.setEditable(false);
		txtrHello.setBackground(new Color(75, 91, 99));
		insta_panel.add(txtrHello);
		
		JLabel lbl_img = new JLabel("");
		lbl_img.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\pictures\\illustration.png"));
		lbl_img.setBounds(-42, 54, 468, 284);
		insta_panel.add(lbl_img);
		
		JLabel lbl_stats_img = new JLabel("");
		lbl_stats_img.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\icons\\content_status.png"));
		lbl_stats_img.setBounds(29, 401, 509, 52);
		insta_panel.add(lbl_stats_img);
		
		JTextArea txtrNatalielazaro = new JTextArea();
		txtrNatalielazaro.setText("natalielazaro.");
		txtrNatalielazaro.setForeground(Color.WHITE);
		txtrNatalielazaro.setFont(new Font("Microsoft PhagsPa", Font.BOLD, 13));
		txtrNatalielazaro.setEditable(false);
		txtrNatalielazaro.setBackground(new Color(75, 91, 99));
		txtrNatalielazaro.setBounds(37, 331, 88, 22);
		insta_panel.add(txtrNatalielazaro);
		
		JTextArea txtrHello_1 = new JTextArea();
		txtrHello_1.setText("\tHi, I'm Natalie Lazaro - a college student \r\ncurrently taking BSIT MAA program.\r\n__________________________________________________________________");
		txtrHello_1.setForeground(Color.WHITE);
		txtrHello_1.setFont(new Font("Microsoft PhagsPa", Font.PLAIN, 13));
		txtrHello_1.setEditable(false);
		txtrHello_1.setBackground(new Color(75, 91, 99));
		txtrHello_1.setBounds(37, 331, 434, 76);
		insta_panel.add(txtrHello_1);
		
		JTextArea txtrTrack = new JTextArea();
		txtrTrack.setEditable(false);
		txtrTrack.setText("TRACK 01.");
		txtrTrack.setForeground(new Color(75, 91, 99));
		txtrTrack.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 25));
		txtrTrack.setBackground(new Color(237, 234, 237));
		txtrTrack.setBounds(303, 35, 165, 31);
		contentPane.add(txtrTrack);
		
		JTextArea txtrPersonalInformation = new JTextArea();
		txtrPersonalInformation.setEditable(false);
		txtrPersonalInformation.setText("PERSONAL INFORMATION");
		txtrPersonalInformation.setForeground(new Color(7, 59, 76));
		txtrPersonalInformation.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
		txtrPersonalInformation.setBackground(new Color(237, 234, 237));
		txtrPersonalInformation.setBounds(303, 77, 477, 43);
		contentPane.add(txtrPersonalInformation);	
		
		JLabel img_design = new JLabel("");
		img_design.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\tracks\\track01.png"));
		img_design.setBounds(292, 141, 488, 76);
		contentPane.add(img_design);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(414, 229, 652, 472);
		
		// Customize the vertical scroll bar
		scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
		
		contentPane.add(scrollPane);
		
		JLabel lbl_info = new JLabel("");
		scrollPane.setViewportView(lbl_info);
		lbl_info.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\pictures\\persona.png"));
		
	}
}
