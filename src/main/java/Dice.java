import java.util.Random;

public class Dice {
    private final int sides;

    public Dice(int sides) {
        this.sides = sides;
    }

    public int rollDice() {
        Random random = new Random();
        return random.nextInt(sides) + 1;
    }
}
