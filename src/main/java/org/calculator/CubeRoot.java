package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CubeRoot {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double cubeRoot(double n) {
        logger.info("[CUBE ROOT] - " + n);
        double res = Math.cbrt(n);
        logger.info("[RESULT - CUBE ROOT] - " + res);
        return res;
    }
}
