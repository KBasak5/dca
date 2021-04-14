import java.util.*;
class dca5{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		int sum=arr[0];
		ArrayList<Integer> result=new ArrayList<Integer>();
		for(int i=0;i<size-1;i++){
			if(arr[i]<arr[i+1]){
				sum+=arr[i+1];
			}
			else{
				result.add(sum);
				sum=arr[i+1];
				continue;
			}
			
			
		}
		result.add(sum);
		System.out.println(result);
	}
}