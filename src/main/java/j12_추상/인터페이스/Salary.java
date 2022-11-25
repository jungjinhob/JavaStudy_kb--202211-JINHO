package j12_추상.인터페이스;
/*
    급여정산
 */
public class Salary implements Calc{
    @Override
    public int calc(int[] values) {
        System.out.println("급여 정산을 진행합니다.");
        int sum = 0;
        for(int i=0; i<values.length; i++){
            sum += values[i];
        }
        sum = (sum - (int)(sum * 0.03));
        return sum;
    }
}
