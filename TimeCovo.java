import java.util.Calendar;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class TimeCovo {
    public static void main(String[] args) {
        // Get the current time in India
        Calendar calendar = Calendar.getInstance();
        TimeZone sourceTimeZone = TimeZone.getTimeZone("Asia/Kolkata");
        calendar.setTimeZone(sourceTimeZone);

        // Define the target time zones
        String[] targetTimeZones = {
            "America/New_York",
            "Europe/London",
            "Australia/Sydney",
            "Asia/Tokyo",
            "Africa/Johannesburg"
        };

        // Format the source time for display
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        formatter.setTimeZone(sourceTimeZone);
        String sourceTime = formatter.format(calendar.getTime());

        // Convert to target time zones and display the converted times
        for (String targetTimeZoneId : targetTimeZones) {
            TimeZone targetTimeZone = TimeZone.getTimeZone(targetTimeZoneId);
            formatter.setTimeZone(targetTimeZone);
            String targetTime = formatter.format(calendar.getTime());

            System.out.println("Source Time (India): " + sourceTime);
            System.out.println("Target Time (" + targetTimeZoneId + "): " + targetTime);
            System.out.println();
        }
    }
}
