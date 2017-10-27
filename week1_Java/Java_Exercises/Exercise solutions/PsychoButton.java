import java.awt.*;

class PsychoButton extends Button implements Runnable {
    /*
     *  Create a Psychobutton and run it in its own thread
     */
    public PsychoButton(String label) {
        super(label);
        try {
            Thread t = new Thread(this);
            t.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Generate a random colour
     */
    public Color getRandomColor() {
        float r = (float)Math.random();
        float g = (float)Math.random();
        float b = (float)Math.random();
        return new Color(r,g,b);
    }

    /*
     * The new thread of control will start from this method
     */
    public void run() {
        while (true) {
            try {
                setBackground(getRandomColor());
                Thread.sleep(1000);
            } catch (InterruptedException tie) {
                tie.printStackTrace();
            }
        }
    }

    /**
     * The main method can be used to test your implementation of the run method.
     * After compiling this class just run it, i.e. type : "java PsychoButton"
     * at a command prompt.
     */
    public static void main(String[] args) {
        Frame f = new Frame();
        f.add(new PsychoButton("Flasher !!!"));
        f.setBounds(100,100,300,300);
        f.show();
    }
}
