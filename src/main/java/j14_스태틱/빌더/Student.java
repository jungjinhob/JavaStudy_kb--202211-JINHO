package j14_스태틱.빌더;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Student {
    private int studentCode;
    private String name;
    private String address;

    public static StudentBuilder builder(){
        return new StudentBuilder();
    }
    public static class StudentBuilder{  //내부클래스 바로 접근하기위해 static사용!!!!!
                                        // 일반클래스는 무조건 메모리 할당해야 사용가능.(new , . 사용)
        private int studentCode; //이 부분 하나를 위해서 다씀 (studentCode)
        private String name;
        private String address;

        public StudentBuilder studentCode(int studentCode){
            this.studentCode = studentCode;
            return this; //자기 자신의 주소 리턴 !!!! (다시 간다 StudentBuilder로)
        }public StudentBuilder name(String name){
            this.name = name;
            return this;
        }public StudentBuilder address(String address){
            this.address = address;
            return this;
        }
        public Student build(){
            return new Student(studentCode, name, address); //빌더에 있는 변수값들을 student로 보냄.
    }




}}
