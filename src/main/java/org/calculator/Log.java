package org.calculator;

import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double log(double n) {

        logger.info("[NATURAL LOG] - " + n);
        double res = Math.log(n);
        logger.info("[RESULT - NATURAL LOG] - " + res);
        return res;
    }
}
