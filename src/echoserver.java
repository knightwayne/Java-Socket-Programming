import java.io.*;
import java.net.*;
//import java.util.concurrent.ExecutionException;
public class echoserver {

public static void main(String args[])
{
	try {
		ServerSocket ss = new ServerSocket(1234);
		Socket s=ss.accept();
		DataInputStream dis = new DataInputStream(s.getInputStream());
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		//BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Client Connected");
		
		String str="";
		//while(str.equalsIgnoreCase("stop")==false)
		//{
			str=dis.readUTF();
			System.out.println("Message recieved from Client: "+str);
			//str1=input.readLine();
			dout.writeUTF(str);
			dout.flush();
		//}
		dout.close();
		dis.close();
		s.close();
		ss.close();
		
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
}
}
