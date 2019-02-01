/*
package tree;

import java.awt.*;

public class Tree {

        Graphics graphics;
        int startX;
        int startY;
        int size;


        public Sierpinsky(int startX, int startY, int size){

            this.startX = startX;
            this.startY = startY;
            this.size = size;

        }

        public void circleParameters(Graphics graphics) {
            drawSierpinsky(graphics, startX, startY, size);
        }

        public static void drawSierpinsky(Graphics graphics, int startX, int startY, int size){
            if (size > 0  ) {
                drawSierpinsky(graphics, startX-size*2/3, startY-size*2/3, size/3);
                drawSierpinsky(graphics, startX+size/3, startY-size*2/3, size/3);
                drawSierpinsky(graphics, startX+size*4/3, startY-size*2/3, size/3);

                drawSierpinsky(graphics, startX-size*2/3, startY+size/3, size/3);

                drawSierpinsky(graphics, startX-size*2/3, startY+size*4/3, size/3);
                drawSierpinsky(graphics, startX+size/3, startY+size*4/3, size/3);
                drawSierpinsky(graphics, startX+size*4/3, startY+size*4/3, size/3);

                drawSierpinsky(graphics, startX+size*4/3, startY+size/3, size/3);

                Color c = new Color((int)(255*Math.random()), (int)(255*Math.random()),(int)(255*Math.random()));

                graphics.setColor(Color.BLACK);

                graphics.fillRect(startX, startY, size, size);
                graphics.fillRect(startX-size*2/3, startY - size * 2/3, size/3, size/3);
                graphics.fillRect(startX+size/3, startY - size * 2/3, size/3, size/3);
                graphics.fillRect(startX+size*4/3, startY - size * 2/3, size/3, size/3);graphics.fillRect(startX+size/3, startY - size * 2/3, size/3, size/3);

                graphics.fillRect(startX-size*2/3, startY + size / 3, size/3, size/3);
                graphics.fillRect(startX-size*2/3, startY + size * 4 / 3, size/3, size/3);

                graphics.fillRect(startX+size/3, startY + size * 4/3, size/3, size/3);
                graphics.fillRect(startX+size*4/3, startY + size * 4/3, size/3, size/3);

                graphics.fillRect(startX+size*4/3, startY + size /3, size/3, size/3);

            }
        }
    }

}
*/
