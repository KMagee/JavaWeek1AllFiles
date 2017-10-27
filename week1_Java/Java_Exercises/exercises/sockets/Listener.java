import java.io.*;
import java.net.*;
import java.awt.TextArea;

class Listener extends java.lang.Thread {
	private int connectionNo;
	private static int listenerCount=0;

	private TextArea gui;
	BufferedReader in;

	public Listener(Socket s, TextArea gui) {
		this.gui = gui;
		connectionNo = ++listenerCount;
		gui.append("Connection id "+connectionNo+" created.\n");

		try {
			in =  new BufferedReader(new InputStreamReader(s.getInputStream()));
		} catch (IOException ioe) {
			System.err.println("Error getting input stream from socket in "+this.getClass().getName());
		}

		this.start();
	}

	public void run() {
		BufferedReader d = null;
		try {
			String line;
			do {
				line = in.readLine();
				if (line!=null)
					gui.append("Connection "+connectionNo+" : "+line+"\n");
			} while(true);
		} catch (Exception e) {
		} finally {
			gui.append("Connection id "+connectionNo+" terminated.\n");
		}
	}
}
