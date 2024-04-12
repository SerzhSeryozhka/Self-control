import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Test6 {
  /*  private static int maximum() {

        return new int[]{max};
    }*/
    public static int[] readFromFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("Test6 Bus"));
        int k = scanner.nextInt();
        int[] kolvo = new int[k];
        for (int i = 0; i < k; i++) {
            kolvo[i] = scanner.nextInt();
            int max = 0;
            int sp = 0;
            int hz = 0;
            while (sp < kolvo.length) {
                sp++;{
                    if (hz > max)
                        max = hz;
                    hz = 0;
                }
            }
            if (hz > max)
                max = hz;
            System.out.println(max);
        }
        scanner.close();
        return kolvo;
    }


}

