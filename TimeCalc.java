public class TimeCalc {
    public static void main(String[] args) {
        String[] time = args[0].split(":");
        int hours = Integer.parseInt(time[0]);
        int minutes = Integer.parseInt(time[1]);

        int minutesToAdd = Integer.parseInt(args[1]);

        int totalMinutes = (hours * 60) + minutes + minutesToAdd;
        int totalHours = (int) (totalMinutes / 60);
        int newHours = totalHours % 24;
        int newMinutes = totalMinutes - (totalHours * 60);

        String hoursToDisplay = "", minutesToDisplay = "";

        if (newHours < 10) {
            hoursToDisplay = "0" + newHours;
        }
        if (newHours >= 10) {
            hoursToDisplay = String.valueOf(newHours);
        }

        if (newMinutes < 10) {
            minutesToDisplay = "0" + newMinutes;
        }
        if (newMinutes >= 10) {
            minutesToDisplay = String.valueOf(newMinutes);
        }

        System.out.println(hoursToDisplay + ":" + minutesToDisplay);

    }
}
