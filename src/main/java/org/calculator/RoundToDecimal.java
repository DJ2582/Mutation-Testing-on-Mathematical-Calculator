package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoundToDecimal {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double roundToDecimalPlaces(double num, int decimalPlaces) {
        logger.info("[ROUND TO DECIMAL PLACES] - " + num + " to " + decimalPlaces + " decimal places");
        double res = Math.round(num * Math.pow(10, decimalPlaces)) / Math.pow(10, decimalPlaces);
        logger.info("[RESULT - ROUND TO DECIMAL PLACES] - " + res);
        return res;
    }
}
