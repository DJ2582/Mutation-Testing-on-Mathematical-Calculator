package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class Median {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double median(double[] values) {
        logger.info("[MEDIAN] - " + Arrays.toString(values));
        Arrays.sort(values);
        int n = values.length;
        double res;
        if (n % 2 == 0) {
            res = (values[n / 2 - 1] + values[n / 2]) / 2.0;
        } else {
            res = values[n / 2];
        }
        logger.info("[RESULT - MEDIAN] - " + res);
        return res;
    }
}
