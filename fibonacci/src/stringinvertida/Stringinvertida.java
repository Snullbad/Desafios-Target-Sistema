package stringinvertida;
import java.util.Scanner;

public class Stringinvertida {
	  public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.println("Digite Qualquer palavra : ");
	        String str = input.nextLine();
	        char[] charArray = new char[str.length()];
	       
	        
	        for (int i = str.length() - 1, j = 0; i >= 0; i--, j++) {
	            charArray[j] = str.charAt(i);
	        }
	        
	        String strInvertida = new String(charArray);
	        
	        System.out.println("String original: " + str);
	        System.out.println("String invertida: " + strInvertida);
	    }

}
