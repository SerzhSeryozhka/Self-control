import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.Comparator;

public class Test5 {
    public static void exampl() throws FileNotFoundException {
        ArrayList<Time> clock = readTimeFromFile();
        for (Time r:clock){
            System.out.println(r);
        }
//        System.out.println(clock);
    }
public static ArrayList<Time> readTimeFromFile() throws FileNotFoundException {
    Scanner scanner=new Scanner(new File("Numbs Test5"));
    ArrayList<Time> clock=new ArrayList<>();
    int kolvo = scanner.nextInt();
    while (scanner.hasNext()){
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        int seconds=scanner.nextInt();
        clock.add(new Time(hours, minutes, seconds));
//        var order = new ArrayList<>(List.of(clock));
//        Collections.sort(clock);
        clock.sort(Comparator.naturalOrder());

    }
    scanner.close();
    return clock;
}
}
class Time implements Comparable<Time>{
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
        return      " " + hours +
                " " + minutes +
                " " + seconds ;
    }

    @Override
    public int compareTo(Time o) {
        return this.hours-o.hours;
    }
}