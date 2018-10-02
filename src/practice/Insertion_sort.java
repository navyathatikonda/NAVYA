package practice;

import java.util.Scanner;

public class Insertion_sort {
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
		int [] n1=Insertion_sort(m);
		for(int i=0;i<n1.length;i++)
		{
		System.out.println(n1[i]);
		}
	}
		public static int[]  Insertion_sort(int[] a) {
			int t=0;
			for(int i=1;i<a.length;i++)
			{
				for(int j=i;j>0;j--)
				{
					if(a[j]>a[j-1])
					{
						t=a[j];
						a[j]=a[j-1];
						a[j-1]=t;
					}
					
			}
		}
			return a;
			
		}
}
