package 과제1111;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
       
        int sum = 0;
        int[] arr = new int[T];
        for(int i = 0;i<T;i++) {
        	int a = scanner.nextInt();
        	arr[i] = a;
        	sum += arr[i];
        }
        System.out.println(sum/T);




    }
}



