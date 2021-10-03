package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.imageio.stream.ImageInputStream;

import static org.junit.jupiter.api.Assertions.*;

class Solution31Test {

    @Test
    void heartRateMin() {
        Solution31 in = new Solution31();
        int age = 22;
        int restHR = 65;
        int intensity = 55;

        int target = (((220 - age) - restHR) * intensity/100) + restHR;

        Assertions.assertEquals(138, target);
    }

    @Test
    void heartRateMAx() {
        Solution31 in = new Solution31();
        int age = 22;
        int restHR = 65;
        int intensity = 95;

        int target = (((220 - age) - restHR) * intensity/100) + restHR;

        Assertions.assertEquals(191, target);
    }
}