import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;

import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class RainbowBoxFunctionV2 {
    public static void mainDraw(Graphics graphics) {
        // Create a square drawing function that takes 3 parameters:
        // The square size, the fill color, graphics
        // and draws a square of that size and color to the center of the canvas.
        // Create a loop that fills the canvas with rainbow colored squares.

        int x=25;

        ArrayList<Color> rainbowColor = new ArrayList<>();

        rainbowColor.add(new Color(148, 0, 211));
        rainbowColor.add(new Color(75, 0, 130));
        rainbowColor.add(new Color(0, 0, 255));
        rainbowColor.add(new Color(0, 255, 0));
        rainbowColor.add(new Color(255, 255, 0));
        rainbowColor.add(new Color(255, 127, 0));
        rainbowColor.add(new Color(	255, 0 , 0));
//If the ArrayList is passed toward the function, use the color set above.

        Color[] rainbowArrayColor = new Color[7];
        rainbowArrayColor[0] = new Color(148, 0, 211);
        rainbowArrayColor[1] = new Color(75, 0, 130);
        rainbowArrayColor[2] = new Color(0, 0, 255);
        rainbowArrayColor[3] = new Color(0, 255, 0);
        rainbowArrayColor[4] = new Color(255, 255, 0);
        rainbowArrayColor[5] = new Color(255, 127, 0);
        rainbowArrayColor[6] = new Color(	255, 0 , 0);

//If the ArrayList is passed toward the function, use the color set above.
        rainbowSquaring(x, rainbowArrayColor, graphics);

    }
    public static void rainbowSquaring(int x, Color[] rainbowArrayColor, Graphics graphics){

        for (int i = 0; i < 7; i++) {
        graphics.setColor(rainbowArrayColor[i]);
        graphics.fillRect(i*x, i*x, 320-i*x*2,320-i*x*2 );

        }

    }

    // Don't touch the code below
    static int WIDTH = 320;
    static int HEIGHT = 320;

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Drawing");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        ImagePanel panel = new ImagePanel();
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        jFrame.add(panel);
        jFrame.setLocationRelativeTo(null);
        jFrame.setVisible(true);
        jFrame.pack();
    }

    static class ImagePanel extends JPanel {
        @Override
        protected void paintComponent(Graphics graphics) {
            super.paintComponent(graphics);
            mainDraw(graphics);
        }
    }
}