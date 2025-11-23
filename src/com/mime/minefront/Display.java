package com.mime.minefront;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Display extends Canvas{
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final String TITLE = "MineFront pre-alpha";
    public static void main(String[] args){
        Display game = new Display(); // creating object of this class. Can access the variables of this class.

        //Creating a JFrame (window, but in java)
        JFrame frame = new JFrame();
        frame.add(game); // Adding the display object to JFrame. So, the frame can access the methods and variables of the Display object.
        frame.setSize(WIDTH, HEIGHT); // Setting the size of the frame as 800*600.
        frame.setResizable(false); // I need to check out with ChatGPT to see what this means.
        frame.setVisible(true); // This as well.

        // Adding a print statement to check if we have to manually terminate the window.
        System.out.println("Running...");

        // Adding this line to terminate the window, whenever we hit the close button, thus we don't have to manually terminate it everytime.
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle(TITLE);
    }
}