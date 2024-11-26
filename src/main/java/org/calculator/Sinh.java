package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Sinh {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double sinh(double value) {
        logger.info("[SINH] - " + value);
        double res = Math.sinh(value);
        logger.info("[RESULT - SINH] - " + res);
        return res;
    }
}
