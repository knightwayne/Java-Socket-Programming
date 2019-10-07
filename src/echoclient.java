import java.io.*;
import java.net.*;
public class echoclient {
//@SuppressWarnings("deprecation")
public static void main(String args[])
{
	try {
		Socket c = new Socket(InetAddress.getLocalHost(),1234);
		DataInputStream dis = new DataInputStream(c.getInputStream());
		DataOutputStream dout = new DataOutputStream(c.getOutputStream());
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Server Connected");
		
		String str="",str1="";
		//while(str.equalsIgnoreCase("stop")==false)
		//{
			str1=input.readLine();
			dout.writeUTF(str1);
			dout.flush();
			System.out.println("Message Sent from Server: "+str1);
			str=dis.readUTF();
			System.out.println("Message recieved from Server: "+str);
		//}
		dout.close();
		dis.close();
		c.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
