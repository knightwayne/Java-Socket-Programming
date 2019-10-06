import java.io.*;
import java.net.*;
public class rceclient {
public static void main(String args[])
{
	try {
		Socket s = new Socket(InetAddress.getLocalHost(),1235);
		//DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Command");
		String str=br.readLine();
		dout.writeUTF(str);
		s.close();
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
