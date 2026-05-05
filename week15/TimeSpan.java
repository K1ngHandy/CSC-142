package week15;

public class TimeSpan {
    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public int getHours() {
        return hours + minutes / 60;
    }

    public int getMinutes() {
        return hours * 60 + minutes;
    }

    public int add(int hours, int minutes) {
        this.hours += hours;
        this.minutes += minutes;
    }

    public int add(timespan) {}

    public int getTotalHours() {
    }

    public String toString() {
        return hours + "h" + minutes + "m";
    }

    public static void main(String[] args) {
        TimeSpan time = new TimeSpan(3, 30);

        System.out.println(time.toString());
    }
}
