package j10_배열;

public class Array2 {
    /*
    names 라는 배열을 생성하고
    5명 조원
    위의 값을 순서대로 대입

     */
    public static void main(String[] args) {
        String[] names = new String[10];
        names[0] = "임지현";
        names[1] = "신경수";
        names[2] = "고희주";
        names[3] = "문승주";
        names[4] = "장건녕";

        for(int i=0; i<names.length; i++){
            System.out.println("이름" + (i+1) + ": " + names[i] );
        }

    }
}
