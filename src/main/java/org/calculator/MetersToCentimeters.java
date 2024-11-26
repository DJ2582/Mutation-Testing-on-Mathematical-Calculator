package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MetersToCentimeters {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double metersToCentimeters(double meters) {
        logger.info("[METERS TO CENTIMETERS] - " + meters);
        double res = meters * 100;
        logger.info("[RESULT - METERS TO CENTIMETERS] - " + res);
        return res;
    }
}
