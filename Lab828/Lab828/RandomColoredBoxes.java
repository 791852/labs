
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class RandomColoredBoxes extends Canvas
{
   public RandomColoredBoxes()
   {
      setBackground(Color.white);
   }

   public void paint(Graphics window)
   {
      for(int run=50; run<=360; run+=20)
      {
			window.setColor(new Color((int)(Math.random()*256),(int)(Math.random()*256),(int)(Math.random()*256)));
			
			for(int i=0; i<20000000;i++){ } 
			
			window.fillRect( run, run, 15, run/3);
      }
   }
}