package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AverageCelsiusToFahrenheit {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double averageCelsiusToFahrenheit(double[] celsiusArray) {
        logger.info("[AVERAGE CELSIUS TO FAHRENHEIT] - Input: " + java.util.Arrays.toString(celsiusArray));
        if (celsiusArray == null || celsiusArray.length == 0) {
            logger.error("Input array is null or empty.");
            return Double.NaN;
        }

        double sum = 0.0;
        for (double celsius : celsiusArray) {
            sum += CelsiusToFehrenheit.celsiusToFahrenheit(celsius);
        }

        double average = sum / celsiusArray.length;
        logger.info("[RESULT - AVERAGE CELSIUS TO FAHRENHEIT] - " + average);
        return average;
    }
}
