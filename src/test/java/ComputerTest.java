import org.junit.jupiter.api.*;

import java.lang.reflect.Executable;

import static org.junit.jupiter.api.Assertions.*;

class ComputerTest {
    Computer sut;

    @BeforeAll
    public static void started() {
        System.out.println("Tests started");
    }

    @BeforeEach
    public void init() {
        System.out.println("Test started");
        sut = new Computer();
    }

    @AfterEach
    public void finished() {
        System.out.println("Test finished");
    }

    @AfterAll
    public static void finishedAll() {
        System.out.println("Tests finished");
    }

    @Test
    void testBinar() {
        //arrange
        int decimal = 4, expected = 100;

        //act
        int result = sut.binar(decimal);

        //assert
        assertEquals(expected, result);
    }

    @Test
    void testAdd() {
        //arrange
        int firstNum = 2, secondNum = 2, expected = 4, notExpected = 5;

        //act
        int result = sut.add(firstNum, secondNum);

        //assert
        assertEquals(expected, result);
        assertNotEquals(notExpected, result);
    }

    @Test
    void testConcat() {
        //arrange
        String firstText = "Hello ", secondText = "World", expected = "Hello World";
        //act
        String result = sut.concatText(firstText, secondText);
        //assert
        assertEquals(expected, result);
    }

    @Test
    void testNullPointer() {
        //arrange
        String firstText = "Some text", secondText = null;
        Class<NullPointerException> expected = NullPointerException.class;

        //assert
        assertThrows(expected, () -> sut.concatText(firstText, secondText));

    }

}