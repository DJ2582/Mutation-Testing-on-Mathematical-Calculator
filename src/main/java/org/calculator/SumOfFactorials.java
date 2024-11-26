package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SumOfFactorials {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double sumOfFactorials(double[] numbers) {
        logger.info("[SUM OF FACTORIALS] - Input Array: ");
        for (double num : numbers) {
            logger.info(num + " ");
        }

        double sum = 0.0;
        for (double num : numbers) {
            double factorialValue = Factorial.factorial(num);
            sum += factorialValue;
        }

        logger.info("[RESULT - SUM OF FACTORIALS] - " + sum);
        return sum;
    }
}
