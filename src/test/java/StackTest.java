import org.example.Stack;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;


import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StackTest {
    Stack sut;

    @BeforeEach
    public void initEachTest() {
        sut = new Stack();
        System.out.println("Стек создан");
    }

    @AfterEach
    public void afterEachTest() {
        sut = null;
        System.out.println("Стек удален");
    }

    @MethodSource("source")
    @ParameterizedTest
    public void testPush(int expected) {
        sut.push(expected);
        int result = sut.getHead().getValue();
        assertEquals(expected, result);
    }

    public static Stream<Arguments> source() {
        return Stream.of(Arguments.of(1), Arguments.of(2));
    }

    @Test
    public void testPrintme() {
        boolean expected = true;
        sut.push(1);
        boolean result = sut.printme();
        assertEquals(expected, result);
    }

    @Test
    public void testPop() {
        String expectedFirst = "нет элементов!";
        String expectedSecond = "1";
        sut.push(1);
        String resultFirst = sut.pop();
        assertEquals(expectedSecond, resultFirst);
        String resultSecond = sut.pop();
        assertEquals(expectedFirst, resultSecond);
    }


}
