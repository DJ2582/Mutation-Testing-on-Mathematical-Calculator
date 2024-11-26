package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Modulus {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double modulus(double a, double b) {
        logger.info("[MODULUS] - " + a + " % " + b);
        double res = a % b;
        logger.info("[RESULT - MODULUS] - " + res);
        return res;
    }
}
