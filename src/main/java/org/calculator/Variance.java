package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Variance {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double variance(double[] values) {
        logger.info("[VARIANCE] - " + Arrays.toString(values));
        double mean = Mean.mean(values);
        double sum = 0;
        for (double value : values) {
            sum += Math.pow(value - mean, 2);
        }
        double res = sum / values.length;
        logger.info("[RESULT - VARIANCE] - " + res);
        return res;
    }
}
