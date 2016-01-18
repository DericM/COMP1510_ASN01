package q5;

import javax.swing.JFrame;
/**
 * <p>This class is just a launching point for the meat of the program. 
 * We create the frame object here and display it and then add a 
 * PieChartPanel object to it so that can build the pie chart.</p>
 *
 * @author Deric
 * @version 1.0
 */
public class PieChart extends JFrame {

    
    /**
     * 
     */
    private static final long serialVersionUID = -5890104607890453878L;

    /**
     * <p>The main method.</p>
     * 
     * @param args not used.
     */
    public static void main(String[] args) {
        
        JFrame frame = new JFrame("Pie Chart");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new PieChartPanel());
        frame.pack();
        frame.setVisible(true); 
        
    }
}