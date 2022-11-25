package j12_추상.인터페이스;



public class CalcMain {
    public static void main(String[] args) {
        int[] taxPay = {2000000,2500000,2600000,2700000};
        int[] calaryPay = {1000000,1000000,1000000,1000000};
        Calc calculator = new Tax();

        int result1 = calculator.calc(taxPay);
        if(result1 == 0){
            System.out.println("오류: " + calculator.ERROR_CODE);
        }else{
            System.out.println("result1 = " + result1);
        }
//        System.out.println(tax.calc(new int[] {2000000,2500000,2600000,2700000})); //같다
        System.out.println();
        calculator = new Salary();
        int result2 = calculator.calc(calaryPay);
        if(result2 == 0){
            System.out.println("오류: " + calculator.ERROR_CODE);
        }else{
            System.out.println("result2 = " + result2);
        }


    }
}
