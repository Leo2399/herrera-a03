package baseline;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.util.Arrays;


class Solution24Test {

    @Test
    void isAnagram() {
        String Str1 = "note";
        String Str2 = "tone";
        boolean status = true;
        if(Str1.length()!= Str2.length()){
            status = false;
        }
        char arr1[] = Str1.toCharArray();
        char arr2[] = Str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);

        Assertions.assertFalse(Arrays.equals(arr1,arr2));
    }
}