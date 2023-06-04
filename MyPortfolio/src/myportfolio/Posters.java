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

public class Posters extends Frame {

	private JPanel contentPane;
	private Clip clip;
	private ContentsPage content;
	JButton next_btn = new JButton("");
	JButton return_btn = new JButton("");

	private void playMusic() {
		try {
			// Load the audio file
			AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:\\LAZARO\\MyPortfolio\\bgm\\phum.wav"));

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
	public Posters() {
		super("Collection of Posters", 1082, 740);
		content = new ContentsPage();
		playMusic();
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 234, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		// ActionListener for the next button
		next_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopMusic();
				content.openPersonalProject();
				dispose();
			}
		});

		// ActionListener for the return button
		return_btn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				stopMusic();
				content.openLogofolio();
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

		// Set icons, positions, and styles for buttons
		content_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\content_btn.png"));
		content_btn.setBorderPainted(false);
		content_btn.setBackground(new Color(237, 234, 237));
		content_btn.setBounds(302, 178, 32, 31);

		next_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\next_btn.png"));
		next_btn.setBorderPainted(false);
		next_btn.setBackground(new Color(237, 234, 237));
		next_btn.setBounds(730, 178, 25, 31);

		return_btn.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\return_btn.png"));
		return_btn.setBorderPainted(false);
		return_btn.setBackground(new Color(237, 234, 237));
		return_btn.setBounds(685, 178, 25, 31);

		// Create and style a text area for "POSTERS"
		JTextArea txtrPosters = new JTextArea();
		txtrPosters.setText("POSTERS");
		txtrPosters.setForeground(new Color(7, 59, 76));
		txtrPosters.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 35));
		txtrPosters.setEditable(false);
		txtrPosters.setBackground(new Color(237, 234, 237));
		txtrPosters.setBounds(303, 77, 477, 43);

		// Create and style a label for an image
		JLabel img = new JLabel("");
		img.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\tracks\\track03.png"));
		img.setBounds(292, 141, 488, 65);

		// Create and style a text area for "TRACK 03."
		JTextArea txtrTrack = new JTextArea();
		txtrTrack.setText("TRACK 03.");
		txtrTrack.setForeground(new Color(75, 91, 99));
		txtrTrack.setFont(new Font("Microsoft YaHei UI", Font.BOLD, 25));
		txtrTrack.setEditable(false);
		txtrTrack.setBackground(new Color(237, 234, 237));
		txtrTrack.setBounds(303, 35, 165, 31);

		// Create a scroll pane for the posters panel
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setBounds(0, 220, 1066, 481);

		// Customize the vertical scroll bar
		scrollPane.getVerticalScrollBar().setUI(new CustomScrollBarUI());

		JLabel posters_panel = new JLabel("");
		scrollPane.setViewportView(posters_panel);
		posters_panel.setIcon(new ImageIcon("D:\\LAZARO\\MyPortfolio\\imgs\\pictures\\works\\collection\\Poster.png"));

		// Add components to the content pane
		contentPane.add(content_btn);
		contentPane.add(next_btn);
		contentPane.add(return_btn);
		contentPane.add(txtrPosters);
		contentPane.add(img);
		contentPane.add(scrollPane);
		contentPane.add(txtrTrack);
	}
}
