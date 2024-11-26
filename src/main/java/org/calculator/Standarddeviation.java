package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Standarddeviation {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double standardDeviation(double[] values) {
        logger.info("[STANDARD DEVIATION] - " + Arrays.toString(values));
        double mean = Mean.mean(values);
        double sum = 0;
        for (double value : values) {
            sum += Math.pow(value - mean, 2);
        }
        double res = Math.sqrt(sum / values.length);
        logger.info("[RESULT - STANDARD DEVIATION] - " + res);
        return res;
    }
}
