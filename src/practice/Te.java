package practice;
import java.util.*;
public class Te {

	public static void main(String[] args) throws ArithmeticException {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter index value");
int n=sc.nextInt();
System.out.println("enter y value");
int y=sc.nextInt();
System.out.println("enter  array values");
int[] m=new int[n];

for(int i=0;i<m.length;i++) {
	m[i]=sc.nextInt();
}
try {
	System.out.print(m[7]);
	}

catch(Exception  b ) {
	System.out.println("index size is incorrect");
	}


finally {
System.out.println("1234");
}

	}
}