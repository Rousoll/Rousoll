
package question4imageproccesing;
// import the necessary libraries 
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.ConvolveOp;
import java.awt.image.Kernel;
import java.awt.image.RescaleOp;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
// extend the JPanel class
public class TheImplementingClass extends JPanel {
    // creating a constructor 
    public TheImplementingClass() {
        // set the dimesnsion
        setPreferredSize(new Dimension(800, 800));
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        // creating an object from graphics2D 
        Graphics2D imageproccessingquestion = (Graphics2D) g;
        BufferedImage noisyimage = null;
        //using try and catch 
        try {
            noisyimage = ImageIO.read(new File("300x300.jpg"));
            // read the image to fix it 
        } catch (IOException e) {
        }
        // proccess the image 
        imageproccessingquestion.drawImage(noisyimage, 0, 0, this);
        // adding a text to the image 
        imageproccessingquestion.drawString("The Image i Entered ", 50, 250);
        /* 
        edge detection part 
        -----------------------
        adding the float values of the edge 
        ------------------------
        */
       float[] edge = {0f, -1f, 0f, -1f, 4f, -1f, 0f, -1f, 0f};
       // applying kernel 
       Kernel edgeKernel = new Kernel(3,3,edge);
       // applying Convolve
       ConvolveOp op = new ConvolveOp(edgeKernel);
       // using buffered image to filter it 
       BufferedImage img = op.filter(noisyimage, null);
       imageproccessingquestion.drawImage(img, 400, 0, null);
       imageproccessingquestion.drawString("Edge Detection ", 450, 250);
        /*
       remove the noise from the pic 
       ---------------------------------
       adding a float values 
       ---------------------------------
       */
        float[] noise = {1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f,
             1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f, 1.0f / 9.0f};
        // applying kernel 
        Kernel noiseKernel = new Kernel(3, 3, noise);
        // applying Convolve
        ConvolveOp op1 = new ConvolveOp(noiseKernel);
        // using buffered image 
        BufferedImage imimageproccessingquestion = op1.filter(noisyimage, null);
        imageproccessingquestion.drawImage(imimageproccessingquestion, 0, 400, null);
        //draw a smooth image
        imageproccessingquestion.drawString(" Remove noise from the image ", 50,650);
        // edge detection after removing the noise 
       float[] edge2 = {0f, -1f, 0f, -1f, 4f, -1f, 0f, -1f, 0f};
       Kernel edgeKernel2 = new Kernel(3,3,edge2);
       ConvolveOp op2 = new ConvolveOp(edgeKernel);
       BufferedImage img3 = op.filter(imimageproccessingquestion, null);
       imageproccessingquestion.drawImage(img3, 400, 400, null);
       imageproccessingquestion.drawString("Detect the edge after removing the noise", 450, 650);
    }

}