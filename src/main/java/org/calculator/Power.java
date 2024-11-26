package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Power {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double power(double base, double exponent) {
        logger.info("[POWER] - Base: " + base + ", Exponent: " + exponent);
        double res = Math.pow(base, exponent);
        logger.info("[RESULT - POWER] - " + res);
        return res;
    }
}
