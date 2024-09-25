package moderar_palavrao_v1;

public class Utils {
	public static void verifica (String str) throws TextoCurtoException{
		if (str.length()<10) {
			throw new TextoCurtoException("texto inserido com "+str.length() + " caracteres");
		}
	}
	public static String moderar (String str) {
		String vet [] = str.split(" ");
		String novaString = "";
		for(int i=0; i<vet.length; i++) {
			String palavra = vet[i];
			if (Utilidades.getPalavroes().contains(palavra.toLowerCase())) {
				String hash = hashtags(palavra.length());
				novaString+=" "+hash;
			} else {
				novaString += " "+palavra;
			}
		}
		return novaString.trim();
	}
	private static String hashtags(int tamanho) {
		String str="";
		for(int i=0; i<tamanho; i++) {
			str+="#";
		}
		return str;
	}
}
