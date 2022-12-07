package j14_스태틱.싱글톤;



public class Factory {
	private String factoryName;
	public void hi() {
		Factory2 factory = FactorySingleton.getInstance().getFactory();
		System.out.println("bye");
	}
}
