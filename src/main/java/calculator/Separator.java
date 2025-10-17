package calculator;

public class Separator {

    String input_str;
    String regex_str;

    Separator(String input_str) {
        this.input_str = input_str;
    }

    void setRegex() {
        regex_str = ",|:"; // 구분자 필드로 따로 명시.
    }

    int[] getNums(String add_str) {
        String[] nums_str = add_str.split(regex_str); // 이 구분자를 따로 변수로 명시해주면 더 좋을듯.정규표현식이라는 개념.
        int[] nums = new int[nums_str.length];

        try {
            for (int i = 0; i < nums_str.length; i++) {
                int num = Integer.parseInt(nums_str[i]);
                if (num < 0) {
                    throw new IllegalArgumentException();
                }
                //            System.out.println(num);
                nums[i] = num;
            }
        } catch (IllegalArgumentException e) {
            nums = null;
            System.out.println("IllegalArgumentException");
        } catch (Exception e) {
            nums = null;
        }
        return nums;

    }

}
