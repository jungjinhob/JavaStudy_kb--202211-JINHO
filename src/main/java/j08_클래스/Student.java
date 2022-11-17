package j08_클래스;
//지역변수 > 전역변수 (우선순위)
public class Student {

    String school;
    String name;
    int studentYear;
    boolean gender;
    Student(){

    }
    Student(String school, String name, int studentYear, boolean gender){
        this.school = school;
        this.name = name;
        this.studentYear = studentYear;
        this.gender = gender;
        showStudentInfo();
    }
    void showStudentInfo(){

        System.out.println("학교명 : " + school);
        System.out.println("이름 : " + name);
        System.out.println("학년 : " + studentYear);
        System.out.println("성별 : " + (gender ? "남" : "여"));

    }
}
