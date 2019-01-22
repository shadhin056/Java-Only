package two;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReader {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter Another a number : ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// int c = Integer.parseInt(br.readLine());
		String c = br.readLine();
		System.out.println(c);
	}
}
