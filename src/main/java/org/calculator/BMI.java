package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class BMI {
    private static final Logger logger = LogManager.getLogger(Main.class);

    public static double calculateBMI(double weight, double height) {
        logger.info("[BMI] - Weight: " + weight + " kg, Height: " + height + " meters");
        if (height <= 0) {
            logger.error("Height must be greater than zero.");
            return Double.NaN;
        }
        double res = weight / (height * height);
        logger.info("[RESULT - BMI] - " + res);
        return res;
    }
}
