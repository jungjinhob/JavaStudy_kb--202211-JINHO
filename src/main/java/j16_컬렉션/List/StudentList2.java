package j16_컬렉션.List;

import java.util.ArrayList;
import java.util.List;

public class StudentList2 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        students.add(new Student(20220001,"이승아",21,null));
        students.add(new Student(20220002,"김수현",22,null));
        students.add(new Student(20220003,"문경원",23,null));
        students.add(new Student(20220004,"홍지혜",24,null));
        students.add(new Student(20220005,"고동현",25,null));

        String lastName = null;
        for(int i =0;i<students.size();i++){
            int nowIndex = students.size() -1 -i; //마지막
            int preIndex = nowIndex -1; //그 앞
            Student s = students.get(nowIndex);

            if(nowIndex == 0){ //마지막인덱스는 저장된 마지막인덱스값 삽입 (고동현)
                s.setName(lastName);
                break;
            }
            if(nowIndex == students.size() - 1){ //마지막 인덱스값 lastName에 저장.(고동현)
                lastName = s.getName();
            }
            s.setName(students.get(preIndex).getName()); //이전 인덱스의 값을 본 값에 넣기.
        }

        System.out.println(students);

        // 0번 인덱스 학생의 이름을 다음 인덱스 학생이름으로 변경
        // 제일 마지막 인덱스의 학생 이름으로 0번  인덱스로 이동

    }
}
