import java.util.*;
class dca6{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		HashSet<Character> h=new HashSet<Character>();
		for(int i=0;i<str.length();i++){
			h.add(str.charAt(i));
		}
		int count[]=new int[h.size()];
		int k=0;
		long numerator=0,denominator=1,vowels=0;
		float result;

		for(Character c: h){
			
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==c){
					count[k]++;
				}
			}
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U'){
				vowels+=count[k];
			}
			k++;
		}
		int flag=0;
		if(vowels>0){
			flag=1;	
		}
		System.out.println(str.length()-vowels+flag);
		numerator=factorial(str.length()-vowels+flag) * factorial(vowels);
		for(int i:count){
			denominator*=factorial(i);
		
		}

		result=numerator/denominator;
		System.out.println(numerator);

		System.out.println(result);

	}

	public static long factorial(long n){
		if(n==0)
			return 1;
		else
			return n*factorial(--n);
	}
}