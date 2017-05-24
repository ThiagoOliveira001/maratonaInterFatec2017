import java.io.IOException;
import java.util.Locale;
//import java.text.DecimalFormat;
import java.util.Scanner;

public class nomes {

	public static void main(String[] args) throws IOException {
		//Locale.setDefault(new Locale("en","US"));
		//Locale.setDefault(new Locale("pt","BR"));

		//StringBuilder sb = new StringBuilder();
		//DecimalFormat df = new DecimalFormat("#0.00");
		Scanner sc = new Scanner(System.in);
		
		String nome = sc.next();
		String nomeFilho;
		int Q = sc.nextInt();
		char[] nomePais = nome.toCharArray();
		
		if(nome.length()<4){
			for(int i=0;i<Q;i++){System.out.println("NORMAL");}
		}else{
			for(int i=0;i<Q;i++){
				nomeFilho =  sc.next();
				if(nomeFilho.length()<4){
					System.out.println("NORMAL");
				}else{
					int acm = 0;
					char[] nomeFilhoC = nomeFilho.toCharArray();
					for(int j =0;j<4;j++){
						if( nomeFilhoC[j]== nomePais[j] ){
							acm++;
						}
						if(acm==4){break;}
					}
					if(acm<4){
						System.out.println("NORMAL");
					}else{
						System.out.println("VERIFICAR");
					}
					
					//System.out.println(nomeFilho);
				}
			}
		}
		sc.close();
	}

}
