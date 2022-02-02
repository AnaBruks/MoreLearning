import java.util.Arrays;
import java.util.regex.*;

public class Test {

    public static void main(String[] args) {
        // String stringPattern = "[a-z]+";                // вводим патерн в строку
        String text = "code 2 learn java tutorial";      // вводим ТЕКСТ
        Pattern pattern = Pattern.compile("[a-z]+");  // делаем паттерн из строки
        Matcher matcher = pattern.matcher(text);           // матчер вызывает патерн на заданном тексте
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));  // результат работы матчера
        }
        String regex = "(\\w{6,})@(\\w+\\.)([a-z]{2,4})";
        String s = "адреса эл.почты:ivanov@gmail.com, sidorov@bsu.by!";
        Pattern pattern2 = Pattern.compile(regex);
        Matcher matcher2 = pattern.matcher(s);
        while (matcher2.find()) {
            System.out.println("e-mail: " + matcher2.group());
        }
        Pattern pattern3 = Pattern.compile("\\d+\\s?");
        String[] words = pattern3.split("java5tiger 77 java6mustang");
        System.out.print(Arrays.toString(words));
    }

}
