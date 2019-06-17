  
               
import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;

public class DrawingPicture extends JComponent
{
    public void paintComponent(Graphics g){

        Graphics2D g2 = (Graphics2D)g;
        
	// comment this out once you have finished
        drawGrid(g2);
	
	/******** Put your code here  *********/

	g2.setColor(Color.yellow);
	Rectangle r1 = new Rectangle(50, 50, 600, 400);
        g2.fill(r1);
        g2.setColor(Color.red);
	Rectangle r2 = new Rectangle(50, 125, 600 , 200);
        g2.fill(r2);
        g2.setColor(Color.blue);
	Rectangle r3 = new Rectangle(50, 225, 600, 100);
	g2.fill(r3);
        



   	
    }
    public void drawGrid(Graphics g2){
        g2.setColor(new Color(211, 211, 211));
        
        // Draw vertical lines
        for(int x = 0; x < 1000; x += 50){
            g2.drawLine(x, 0, x, 1000);
            g2.drawString("" + x, x, 10);
        }
        
        // Draw horizontal lines
        for(int y = 50; y < 1000; y += 50){
            g2.drawLine(0, y, 1000, y);
            g2.drawString("" + y, 0, y);
        }
	g2.setColor(Color.black);
    }
}