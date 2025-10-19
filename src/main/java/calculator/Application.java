package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        String add_str = Console.readLine();

        int[] intList = Separator.separate(add_str);

        Calculator calculator = new Calculator(intList);
        int result = calculator.plusNums();

        System.out.println("결과 : " + result);
    }
}
