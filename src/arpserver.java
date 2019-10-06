import java.io.*;
import java.net.*;
public class arpserver {
public static void main(String args[])
{
	try {
		ServerSocket ss = new ServerSocket(6666);
		Socket s= ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str=dis.readUTF();
		str="xyz";
		Runtime r = Runtime.getRuntime();
		Process p = r.exec("arp -a");
		String str2="";
		BufferedReader br2 = new BufferedReader(new InputStreamReader(p.getInputStream()));
		while((str2=br2.readLine())!=null)
		{
			dos.writeUTF(str2);
		}
		s.close();
		ss.close();
		
		
	}
	catch(Exception e) {
		
	}
}
}