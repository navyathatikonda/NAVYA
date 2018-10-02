package practice;

public class valid1 extends RuntimeException {
public static void main(String[] args)throws valid1  {
		// TODO Auto-generated method stub
InvalidAge b=new InvalidAge();
b.setAge(-20);
b.setName("navya");
System.out.println(b.age);
System.out.println(b.name);


	}

}
