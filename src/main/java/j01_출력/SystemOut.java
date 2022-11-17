package j01_출력;
//class 파일은 대문자로
// \t \n  \\(폴더 경로) 같은걸 이스케이프문자라고 함.
//    \r 해당 줄 맨 앞으로 이동  \" 큰따옴표 출력

public class SystemOut {
    public static void main(String[] args) {
        System.out.print("이름 : ");
        System.out.println("정진호");
        System.out.print("주소 : ");
        System.out.println("부산 북구 덕천동");
        System.out.print("연락처 : ");
        System.out.println("111-2222-3333");
        System.out.print("성별 : ");
        System.out.println("남성");

    }
}
