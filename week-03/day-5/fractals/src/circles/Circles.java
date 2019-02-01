package circles;

import java.awt.*;

public class Circles {
    Graphics graphics;
    int startX;
    int startY;
    int height;
    int width;


    public Circles(int startX, int startY, int height, int width){

        this.startX = startX;
        this.startY = startY;
        this.height = height;
        this.width = width;
    }

    public void circleParameters(Graphics graphics) {
/*        int startX = 450;
        int startY = 0;
        int height = 400;
        int width = 500;*/
        graphics.drawLine(startX-width, startY, startX + width, startY);
        graphics.drawLine(startX - width, startY, startX, startY + height * 2);
        graphics.drawLine(startX + width, startY, startX, startY + height * 2);

        drawCircles(graphics, startX, startY, height, width);
    }
    public static void drawCircles(Graphics graphics, int startX, int startY, int height, int width){
        if (height > 5  ) {

            Color c = new Color((int)(255*Math.random()), (int)(255*Math.random()),(int)(255*Math.random()));

            drawCircles(graphics, startX - width / 2, startY, height / 2, width / 2);
            drawCircles(graphics, startX + width / 2 , startY, height / 2, width / 2);
            drawCircles(graphics, startX, startY + height, height/2, width / 2);

            graphics.setColor(c);
            graphics.drawLine(startX, startY, startX + width / 2, startY + height);
            graphics.drawLine(startX, startY, startX - width / 2, startY + height);
            graphics.drawLine(startX - width / 2, startY + height, startX + width / 2, startY + height);
        }
    }
}
