import java.util.*;
import java.util.regex.*;
class dca7{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		String arr[]=new String[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.next();
		}
		
		int digit=0,word=0,flag=0;
		boolean matchdig,matchalph;
		for(int i=0;i<size;i++){
			char ar[]=(arr[i].toLowerCase()).toCharArray();
			matchdig=true;
			matchalph=true;
			for(char c:ar){
				if(!(c>=48&&c<=57)){
					matchdig=false;
					break;
				}
			}
			for(char c:ar){
				if(!(c>=97&&c<=122)){
					matchalph=false;
					break;
				}
			}

			if(matchdig==true){
				digit++;
			}
			else if(matchalph==true){
				word++;
			}
			else{
				System.out.println("Invalid Input");
				flag=1;
				break;
			}

		}
		if(flag!=1){
			System.out.println("Digits = "+digit);
			System.out.println("Words = "+word);
		}
	}
}