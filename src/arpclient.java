import java.io.*;
import java.net.*;
public class arpclient {
public static void main(String args[])
{
	try {
		Socket s = new Socket(InetAddress.getLocalHost(),6666);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dos = new DataOutputStream(s.getOutputStream());
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter IP Address: ");
		String str=br.readLine();
		dos.writeUTF(str);
		String str2="";
		System.out.println("ARP from server side: ");
		while(str2.equalsIgnoreCase("end")==false)
		{
			str2=dis.readUTF();
			System.out.println(str2);
		}
		s.close();
	}
	catch(Exception e) {
		
	}
}
}