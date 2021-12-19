package co.com.sofka.app.calculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2){
        logger.info("summing {} + {}", number1, number2);
        return number1 + number2;
    }

    public Long subtraction(Long number1, Long number2){
        logger.info("subtracting {} + {}", number1, number2);
        return number1 - number2;
    }

    public Long multiplication(Long number1, Long number2){
        logger.info("multiplying {} + {}", number1, number2);
        return number1 * number2;
    }

    public Long division(Long number1, Long number2){
        logger.info("dividing {} + {}", number1, number2);
        try {
            return number1 / number2;
        } catch (ArithmeticException e){
            System.out.println("Un número es 0");
            return 0L;
        }
    }

}
