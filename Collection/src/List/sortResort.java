package List;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class sortResort {

	public static void main(String[] args) {
		String[]a={"ami","tui","she"};
		List<String>aa=Arrays.asList(a);
		Collections.sort(aa);
		System.out.println(aa);
		Collections.sort(aa,Collections.reverseOrder());
		System.out.println(aa);
	}
}
