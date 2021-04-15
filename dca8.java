import java.util.*;
class dca8{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		char s[]=(str.toLowerCase()).toCharArray();
		System.out.println(s);
		int flag=0;
		char c;
		for(int i=1;i<s.length;i++){
			c=s[i];
			if(c>=97&&c<=122){
				if(!((s[i-1]+1)==c)){
					flag=1;
					break;
				}
			}
			else{
				while(!(s[i]>=97&&s[i]<=122))
					i++;
			}
		}
		if(flag==0){
			System.out.println("Yes,this sentence contains all English alphabets in order");
		}
		else{
			System.out.println("No,this sentence does not contains all English alphabets in order");
		}
	}
}