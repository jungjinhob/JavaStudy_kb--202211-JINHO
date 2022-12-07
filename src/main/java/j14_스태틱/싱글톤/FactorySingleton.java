package j14_스태틱.싱글톤;



import lombok.Getter;

public class FactorySingleton {
	private static FactorySingleton instance = null;

    @Getter
    private Factory2 factory; 

    private FactorySingleton() {
        factory = new Factory2();
    }

    public static FactorySingleton getInstance() {
        if (instance == null) {
            instance = new FactorySingleton();
        }
        return instance;
    }
}

