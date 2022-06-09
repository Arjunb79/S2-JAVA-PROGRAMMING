import java.applet.*;
import java.awt.*;
/* 
<applet code="applet.class" width="500" height="400"> 
</applet> 
*/  
public class applet extends Applet
{
	public void paint(Graphics g)
	{	
		g.setColor(Color.green);
		g.fillRect(25,100,100,200);  
		g.setColor(Color.red);
		g.drawLine(25,25,150,50); 
		g.setColor(Color.magenta);
		g.fillOval(100,50,150,150); 
	}
}
