package week15;

public class Date {
    private int m;
    private int d;

    public Date(int m, int d) {
        this.d = d;
        this.m = m;
    }

    public int daysInMonth() {
        if (this.m == 2) {
            return 28;
        } else if (this.m == 1 || this.m == 3 || this.m == 5 || this.m == 7 || this.m == 8 || this.m == 10
                || this.m == 12) {
            return 31;
        } else {
            return 30;
        }
    }

    public int getDay() {
        return this.d;
    }

    public int getMonth() {
        return this.m;
    }

    public void nextDay() {
        if (this.d < daysInMonth()) {
            this.d++;
        } else {
            this.d = 1;
            if (this.m < 12) {
                this.m++;
            } else {
                this.m = 1;
            }
        }
    }

    public int absoluteDay() {
        int dayOfYear = 0;
        dayOfYear += this.d + ;
        return dayOfYear;
    }

    public String toString() {
        String mm = (this.m < 10 ? "0" : "") + this.m;
        String dd = (this.d < 10 ? "0" : "") + this.d;
        return mm + "/" + dd;
    }

    public static void main(String[] args) {
        Date date = new Date(03, 30);
        System.out.println(date.toString());
    }
}
