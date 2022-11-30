package 과제1111;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Main {
	//O는 79
	//X는 88
    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);
        
		String arr[] = new String[in.nextInt()];
 
		for (int i = 0; i < arr.length; i++) {
			arr[i] = in.next();
		}
		
		for (int i = 0; i < arr.length; i++) {
			
			int cnt = 0;	// 연속횟수
			int sum = 0;	// 누적 합산 
			
			for (int j = 0; j < arr[i].length(); j++) {
				
				if (arr[i].charAt(j) == 'O') {
					cnt++;
				} 
				else {
					cnt = 0;
				}
				sum += cnt;
			}
			
			System.out.println(sum);
		}
        }
}


