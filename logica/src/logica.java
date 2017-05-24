import java.io.IOException;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Locale;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class logica {

	public static void main(String[] args) throws IOException {
		//Locale.setDefault(new Locale("en","US"));
		//Locale.setDefault(new Locale("pt","BR"));

		//StringBuilder sb = new StringBuilder();
		//DecimalFormat df = new DecimalFormat("#0.00");
		Scanner sc = new Scanner(System.in);
		
		
		//long N=sc.nextLong();
		
		BigInteger N  = sc.nextBigInteger();
		sc.close();
		
		if ( N.mod(BigInteger.valueOf(3)).compareTo(BigInteger.valueOf(0))>0 ){
			System.out.println("impar");
		}else{
			System.out.println("par");
		}
		
		
		
		
		

		
	}

}
