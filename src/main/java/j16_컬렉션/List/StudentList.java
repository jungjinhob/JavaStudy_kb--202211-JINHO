package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        List<String> names = new ArrayList<String>();
        students.add(new Student(20220001,"이승아",21));
        students.add(new Student(20220002,"김수현",22));
        students.add(new Student(20220003,"문경원",23));
        students.add(new Student(20220004,"홍지혜",24));
        students.add(new Student(20220005,"고동현",25));
        names.add("이승아");
        names.add("김수현");
        names.add("문경원");
        names.add("홍지혜");
        names.add("고동현");

        for(int i = 0; i < students.size(); i++) {
            if(i == 4){
                students.get(0).setName("고동현");
                break;
            }
            students.get(i+1).setName(names.get(i));

        }
        System.out.println(students);

        // 0번 인덱스 학생의 이름을 다음 인덱스 학생이름으로 변경
        // 제일 마지막 인덱스의 학생 이름으로 0번  인덱스로 이동

    }
}
