import java.io.*;
import java.net.*;
public class udpclient {
public static void main(String args[])
{
	try {
		int clientport=789,serverport=790;
		DatagramSocket ds = new DatagramSocket(clientport);
		byte[] buffer= new byte[1024];
		byte[] buffer1= new byte[1024];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Client here: ");
		while(true)
		{
			//System.out.println("Client: ");
			String str=br.readLine();
			if(str.equalsIgnoreCase("end"))
				break;
			buffer=str.getBytes();
			ds.send(new DatagramPacket(buffer,buffer.length,InetAddress.getLocalHost(),serverport));
			DatagramPacket dp = new DatagramPacket(buffer1,buffer1.length);
			ds.receive(dp);
			String str2 = new String(dp.getData(),0,dp.getLength());
			System.out.println("Server: "+str2);
		}
		ds.close();
	}
	catch(Exception e) {
		System.out.println(e);
	}
}
}
