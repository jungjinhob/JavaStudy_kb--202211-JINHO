package j09_접근지정자;

import j09_접근지정자.test.Access4;

public class Access1 {
    
    public String name;
	public Access1(String name) {
    	this.name = name;
    }
    protected void printName(){
        System.out.println("Name: " + name);
    }
}
