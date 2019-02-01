package circles;

import java.awt.*;

public class Circles {
    Graphics graphics;
    int startX;
    int startY;
    int radius;


    public Circles(int startX, int startY, int radius){

        this.startX = startX;
        this.startY = startY;
        this.radius = radius;

    }

    public void circleParameters(Graphics graphics) {
        drawCircles(graphics, startX, startY, radius);
    }

    public static void drawCircles(Graphics graphics, int startX, int startY, int radius){
        if (radius > 5  ) {

            Color c = new Color((int)(255*Math.random()), (int)(255*Math.random()),(int)(255*Math.random()));

/*            drawCircles(graphics, startX - radius / 2, startY, radius / 2);
            drawCircles(graphics, startX + radius / 2 , startY, radius / 2);
            drawCircles(graphics, startX, startY + radius, radius/2);*/

            /*graphics.setColor(c);*/
            graphics.drawOval(startX, startY, radius, radius);
            graphics.drawOval(startX-radius / 2, startY + radius, radius, radius);
            graphics.drawOval(startX+radius / 2, startY + radius, radius, radius);



        }
    }
}
