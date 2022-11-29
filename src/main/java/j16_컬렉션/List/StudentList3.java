package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StudentList3 {
    public static void main(String[] args) {
//        List<hobby> hobbyList = new ArrayList<hobby>();
    	int[] arr = {1,2,3,4};
        List<hobby> hl = Arrays.asList(new hobby[]{
                new hobby(1, "축구"),
                new hobby(2, "농구"),
                new hobby(3, "골프"),
                new hobby(4, "음악감상")
        });

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
        
        List<Student> sl = new ArrayList<Student>();
        sl.add(s1);
        sl.add(s2);
        sl.add(s3);
        for(Student s : sl){
            System.out.println("<학생정보>");
            System.out.println(s);
            System.out.println("<" + s.getName() + " 학생 취미>");
            for(hobby h : s.getHobbyList()){
                System.out.println(h);
            }
        }
        List<String> nameList = Arrays.asList(new String[] {
                "김준일",
                "김준이",
                "김준삼"
        });


        Object[] nameArray = nameList.toArray();
        System.out.println((String)nameArray[0]);

}}


