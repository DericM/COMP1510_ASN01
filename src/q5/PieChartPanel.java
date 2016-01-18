package q5;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 * <p>This is a panel that we will build the pie chart on. </p>
 * 
 * @author Deric
 * @version 1.0
 */
class PieChartPanel extends JPanel {

    /**
     * 
     */
    private static final long serialVersionUID = 7738950817773443623L;
    
    /**<p>Arc 1.</p>*/
    private final Arc arc1;
    /**<p>Arc 2.</p>*/
    private final Arc arc2;
    /**<p>Arc 3.</p>*/
    private final Arc arc3;
    /**<p>Arc 4.</p>*/
    private final Arc arc4;
    /**<p>Arc 5.</p>*/
    private final Arc arc5;
    /**<p>Arc 6.</p>*/
    private final Arc arc6;
    /**<p>Arc 7.</p>*/
    private final Arc arc7;
    /**<p>Arc 8.</p>*/
    private final Arc arc8;
    

    /**
     * <p>This is where we build the arcs according to our specifications,
     *  and point our references to them.</p>
     */
    PieChartPanel() {
        
        //Panel variables
        //width of panel
        final int panelWidth = 600;
        //height of panel
        final int panelHeight = 400;
        
        //arc variables
        //x coordinates
        final int pieX = 140;
        //y coordinates
        final int pieY = 75;
        //pie width
        final int pieWidth = 300;
        //pie height
        final int pieHeight = 300;
        //arc length
        final int arcAngle = 45;
        //starting angle
        int arcStart = 0;
        
        
        //Build each arc and set its reference.
        arc1 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.blue);
        
        //increment the arcStart for the next arc
        arcStart += arcAngle;
        arc2 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.green);
        
        arcStart += arcAngle;
        arc3 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.red);
        
        arcStart += arcAngle;
        arc4 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.yellow);
        
        arcStart += arcAngle;
        arc5 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.cyan);
        
        arcStart += arcAngle;
        arc6 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.magenta);
        
        arcStart += arcAngle;
        arc7 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.orange);
        
        arcStart += arcAngle;
        arc8 = new Arc(pieX, pieY, pieWidth, 
                pieHeight, arcStart, arcAngle, Color.pink);
    
        
        //set panel size and background color
        setPreferredSize(new Dimension(panelWidth, panelHeight));
        setBackground(Color.black);
    
    }

    /**
     * <p>Called by the environment when the frame needs to be updated.</p>
     *
     * @param page the graphics context with which we paint into.
     */
    public void paintComponent(Graphics page) {
        
        //text x and y position
        final int xPos = 250;
        final int yPos = 20;
        
        super.paintComponent(page);
        
        //draw the text
        page.setColor(Color.white);
        page.drawString("Something interesting ...", xPos, yPos);
        
        //draw all the arcs to the panel.
        arc1.draw(page);
        arc2.draw(page);
        arc3.draw(page);
        arc4.draw(page);
        arc5.draw(page);
        arc6.draw(page);
        arc7.draw(page);
        arc8.draw(page);
        
    }
}