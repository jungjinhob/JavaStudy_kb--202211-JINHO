package j10_배열;

import java.util.Random;

public class Array3 {
    public static int foundMinNumber(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
            }
        }        return min;
    }
    public static int foundMaxNumber(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }        return max;
    }

    public static void main(String[] args) {
        Random random = new Random();

        int sum =0;
        int[] randomArray = new int[10];
//


        for (int i = 0; i < randomArray.length; i++) { //중복 찾아서 빼고 배열에 숫자 저장.
            while(true){
                int randomNumber = random.nextInt(10) + 1; //1~10
                boolean found = true; //안찾음
                for(int j =0; j< randomArray.length;j++){
                    if(randomArray[j] == randomNumber){ //들어있는지 확인 같은값이
                        found = false; // 중복 찾음
                        break; //for break
                    }
                }
                if(found){ //증가 안된거면(중복값 없었음)
                    randomArray[i] = randomNumber; // 배열에 저장.
                    break; // while break
            }


    }
}
        for( int i = 0; i < randomArray.length; i++){
            System.out.print(randomArray[i] + " ");
            sum += randomArray[i];

        }
        System.out.println();
        System.out.println("총합 : " + sum);

        System.out.println("최소값 : " + foundMinNumber(randomArray));
        System.out.println("최대값 : " + foundMaxNumber(randomArray));



//        for (int i = 0; i < randomArray.length; i++) {
//            randomArray[i] = random.nextInt(10);
//            sum += randomArray[i];
//            System.out.print(randomArray[i]);
//            if(i < randomArray.length -1 ){
//                System.out.print(", ");
//            }
//
//        }
//        System.out.println();
//
//        System.out.println("총합 : " + sum);
    }
    //문제 : 2개 배열  겹치면서 제일 작은값 제일 큰값

}
