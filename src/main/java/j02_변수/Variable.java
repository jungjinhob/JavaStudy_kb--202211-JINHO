package j02_변수;

/**
 * 클래스에 대한 설명
 */
public class Variable {
    /**
     *
     * 메소드에 대한 설명
     */

    public static void main(String[] args) {
        boolean checkFlag = false;
        System.out.println("논리 자료형 : " + checkFlag);
        checkFlag = true;
        System.out.println("논리 자료형 : " + checkFlag);

        // char형 + 하면 int형으로나옴 (원하는값 x)
        char name1 = '정';
        char name2 = '진';
        System.out.println(name1 + name2);
        System.out.println(Integer.toHexString(name1));
        System.out.println((int)name1);

        int width = 100;
        int width2 = 200;
        System.out.println(width2 + width);
        String sWidth = "100";
        String sWidth2 = "200";
        System.out.println(sWidth + sWidth2);

        double dNum = 2.1;
        double dNum2 = 3.5;
        System.out.println(dNum + dNum2);

        System.out.println("<<<<<< 형변환 >>>>>>");
        //업캐스팅
        //문자 -> 정수 -> 실수
        //회색 글씨는 생략해도됨 (메모리 안넘침)
        char c1 = 'a';
        System.out.println(c1);
        int n1 =  c1;
        System.out.println(n1);
        double d1 =  n1;
        System.out.println(d1);

        //회색 글씨는 생략x (메모리 넘침)
        //다운캐스팅
//        실수 -> 정수 -> 문자
        int n2 = (int) d1;
        System.out.println(n2);
        char c2 = (char) n2;
        System.out.println(c2);
    }
}
