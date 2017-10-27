import java.awt.*;
import java.awt.event.*;

class EventDemo extends Frame {
		public static void main(String[] args) {
			new EventDemo();
		}

		public EventDemo() {
			super("EventDemo");
			setLayout(new GridLayout(1,1));

			TextArea ta = (TextArea)add(new TextArea());

			ta.addKeyListener(new EventDemoKeyListener());

			pack();
			show();
		}
}

class EventDemoKeyListener implements KeyListener {
	public void keyPressed(KeyEvent k) {
		System.out.println("Pressed  : "+k.getKeyChar());
	}
	public void keyReleased(KeyEvent k) {
		System.out.println("Released : "+k.getKeyChar());
	}
	public void keyTyped(KeyEvent k) {
		System.out.println("Typed    : "+k.getKeyChar());
	}
}
