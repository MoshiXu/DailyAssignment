package day4;

public class FindOccurence {
	
	public static void main(String[] args) {
		String str="Hello Wolrd";
		findOccurenece(str);

	}

	private static void findOccurenece(String str) {
		// TODO Auto-generated method stub
		int count[]=new int[256];
		
		for(int i=0;i<str.length();i++) {
			count[str.charAt(i)]++;
		}
		
		int max=-1;
		char result=' ';
		
		for(int i=0;i<str.length();i++) {
			if(max<count[str.charAt(i)]) {
				max=count[str.charAt(i)];
				result=str.charAt(i);
			}
		}
		System.out.println("The most popular one: "+result);
	}

}
