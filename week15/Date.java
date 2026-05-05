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

    public int nextDay() {
        this.d = this.d + 1;
        return this.d;
    }

    public String toString() {
        if (this.d < 10) {
            return "0" + this.m + "/" + this.d;
        } else {
            return this.m + "/" + this.d;
        }
    }

    public static void main(String[] args) {
        Date date = new Date(03, 30);
        System.out.println(date.toString());
    }
}
