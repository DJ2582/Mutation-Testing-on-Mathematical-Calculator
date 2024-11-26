package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Cosh {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double cosh(double value) {
        logger.info("[COSH] - " + value);
        double res = Math.cosh(value);
        logger.info("[RESULT - COSH] - " + res);
        return res;
    }
}
