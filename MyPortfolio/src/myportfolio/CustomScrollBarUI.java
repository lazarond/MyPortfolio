package myportfolio;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Path2D;

import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.plaf.basic.BasicScrollBarUI;

public class CustomScrollBarUI extends BasicScrollBarUI {
	
		private static final int SCROLL_BAR_WIDTH = 12; // Adjust the width of the scroll bar
	    private static final int BUTTON_SIZE = 16; // Adjust the size of the scroll arrow buttons
	    private static final Color SCROLL_BAR_COLOR = new Color(75, 91, 99); // Customize the scroll bar color
	    private static final Color BUTTON_COLOR = new Color(75, 91, 99); // Customize the scroll arrow button color
	    private static final int TRIANGLE_SIZE = 6;

	
    //override the necessary methods to customize the scroll bar appearance
    @Override
    protected void configureScrollBarColors() {
    	
        this.thumbColor = new Color(75,91,99); //customize the thumb color
        this.thumbDarkShadowColor = new Color(75,91,99); //customize the thumb dark shadow color
        this.thumbHighlightColor = new Color(75,91,99); //customize the thumb highlight color
        this.thumbLightShadowColor = new Color(75,91,99); //customize the thumb light shadow color
        this.trackColor = new Color(237,234,237); //customize the track color
        this.trackHighlightColor = new Color(237,234,237); //customize the track highlight color
        
    }
    
    @Override
    protected JButton createDecreaseButton(int orientation) {
        return new ScrollBarButton(orientation);
    }

    @Override
    protected JButton createIncreaseButton(int orientation) {
        return new ScrollBarButton(orientation);
    }

    // Custom scroll arrow button class
    private class ScrollBarButton extends JButton {
        private final int orientation;

        public ScrollBarButton(int orientation) {
            this.orientation = orientation;
            setPreferredSize(new Dimension(BUTTON_SIZE, BUTTON_SIZE));
            setBackground(BUTTON_COLOR);
            setFocusPainted(false);
        }

        @Override
        protected void paintComponent(Graphics g) {
        	 Graphics2D g2d = (Graphics2D) g.create();
             g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
             g2d.setColor(getBackground());

             // Draw a rounded rectangle as the button shape
             Shape buttonShape = new java.awt.geom.RoundRectangle2D.Float(0, 0, getWidth(), getHeight(), 8, 8);
             g2d.fill(buttonShape);

             // Draw a triangle arrow pointing up or down
             int x = (getWidth() - TRIANGLE_SIZE) / 2;
             int y = (getHeight() - TRIANGLE_SIZE) / 2;

             Path2D triangle = new Path2D.Double();
             if (orientation == SwingConstants.NORTH) { // Up arrow
                 triangle.moveTo(x, y + TRIANGLE_SIZE);
                 triangle.lineTo(x + TRIANGLE_SIZE, y + TRIANGLE_SIZE);
                 triangle.lineTo(x + (TRIANGLE_SIZE / 2), y);
             } else if (orientation == SwingConstants.SOUTH) { // Down arrow
                 triangle.moveTo(x, y);
                 triangle.lineTo(x + TRIANGLE_SIZE, y);
                 triangle.lineTo(x + (TRIANGLE_SIZE / 2), y + TRIANGLE_SIZE);
             }
             triangle.closePath();
             g2d.setColor(Color.WHITE);
             g2d.fill(triangle);

             g2d.dispose();
        }
    }
}
