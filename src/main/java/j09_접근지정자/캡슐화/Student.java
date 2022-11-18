package j09_접근지정자.캡슐화;
//priavte 보호 -> getter setter 사용해서 바깥에서 씀
public class Student {
    private String name;
    private String gender;

    Student(){

    }
    public Student(String name, String gender) {
        this.name = name;
        this.gender = gender;
}
    public void setName(String name) {
            this.name = name;
    }
    public String getGender(){
        return this.gender;
    }

public void printInfo() {
    System.out.println("Name: " + name);
    System.out.println("Gender: " + gender);
}
}
