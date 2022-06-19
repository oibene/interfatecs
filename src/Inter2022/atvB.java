package Inter2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class atvB {
	 public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 
		// armazena linha
		 System.out.print("");
		 String texto = sc.nextLine();
		 
		 // separa primeira linha em 2 var e converte
		 String linha[] = texto.split(" ");
		 int P = Integer.parseInt(linha[0]);
		 int E = Integer.parseInt(linha[1]);
		 
		 // matriz contato e lista inseguro
		 int [][] ctt = new int[P][P];
		 
		 // contadores comandC e contact
		 int comandC = 0, contact = 0;
		 
		 // loop com E entradas
		 do {
			// armazena cada linha
			System.out.print("");
			texto = sc.nextLine();
			String linhas[] = texto.split(" ");
			 
			String C = linhas[0];
			// comandos
			switch(C) {
				case "c":
					comandC++;
					
					int A = Integer.parseInt(linhas[1]);
					int B = Integer.parseInt(linhas[2]);
					 
					ctt[A-1][B-1] = B;
					ctt[B-1][A-1] = A;

				break;
				
				case "p":
					int D = Integer.parseInt(linhas[1]);
					
					for (int i = 0; i < P; i++) {
						
						for (int element : ctt[i]) {
							if (element == D){
								System.out.println((i+1)+"sim");
						    }
						}
					}
					
				break;
				
				case "n":
					System.out.println(P-comandC);
				break;
				
				case "ns":
					comandC++;
				break;
				
				case "ni":
					comandC++;
				break;
				
				case "ii":
					comandC++;
				break;
			}
			
			E--;
		 }while (E != 0);
		 
	}
}
