import java.net.*;
import java.io.*;

class Client {
    public static void main(String[] args) {
        try {
            String hostName = args[0];
            int portNumber = Integer.parseInt(args[1]);
            new Client(hostName, portNumber);
        } catch (Exception e) {
            System.err.println("Usage: java Client hostName portNumber");
        }
    }

    Client(String hostName, int portNumber) {
        try {
            Socket s = new Socket(hostName, portNumber);
            PrintWriter out = new PrintWriter(s.getOutputStream());
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            while (true) {
                String str = in.readLine();
                if (str==null) { //ctrl-c on the command line will generate null here
                    System.out.println("<CTRL-C>\ndisconnected from server...");
                    break;
                }
                out.println(str);
                out.flush();
            }
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}