import java.applet.*;
import java.awt.*;

public class AppletStarter extends Applet {
	private String userName;
	Label label;

	public void init() {
		//Set up the label and the name
		String first = getParameter("firstName");
		String second = getParameter("secondName");
		userName = "Welcome " + first + " " + second;
		label = new Label(userName,Label.CENTER);
		setLayout(new GridLayout(1,1));
		add(label);
		label.setFont(new Font("Ariel",Font.BOLD+Font.ITALIC,14));

		//Set the background color of the label (if specified)
		String bgcolor = getParameter("bgcolor");
		if (bgcolor!=null) {
			Color col = stringToColour(bgcolor);
			label.setBackground(col);
		}
	}

	private Color stringToColour(String colour) {
		int r = Integer.parseInt(colour.substring(0,2),16);
		int g = Integer.parseInt(colour.substring(2,4),16);
		int b = Integer.parseInt(colour.substring(4,6),16);
		return new Color(r,g,b);
	}
}