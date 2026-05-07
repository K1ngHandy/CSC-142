package week15;

public class Clock {
    private int hour;
    private int minute;
    private String amPm;

    public Clock(int hour, int minute, String amPm) {
        this.hour = hour;
        this.minute = minute;
        this.amPm = amPm;
    }

    public int getHour() {
        return this.hour;
    }

    public int getMinute() {
        return this.minute;
    }

    public String getAmPm() {
        return this.amPm;
    }

    public String toString() {
        return String.format("%02d:%02d %s", this.hour, this.minute, this.amPm);
    }

    public int advance(int minute) {
        int totalMins = this.minute + minute;
        int addHours = totalMins / 60;
        int newMinute = totalMins % 60;

        int hoursToAdd = this.hour % 12;
        int totalHours = hoursToAdd + addHours;

        int toggle = totalHours / 12;
        int newHours = totalHours % 12;
        int newHour = (newHours == 0) ? 12 : newHours;

        if (toggle % 2 == 1) {
            this.amPm = this.amPm.equals("AM") ? "PM" : "AM";
        }

        this.hour = newHour;
        this.minute = newMinute;
        return this.minute;
    }

    public boolean isWorkTime() {
        if (this.amPm.equals("AM")) {
            return this.hour >= 9 && this.hour <= 11;
        } else {
            return this.hour == 12 || (this.hour >= 1 && this.hour <= 4) || (this.hour == 5 && this.minute == 0);
        }
    }

    public static void main(String[] args) {
        Clock time = new Clock(4, 59, "PM");
        System.out.println(time.toString());

        time.advance(1); // 6:28 PM
        System.out.println(time.toString());
        time.advance(30); // 6:58 PM
        System.out.println(time.toString());
        time.advance(5); // 7:03 PM

        System.out.println(time.isWorkTime());
    }
}
