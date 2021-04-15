package test;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;

public class BigClasstest {
    BigClass B = new BigClass();
    @Test
    void testStringLength(){
        String stringExample = "Akshaj";
        int Expected = 6;
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
    @RepeatedTest(20)
    @DisplayName("Testing how long the method is executing")
    void testTimeoutInc() {
        Myclass testObject = new Myclass();
        Assertions.assertTimeout(Duration.ofHours(100),() -> testObject.inc(1000));
    }
    @ParameterizedTest
    @CsvSource({"3,8,11", "5,6,11", "7,4,11"})
    void testAdd(int a,int b,int Expected) {
        System.out.println(Expected);
        BigClass B = new BigClass();
        int Actual = B.Add(a,b);
        Assertions.assertEquals(Expected  ,Actual);
    }
    @Test
        void testSum() {
        int Expected = 13;
        BigClass B = new BigClass();
        int Actual = B.Add(6,7);
        Assertions.assertEquals(Expected  ,Actual);
    }
    @Test
    void testString() {
        BigClass B = new BigClass();
        String Actual = B.textnull("BUS");
        Assertions.assertNull( Actual);
    }
    @ParameterizedTest
    @ValueSource(strings  = {"abc","hello"})
    void testStringUpperCase(String name) {
        String Expected = name.toUpperCase();
        BigClass B = new BigClass();
        B.printExample();
        String actual =B.printretExample(name);
       // Assertions.assertEquals(Expected ,B.getText());
        Assertions.assertEquals(Expected ,actual);
    }
}



