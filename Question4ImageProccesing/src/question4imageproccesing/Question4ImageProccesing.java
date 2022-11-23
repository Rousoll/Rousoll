/*
@Author : Rousol Jamal Sabobeh . 
ID Number : 20411698 .
Course Name : TM240 .
Year : Summer Semester , 2022 . 
----------------------------------------------------------------------------------------
Drawing The Animation Car with Gradient Paint  . 
----------------------------------------------------------------------------------------
*/
package question4imageproccesing;
// importing the needed libraries 
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
// extend JApplet 
public class Question4ImageProccesing extends JApplet {
// main method 
    public static void main(String[] args) {
        // creating a question4frame 
JFrame question4frame = new JFrame();
// set a title to the frame
        question4frame.setTitle("Image  processing question 4");
        question4frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        JApplet applete = new Question4ImageProccesing();
        applete.init();
        // get content of the frame 
        question4frame.getContentPane().add(applete);
        question4frame.pack();
        question4frame.setVisible(true);
    }
    public void init() {
        JPanel panel = new TheImplementingClass();
        getContentPane().add(panel);
    }
}