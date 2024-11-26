package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Cosine {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double cosine(double angle) {
        logger.info("[COSINE] - " + angle);
        double res = Math.cos(angle);
        logger.info("[RESULT - COSINE] - " + res);
        return res;
    }
}
