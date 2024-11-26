package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FarenheitToCelsius {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double fahrenheitToCelsius(double fahrenheit) {
        logger.info("[FAHRENHEIT TO CELSIUS] - " + fahrenheit);
        double res = (fahrenheit - 32) * 5/9;
        logger.info("[RESULT - FAHRENHEIT TO CELSIUS] - " + res);
        return res;
    }
}
