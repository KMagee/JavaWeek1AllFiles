import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

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
public class Editor extends JFrame {
	private JTextArea ta1;
	private JTextArea ta2;

	public static void main(String[] args) {
		Editor e = new Editor();
	}

	public Editor() {
		super("Editor V5.0");

		//Create Action objects, for exit, load, save & clear - the first is done for you
		ImageIcon exitIcon = new ImageIcon(getClass().getResource("exit.jpg"));
		Action exit = new AbstractAction("Exit",exitIcon) {
			public void actionPerformed(ActionEvent e) {
				shutDown();
			}
		};
		
		//Add menus to the frame here
		JMenuBar mb = new JMenuBar();
		JMenu file = mb.add(new JMenu("File"));
		file.add(exit);

		setJMenuBar(mb);

		//Create the text areas and clear button
		ta1 = new JTextArea(10,50);
		ta2 = new JTextArea(10,50);
		JSplitPane split = new JSplitPane(JSplitPane.VERTICAL_SPLIT,new JScrollPane(ta1),new JScrollPane(ta2));
		split.setOneTouchExpandable(true);
		ta2.setDocument(ta1.getDocument());

		//Create a toolbar
		JToolBar tools = new JToolBar();
		tools.add(exit);

		//Add the text area
		getContentPane().setLayout(new BorderLayout());
		getContentPane().add(split,BorderLayout.CENTER);

		//Add the toolbar to the editor
		
		
		//Add a window listener
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				shutDown();
			}
		});

		//Arrange components and show the frame
		pack();
		split.setDividerLocation(0.0);
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
		int answer = JOptionPane.showConfirmDialog(this,"Are you sure about this ?","Confirm",JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}

