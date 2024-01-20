package basic;

public class prac_15_Vowel_consonant {
	public static void main(String[] args) {
		char character = 'K';
		
		switch(character) {
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("Vowel");
			break;
		
		default:
			System.out.println("Consonant");
			break;
		}
	}
}
