import java.util.*;
class dca4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		HashSet<Character> h1=new HashSet<Character>();
		HashSet<Character> h2=new HashSet<Character>();
		for(int i=0;i<str1.length();i++){
			if(str1.charAt(i)!=' ')
				h1.add(str1.charAt(i));
		}
		for(int i=0;i<str2.length();i++){
			if(str2.charAt(i)!=' ')
				h2.add(str2.charAt(i));
		}

		ArrayList<Character> list = new ArrayList<Character>();
		for(Character i: h1){
			if(h2.contains(i)){
				list.add(i);
			}
		}
			Collections.sort(list);
			System.out.println(list);
			Collections.sort(list,Collections.reverseOrder());
			System.out.println(list);
	
	}
}