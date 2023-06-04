package myportfolio;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;
import javax.swing.ScrollPaneConstants;


public class PersonalProject extends Frame {

    private JPanel contentPane;
    private Clip clip;
    private ContentsPage content;
	JButton return_btn = new JButton("");
	JButton next_btn = new JButton("");
		
	    private void playMusic() {
			
		    try {
		        // Load the audio file
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\LAZARO\\MyPortfolio\\bgm\\warhols.wav"));
		        
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
		 
	public PersonalProject() {
		
		super("My Personal Projects", 1082, 740);

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
				
				content.openPosters();
				dispose();
				
			}
		});
		
		next_btn.addActionListener(new ActionListener() {
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
		content_btn.setBounds(302, 178, 32, 31);
		
		return_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\return_btn.png"));
		return_btn.setBorderPainted(false);
		return_btn.setBackground(new Color(237, 234, 237));
		return_btn.setBounds(687, 178, 25, 31);
			
		next_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\next_btn.png"));
		next_btn.setBorderPainted(false);
		next_btn.setBackground(new Color(237, 234, 237));
		next_btn.setBounds(729, 178, 25, 31);
			
		JTextArea txtrPersonalProjects = new JTextArea();
		txtrPersonalProjects.setText("PERSONAL PROJECTS");
		txtrPersonalProjects.setForeground(new Color(7, 59, 76));
		txtrPersonalProjects.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
		txtrPersonalProjects.setEditable(false);
		txtrPersonalProjects.setBackground(new Color(237, 234, 237));
		txtrPersonalProjects.setBounds(303, 77, 477, 43);
		
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\tracks\\track04.png"));
		img.setBounds(292, 141, 488, 65);
		
		JTextArea txtrTrack_4 = new JTextArea();
		txtrTrack_4.setText("TRACK 04.");
		txtrTrack_4.setForeground(new Color(75, 91, 99));
		txtrTrack_4.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 25));
		txtrTrack_4.setEditable(false);
		txtrTrack_4.setBackground(new Color(237, 234, 237));
		txtrTrack_4.setBounds(303, 35, 165, 31);
		
		JPanel works_panel = new JPanel();
		works_panel.setBorder(null);
		works_panel.setLayout(null);
		works_panel.setBackground(new Color(255, 255, 255));
		works_panel.setBounds(0, 222, 1076, 984);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 0, 1066, 485);
		//customize the vertical scroll bar
		scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());
		works_panel.add(scrollPane);
		
		JLabel lbl_projects = new JLabel("");
		lbl_projects.setBackground(new Color(255, 255, 255));
		lbl_projects.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\pictures\\works\\collection\\Personal Project.png"));
		scrollPane.setViewportView(lbl_projects);
		
		contentPane.add(content_btn);
		contentPane.add(return_btn);
		contentPane.add(next_btn);
		contentPane.add(txtrPersonalProjects);
		contentPane.add(img);
		contentPane.add(txtrTrack_4);
		contentPane.add(works_panel);
	
	}

}
