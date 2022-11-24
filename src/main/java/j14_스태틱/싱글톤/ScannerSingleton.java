package j14_스태틱.싱글톤;

import lombok.Getter;

import java.util.Scanner;

public class ScannerSingleton {
    //2. 자기 자신을 static 변수로 가지고 있어야함. -> null 값이 계속 초기화되면 안되니까
    private static ScannerSingleton instance = null;

    @Getter
    private Scanner scanner; //getScanner

    private ScannerSingleton() {// 1.생성자가 private이네
        scanner = new Scanner(System.in);
    }

    public static ScannerSingleton getInstance() { //instance 게터
        if (instance == null) {
            instance = new ScannerSingleton();
        }
        return instance;
    }
}
