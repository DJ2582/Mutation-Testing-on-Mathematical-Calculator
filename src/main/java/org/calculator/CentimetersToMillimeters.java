package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CentimetersToMillimeters {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double centimetersToMillimeters(double centimeters) {
        logger.info("[CENTIMETERS TO MILLIMETERS] - " + centimeters);
        double res = centimeters * 10;
        logger.info("[RESULT - CENTIMETERS TO MILLIMETERS] - " + res);
        return res;
    }
}
