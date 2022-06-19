package Inter2022;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
		 ArrayList<Object> ctt = new ArrayList<>();
		 
		 // inicializando matriz
		 for (int i = 0; i < P; i++) {
			 	ctt.add(new ArrayList<>());
			}
		 
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
					 
					((ArrayList<Integer>) ctt.get(A-1)).add(B);
					((ArrayList<Integer>) ctt.get(B-1)).add(A);
				break;
				
				case "p":
					int D = Integer.parseInt(linhas[1]);
					
					for (int i = 0; i < P; i++) {
						
					}
					
					for (int i = 0; i < ; i++) {
						for (int j = 0; j < P-1; j++) {
							int aux = (int) ((ArrayList<Object>) ctt.get(i)).get(j);
							System.out.print(aux);
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
