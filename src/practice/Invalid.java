package practice;

public class Invalid extends Exception{
	public String toString() {
		return "name should be Alphabets";
	}

	

public static void main(String[] args) throws Invalid  {
	// TODO Auto-generated method stub
Invalid_name a=new Invalid_name();
a.setvalid_name("NAVY0000A.T");
System.out.print(a.name);

}
}
