package practice;
public class InvalidAge {
public int age;
public String name;
public void setAge(int age)   
{
	if(age<0) {
	try {
		throw new valid1();	
	}
	catch(Exception e) {
		System.out.println("age isin valid");
	}
	}
	else {
	this.age=age;
}
	}



public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}



}
