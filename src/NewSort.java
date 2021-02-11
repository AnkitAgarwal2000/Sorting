import java.util.Scanner;

public class NewSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		System.out.println("Enter no of elements un the array");
		Scanner sc=new Scanner(System.in);
		n= sc.nextInt();
		
		int arr[] = new int[n];
		
		System.out.println("Enter Elements");
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		
		for(int i=0;i<n;i++)
		{
			int min=arr[i];
			int pos=i;
			for(int j=i;j<n;j++)
			{
				if(min>arr[j])
				{
					pos=j;
					min=arr[j];
				}
			}
			
			arr[pos]=arr[i];
			arr[i]=min;
		}
		
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		

	}

}
