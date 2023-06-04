package myportfolio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


public class Logofolio extends Frame{
	
	private JPanel contentPane;
	private ContentsPage content;
	private Clip clip;
	JButton return_btn = new JButton("");
	JButton next_btn = new JButton("");

    
	private void playMusic() {
		
	    try {
	        // Load the audio file
	        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\LAZARO\\MyPortfolio\\bgm\\akmu.wav"));
	        
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
	 
	public Logofolio() {

		super("Logo Collection", 1082, 740);

		content = new ContentsPage();

		playMusic();
			
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 234, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		return_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				stopMusic();
				content.openPersonalInfoPage();
				dispose();
			}
		});
		
		next_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				stopMusic();
				content.openPosters();
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
		content_btn.setBounds(302, 178, 32, 31);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\tracks\\track02.png"));
		img.setBounds(292, 141, 488, 65);
		
		return_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\return_btn.png"));
		return_btn.setBorderPainted(false);
		return_btn.setBackground(new Color(237, 234, 237));
		return_btn.setBounds(685, 178, 25, 31);
		
		next_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\next_btn.png"));
		next_btn.setBorderPainted(false);
		next_btn.setBackground(new Color(237, 234, 237));
		next_btn.setBounds(730, 178, 25, 31);
		
		JTextArea txtrLogofolio = new JTextArea();
		txtrLogofolio.setText("LOGOFOLIO");
		txtrLogofolio.setForeground(new Color(7, 59, 76));
		txtrLogofolio.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
		txtrLogofolio.setEditable(false);
		txtrLogofolio.setBackground(new Color(237, 234, 237));
		txtrLogofolio.setBounds(303, 77, 477, 43);
		
		JTextArea txtrTrack_1 = new JTextArea();
		txtrTrack_1.setText("TRACK 02.");
		txtrTrack_1.setForeground(new Color(75, 91, 99));
		txtrTrack_1.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 25));
		txtrTrack_1.setEditable(false);
		txtrTrack_1.setBackground(new Color(237, 234, 237));
		txtrTrack_1.setBounds(303, 35, 165, 31);
	    
	    JScrollPane scrollPane = new JScrollPane();
	    scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
	    scrollPane.setBounds(-3, 236, 1070, 465);
	    
	    // Customize the vertical scroll bar
	 	scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
	    
	    JLabel lbl_logo = new JLabel("");
	    scrollPane.setViewportView(lbl_logo);
	    lbl_logo.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\pictures\\works\\collection\\logofolio-1.png"));
	    
		contentPane.add(content_btn);
		contentPane.add(img);
		contentPane.add(return_btn);	
		contentPane.add(next_btn);
		contentPane.add(txtrLogofolio);
		contentPane.add(txtrTrack_1);
	    contentPane.add(scrollPane);
	    
	   
	    
	}
}

