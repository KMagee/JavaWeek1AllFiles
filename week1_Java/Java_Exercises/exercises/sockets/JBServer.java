import java.io.*;
import java.net.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class JBServer extends Frame implements WindowListener {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage : java JBServer portNumber");
        } else {
            int portNo = Integer.parseInt(args[0]);

            JBServer f = new JBServer("Listening to port "+portNo);
            f.setLayout(new BorderLayout());
            TextArea t = new TextArea();
            f.add(t,BorderLayout.CENTER);
            f.pack();
            f.show();

				try {
					Vector v=new Vector();;
					ServerSocket ss = new ServerSocket(portNo);
					while(true) {
						Socket s = ss.accept();
						Listener l  = new Listener(s,t);
						v.addElement(l);
					}
				} catch (Exception e) {
					throw new Error(e.toString());
				}
			}
		}

    public void windowDeactivated(WindowEvent e) {}
    public void windowOpened(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowClosing(WindowEvent e) {
        System.exit(0);
    }

    public JBServer(String s) {
        super(s);
        addWindowListener(this);
    }
}
