import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static String separation (String text, String regex) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        String number = null;
        if (matcher.find()) {
            number = text.substring(matcher.start(), matcher.end());
        }
        return number;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        Double number1 = Double.valueOf(separation(input,"^\\d{1,}"));
        Double number2 = Double.valueOf(separation(input,"\\d{1,}$"));
        String ops = separation(input,"\\b\\D\\b");

        Calc<Double> result = new Calc<>(number1,number2);
        System.out.println(result.cal(ops));
        }

}
