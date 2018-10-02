package practice;
import java.util.*;
public class Binary_Search {
public static int search(int[] m,int key) {
	int start=0;
	int end=m.length-1;

	while(start<=end)
{
		int mid=(start+end)/2;
		if(key==m[mid]) 
		{
			return mid;	
			
		}
		if(key<=m[mid]) 
		{
			end=mid-1;
		}
		else
		{
			start=mid+1;
		}
	}
	
	return -1;	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner b=new Scanner(System.in);
			
			System.out.println("enter size");
			int n=b.nextInt();
			System.out.println("Enter Values");
			int [] m1=new int[n];
			for(int i=0;i<m1.length;i++) 
			{
				m1[i]=b.nextInt();
			}
			System.out.println("Enter key");
			int d=b.nextInt();
			int o=search(m1,d);
	System.out.println(o);
			
	}

}
