package calculator;

public class Separator {

    private static final String REGEX_DEFAULT = ",|:";

    public static int [] separate(String input_str) {
        String regex_str = REGEX_DEFAULT;

        String regex_check = "//|\\\\n";
        String[] check_custom = input_str.split(regex_check);
        if (check_custom.length != 1) {
            regex_str = regex_str + "|" + check_custom[1];
            input_str = check_custom[2];
        }

        String[] nums_str = input_str.split(regex_str);
        return getNums(nums_str);
    }

    private static int[] getNums(String[] nums_str) {
        int[] nums = new int[nums_str.length];

        for (int i = 0; i < nums_str.length; i++) {
                int num = Integer.parseInt(nums_str[i]);
                if (num < 0) {
                    throw new IllegalArgumentException();
                }
                nums[i] = num;
        }
        return nums;
    }

}
