import javax.swing.*;

class ScrollPaneDemo {
	public static void main(String[] args) {
		JFrame myFrame = new JFrame("Scroll pane demoooo");
		JTextArea ta = new JTextArea(20,40);
		JScrollPane sp = new JScrollPane(ta);
		
		myFrame.getContentPane().add(sp);
		
		myFrame.pack();
		myFrame.setVisible(true);
	}
}

