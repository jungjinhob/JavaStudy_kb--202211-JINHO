package j09_접근지정자.test;

import j09_접근지정자.Access1;
import j09_접근지정자.Access2;

public class Access4 extends Access1 {

    public Access4(String name) {
		super(name);
	}

	public void access1Printname(){
    	
        printName();

    }
}
