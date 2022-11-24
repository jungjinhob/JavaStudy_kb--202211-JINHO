package j08_클래스;

public class Phone {
    public static String company;
    String model;
    Phone(){

    }
    Phone(String c , String m){ //(기본생성자) 무조건 주소를 리턴
        company = c;
        model = m;
        printPhoneCompany();
        printPhoneModel();
        System.out.println();
    }

    public static void printPhoneCompany(){
        System.out.println("제조사 : " + company);
        System.out.println();
    }

    void printPhoneModel(){
        System.out.println("모델명 : " + model);
        System.out.println();
    }
}
