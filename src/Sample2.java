
import java.util.Arrays;

public class Sample2 {

	public static void main(String[] args) {
		String[] arr = { new String("Jeeva"), new String("Raja"), new String("Mohan"), new String("Elango"),
				new String("Naveen"), new String("Silambu") };
		Arrays.sort(arr, (s1, s2) -> s1.length() - s2.length());

		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
