package moderar_palavrao_v1;

import java.util.Scanner;

public class Moderar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira a frase com pelo menos 10 caracteres");
		String frase = sc.nextLine();
		try {
			Utils.verifica(frase);
			String str = Utils.moderar(frase);
			System.out.println(str);
		} catch (TextoCurtoException e) {
			System.out.println(e);
		}
	}

}
