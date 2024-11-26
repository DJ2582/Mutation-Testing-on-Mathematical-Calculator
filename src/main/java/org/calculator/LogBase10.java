package org.calculator;

import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class LogBase10 {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double logBase10(double n) {
        logger.info("[BASE 10 LOG] - " + n);
        double res = Math.log10(n);
        logger.info("[RESULT - BASE 10 LOG] - " + res);
        return res;
    }
}
