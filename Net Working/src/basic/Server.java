package basic;

import java.io.*;
import java.net.*;

public class Server {
	public Server() throws IOException {
		ServerSocket server = new ServerSocket(3000);
		System.out
				.println("Server binded at " + ((server.getInetAddress()).getLocalHost().getHostAddress() + ": 3000"));
		System.out.println("Run the Client");
		Socket socket = server.accept();

		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		System.out.println(in.readLine());

		PrintStream out = new PrintStream(socket.getOutputStream());
		out.print("welcome by server\n");

		out.flush();
		out.close();

	}

	public static void main(String[] args) throws IOException {
		new Server();
	}

}
