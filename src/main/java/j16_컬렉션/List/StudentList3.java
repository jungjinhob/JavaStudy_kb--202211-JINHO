package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList3 {
    public static void main(String[] args) {
//        List<hobby> hobbyList = new ArrayList<hobby>();
    	//hl 이란 list에 hobby객체 4개가 들어감 (원랜 배열로 객체 생성을했지만 aslist로 List형으로 바꿔줌)
        List<hobby> hl = Arrays.asList(new hobby[]{
                new hobby(1, "축구"),
                new hobby(2, "농구"),
                new hobby(3, "골프"),
                new hobby(4, "음악감상")
        });
        //student 빌더사용해서 정보 갖고옴 , hobbyList 부분은 hl와 같은 원리로 갖고오는데 hl.get을 사용해서 hl에서 값을 가져올뿐이다.
        //ex. s1 = (id = 20220001 , age = 21, name = 고동현 hobbylist = {id = 1 , hobbyname = "축구", id = 3, hobbyname = "골프"}
        Student s1 =Student.builder()
                .studentId(20220001)
                .age(21)
                .name("고동현")

                .hobbyList(Arrays.asList(new hobby[]{hl.get(0),hl.get(2)}))
                .build();
        Student s2 =Student.builder()
                .studentId(20220001)
                .name("강동욱")
                .age(21)
                .hobbyList(Arrays.asList(new hobby[]{hl.get(1),hl.get(3)}))
                .build();
        Student s3 =Student.builder()
                .studentId(20220001)
                .name("정진호")
                .age(21)
                .hobbyList(Arrays.asList(new hobby[]{hl.get(0),hl.get(3)}))
                .build();
        //sl에 Student자료형 List가 생성하여 그안에 Student객체 s1~s3삽입.
        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        //큰 for문 s1~s3출력
        for(Student s : sl){
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + " 학생 취미>");
            //작은 for문 s1~s3각각의 hobbyList출력(get으로 받아온것들)
            for(hobby h : s.getHobbyList()){
                System.out.println(h);
            }
        }
        //String 형의 List하나 생성 안에는 {김준일 ~삼}
        List<String> nameList = Arrays.asList(new String[] {
                "김준일",
                "김준이",
                "김준삼"
        });

        
        Object[] nameArray = nameList.toArray();
        
        System.out.println((String)nameArray[0]);

}}


