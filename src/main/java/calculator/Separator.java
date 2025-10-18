package calculator;

public class Separator {

    String input_str;
    String regex_str;
    String custom_regex;

    Separator(String input_str) {
        this.input_str = input_str;
    }

    void setRegex() {
        regex_str = ",|:"; // 구분자를 정규식 형태로 정의.
    }

    void checkCustomRegex() {
        String regex_check = "//|\\\\n";
        String[] check_custom = input_str.split(regex_check);
        if (check_custom.length != 1) {
            custom_regex = check_custom[1];
            regex_str = regex_str + "|" + custom_regex;
            input_str = check_custom[2];
        }
    }

    int[] getNums() {
        String[] nums_str = input_str.split(regex_str); // 정규식 형태로 정의된 구분자 삽입 후 split.
        int[] nums = new int[nums_str.length];


        for (int i = 0; i < nums_str.length; i++) {
                int num = Integer.parseInt(nums_str[i]);
                if (num < 0) {
                    throw new IllegalArgumentException();
                }
                //            System.out.println(num);
                nums[i] = num;
        }
        return nums;
    }

}
