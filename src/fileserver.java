import java.io.*;
import java.net.*;
public class fileserver {
public static void main(String args[])
{
	try {
		ServerSocket ss = new ServerSocket(7777);
		Socket s=ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		FileOutputStream fos = new FileOutputStream("C:\\Users\\Arnav\\Desktop\\New folder\\2.txt");
		String str="";
		while((str=dis.readUTF())!=null)
		{
			//System.out.println(str);
			//byte[] b=str.getBytes();
			int i=Integer.parseInt(str);
			fos.write((char)i);
			fos.flush();
		}
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}