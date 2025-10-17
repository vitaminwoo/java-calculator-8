package calculator;

public class Calculator {

    int[] nums;

    Calculator(int[] nums) {
        this.nums = nums;
    }

    public int plusNums() {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return sum;
    }

}
