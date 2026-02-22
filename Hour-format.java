import java.util.*;

public class Hour-format {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        int hour = Integer.parseInt(time.substring(0, 2));
        int minute = Integer.parseInt(time.substring(2, 4));
        String period;
        if(hour == 0) {
            hour = 12;
            period = "AM";
        }
        else if(hour == 12) {
            period = "PM";
        }
        else if(hour > 12) {
            hour = hour - 12;
            period = "PM";
        }
        else {
            period = "AM";
        }
        System.out.printf("%02d:%02d %s", hour, minute, period);
    }
}
