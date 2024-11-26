package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Arctangent {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double arctangent(double value) {
        logger.info("[ARCTANGENT] - " + value);
        double res = Math.atan(value);
        logger.info("[RESULT - ARCTANGENT] - " + res);
        return res;
    }
}
