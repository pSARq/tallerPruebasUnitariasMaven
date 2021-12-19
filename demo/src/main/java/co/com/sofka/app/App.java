package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.SocketTimeoutException;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter number 1: ");
        String textNumber1 = bufferedReader.readLine();

        System.out.println("Enter number 2: ");
        String textNumber2 = bufferedReader.readLine();

        Long number1 = Long.valueOf(textNumber1);
        Long number2 = Long.valueOf(textNumber2);

        BasicCalculator calculator = new BasicCalculator();
        Long sum = calculator.sum(number1, number2);
        Long subtraction = calculator.sum(number1, number2);
        Long multiplication = calculator.sum(number1, number2);
        Long division = calculator.sum(number1, number2);

        System.out.println(number1 +" + "+ number2 +" = "+ sum);
        System.out.println(number1 +" - "+ number2 +" = "+ subtraction);
        System.out.println(number1 +" * "+ number2 +" = "+ multiplication);
        System.out.println(number1 +" / "+ number2 +" = "+ division);

    }
}
