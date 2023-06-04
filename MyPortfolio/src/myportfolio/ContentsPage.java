package myportfolio;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ContentsPage extends Frame {

	private JPanel contentPane;	
	
	public void openContentsPage() {
		ContentsPage content = new ContentsPage();
        FrameUtils.openFrame(content);
        FrameUtils.closeCurrentFrame(this);
	}
	
	public void openPersonalInfoPage() {
	    PersonalInfoPage info = new PersonalInfoPage();
	    FrameUtils.openFrame(info);
        FrameUtils.closeCurrentFrame(this);
	}
	
	public void openLogofolio() {
	    Logofolio logo = new Logofolio();
	    FrameUtils.openFrame(logo);
        FrameUtils.closeCurrentFrame(this);
	}

	public void openPosters() {
	    Posters poster = new Posters();
	    FrameUtils.openFrame(poster);
        FrameUtils.closeCurrentFrame(this);
	}

	public void openPersonalProject() {
	    PersonalProject personal = new PersonalProject();
	    FrameUtils.openFrame(personal);
        FrameUtils.closeCurrentFrame(this);
	}
	
			//method to create a button with common properties
			public JButton createButton(String text, String iconPath, int x, int y) {
			    JButton button = new JButton(text);
			    button.setIcon(new ImageIcon(iconPath));
			    button.setBorderPainted(false);
			    button.setBackground(new Color(237, 234, 237));
			    button.setBounds(x, y, 40, 31);
			    return button;
			}
					
			//method to create a JLabel with an image icon
			public JLabel createImageLabel(String imagePath, int x, int y) {
			JLabel label = new JLabel("");
			label.setIcon(new ImageIcon(imagePath));
			label.setBounds(x, y, 27, 29);
			return label;
			}
			
			//method to create a JLabel with an image icon
			public JLabel createImageLabel(String imagePath, int x, int y, int width, int height) {
			    JLabel lbl_profile_img = new JLabel("");
			    lbl_profile_img.setIcon(new ImageIcon(imagePath));
			    lbl_profile_img.setBounds(x, y, width, height);
			    return lbl_profile_img;
			}

			//method to create a JLabel with text and font
			public JLabel createLabel(String text, Font font, Color foregroundColor, int x, int y, int width, int height) {
			    JLabel label = new JLabel(text);
			    label.setForeground(foregroundColor);
			    label.setFont(font);
			    label.setBounds(x, y, width, height);
			    return label;
			}

			//method to create a JTextArea with text, font, and colors
			public JTextArea createTextArea(String text, Font font, Color foregroundColor, Color backgroundColor, int x, int y, int width, int height) {
			    JTextArea textArea = new JTextArea();
			    textArea.setEditable(false);
			    textArea.setText(text);
			    textArea.setForeground(foregroundColor);
			    textArea.setFont(font);
			    textArea.setBackground(backgroundColor);
			    textArea.setBounds(x, y, width, height);
			    return textArea;
			}
		    
			
	public ContentsPage() { 
		
		super("Contents Page", 1080, 620);

		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 234, 237));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//button for interests page
		JButton postersBtn = createButton("", "D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\play_btn.png", 844, 347);
		postersBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        openPosters();
		    }
		});

		//button for collection of works page
		JButton worksBtn = createButton("", "D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\play_btn.png", 844, 407);
		worksBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        openPersonalProject();
		    }
		});

		//button for hobbies page
		JButton logoBtn = createButton("", "D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\play_btn.png", 844, 288);
		logoBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        openLogofolio();
		    }
		});

		//button for personal information page
		JButton personalInfoBtn = createButton("", "D:\\LAZARO\\MyPortfolio\\imgs\\buttons\\play_btn.png", 844, 227);
		personalInfoBtn.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		        openPersonalInfoPage();
		    }
		});

        
		//add buttons to the content pane
		contentPane.add(postersBtn);
		contentPane.add(worksBtn);
		contentPane.add(logoBtn);
		contentPane.add(personalInfoBtn);
	
		
		//displayContent_panel
		JPanel displayContent_panel = new JPanel();
		displayContent_panel.setBackground(new Color(75, 91, 99));
		displayContent_panel.setBounds(0, 0, 437, 581);
		contentPane.add(displayContent_panel);
		displayContent_panel.setLayout(null);

		//profile_pic label (image)
		JLabel profile_pic = createImageLabel("D:\\LAZARO\\MyPortfolio\\imgs\\pictures\\profile_nat.png", -26, 11, 395, 294);
		displayContent_panel.add(profile_pic);

		//content_lbl label
		JLabel content_lbl = createLabel("The Content", new Font("Palatino Linotype", Font.BOLD | Font.ITALIC, 40), new Color(255, 255, 255), 107, 269, 231, 92);
		displayContent_panel.add(content_lbl);

		//playlist_lbl label
		JLabel playlist_lbl = createLabel("PLAYLIST", new Font("Microsoft JhengHei UI Light", Font.PLAIN, 20), new Color(255, 255, 255), 230, 330, 94, 31);
		displayContent_panel.add(playlist_lbl);

		//txtrBio text area
		JTextArea txtBio = createTextArea("     \" I always love to work on \r\n something that lets me explore \r\n       new concept and ideas \"", 
		new Font("Microsoft JhengHei UI Light", Font.PLAIN, 13), new Color(255, 255, 255), new Color(75, 91, 99), 107, 372, 197, 58);
		txtBio.setEditable(false);
		displayContent_panel.add(txtBio);

		//display_icons label (image)
		JLabel display_icons = createImageLabel("D:\\LAZARO\\MyPortfolio\\imgs\\icons\\content_icons.png", -42, 455, 334, 41);
		displayContent_panel.add(display_icons);

		//txtrTheConten text area
		JTextArea txtrTheContent = createTextArea("THE CONTENT", new Font("Microsoft YaHei UI", Font.BOLD, 40), new Color(7, 59, 76), new Color(237, 234, 237), 517, 79, 299, 56);
		contentPane.add(txtrTheContent);

		//txtrPlaylist and tracks text area
		JTextArea txtrPlaylist = createTextArea("PLAYLIST", new Font("Microsoft YaHei UI", Font.BOLD, 30), new Color(75, 91, 99), new Color(237, 234, 237), 517, 135, 149, 43);
		contentPane.add(txtrPlaylist);
		JTextArea txtrTracks = createTextArea("| 4 tracks", new Font("Microsoft YaHei UI", Font.PLAIN, 16), new Color(75, 91, 99), new Color(237, 234, 237), 670, 146, 89, 31);
		contentPane.add(txtrTracks);

		//txtrPlaylist_X text areas (numbers)
		JTextArea txtrPlaylist_1 = createTextArea("01.", new Font("Microsoft YaHei UI", Font.BOLD, 15), new Color(75, 91, 99), new Color(237, 234, 237), 517, 234, 27, 24);
		contentPane.add(txtrPlaylist_1);
		JTextArea txtrPlaylist_2 = createTextArea("02.", new Font("Microsoft YaHei UI", Font.BOLD, 15), new Color(75, 91, 99), new Color(237, 234, 237), 517, 295, 27, 24);
		contentPane.add(txtrPlaylist_2);
		JTextArea txtrPlaylist_3 = createTextArea("03.", new Font("Microsoft YaHei UI", Font.BOLD, 15), new Color(75, 91, 99), new Color(237, 234, 237), 517, 354, 27, 24);
		contentPane.add(txtrPlaylist_3);
		JTextArea txtrPlaylist_4 = createTextArea("04.", new Font("Microsoft YaHei UI", Font.BOLD, 15), new Color(75, 91, 99), new Color(237, 234, 237), 517, 414, 27, 24);
		contentPane.add(txtrPlaylist_4);

		//txtrPersonalInformation text area
		JTextArea txtrPersonalInformation = createTextArea("Personal Information", new Font("Microsoft YaHei UI", Font.BOLD, 20), new Color(7, 59, 76), new Color(237, 234, 237), 554, 229, 229, 29);
		contentPane.add(txtrPersonalInformation);

		//txtrMyHobbies text area
		JTextArea txtrLogofolio = createTextArea("Logofolio", new Font("Microsoft YaHei UI", Font.BOLD, 20), new Color(7, 59, 76), new Color(237, 234, 237), 554, 290, 133, 31);
		contentPane.add(txtrLogofolio);

		//txtrInterests text area
		JTextArea txtrPosters = createTextArea("Posters", new Font("Microsoft YaHei UI", Font.BOLD, 20), new Color(7, 59, 76), new Color(237, 234, 237), 554, 349, 229, 31);
		contentPane.add(txtrPosters);

		//txtrCollectionOfWorks text area
		JTextArea txtrPersonalProjects = createTextArea("Personal Projects", new Font("Microsoft YaHei UI", Font.BOLD, 20), new Color(7, 59, 76), new Color(237, 234, 237), 554, 409, 241, 31);
		contentPane.add(txtrPersonalProjects);
	
		//array of file paths for 'loop' icon 
		String[] loopIcons = {
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\loop_btn.png",
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\loop_btn.png",
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\loop_btn.png",
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\loop_btn.png"
			};

		//array of file paths for 'more' icon 
		String[] moreIcons = {
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\more_btn.png",
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\more_btn.png",
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\more_btn.png",
			    "D:\\LAZARO\\MyPortfolio\\imgs\\icons\\more_btn.png"
			};
		
			//starting coordinates for the loop and more icons
			int startX = 894;
			int startY = 229;
			int yOffset = 61;

			//loop to create and add loop and more icons to the content pane
			for (int i = 0; i < 4; i++) {
			    JLabel loopLabel = createImageLabel(loopIcons[i], startX, startY + (i * yOffset));
			    contentPane.add(loopLabel);

			    JLabel moreLabel = createImageLabel(moreIcons[i], startX + 43, startY + (i * yOffset));
			    contentPane.add(moreLabel);
			}

			JSeparator separator = new JSeparator();
			separator.setBounds(107, 347, 113, 2);
			displayContent_panel.add(separator);
			
			JSeparator separator_1 = new JSeparator();
			separator_1.setBackground(new Color(75, 91, 99));
			separator_1.setBounds(517, 269, 447, 2);
			contentPane.add(separator_1);
			
			JSeparator separator_2 = new JSeparator();
			separator_2.setBackground(new Color(75, 91, 99));
			separator_2.setBounds(517, 330, 447, 2);
			contentPane.add(separator_2);
			
			JSeparator separator_3 = new JSeparator();
			separator_3.setBackground(new Color(75, 91, 99));
			separator_3.setBounds(517, 389, 447, 2);
			contentPane.add(separator_3);
			
			JSeparator separator_4 = new JSeparator();
			separator_4.setBackground(new Color(75, 91, 99));
			separator_4.setBounds(517, 449, 447, 2);
			contentPane.add(separator_4);
				
	}
}


