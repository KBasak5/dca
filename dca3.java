import java.util.*;
class dca3{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int product=1;
		String str=String.valueOf(num);
		for(int i=0;i<str.length();i++){
			product*=(int)(str.charAt(i))-48;
		}
		System.out.println(product);
	}
}