import java.awt.*;
import java.awt.event.*;

/**
 * Simple editor window with menus
 * Reacts to user events
 */
public class Editor extends Frame {
	public static void main(String[] args) {
		Editor e = new Editor();
	}

	public Editor() {
		super("Editor V2.0");

		//Add menus to the frame here
		MenuBar mb = new MenuBar();
		Menu file = mb.add(new Menu("File"));
		MenuItem load = file.add(new MenuItem("Load"));
		MenuItem save = file.add(new MenuItem("Save"));
		file.addSeparator();
		MenuItem exit = file.add(new MenuItem("Exit"));
		setMenuBar(mb);


		//Add a text area
		setLayout(new GridLayout());
		add(new TextArea());

		//Add event listeners here
		Closer c = new Closer(this);
		addWindowListener(c);

		pack();
		show();
	}

	private void loadFile() {
		//Pop up a dialog and let the user select the file to load
		System.err.println("debug: the loadFile method has been called");
	}

	/**
	 * Quits the application
	 */
	public void shutdown() {
		System.exit(0);
	}

}

class Closer extends WindowAdapter {
	private final Editor app;

	public Closer(Editor app) {
		this.app = app;
	}

	public void windowClosing(WindowEvent e) {
		app.shutdown();
	}
}

