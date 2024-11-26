package org.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class SolveQuadraticEquation {
    private static final Logger logger = LogManager.getLogger(Main.class);
    public static double solveQuadraticEquation(String equation) {
        logger.info("[SOLVE QUADRATIC EQUATION] - " + equation);
        // Assuming a quadratic equation of the form "ax^2 + bx + c = 0"
        String[] parts = equation.split(",");
        double a = Double.parseDouble(parts[0]);
        double b = Double.parseDouble(parts[1]);
        double c = Double.parseDouble(parts[2]);

        if (a == 0) {
            // Handle the case where coefficient 'a' is zero
            logger.error("Coefficient 'a' cannot be zero for a quadratic equation.");
            return Double.NaN;
        }
        double discriminant = b * b - 4 * a * c;
        double res1, res2;
        if (discriminant >= 0) {
            res1 = (-b + Math.sqrt(discriminant)) / (2 * a);
//            res2 = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else {
            // Complex roots, returning NaN for now
            res1 = Double.NaN;
//            res2 = Double.NaN;
        }
        logger.info("[RESULT - SOLVE QUADRATIC EQUATION] - " + Arrays.toString(new double[]{res1}));
        return res1; // Returning only the first root for simplicity
    }
}
