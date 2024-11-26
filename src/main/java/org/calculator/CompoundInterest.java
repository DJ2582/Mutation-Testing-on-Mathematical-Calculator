package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CompoundInterest {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double compoundInterest(double principal, double rate, double time) {
        logger.info("[COMPOUND INTEREST] - Principal: " + principal + ", Rate: " + rate + ", Time: " + time);
        double res = principal * Math.pow((1 + rate / 100), time);
        logger.info("[RESULT - COMPOUND INTEREST] - " + res);
        return res;
    }
}
