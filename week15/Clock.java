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
        this.minute = totalMins % 60;

        this.hour += addHours;

        while (this.hour > 12) {
            this.hour -= 12;
            this.amPm = this.amPm.equals("AM") ? "PM" : "AM";
        }

        return this.minute;
    }

    public static void main(String[] args) {
        Clock time = new Clock(6, 27, "PM");
        System.out.println(time.toString());

        time.advance(1); // 6:28 PM
        System.out.println(time.toString());
        time.advance(30); // 6:58 PM
        System.out.println(time.toString());
        time.advance(5); // 7:03 PM
        System.out.println(time.toString());
        time.advance(60); // 8:03 PM
        System.out.println(time.toString());
        time.advance(128); // 10:11 PM
        System.out.println(time.toString());
        time.advance(180); // 1:11 AM
        System.out.println(time.toString());
        time.advance(1440); // 1:11 AM (1 day later)
        System.out.println(time.toString());
        time.advance(21075); // 4:26 PM (2 weeks later)
        System.out.println(time.toString());
    }
}
