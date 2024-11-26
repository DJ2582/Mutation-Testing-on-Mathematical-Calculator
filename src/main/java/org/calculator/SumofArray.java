package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.Arrays;

public class SumofArray {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double sumofArray(double[] values) {
        logger.info("[SUM] - " + Arrays.toString(values));
        double sum = 0;
        for (double value : values) {
            sum += value;
        }
        logger.info("[RESULT - SUM] - " + sum);
        return sum;
    }
}
