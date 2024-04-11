import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class Test3 {
    public static void N3() {
        System.out.println("Как тебя зовут?");
        Scanner scanner = new Scanner(System.in);
        String q = scanner.next();
//        if (q.charAt(q.length()-1)=='а'||q.charAt(q.length()-1)=='и'||q.charAt(q.length()-1)=='я')
        if (q.endsWith("а")|| q.endsWith("и")||q.endsWith("я"))
            System.out.println("Приветик!");
        else
            System.out.println("Здарово!");

}}