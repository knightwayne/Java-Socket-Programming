import java.io.*;
import java.net.*;
public class fileclient {
public static void main(String args[])
{
	try {
		Socket s = new Socket(InetAddress.getLocalHost(),7777);
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		FileInputStream fis = new FileInputStream("C:\\Users\\Arnav\\Desktop\\New folder\\1.txt");
		int i=0;
		while((i=fis.read())!=-1)
		{
			String str=Integer.toString((char)i);
			//byte[] b=str.getBytes();
			dout.writeUTF(str);
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
