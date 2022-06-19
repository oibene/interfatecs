package Inter2022;

import java.util.HashMap;
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
		 HashMap<Integer, Integer> ctt = new HashMap<Integer, Integer>();
		 
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
					 
					ctt.put(A, B);
					ctt.put(B, A);
					
					System.out.println(ctt);
				break;
				
				case "p":
					comandC++;
				break;
				
				case "n":
					comandC++;
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
