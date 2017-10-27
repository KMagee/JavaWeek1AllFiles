import java.awt.*;
import java.awt.event.*;

// HINT: You'll need to un-comment the line below, but why ?
// import javax.swing.*;

/**
 * Simple editor program
 * 
 * You should:
 * 	Make this code load a file that has been selelcted by the user
 * 
 * You could:
 * 	Allow the file to be edited and saved back to disk
 * 
 */
public class Editor extends Frame {
	private TextArea ta;

	public static void main(String[] args) {
		Editor e = new Editor();
	}
	
	public Editor() {
		super("Editor V1.0");
		
		//Add menus to the frame here
		MenuBar mb = new MenuBar();
		Menu file = mb.add(new Menu("File"));
		MenuItem load = file.add(new MenuItem("Load"));
		MenuItem save = file.add(new MenuItem("Save"));
		file.addSeparator();
		MenuItem exit = file.add(new MenuItem("Exit"));
		setMenuBar(mb);

		//Create text area and clear button
		ta = new TextArea(10,50);
		Button clear = new Button("Clear disaply");

		//Create event listeners
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				shutDown();
			}		
		});
		
		exit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				shutDown();
			}
		});
		
		load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				loadFile();
			}
		});
		
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ta.setText("");
			}
		});
		
		//Add the text area and clear button
		setLayout(new BorderLayout());
		add(ta,BorderLayout.CENTER);
		add(clear,BorderLayout.SOUTH);
		
		//Arrange components and show the frame
		pack();
		setVisible(true);
	}
	
	private void loadFile() {
		//Pop up a dialog and let the user select the file to load
		FileDialog fd = new FileDialog(this,"Select file to load",FileDialog.LOAD);
		fd.show();
		String path = fd.getDirectory();
		path+= fd.getFile();
		loadFile(path);
	}
	
	private void loadFile(String filename) {
		System.out.println("in load file : "+filename);
		
		//Scrap the above line and load the file here
		
	}
	
	private void shutDown() {
		System.exit(0);
	}
}

