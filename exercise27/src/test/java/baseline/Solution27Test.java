package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution27Test {

    @Test
    void Test_validateInputTrue() {
        String first = "Leonardo";
        String second = "Herrera";
        String id = "Le-2399";
        String zip = "33025";

        Assertions.assertTrue(Solution27.validateInput(first, second, id, zip));
    }

    @Test
    void Test_validateInputFalse() {
        String first = "";
        String second = "";
        String id = "AA1234";
        String zip = "abcd";

        Assertions.assertFalse(Solution27.validateInput(first, second, id, zip));
    }
}