public class DiceRoller {
    private final Dice dice1;
    private final Dice dice2;

    public DiceRoller(Dice dice1, Dice dice2) {
        this.dice1 = dice1;
        this.dice2 = dice2;
    }

    public int rollDice(Dice dice) {
        int roll = dice.rollDice();
        System.out.println("Rolled a " + roll);
        return roll;
    }

    public int rollUntilDouble() {
        boolean match = false;
        int counter = 0;
        do {
            int roll1 = rollDice(dice1);
            int roll2 = rollDice(dice2);
            counter ++;
            if (roll1 == roll2) {
                match = true;
                System.out.println("You rolled a double! " + roll1 + " " + roll2 + " after " + counter + " tries!");
            }
            else {
                System.out.println("Try again!");
            }
        } while (!match);
        return counter;
    }
}
