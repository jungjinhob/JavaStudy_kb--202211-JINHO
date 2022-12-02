package j19_익명클래스;

public interface Calculator {
	
	public int calc(int a, int b) ;
	
	public default int a () {
		return 10;
	}
}
