import java.util.*;

public class CaesarCipher {
	public static void main(String[] args){

		Scanner sn = new Scanner(System.in);
		int length = sn.nextInt();
		sn.nextLine();
       // System.out.println(length);
		String letters = sn.nextLine();
       // System.out.println(letters);
		int key = sn.nextInt();
        //System.out.print(key);
		
		char[] lettersChar = letters.toCharArray();
		for(int i = 0; i<length; i++){
			if((lettersChar[i]>=65 &&lettersChar[i]<=90)||(lettersChar[i]>=97 &&lettersChar[i]<=122)){
				lettersChar[i] = (char) (lettersChar[i]+ key);
				System.out.print(lettersChar[i]);
			}
			else
			{
				System.out.print(lettersChar[i]);
			}
		}
	}
}
