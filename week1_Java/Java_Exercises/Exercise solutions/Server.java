import java.awt.*;
import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.html.*;

class Server extends Thread {
    private JTextArea out;
    private int portNo;

    Server(int portNo) {
        this.portNo = portNo;

    	//Create GUI
    	JFrame f = new JFrame();
        out = new JTextArea();
        out.setEditable(false);
        out.setFont(new Font("Courier",Font.BOLD,18));

    	f.getContentPane().setLayout(new GridLayout(1,1));
        f.getContentPane().add(new JScrollPane(out,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
                                                   JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS));
    	f.setBounds(10,10,600,400);
    	f.setVisible(true);

        start();
    }

    public void run() {
        ServerSocket ss=null;
        try {
            ss = new ServerSocket(portNo);
        } catch (IOException e) {
            e.printStackTrace();
        }

        while (true) {
            try {
                Socket client = ss.accept();
                new Connection(out,client);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            new Server(i);
        } catch (Exception e) {
            System.err.println("Usage: java Server portNumber");
        }
    }
}