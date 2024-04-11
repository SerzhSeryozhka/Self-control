import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test5 {
    public static void exampl() throws FileNotFoundException {
        ArrayList<Time> clock = readTimeFromFile();
        System.out.println(clock);
    }
public static ArrayList<Time> readTimeFromFile() throws FileNotFoundException {
    Scanner scanner=new Scanner(new File("Numbs Test5"));
    int kolvo = scanner.nextInt();
    ArrayList<Time> clock=new ArrayList<>();
    while (scanner.hasNext()){
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds=scanner.nextInt();
        clock.add(new Time(hours, minutes, seconds));
        var order = new ArrayList<>(List.of(clock));
//        Collections.sort(order);
    }
    scanner.close();
    return clock;
}
}
class Time{
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return "Time{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                '}';
    }
}