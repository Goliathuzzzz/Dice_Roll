import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DiceTest {

    private static Dice dice;
    private static int sides;

    @BeforeAll
    static void innit() {
        sides = 6;
        dice = new Dice(sides);
    }

    @BeforeEach
    void setUp() {
    }

    @Test
    void rollDice() {
        for (int i = 0; i < 100; i++) {
            int result = dice.rollDice();
            assertTrue(result >= 1 && result <= 6, "Results should be between 1 and " + sides);
        }
    }
}