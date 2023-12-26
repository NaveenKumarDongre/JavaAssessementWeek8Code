import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static String convertToMilitaryTime(String time12hr) {
        try {
            // Define format for 12-hour time
            SimpleDateFormat inputFormat = new SimpleDateFormat("hh:mm:ss a");
            
            // Parse the input time in 12-hour format
            Date date = inputFormat.parse(time12hr);
            
            // Define format for 24-hour time
            SimpleDateFormat outputFormat = new SimpleDateFormat("HH:mm:ss");
            
            // Format the parsed date to 24-hour time
            return outputFormat.format(date);
        } catch (ParseException e) {
            // Handle parsing exceptions, if any
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        // Example usage
        String time12hr = "03:45:00 PM";
        String militaryTime = convertToMilitaryTime(time12hr);

        if (militaryTime != null) {
            System.out.println("12-hour time: " + time12hr);
            System.out.println("Military time: " + militaryTime);
        } else {
            System.out.println("Conversion failed.");
        }
    }
}
