package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Vector;

public class StringList {
    public static void main(String[] args) {
        String[] strArray = new String[3];
        strArray[0] = "java";
        strArray[1] = "Jsp";
        strArray[2] = "Servlet";
        //일반반복
        System.out.println("<<<<<<<<< 일반반복 >>>>>>>>>");
        for(int i = 0; i< strArray.length;i++){
            System.out.println(strArray[i]);
        }

        // for each  인덱스 필요없이 for문 돌릴때 사용 .
        System.out.println("<<<<<< foreach >>>>>>");
        for(String str : strArray){ // for(    : 데이터집합) -> 순서대로 꺼냄 , 앞뒤가 자료형 같아야함.
            System.out.println(str);
        }

        ArrayList<String> strList = new ArrayList<>(); // 크기 지정안하고 하고 상관없이 넘치면 크기가 1.5배로 늘어남
        //값 추가 (create) -> add(값), add(index, 값)
        strList.add("java");
        strList.add("jsp");
        strList.add("servlet");
        strList.add(1,"C++");

        System.out.println("<<<<<<<< list foreach >>>>>>>");
        for(String str : strList){
            System.out.println(str);
        }

        //값 조회(Read) -> get(index)
        System.out.println("<<<<<<<< list 일반반복 >>>>>>>>"); //list값은 출력하려면 get이 필요함.
        for(int i= 0 ; i< strList.size();i++){ // 키값이 없으면 get이 없다.(set은 없음)
            System.out.println(strList.get(i));
        }

        //값 수정(Update) -> set(index, 값)
        System.out.println("<<<<<<<< list 수정 >>>>>>>>");
        strList.set(0,"HTML5");
        System.out.println(strList);

        //값 삭제(Delete) -> remove(index);
        System.out.println("<<<<<<<< list 삭제 >>>>>>>>");
        String removeData = strList.remove(2);
        System.out.println(removeData);
        System.out.println(strList);

    }
}
