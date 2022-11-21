package j10_배열;

import java.util.Random;

public class Array4 {

    /*
    1.두 배열에서 중복된 값 중 최소값
    2.두 배열에서 중복되지 않은 값 중 최대 값
     */
    public static int[] add(int[] array, int value) {
        int[] resultArray = new int[array.length + 1]; //기존보다 인덱스가 1더 큰 배열을 계속 만듬
        for (int i = 0; i < array.length; i++) { // 계속 new int로 0값이 초기화되므로 value값을 넣어줌
            resultArray[i] = array[i];              // 이 FOR문 없으면 0값 초기화된대로 들어가기 때문에 결과값이 0이 나올거임
        }
        resultArray[array.length] = value; //각 인덱스마다 해당하는 다른값을 삽입. EX 1,3,5 를 0,1,2 배열에 넣으면
        return resultArray;                 // {1} -> {1,3} -> {1,3,5}
    }

    public static int[] duplicateArray(int[] array1, int[] array2) {
        int[] resultArray = new int[0]; //add에서 1씩 크기를 증가시키기 때문에 0부터 시작

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    resultArray = add(resultArray, array1[i]);
                }
            }

        }
        return resultArray;
    }
    public static int[] nonDuplicateArray(int[] array1, int[] array2) {
        int[] resultArray = new int[0];
        int duplicateCountArray1 = 0;
        int duplicateCountArray2 = 0;

        for(int i = 0; i < array1.length; i++) {
            int duplicateCountInArray1 = 0;

            for(int j = 0; j < array2.length; j++) {
                if(array1[i] == array2[j]) {
                    duplicateCountInArray1++;
                }
            }
            if(duplicateCountInArray1 != 0) {
                continue;
            }
            resultArray = add(resultArray, array1[i]);
        }

        for(int i = 0; i < array2.length; i++) {
            int duplicateCountInArray2 = 0;

            for(int j = 0; j < array2.length; j++) {
                if(array2[i] == array1[j]) {
                    duplicateCountInArray2++;
                }
            }
            if(duplicateCountInArray2 != 0) {
                continue;
            }
            resultArray = add(resultArray, array2[i]);
        }

        return resultArray;
    }

    public static int getMinNumberFromArray ( int[] array){

        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;


    }
    public static int getMaxNumberFromArray ( int[] array){
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;

    }
    public static void main(String[] args) {
        int[] nums1 = {1,2,3,4,5,6,7,8,9,10};
        int[] nums2 = {6,7,8,9,10,11,12,13,14,15};

        int[] duplicateArray = duplicateArray(nums1,nums2); // 두 배열에서 중복된값을 또 다른 배열에 저장
        int[] nonDuplicateArray = nonDuplicateArray(nums1,nums2); // 두 배열에서 중복되지 않은값을 저장.
        int minNumberInDuplicateArray = getMinNumberFromArray(duplicateArray);
        int maxNumberInDuplicateArray = getMaxNumberFromArray(nonDuplicateArray);
        System.out.println("중복최소 : " + minNumberInDuplicateArray);
        System.out.println("중복x최대 : " + maxNumberInDuplicateArray);
    }


}

