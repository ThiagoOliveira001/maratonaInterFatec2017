import java.io.IOException;
import java.util.Locale;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class urinals {

	public static void main(String[] args) throws IOException {
		//Locale.setDefault(new Locale("en","US"));
		//Locale.setDefault(new Locale("pt","BR"));

		//StringBuilder sb = new StringBuilder();
		//DecimalFormat df = new DecimalFormat("#0.00");
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		System.out.println(N*2-1);
		sc.close();
	}

}
