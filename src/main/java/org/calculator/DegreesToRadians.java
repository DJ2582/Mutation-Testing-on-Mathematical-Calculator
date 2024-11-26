package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class DegreesToRadians {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double degreesToRadians(double degrees) {
        logger.info("[DEGREES TO RADIANS] - " + degrees);
        double res = Math.toRadians(degrees);
        logger.info("[RESULT - DEGREES TO RADIANS] - " + res);
        return res;
    }
}
