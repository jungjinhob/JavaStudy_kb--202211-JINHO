package j06_반복;

import java.util.Scanner;



public class Loop5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String select = null;
        boolean Flag1 = true;
        boolean Flag2 = true;
        //이중 while에서 바깥도 break 걸기위해 사용 (flag)
        while(Flag1){
            System.out.println("[폴더 선택]");
            System.out.println("1. 문서");
            System.out.println("2. 음악");
            System.out.println("3. 사진");
            System.out.println("4. 동영상");
            System.out.println("q. 종료");
            System.out.print("메뉴선택:");
            select = scanner.nextLine();
            if(select.equals("1")) {
                while(Flag2){
                    System.out.println("1.대학서류");
                    System.out.println("2.개인자료");
                    System.out.println("1.기업정보");
                    System.out.println("b. 뒤로가기");
                    System.out.print("메뉴선택:");
                    select = scanner.nextLine();
                    if(select.equals("1")){

                    }else if(select.equals("2")) {

                    }else if(select.equals("3")){

                    }else if(select.equals("4")){

                    }else if(select.equals("b")){
                        Flag2= false;
                    }else if (select.equals("q")) {
                        System.out.println("정말 프로그램을 종료하시겠습니까?(y/n)");
                        select = scanner.nextLine();
                        if(select.equals("y")){
                            Flag1 = false;
                            Flag2= false;
                        }
                    }else{
                        System.out.println("다시입력ㄱㄱ");
                    }
                }


            }else if(select.equals("2")) {

            }else if(select.equals("3")){

            }else if(select.equals("4")){

            }
            else if (select.equals("q")) {
                System.out.println("정말 프로그램을 종료하시겠습니까?(y/n)");
                select = scanner.nextLine();
                if(select.equals("y")){
                    break;
                }
            }else {
                System.out.println("다시 입력하세요");
            }

        }


    }
}
