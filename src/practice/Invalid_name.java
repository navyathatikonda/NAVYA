package practice;
public class Invalid_name {
public String name;
	public void setvalid_name(String name) throws Invalid  {
		for(int i=0;i<name.length();i++)
	if((name.charAt(i)>=48)&&(name.charAt(i)<=57)) {
		
			throw new Invalid();
		
	}
	/*try {
		throw new Invalid();
	} catch (Invalid e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}*/
	else {
		this.name=name;
	}
		
	
	}
}