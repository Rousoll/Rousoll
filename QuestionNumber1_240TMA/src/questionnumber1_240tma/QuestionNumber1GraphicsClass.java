/*
@Author : Rousol Jamal Sabobeh . 
ID Number : 20411698 .
Course Name : TM240 .
Year : Summer Semester , 2022 . 

*******************************************************************
    Question Number 1. 
            Creating a circle that includes lines in it while zooming in and out 
*******************************************************************

*/
package questionnumber1_240tma;
/*
------------------------------------------------------------------------------------------------------
---------------------------------- import all the needed libraries --------------------------------
------------------------------------------------------------------------------------------------------
*/
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPanel;
import javax.swing.Timer;
// creating a class , extend the JPanel Class and Implement the ActionListen
public class QuestionNumber1GraphicsClass extends JPanel implements ActionListener{
   // giving a value for the radius by 250 
    double Radius = 250;
    // timer for the animation
    Timer AnimationTimer = new Timer(25, this);
    // to make the animation grow 
    boolean grow = true;
    
    @Override
     public void actionPerformed(ActionEvent Action) {
        SuperSizeCircle();
        repaint();
    }
     // Starting the Animation
         public QuestionNumber1GraphicsClass() {
        AnimationTimer.start();
    }
         
    @Override
    public void paintComponent(Graphics xcv) {
        // inherit the paintComponent method
        super.paintComponent(xcv);
        //  Create an object from thr Graphics2D class
        Graphics2D Grahpics2DClassObject = (Graphics2D) xcv;
        // Creating an object from the color class and use integer numeric data type
        Color CircleRGBColor = new Color(255, 0, 0);
        /*
        RGB means : Red , Green & Blue . 
        RGB Color range from 0 till 255. 
        so the first value will be 255 because the color is RED, and the other two 
        are going to be 0, so they don't affect the color
        */
        Grahpics2DClassObject.setColor(CircleRGBColor);
        // set to the object a color
        Grahpics2DClassObject.translate(250, 250);
        // centering the object in the frame
        int NumberOfPoints =500;
        // the drawing points 
        int Xais1 = (int)Radius;
        // the xais starting point 
        int Yais1 = 0;
        int v;
        int Xais2,Yais2;
        // the second point
        for ( v = 0; v < NumberOfPoints; v++) {
            /*
            ------------------------------------------------------------------------
            Creating a loop to go through all the number of points we added . 
            ---
            intialise v by 0
            -- 
            while v is less that the number of points , keep the loop on run
            
            */
            double xvb = v * Math.PI/90;
            // the result of multiplying the iteration by PI over 90
            Xais2 = (int) ((Radius) * Math.cos(xvb)) ;
           
            Yais2 = (int) ((Radius) * Math.sin(xvb));
            /*
            now calculating the second point 
            x2 is equal to radius  * Cos(xvb)
            y2 is equal to radius  * Sin(xvb)
            */ 
            Grahpics2DClassObject.drawLine(Xais1, Yais1, Xais2, Yais2);
            // drawig lines by the axis and yais 
            Grahpics2DClassObject.drawLine(0, 0, Xais2,Yais2);
            // drawig lines by the axis and yais 
            Xais1 = Xais2;
            Yais1 = Yais2;
        }   
    } // end of the public paint component 
   // the grow animation part 
    public void SuperSizeCircle() {
        // using if statments 
        if (Radius >= 200) {
        // if the radius is bigger than 200; Stop
            grow = false;
        }
        if (Radius <= 20) {
        // if raidus less than 20; keep the animation on
            grow = true;
        }
        if (grow){   
            
            Radius += 3;
        } 
        else {  
            Radius -= 3;
        }
    } // end of the public oversize method 
} // end of the class
