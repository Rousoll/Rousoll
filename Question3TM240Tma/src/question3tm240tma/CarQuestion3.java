
package question3tm240tma;
/*
importing all the needed libraries 
*/
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;
public class CarQuestion3 extends JPanel implements Runnable { 
    // to use the thread feature
    public CarQuestion3() {
        // creating a constructor for the class
        setPreferredSize(new Dimension(640, 480));
        /*
        -------------------------------------
        set a new dimension to the object
        -------------------------------------
        creating a thread and start it 
        -------------------------------------
        */
        Thread threadfortheq = new Thread(this);
        threadfortheq.start();
    }
    // declar a variable called gvb
    int gvb = 0;
    public void paintComponent(Graphics g) {
        // extend the paintComponent method 
        super.paintComponent(g);
        Graphics2D graphicsforquestion3 = (Graphics2D) g;
        // creating an object from the graphics2D class
        GradientPaint TheCarPaintGradient = 
                new GradientPaint(0, 0, Color.red, 640, 640, Color.green, false);
        // creating an object for the gradient pain by a false boolean 
        graphicsforquestion3.setPaint(TheCarPaintGradient);
        // paint the car
        Shape CarBodyQ3 = new Rectangle2D.Double(gvb,300, 500, 120);
        // creating the car body by a rectangle 
        Shape CarTopBody = new Ellipse2D.Double(gvb+80,250,260,170);
        // creating the car top body by an ellipse
        Shape CarFrontWheel = new Ellipse2D.Double(gvb+50,380,75, 65);
        // creating the car front wheel by an ellipse
        Shape CarBackWheel = new Ellipse2D.Double(gvb+300,380,75,65);
        // creating the car back wheel by an ellipse
        graphicsforquestion3.fill(CarBodyQ3);
        // filling the objects 
        graphicsforquestion3.fill(CarTopBody);
        // filling the objects 
        graphicsforquestion3.fill(CarFrontWheel);     
        // filling the objects 
        graphicsforquestion3.fill(CarBackWheel);       
        // filling the objects 
    }
    // now running the animation 
    public void run() {
        // declare vb
        int vb=0;
        while (vb<=640) {
            // while vb less than or equal 640
            gvb += 1;
            // if vb is equal to 640
            if(vb==640){
                // do
                gvb=0;
                 vb=0;
            }
            repaint();
            try {
                Thread.sleep(10);
            } catch (InterruptedException ex) {
            }
            vb++;
        }
    }
}