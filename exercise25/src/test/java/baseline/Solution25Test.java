package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class Solution25Test {

    @Test
    void TestVeryWeakPassword() {
       //Solution25 pass = new Solution25();

        String Str = "1234";
        Assertions.assertEquals(25,Solution25.passwordValidator(Str));
    }

    @Test
    void TestWeakPassword(){

        String Str = "abcdef";
        Assertions.assertEquals(50, Solution25.passwordValidator(Str));
    }

    @Test
    void TestStrongPassword(){
        String Str = "abc123xyz";
        Assertions.assertEquals(75,Solution25.passwordValidator(Str));
    }
    @Test
    void TestVeryStrongPassword(){
        String Str = "1337h@xor!";
        Assertions.assertEquals(100, Solution25.passwordValidator(Str));
    }
    @Test
    void TestUnkownStrength(){
        String Str = "@@@";
        Assertions.assertEquals(0,Solution25.passwordValidator(Str));
    }
}