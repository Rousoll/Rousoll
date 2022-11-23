/*
@Author : Rousol Jamal Sabobeh . 
ID Number : 20411698 .
Course Name : TM240 .
Year : Summer Semester , 2022 . 

*******************************************************************
    Question Number 1. 
            Creating a circle that includes lines in it while zooming in and out 
            The Parametric Equation : (x2 is equal to radius  * Cos(),y2 is equal to radius  * Sin())
            
*******************************************************************

*/
package questionnumber1_240tma;
/* 
The Main Class 
--------------------------------------------
Firstly , importing the libraries we need.
--------------------------------------------

*/
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
/*
Naming the Main Class 
*/
public class QuestionNumber1_240TMA {
/*
    -------------------------------------------------------------
    Start to write the codes to run the shape and to test it 
    -------------------------------------------------------------
    */
    public static void main(String[] args) {
        /*
        -----------------------------------------------------
        Using swing to run the animation.
        -----------------------------------------------------
        Creating a void method called RunTheAnimation.
        -----------------------------------------------------
        */
        SwingUtilities.invokeLater(new Runnable() {
            
            /*
                 Creating a Runnable Class, or we can use a Lambada Exepression . 
                -------------------------------------
                SwingUtilities.invokeLater(() ->
                -------------------------------------
                     */
                 
            @Override
            /*
            ----------------------------------
            Overriding the method run , 
            ----------------------------------
            */
            public void run() {
                /*
                ------------------------------------------------------------
                Creating a Frame and give it a name 
                ------------------------------------------------------------
                */
                JFrame CircleMainFrame = new JFrame("Question Number 1 , TM240 , Circle Animation.");
                // creating an object from ( QuestionNumber1GraphicsClass ) 
                QuestionNumber1GraphicsClass CircleFrame = new QuestionNumber1GraphicsClass();
                // adding the object to the frame to test it
                CircleMainFrame.add(CircleFrame);
                // set a default close the frame once we're done
                CircleMainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                // give the frame a size by width and height
                CircleMainFrame.setSize(600, 600);
                // boolean the frame to set it visible 
                CircleMainFrame.setVisible(true);
                // Main Class Ended
                System.out.println("hello");
                
            } // end the run method
        }); // end the runnable 

    } // end the main class method
    
} // end the class
