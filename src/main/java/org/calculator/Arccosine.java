package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Arccosine {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double arccosine(double value) {
        logger.info("[ARCCOSINE] - " + value);
        double res = Math.acos(value);
        logger.info("[RESULT - ARCCOSINE] - " + res);
        return res;
    }
}
