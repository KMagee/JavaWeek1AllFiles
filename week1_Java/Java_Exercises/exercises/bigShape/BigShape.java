import java.applet.*;
import java.awt.*;

public class BigShape extends Applet {
	private String shape;
	private Color c;
	
	public void init() {
		shape = getParameter("shape");
		String colour = getParameter("colour");
		int r = Integer.parseInt(colour.substring(0,2),16);
		int g = Integer.parseInt(colour.substring(2,4),16);
		int b = Integer.parseInt(colour.substring(4,6),16);
		c = new Color(r,g,b);
	}
	
	public void paint(Graphics g) {
		g.setColor(c);
		int width  = getSize().width;
		int height = getSize().height;
		if (shape.equalsIgnoreCase("CIRCLE")) {
			g.fillArc(0,0,width,height,0,360);
		}
	}
}
