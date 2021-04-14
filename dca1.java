import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
class dca1{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String word=sc.nextLine();

		Pattern pattern = Pattern.compile("[^a-zA-z0-9]"); //Find one character NOT between the brackets
		Matcher match = pattern.matcher(word);
		boolean check = match.find();
		if(check==true){
			System.out.println("Invalid input given");
		}
		else{
		String result = word.replaceAll("53","");
		result = result.replaceAll("8","");
		System.out.println(result.toLowerCase());
		}

		
	}
}