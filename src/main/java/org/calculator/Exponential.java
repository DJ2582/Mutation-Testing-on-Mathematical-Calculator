package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Exponential {

    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double exponential(double n) {
        logger.info("[EXPONENTIAL] - " + n);
        double res = Math.exp(n);
        logger.info("[RESULT - EXPONENTIAL] - " + res);
        return res;
    }
}
