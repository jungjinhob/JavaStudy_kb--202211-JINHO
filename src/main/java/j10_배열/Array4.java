package j10_배열;

import java.util.Random;

public class Array4 {

    /*
    1.두 배열에서 중복된 값 중 최소값
    2.두 배열에서 중복되지 않은 값 중 최대 값
     */
    public static int foundMaxNumber(int[] numbers){
        int max = numbers[0];
        for(int i = 0; i < numbers.length; i++){
            if(max < numbers[i]){
                max = numbers[i];
            }
        }        return max;
    }
    public static int foundMinNumber(int[] numbers){
        int min = numbers[0];
        for(int i = 0; i < numbers.length; i++){

            if(min > numbers[i]){
                min = numbers[i];
            }
        }        return min;
    }
    public static int cmpMin(int[] array1, int[] array2, int[] result){
        for(int i = 0; i<array1.length;i++){
            for(int j = 0; j < array2.length;j++){
                if(array1[i] == array2[j]){
                    result[i] = array1[i];
                }
            }
        }
        for(int i =0;i< result.length;i++){
            if(result[i] == 0){
                result[i] = result[i+1];
            }
        }
        int min = foundMinNumber(result);

        return min;

    }
    public static int notCmpMax(int[] array1, int[] array2,int[] result){
        int max = 0;
        for(int i = 0; i<array1.length;i++){
            for(int j = 0; j < array2.length;j++){
                if(array1[i] == array2[j]){//array 2 에서 중복값 이 나올때
                    break; //그만
                }
                result[i] = array1[i]; //if문이 실행안되면 array1 i번째 값을 결과 배열 i번째에 넣기.
            }

        }
        max = foundMaxNumber(result);
        return max;
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {6,7,8,9,10,11,12,13,14,15};
        int[] result = new int[10]; // {0,0,0,0,0,6,7,8,9,10}
        System.out.println(cmpMin(nums1,nums2,result));
        System.out.println(notCmpMax(nums1,nums2,result));


}

}

