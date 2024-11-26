package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Fibonacci {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double fibonacci(double n) {
        logger.info("[FIBONACCI] - Position: " + n);
        if (n <= 0) {
            logger.error("Position must be a positive integer.");
            return -1;
        }
        if (n == 1 || n == 2) return 1;

        int a = 1, b = 1, res = 0;
        for (int i = 3; i <= n; i++) {
            res = a + b;
            a = b;
            b = res;
        }
        logger.info("[RESULT - FIBONACCI] - " + res);
        return res;
    }
}
