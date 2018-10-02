package practice;

import java.util.Scanner;

public class Selection_Sort {
	public static void main(String[] args) {
	Scanner b=new Scanner(System.in);
	System.out.println("enter size");
	int n=b.nextInt();
	System.out.println("Enter Values");
	int [] m=new int[n];
	for(int i=0;i<m.length;i++) 
	{
		m[i]=b.nextInt();
	}
	int [] n1=selection_sort(m);
	for(int i=0;i<n1.length;i++)
	{
	System.out.println(n1[i]);
	}
		}
	public static int[]  selection_sort(int[] a) {
		int t=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					t=a[i];
					a[i]=a[j];
					a[j]=t;
				}
				
		}
	}
		return a;
		
	}
}
