package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LCM {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double lcm(double a, double b) {
        logger.info("[LCM] - a: " + a + ", b: " + b);
        double gcd = GCD.gcd(a, b);
        double res = Math.abs(a * b) / gcd;
        logger.info("[RESULT - LCM] - " + res);
        return res;
    }
}
