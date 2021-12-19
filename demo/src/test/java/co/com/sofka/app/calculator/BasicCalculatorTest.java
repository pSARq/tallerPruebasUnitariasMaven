package co.com.sofka.app.calculator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {

    private final BasicCalculator basicCalculator = new BasicCalculator();

    @DisplayName("Testing several sums")
    @ParameterizedTest(name = "{0} + {1} = {2}")
    @CsvSource({
            "0, 1, 1",
            "1, 2, 3",
            "49, 51, 100",
            "1, 100, 101"
    })
    public void severalSums(Long first, Long second, Long expectedResult){

        assertEquals(expectedResult, basicCalculator.sum(first, second),
                () -> first +" + "+ second +" should equal "+ expectedResult);
    }

    @DisplayName("Testing several substraction")
    @ParameterizedTest(name = "{0} - {1} = {2}")
    @CsvSource({
            "20, 5, 15",
            "10, 2, 8",
            "2, 1, 1",
            "100, 80, 20"
    })
    public void severalSubtraction(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult, basicCalculator.subtraction(first, second));
    }

    @DisplayName("Testing several multiplications")
    @ParameterizedTest(name = "{0} * {1} = {2}")
    @CsvSource({
            "2, 2, 4",
            "10, 3, 30",
            "12, 12, 144",
            "20, 0, 0"
    })
    public void severalMultiplations(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult, basicCalculator.multiplication(first, second));
    }

    @DisplayName("Testing several divisions")
    @ParameterizedTest(name = "{0} / {1} = {2}")
    @CsvSource({
            "10, 2, 5",
            "50, 5, 10",
            "100, 7, 14",
            "0, 20, 0"
    })
    public void severalDivisions(Long first, Long second, Long expectedResult){
        assertEquals(expectedResult, basicCalculator.division(first, second));
    }
}
