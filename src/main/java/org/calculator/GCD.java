package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GCD {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double gcd(double a, double b) {
        logger.info("[GCD] - a: " + a + ", b: " + b);
        while (b != 0) {
            double temp = b;
            b = a % b;
            a = temp;
        }
        logger.info("[RESULT - GCD] - " + a);
        return a;
    }
}
