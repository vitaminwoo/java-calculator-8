package calculator;

import camp.nextstep.edu.missionutils.Console;

public class Application {
    public static void main(String[] args) {
        // TODO: 프로그램 구현
        String add_str = Console.readLine();

        Separator separator = new Separator(add_str);
        separator.setRegex();
        separator.checkCustomRegex();
        int[] intList = separator.getNums();

        Calculator calculator = new Calculator(intList);
        int result = calculator.plusNums();

        System.out.println("결과 : " + result);
    }
}
