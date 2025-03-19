package main;

import java.util.regex.Pattern;

public class PhoneCleanerRegex {
    String number = "";
    String correctNumber = "7[0-9]{10}";
    String regex = "[^0-9]";
    String nonSeven = "[0-9]{10}";
    String nonEight = "8[0-9]{10}";
    String eight = "8";

    Pattern pattern = Pattern.compile(correctNumber, Pattern.CASE_INSENSITIVE);


    public PhoneCleanerRegex(String number) {
        this.number = number;
    }


    public String PhoneRebild() {
        number = number.replaceAll(regex, "");
        if (pattern.matches(correctNumber, number)) {
            return number;
        } else if (pattern.matches(nonSeven, number)) {
            return 7 + number;
        } else if (pattern.matches(nonEight, number)) {
            return number.replaceAll(eight, "7");
        } else {
            return "Введите корректное число";
        }
    }

}
