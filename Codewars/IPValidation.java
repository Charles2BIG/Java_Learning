package base.program;

import java.util.regex.Pattern;

// IP Validator. Consumes ip and return true or false.
public class IPValidation {
    public static boolean isValidIP(String ip) {
        boolean answer = false;
        if (Pattern.matches("^\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}$", ip))
        {
            answer = true;
            Pattern pattern = Pattern.compile("\\.");
            String[] numbers = pattern.split(ip);
            for (String s : numbers) {
                if (Pattern.matches("[0]\\d*", s) | (Integer.parseInt(s) < 0) || (Integer.parseInt(s) > 255)) {
                    answer = false;
                }
            }
        }
        return answer;
    }
}
