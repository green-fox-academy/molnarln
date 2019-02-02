package tree;

import java.awt.*;

public class Tree {

    Graphics graphics;
    double startX;
    double startY;
    double endX;
    double endY;
    double angle;
    double size;


    public Tree(double startX, double startY, double size, double angle){

        this.startX = startX;
        this.startY = startY;
        this.angle = angle;
        this.size = size;

    }

    public void treeParameters(Graphics graphics) {
        drawTree(graphics, startX, startY, size, angle);
    }

    public static void drawTree(Graphics graphics, double startX, double startY, double size, double angle){
        if (size > 0  ) {
            Color c = new Color((int)(255*Math.random()), (int)(255*Math.random()),(int)(255*Math.random()));

            graphics.setColor(Color.BLACK);

            double endXA   = startX + size * Math.sin(angle);
            double endYA   = startY + size * Math.cos(angle);
            graphics.drawLine((int)startX, (int)startY, (int)endXA, (int)endYA);

            double endXB   = startX + size * Math.sin(180-angle);
            double endYB   = startY + size * Math.cos(180-angle);
            graphics.drawLine((int)startX, (int)startY, (int)endXB, (int)endYB);

            drawTree(graphics, endXB, endYB, size-1, angle);
            drawTree(graphics, endXA, endYA, size-1, angle);

        }
    }
}

