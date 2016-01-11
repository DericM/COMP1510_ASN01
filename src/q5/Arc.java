package q5;

import java.awt.Color;
import java.awt.Graphics;

/**
 * Represents an arc with a position, size, and color.
 *
 * @author Deric
 * @version 1
 */
public class Arc {
    
    /** X position of the Arc. */
    private int x;
    /** Y position of the Arc. */
    private int y;
    /** Width of the Arc. */
    private int width;
    /** Height of the Arc. */
    private int height;
    /** Starting angle of the Arc. */
    private int arcStart;
    /** Angle of the arc in degrees. */
    private int arcAngle;
    /** Color of the arc. */
    private Color color;
    
    /**
     * Constructor: Sets up this arc with the specified parameters.
     * @param x The x coordinates of the upper left corner of the box
     * @param y The y coordinates of the upper left corner of the box
     * @param width The width of box containing the circle
     * @param height The height of the box containing the circle
     * @param arcStart The starting angle of the arc
     * @param arcAngle The length of the arc in degrees.
     * @param color The fill color of the arc.
     */
    public Arc(int x, int y, int width, int height, 
            int arcStart, int arcAngle, Color color) {
        super();
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.arcStart = arcStart;
        this.arcAngle = arcAngle;
        this.color = color;
    }
    
    /**
     * Draws this arc object on the Graphics object/context.
     * @param page The graphics object that we draw on
     */
    public void draw(Graphics page) {
        page.setColor(color);
        page.fillArc(x, y, width, height, arcStart, arcAngle);
    }

}
