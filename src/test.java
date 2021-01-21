import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class test {
    @Test
    void testStringLength(){
        String stringExample = "subha";
        int Expected = 5;
        int Actual = stringExample.length();
        Assertions.assertEquals(Expected ,Actual);
    }


    @ParameterizedTest
    @ValueSource(strings  = {"abc","hello"})
    void testUpperCase(String candidate) {
        String Expected = candidate.toUpperCase();
        String Actual = candidate.toUpperCase();
        Assertions.assertEquals(Expected ,Actual);
    }
    @ParameterizedTest
    @ValueSource(strings  = {"","abc","hello"})
    void testStringLength(String candidate) {
        int Expected = 0 ;
        System.out.println(Expected);
        int Actual = candidate.length();
        Assertions.assertEquals(Expected  ,Actual);
    }

}

