package day4;

public class FindExample {
	
	public static void find(String str) {
		
		int countSpace=0;
		int countVowel=0;
		int countDigit=0;
		int countConsonent=0;
		
		//str=Character.toUpperCase(str);
		
		for(int i=0;i<str.length();i++) {
			char c=str.charAt(i);
			if((c>='a'&&c<='z')|| c>='A'&&c<='Z'){
				c=Character.toLowerCase(c);
				if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u') {
					countVowel++;
				}else {
					countConsonent++;
				}
			}else if(c>='0'&&c<='9'){
				countDigit++;
			}else if(c==' '){
				countSpace++;
			}
		}
		
		System.out.println("The number of space: "+countSpace);
		System.out.println("The number of vowel: "+countVowel);
		System.out.println("The number of digit: "+countDigit);
		System.out.println("The number of conent: "+countConsonent);

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="A Bc23";
		
		find(s);
	}

}
