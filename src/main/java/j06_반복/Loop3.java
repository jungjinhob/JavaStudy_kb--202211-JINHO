package j06_반복;

public class Loop3 {
    public static void main(String[] args) {
        int n = 5;
        for(int i= 0 ; i<n;i++){
            System.out.println();
            for(int j= 0; j<i+1;j++){
                System.out.print("*");
            }

        } // 1~5

        System.out.println();





        for(int i= 0 ; i<n;i++){
            System.out.println();
            for(int j= i; j<n;j++){
                System.out.print("*");

            }
        } // 5~1
        System.out.println();

        for(int i= 0 ; i<n;i++){
            System.out.println();
            for(int j= i; j<n-1;j++){
                System.out.print(" ");
            }// 4~0
            for(int k= 0; k<i+1;k++){
                System.out.print("*");
            }// 1~5
        }

        System.out.println();

        for(int i= 0 ; i<n;i++){
            System.out.println();
            for(int k= 0; k<i;k++){
                System.out.print(" ");
            }//0~4
            for(int j= i; j<n;j++){
                System.out.print("*");

            }//5~1

        }

    }
}
