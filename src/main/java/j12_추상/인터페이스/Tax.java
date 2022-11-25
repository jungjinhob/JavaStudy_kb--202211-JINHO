package j12_추상.인터페이스;

public class Tax implements Calc{
    @Override
    public int calc(int[] values) {
        System.out.println("연말정산을 진행합니다.");
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        return sum;
    }
    public int ex(){
        System.out.println("test");
        return 0;
    }
}
