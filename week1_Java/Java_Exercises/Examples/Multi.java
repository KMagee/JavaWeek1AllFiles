import java.io.*;


/** Illustrates the use of static inner classes and PipedStreams.
@author Puff Addison
@date January 31 2003
*/

public class Multi{


	public static void main(String[] args){

		PipedReader pr = new PipedReader();
		PipedWriter pw = null;
		try{
			pw = new PipedWriter(pr);
		}
		catch(IOException e){
			e.printStackTrace();
		}


		Read r = new Read(pw);
		Write w = new Write(pr);
		Thread t1, t2;

		t1 = new Thread(r);
		t2 = new Thread(w);

		t1.start();
		t2.start();

	}


	static class Read implements Runnable{
			BufferedReader in ;
			BufferedWriter out;


		public Read(PipedWriter ow){
			in = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(ow);
		}

		public void run(){

			String s = null;
			try{;
				while((s = in.readLine()) != null){
					out.write(s+"\n");
					out.flush();
					if(s.equals("Stop")) {
						out.close();
						return;
					}
				}

			}catch( IOException e){
					e.printStackTrace();

			}
		}
	}


	static class Write implements Runnable{
		BufferedReader in ;


		public Write(PipedReader iw){
			in = new BufferedReader(iw);
		}

		public void run(){

			String s = null;
			try{
				while((s = in.readLine()) != null){
					System.out.println(s.toUpperCase());

				}
			}catch( IOException e){

				e.printStackTrace();
			}

		}

	}
}