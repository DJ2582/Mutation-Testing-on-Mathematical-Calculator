package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class AbsoluteValue {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double absoluteValue(double value) {
        logger.info("[ABSOLUTE VALUE] - " + value);
        double res = Math.abs(value);
        logger.info("[RESULT - ABSOLUTE VALUE] - " + res);
        return res;
    }
}
