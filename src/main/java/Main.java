public class Main {
    public static void main(String[] args) {
        DiceRoller diceRoller = new DiceRoller(new Dice(6), new Dice(6));
        int count  = diceRoller.rollUntilDouble();
        System.out.println("It took " + count + " tries to roll a double!");
    }
}
