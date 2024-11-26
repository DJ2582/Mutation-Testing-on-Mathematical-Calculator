package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Mean {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double mean(double[] values) {
        logger.info("[MEAN] - " + Arrays.toString(values));
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        double res = sum / values.length;
        logger.info("[RESULT - MEAN] - " + res);
        return res;
    }

}
