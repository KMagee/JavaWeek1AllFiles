import javax.swing.*;

class TwinViews {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Scroll pane demoooo");
		JTextArea ta1 = new JTextArea(10,40);
		JTextArea ta2 = new JTextArea(10,40);
		
		//Share the same document (the model part of MVC)
		ta2.setDocument(ta1.getDocument());
		
		JScrollPane sp1 = new JScrollPane(ta1);
		JScrollPane sp2 = new JScrollPane(ta2);
		
		JSplitPane sp = new JSplitPane(JSplitPane.VERTICAL_SPLIT,sp1,sp2);
		
		myFrame.getContentPane().add(sp);
		
		myFrame.pack();
		myFrame.setVisible(true);
	}
}

