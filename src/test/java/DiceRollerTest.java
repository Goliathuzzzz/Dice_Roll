import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceRollerTest {

    private static DiceRoller diceRoller;
    private static Dice dice1;
    private static Dice dice2;
    private static int sides;

    @BeforeAll
    static void init() {
        sides = 6;
        dice1 = new Dice(sides);
        dice2 = new Dice(sides);
        diceRoller = new DiceRoller(dice1, dice2);
    }

    @Test
    void rollDice() {
        for (int i = 0; i < 100; i++) {
            int result1 = diceRoller.rollDice(dice1);
            int result2 = diceRoller.rollDice(dice2);
            assertTrue(result1 <= 6 && result1 >= 1);
            assertTrue(result2 <= 6 && result2 >= 1);
        }
    }

    @Test
    void rollUntilDouble() {
        for (int i = 0; i < 10; i++) {
            assertTrue(diceRoller.rollUntilDouble() > 0, "Should roll at least once");
        }
    }
}