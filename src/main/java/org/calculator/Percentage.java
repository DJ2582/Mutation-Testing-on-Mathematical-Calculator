package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Percentage {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double percentage(double value, double total) {
        logger.info("[PERCENTAGE] - Value: " + value + ", Total: " + total);
        if (total == 0) {
            logger.error("Total cannot be zero.");
            return Double.NaN;
        }
        double res = (value / total) * 100;
        logger.info("[RESULT - PERCENTAGE] - " + res);
        return res;
    }
}
