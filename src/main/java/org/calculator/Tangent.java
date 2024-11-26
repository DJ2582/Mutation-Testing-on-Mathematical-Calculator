package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Tangent {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double tangent(double angle) {
        logger.info("[TANGENT] - " + angle);
        double res = Math.tan(angle);
        logger.info("[RESULT - TANGENT] - " + res);
        return res;
    }
}
