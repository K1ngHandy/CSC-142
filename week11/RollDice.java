package week10.week11;

public class RollDice {
    public static void main(String[] args) {
        rollDice();
    }

    public static void rollDice() {
        Random r = new Random();
        int sum = 0;
        int tries = 0;

        while (sum != 7) {
            int n1 = r.nextInt(6) + 1;
            int n2 = r.nextInt(6) + 1;

            sum = n1 + n2;

            System.out.println("You rolled " + n1 + " and " + n2);

            tries++;
        }
    }
}
