package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SolveSimpleEquation {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double solveSimpleEquation(String equation) {
        logger.info("[SOLVE SIMPLE EQUATION] - " + equation);
        // Assuming a linear equation of the form "ax + b = c"
        String[] parts = equation.split(",");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);
        if (a == 0) {
            // Handle the case where coefficient 'a' is zero
            logger.error("Coefficient 'a' cannot be zero for a linear equation.");
            return Double.NaN;
        }
        double res = (c - b) / a;
        logger.info("[RESULT - SOLVE SIMPLE EQUATION] - " + res);
        return res;
    }
}
