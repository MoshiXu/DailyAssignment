package day4;

public class FindLocation {

	public static void main(String[] args) {

		String str="Hello,World";
		char c1='o';
		char c2=',';
		find(str,c1,c2);
	}

	private static void find(String str,char c1,char c2) {
		
		//find last index
		int index=-1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==c1) {
				index=i;
			}
		}
		
		if(index==-1) {
			System.out.println("Not found");
		}else {
			System.out.println("The last index: "+index);
		}
		
		//find first index
		int r1=str.indexOf(c1);
		int r2=str.indexOf(c2);
		System.out.println("The first index: "+r1);
	}

}
