import java.applet.Applet;
import java.awt.*;

public class appletEg extends Applet
{
    public void paint(Graphics g)
    {
        g.drawOval(50,100,50,50);
        g.setColor(Color.red);
        g.drawRect(150,100,70,30);
        g.setColor(Color.blue);
        g.drawLine(250,200,50,300);
        g.setColor(Color.black);
    }
 } 
