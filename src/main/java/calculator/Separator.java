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

//    int[] getNums() {}

}
