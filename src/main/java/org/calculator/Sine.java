package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Sine {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double sine(double angle) {
        logger.info("[SINE] - " + angle);
        double res = Math.sin(angle);
        logger.info("[RESULT - SINE] - " + res);
        return res;
    }
}
