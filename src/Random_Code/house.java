package Random_Code;

import java.awt.Color;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Polygon;

public class house extends Canvas 
{
    public house() 
    {
        setBackground(Color.WHITE);
    }
    public void paint(Graphics window)
    {
        window.setColor(Color.BLUE);
        window.drawRect(250, 300, 50, 125);
        window.fillRect(350, 300, 50, 135);
        window.setColor(Color.PINK);
        window.drawRect(200, 150, 350, 300);
        window.fillRect(200, 150, 350, 300);
        window.setColor(Color.GREEN);
        Polygon poly = new Polygon();
        poly.addPoint(100, 200);
        poly.addPoint(200, 400);
        poly.addPoint(300, 200);
        window.fillPolygon(poly);
    }
    public static void main(String[] args) 
    {
    	house h=new house();
    	h.paint(null);
    	
		
	}
    
}