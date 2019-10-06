import java.io.*;
import java.net.*;
public class rceserver {
public static void main(String args[])
{
	try {
		ServerSocket ss = new ServerSocket(1235);
		Socket s = ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		//DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str=dis.readUTF();
		Runtime r = Runtime.getRuntime();
		/*Process p = */r.exec(str);
		
		s.close();
		ss.close();
		
	}
	catch(Exception e){
		System.out.println(e);
	}
}
}
