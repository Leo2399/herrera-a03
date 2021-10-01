package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution24Test {

    @Test
    void TestisAnagram() {
        Solution24 in = new Solution24();

        String Str1 = "Madonna Louise Ciccone";
        String Str2 = "One cool dance musician";

        Assertions.assertTrue(Solution24.isAnagram(Str1, Str2));
    }
}