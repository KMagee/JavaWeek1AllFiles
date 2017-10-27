import java.net.*;
import java.io.*;
import javax.swing.*;
import javax.swing.text.*;
import javax.swing.text.html.*;
import java.awt.*;

class Connection extends Thread {
    private JTextArea out;
    private BufferedReader in;
    private String userId;

    Connection(JTextArea ta, Socket socket) {
        try {
            in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            userId = socket.getInetAddress().getHostName();
            out = ta;
            start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void run() {
        print("<"+userId+": connect    >\n");
        try {
            String line = in.readLine();
            while (line != null) {
                print("<"+userId+": message    > "+line+"\n");
                line = in.readLine();
            }
        } catch (IOException e) {

        } finally {
            this.cleanup();
        }
    }

    private void cleanup() {
        print("<"+userId+": disconnect >\n");
        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private synchronized void print(String s) {
        out.append(s);
        out.setCaretPosition(out.getText().length());
    }
}