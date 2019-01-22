package basic;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public Client() throws UnknownHostException, IOException {
		Socket client = new Socket("localhost", 3000);
		System.out.println("Client connected ");

		PrintStream out = new PrintStream(client.getOutputStream());
		out.println("hello from client");
		out.flush();
		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));
		System.out.println(in.readLine());

	}

	public static void main(String[] args) throws UnknownHostException, IOException {
		new Client();
	}

}
