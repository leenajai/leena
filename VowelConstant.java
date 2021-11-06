package assignment;

public class VowelConstant {

	public static void main(String[] args) {
		char ch = 's';

        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':	
            case 'i':
            case 'I':	
            case 'o':
            case 'O':	
            case 'u':
            case 'U':	
                System.out.println(ch + " is vowel");
                break;
            default:
                System.out.println(ch + " is consonant");
        }


	}

}
