package 과제1111;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] student = new int[31];

        for(int i=0; i<28; i++) {
            int success = sc.nextInt();
            student[success] = 1; //있는 애들은 그 인덱스에 1 을 넣어서 표시해준다.
        }
        for(int i=1; i<student.length; i++) {
            if(student[i]!=1) //1 이없는 애들은 success에 들어간적 없기 때문에 출력한다.
                System.out.println(i);
        }




    }
}



