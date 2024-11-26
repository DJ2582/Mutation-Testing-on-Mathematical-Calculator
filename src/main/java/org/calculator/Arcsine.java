package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Arcsine {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double arcsine(double value) {
        logger.info("[ARCSINE] - " + value);
        double res = Math.asin(value);
        logger.info("[RESULT - ARCSINE] - " + res);
        return res;
    }
}
