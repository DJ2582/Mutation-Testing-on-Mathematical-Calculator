package org.calculator;
import java.lang.Math;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Tanh {

    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double tanh(double value) {
        logger.info("[TANH] - " + value);
        double res = Math.tanh(value);
        logger.info("[RESULT - TANH] - " + res);
        return res;
    }
}
