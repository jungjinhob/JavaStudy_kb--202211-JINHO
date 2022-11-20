package j10_배열;

public class Array5 {
    public static int foundMinNumber(int[][] result,int c){
        int min = result[0][c];
        for(int i = 0; i < 4; i++){
            if(min > result[i][c]){
                min = result[i][c];
            }
        }        return min;
    }
    public static void main(String[] args) {
        int[] nums1 = {1,6,7,12,13};
        int[] nums2 = {2,7,10,11,14};
        int[] nums3 = {3,6,11,14,19};
        int[] nums4 = {4,5,12,13,20};

        int[] resultArray = new int[5];
        int [][] result = new int [5][4];
        result[0] = nums1;
        result[1] = nums2;
        result[2] = nums3;
        result[3] = nums4;
        for(int i =0 ; i< resultArray.length;i++){
            resultArray[i] = foundMinNumber(result,i);
        }
        for(int i = 0 ; i < resultArray.length ;i++){
            System.out.println(resultArray[i]);
        }



        //hint
//        int a = 10;
//        int b = 5;
//        int c =7;
//        int min = 0;
//        if(a<b){
//            min = a;
//        }
//        if(c<min){
//            min= c;
//        }
    }

/*
    배열들 중 동일 인덱스에 위치한 값들 중 최소값들만 뽑아서 새로운 배열을 만든다.
 */

}
