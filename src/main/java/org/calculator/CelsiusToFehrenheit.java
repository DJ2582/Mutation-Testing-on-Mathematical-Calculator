package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CelsiusToFehrenheit {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double celsiusToFahrenheit(double celsius) {
        logger.info("[CELSIUS TO FAHRENHEIT] - " + celsius);
        double res = (celsius * 9/5) + 32;
        logger.info("[RESULT - CELSIUS TO FAHRENHEIT] - " + res);
        return res;
    }
}
