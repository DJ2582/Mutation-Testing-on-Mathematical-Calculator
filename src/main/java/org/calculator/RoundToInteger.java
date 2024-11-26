package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RoundToInteger {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double roundToNearestInteger(double num) {
        logger.info("[ROUND TO NEAREST INTEGER] - " + num);
        double res = Math.round(num);
        logger.info("[RESULT - ROUND TO NEAREST INTEGER] - " + res);
        return res;
    }
}
