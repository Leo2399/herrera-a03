package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;


class Solution24Test {

    @Test
    void isAnagram() {
        String Str1 = "Madonna Louise Ciccone";
        String Str2 = "One cool dance musician";
        boolean status = true;
        if(Str1.length()!= Str2.length()){
            status = false;
        }
        char arr1[] = Str1.replaceAll("\\s","").toLowerCase().toCharArray();
        char arr2[] = Str2.replaceAll("\\s","").toLowerCase().toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Assertions.assertTrue(Arrays.equals(arr1,arr2));
    }
}