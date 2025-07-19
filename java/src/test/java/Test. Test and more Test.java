import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void testTossAndSumInRange() {
        Dice dice = new Dice(2);
        int result = dice.tossAndSum();
        assertTrue(result >= 2 && result <= 12, "Sum should be between 2 and 12 for 2 dice");
    }

    @Test
    public void testTossAndSumSingleDie() {
        Dice dice = new Dice(1);
        int result = dice.tossAndSum();
        assertTrue(result >= 1 && result <= 6, "Sum should be between 1 and 6 for 1 die");
    }
}