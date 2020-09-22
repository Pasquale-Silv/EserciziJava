import java.net.InetAddress;

public class GetMyIpAddress {
	
	public static void main(String[] args) throws Exception {
		
		InetAddress myIP = InetAddress.getLocalHost();
		System.out.println("Local Host:\n" + myIP + "\n");
		
		System.out.println("My IP address is:\n" + myIP.getHostAddress());
		
	}

}
