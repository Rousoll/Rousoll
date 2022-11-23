/*
@Author : Rousol Jamal Sabobeh . 
ID Number : 20411698 .
Course Name : TM240 .
Year : Summer Semester , 2022 . 
----------------------------------------------------------------------------------------
Drawing The Animation Car with Gradient Paint  . 
----------------------------------------------------------------------------------------
*/
package question3tm240tma;
// importing the needed libraries
import java.awt.*;
import java.awt.geom.*;
import javax.swing.*;

public class Question3TM240Tma extends JApplet{
    // extends JApplet
    public static void main(String[] args) {
    // creating JPalletFrame 
JFrame JPalletFrame = new JFrame();
    //set a title to the frame
        JPalletFrame.setTitle(" Car Animation ");
        // set to close the frame
        JPalletFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // set another applet
        JApplet JpalletFramex = new Question3TM240Tma();
        JpalletFramex.init();
        // get the content from the pain
        JPalletFrame.getContentPane().add(JpalletFramex);
        JPalletFrame.pack();
        JPalletFrame.setVisible(true);
    }
    public void init() {
        JPanel panel2 = new CarQuestion3();
        getContentPane().add(panel2);
    }
    }
    

