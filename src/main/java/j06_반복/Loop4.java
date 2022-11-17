package j06_반복;

public class Loop4 {
    public static void main(String[] args) {
        int n = 5;
        //1,3,5,7,9
        //7,5,3,1

        for(int i= 0 ; i<n;i++){
            System.out.println();
            for(int j= i; j<n-1;j++){
                System.out.print(" ");
            }// 4~0
            for(int k= 0; k< 2*i+1;k++){
                System.out.print("*");
            }// 1,3,5,7,9
        }
        for(int i= 0 ; i<n-1;i++){
            System.out.println();
            for(int k= 0; k< i+1 ;k++){
                System.out.print(" ");
            }// 0~3
            for(int j= 2 * i; j<2*n-3;j++){
                System.out.print("*");

            }//7,5,3,1

        }
    }
}
