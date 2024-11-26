package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class SquareRoot {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double squareRoot(double n) {
        logger.info("[SQ ROOT] - " + n);
        double res = Math.sqrt(n);
        logger.info("[RESULT - SQ ROOT] - " + res);
        return res;
    }
}
