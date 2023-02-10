import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class ClassNameExample {
    private static final String ClassName_ReGex = "^[CAP][0-9]{4}[GHIKLM]$";
    public static void main(String[] args) {
        System.out.println("Nhập vào Class Name :");
        String className = new String(new Scanner(System.in).nextLine());
        Pattern pattern = Pattern.compile(ClassName_ReGex);
        Matcher matcher = pattern.matcher(className);
        System.out.println(matcher.matches());
    }
}
