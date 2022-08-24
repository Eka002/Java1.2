public class Main {
    public static void main(String[] args) {
        int ticketPrice = 10000;
        int rubles = 20;
        int bonusMiles = 1;

        int totalBonus = ticketPrice * bonusMiles / rubles;
        System.out.println(totalBonus);
    }
}
