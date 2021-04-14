import java.util.*;
class dca2{
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		//sc.nextLine();
		int arr[]=new int[size];
		for(int i=0;i<size;i++){
			arr[i]=sc.nextInt();
		}
		if(size<4){
			System.out.println("INVALID INPUT");
		}
		else{
			int sum=0,max=0;
			for(int i=0;i<size-2;i++){
				for(int j=i+1;j<size-1;j++){
					sum=arr[i]+arr[j]+arr[j+1];

					if(sum>max){
						max=sum;
					}
				}
			}
			System.out.println(max);
		}
	}
}