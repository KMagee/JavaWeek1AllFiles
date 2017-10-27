import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

/**
 * Simple editor program
 *
 * You should:
 *     Make this code load a file that has been selelcted by the user
 *
 * You could:
 *     Allow the file to be edited and saved back to disk
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

        //Create Action objects
        ImageIcon exitIcon = new ImageIcon(getClass().getResource("exit.jpg"));
        Action exit = new AbstractAction("Exit",exitIcon) {
            public void actionPerformed(ActionEvent e) {
                shutDown();
            }
        };

        ImageIcon loadIcon = new ImageIcon(getClass().getResource("load.jpg"));
        Action load = new AbstractAction("Load",loadIcon) {
            public void actionPerformed(ActionEvent e) {
                loadFile();
            }
        };

        ImageIcon saveIcon = new ImageIcon(getClass().getResource("save.jpg"));
        Action save = new AbstractAction("Save",saveIcon) {
            public void actionPerformed(ActionEvent e) {

            }
        };


        ImageIcon clearIcon = new ImageIcon(getClass().getResource("clear.jpg"));
        Action clear = new AbstractAction("Clear",clearIcon) {
            public void actionPerformed(ActionEvent e) {
                ta1.setText("");
            }
        };


        KeyStroke altl = KeyStroke.getKeyStroke(KeyEvent.VK_L,Event.CTRL_MASK);

        //Add menus to the frame here
        JMenuBar mb = new JMenuBar();
        JMenu file = mb.add(new JMenu("File"));
        file.setMnemonic('f');
        file.add(load).setAccelerator(altl);
        file.add(save);
        file.addSeparator();
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
        tools.add(load);
        tools.add(save);
        tools.add(clear);
        tools.add(exit);

        //Add the text area
        getContentPane().setLayout(new BorderLayout());
        getContentPane().add(split,BorderLayout.CENTER);
        getContentPane().add(tools,BorderLayout.NORTH);

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
        try {
            FileReader fr = new FileReader(filename);
            BufferedReader in = new BufferedReader(fr);

            String line;
            while ((line=in.readLine()) != null) {
                ta1.append(line+"\n");
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void shutDown() {
        int answer = JOptionPane.showConfirmDialog(this,"Are you sure about this ?","Confirm",JOptionPane.YES_NO_OPTION);
        if (answer == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }
}

